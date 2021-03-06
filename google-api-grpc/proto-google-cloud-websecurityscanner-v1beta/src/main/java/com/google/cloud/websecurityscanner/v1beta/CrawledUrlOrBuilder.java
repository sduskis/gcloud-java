// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/crawled_url.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface CrawledUrlOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.CrawledUrl)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only.
   * The http method of the request that was used to visit the URL, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 1;</code>
   */
  java.lang.String getHttpMethod();
  /**
   *
   *
   * <pre>
   * Output only.
   * The http method of the request that was used to visit the URL, in
   * uppercase.
   * </pre>
   *
   * <code>string http_method = 1;</code>
   */
  com.google.protobuf.ByteString getHttpMethodBytes();

  /**
   *
   *
   * <pre>
   * Output only.
   * The URL that was crawled.
   * </pre>
   *
   * <code>string url = 2;</code>
   */
  java.lang.String getUrl();
  /**
   *
   *
   * <pre>
   * Output only.
   * The URL that was crawled.
   * </pre>
   *
   * <code>string url = 2;</code>
   */
  com.google.protobuf.ByteString getUrlBytes();

  /**
   *
   *
   * <pre>
   * Output only.
   * The body of the request that was used to visit the URL.
   * </pre>
   *
   * <code>string body = 3;</code>
   */
  java.lang.String getBody();
  /**
   *
   *
   * <pre>
   * Output only.
   * The body of the request that was used to visit the URL.
   * </pre>
   *
   * <code>string body = 3;</code>
   */
  com.google.protobuf.ByteString getBodyBytes();
}
