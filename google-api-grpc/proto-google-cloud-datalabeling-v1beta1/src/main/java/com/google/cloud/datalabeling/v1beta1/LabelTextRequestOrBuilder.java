// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

package com.google.cloud.datalabeling.v1beta1;

public interface LabelTextRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.LabelTextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration for text classification task.
   * One of text_classification_config and text_entity_extraction_config
   * is required.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextClassificationConfig text_classification_config = 4;
   * </code>
   */
  boolean hasTextClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for text classification task.
   * One of text_classification_config and text_entity_extraction_config
   * is required.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextClassificationConfig text_classification_config = 4;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.TextClassificationConfig getTextClassificationConfig();
  /**
   *
   *
   * <pre>
   * Configuration for text classification task.
   * One of text_classification_config and text_entity_extraction_config
   * is required.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextClassificationConfig text_classification_config = 4;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.TextClassificationConfigOrBuilder
      getTextClassificationConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Configuration for entity extraction task.
   * One of text_classification_config and text_entity_extraction_config
   * is required.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig text_entity_extraction_config = 5;
   * </code>
   */
  boolean hasTextEntityExtractionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for entity extraction task.
   * One of text_classification_config and text_entity_extraction_config
   * is required.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig text_entity_extraction_config = 5;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig getTextEntityExtractionConfig();
  /**
   *
   *
   * <pre>
   * Configuration for entity extraction task.
   * One of text_classification_config and text_entity_extraction_config
   * is required.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.TextEntityExtractionConfig text_entity_extraction_config = 5;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.TextEntityExtractionConfigOrBuilder
      getTextEntityExtractionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Name of the data set to request labeling task, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Name of the data set to request labeling task, format:
   * projects/{project_id}/datasets/{dataset_id}
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  boolean hasBasicConfig();
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig getBasicConfig();
  /**
   *
   *
   * <pre>
   * Required. Basic human annotation config.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.HumanAnnotationConfig basic_config = 2;</code>
   */
  com.google.cloud.datalabeling.v1beta1.HumanAnnotationConfigOrBuilder getBasicConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The type of text labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextRequest.Feature feature = 6;</code>
   */
  int getFeatureValue();
  /**
   *
   *
   * <pre>
   * Required. The type of text labeling task.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.LabelTextRequest.Feature feature = 6;</code>
   */
  com.google.cloud.datalabeling.v1beta1.LabelTextRequest.Feature getFeature();

  public com.google.cloud.datalabeling.v1beta1.LabelTextRequest.RequestConfigCase
      getRequestConfigCase();
}
