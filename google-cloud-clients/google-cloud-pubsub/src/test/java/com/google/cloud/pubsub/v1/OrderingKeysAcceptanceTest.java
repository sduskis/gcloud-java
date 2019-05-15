/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.pubsub.v1;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutureCallback;
import com.google.api.core.ApiFutures;
import com.google.api.gax.core.FixedExecutorProvider;
import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.grpc.testing.LocalChannelProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.common.truth.Truth;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.gson.Gson;
import com.google.protobuf.ByteString;
import com.google.pubsub.v1.ProjectTopicName;
import com.google.pubsub.v1.PublishRequest;
import com.google.pubsub.v1.PubsubMessage;
import io.grpc.Server;
import io.grpc.inprocess.InProcessServerBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.threeten.bp.Duration;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class OrderingKeysAcceptanceTest {

  private static final ProjectTopicName TEST_TOPIC =
      ProjectTopicName.of("test-project", "test-topic");

  private static final TransportChannelProvider TEST_CHANNEL_PROVIDER =
      LocalChannelProvider.create("test-server");

  private ScheduledExecutorService executor;

  private FakePublisherServiceImpl testPublisherServiceImpl;

  private Server testServer;

  @Before
  public void setUp() throws Exception {
    testPublisherServiceImpl = new FakePublisherServiceImpl();

    InProcessServerBuilder serverBuilder = InProcessServerBuilder.forName("test-server");
    serverBuilder.addService(testPublisherServiceImpl);
    testServer = serverBuilder.build();
    testServer.start();

    executor = Executors.newScheduledThreadPool(10);
  }

  @After
  public void tearDown() throws Exception {
    executor.shutdown();
    testServer.shutdownNow().awaitTermination();
    executor.awaitTermination(1, TimeUnit.MINUTES);
  }

  @Test
  public void test() throws Exception {
    InputStream testInputStream =
        OrderingKeysAcceptanceTest.class.getResourceAsStream("/ok.json");

    // Parse the json
    Gson gson = new Gson();
    AcceptanceTest acceptanceTest =
        gson.fromJson(new InputStreamReader(testInputStream), AcceptanceTest.class);

    Publisher publisher =
        getTestPublisherBuilder()
            .setBatchingSettings(
                Publisher.Builder.DEFAULT_BATCHING_SETTINGS
                    .toBuilder()
                    .setElementCountThreshold(3L)
                    .setDelayThreshold(Duration.ofSeconds(100))
                    .build())
            .setEnableMessageOrdering(true)
            .build();
    testPublisherServiceImpl.setAutoPublishResponse(true);

    Map<String, List<String>> submitted = new HashMap<>();

    for(Input input : acceptanceTest.input) {
      ApiFuture<String> future = publisher.publish(
          PubsubMessage.newBuilder().setData(ByteString.copyFromUtf8(input.message))
              .setOrderingKey(input.key).build());

      captureResults(submitted, input, future);

      // Allow some async work to happen
      if (Math.random() > .9) {
        Thread.sleep(1);
      }
    }

    publisher.publishAllOutstanding();

    publisher.shutdown();

    int count = 0;

    for(PublishRequest r : testPublisherServiceImpl.getCapturedRequests()) {
      count += r.getMessagesCount();
    }
    Truth.assertThat(count).isEqualTo(acceptanceTest.input.size());

    for(Expectation expectation : acceptanceTest.expected) {
      if (expectation.key.isEmpty()) {
        Set<String> submittedValues = new HashSet<>(submitted.get(""));
        Truth.assertThat(submittedValues).isEqualTo(new HashSet<>(expectation.messages));
      } else {
        Truth.assertThat(submitted.get(expectation.key)).containsExactlyElementsIn(expectation.messages);
      }
    }
  }

  private void captureResults(final Map<String, List<String>> submitted, final Input input, ApiFuture<String> future) {
    ApiFutureCallback<String> callback = new ApiFutureCallback<String>() {
      @Override public void onFailure(Throwable t) {
      }

      @Override public void onSuccess(String result) {
        synchronized (submitted) {
          List<String> list = submitted.get(input.key);
          if (list == null) {
            list = new ArrayList<>();
            submitted.put(input.key, list);
          }
          list.add(input.message);
        }
      }
    };
    ApiFutures.addCallback(future, callback, MoreExecutors.directExecutor());
  }

  private Publisher.Builder getTestPublisherBuilder() {
    return Publisher.newBuilder(TEST_TOPIC)
        .setExecutorProvider(FixedExecutorProvider.create(executor))
        .setChannelProvider(TEST_CHANNEL_PROVIDER)
        .setCredentialsProvider(NoCredentialsProvider.create());
  }

  // <editor-fold desc="JSON data model populated by gson">
  private static final class AcceptanceTest {
    List<Input> input;
    List<Expectation> expected;
  }

  private static class Input {
    String key;
    String message;
  }

  private static class Expectation {
    String key;
    List<String> messages;
  }

}
