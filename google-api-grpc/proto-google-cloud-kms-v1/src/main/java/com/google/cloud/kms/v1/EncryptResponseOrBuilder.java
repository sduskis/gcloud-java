// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface EncryptResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.EncryptResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used in encryption.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] used in encryption.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The encrypted data.
   * </pre>
   *
   * <code>bytes ciphertext = 2;</code>
   */
  com.google.protobuf.ByteString getCiphertext();
}
