// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/application_service.proto

package com.google.cloud.talent.v4beta1;

public interface ListApplicationsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.ListApplicationsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Applications for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Application applications = 1;</code>
   */
  java.util.List<com.google.cloud.talent.v4beta1.Application> getApplicationsList();
  /**
   *
   *
   * <pre>
   * Applications for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Application applications = 1;</code>
   */
  com.google.cloud.talent.v4beta1.Application getApplications(int index);
  /**
   *
   *
   * <pre>
   * Applications for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Application applications = 1;</code>
   */
  int getApplicationsCount();
  /**
   *
   *
   * <pre>
   * Applications for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Application applications = 1;</code>
   */
  java.util.List<? extends com.google.cloud.talent.v4beta1.ApplicationOrBuilder>
      getApplicationsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Applications for the current client.
   * </pre>
   *
   * <code>repeated .google.cloud.talent.v4beta1.Application applications = 1;</code>
   */
  com.google.cloud.talent.v4beta1.ApplicationOrBuilder getApplicationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.talent.v4beta1.ResponseMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Additional information for the API invocation, such as the request
   * tracking id.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ResponseMetadata metadata = 3;</code>
   */
  com.google.cloud.talent.v4beta1.ResponseMetadataOrBuilder getMetadataOrBuilder();
}