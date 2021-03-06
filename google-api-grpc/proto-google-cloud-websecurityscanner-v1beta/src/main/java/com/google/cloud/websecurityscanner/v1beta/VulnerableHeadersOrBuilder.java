// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/websecurityscanner/v1beta/finding_addon.proto

package com.google.cloud.websecurityscanner.v1beta;

public interface VulnerableHeadersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.websecurityscanner.v1beta.VulnerableHeaders)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header>
      getHeadersList();
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header getHeaders(int index);
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  int getHeadersCount();
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder>
      getHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of vulnerable headers.
   * </pre>
   *
   * <code>repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header headers = 1;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder getHeadersOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  java.util.List<com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header>
      getMissingHeadersList();
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header getMissingHeaders(int index);
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  int getMissingHeadersCount();
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder>
      getMissingHeadersOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of missing headers.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.websecurityscanner.v1beta.VulnerableHeaders.Header missing_headers = 2;
   * </code>
   */
  com.google.cloud.websecurityscanner.v1beta.VulnerableHeaders.HeaderOrBuilder
      getMissingHeadersOrBuilder(int index);
}
