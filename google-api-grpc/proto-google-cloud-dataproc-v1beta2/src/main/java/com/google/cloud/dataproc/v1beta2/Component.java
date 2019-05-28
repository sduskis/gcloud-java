// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/shared.proto

package com.google.cloud.dataproc.v1beta2;

/**
 *
 *
 * <pre>
 * Cluster components that can be activated.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.dataproc.v1beta2.Component}
 */
public enum Component implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified component.
   * </pre>
   *
   * <code>COMPONENT_UNSPECIFIED = 0;</code>
   */
  COMPONENT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The Anaconda python distribution.
   * </pre>
   *
   * <code>ANACONDA = 5;</code>
   */
  ANACONDA(5),
  /**
   *
   *
   * <pre>
   * The Druid query engine.
   * </pre>
   *
   * <code>DRUID = 9;</code>
   */
  DRUID(9),
  /**
   *
   *
   * <pre>
   * The Hive Web HCatalog (the REST service for accessing HCatalog).
   * </pre>
   *
   * <code>HIVE_WEBHCAT = 3;</code>
   */
  HIVE_WEBHCAT(3),
  /**
   *
   *
   * <pre>
   * The Jupyter Notebook.
   * </pre>
   *
   * <code>JUPYTER = 1;</code>
   */
  JUPYTER(1),
  /**
   *
   *
   * <pre>
   * The Kerberos security feature.
   * </pre>
   *
   * <code>KERBEROS = 7;</code>
   */
  KERBEROS(7),
  /**
   *
   *
   * <pre>
   * The Presto query engine.
   * </pre>
   *
   * <code>PRESTO = 6;</code>
   */
  PRESTO(6),
  /**
   *
   *
   * <pre>
   * The Zeppelin notebook.
   * </pre>
   *
   * <code>ZEPPELIN = 4;</code>
   */
  ZEPPELIN(4),
  /**
   *
   *
   * <pre>
   * The Zookeeper service.
   * </pre>
   *
   * <code>ZOOKEEPER = 8;</code>
   */
  ZOOKEEPER(8),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified component.
   * </pre>
   *
   * <code>COMPONENT_UNSPECIFIED = 0;</code>
   */
  public static final int COMPONENT_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The Anaconda python distribution.
   * </pre>
   *
   * <code>ANACONDA = 5;</code>
   */
  public static final int ANACONDA_VALUE = 5;
  /**
   *
   *
   * <pre>
   * The Druid query engine.
   * </pre>
   *
   * <code>DRUID = 9;</code>
   */
  public static final int DRUID_VALUE = 9;
  /**
   *
   *
   * <pre>
   * The Hive Web HCatalog (the REST service for accessing HCatalog).
   * </pre>
   *
   * <code>HIVE_WEBHCAT = 3;</code>
   */
  public static final int HIVE_WEBHCAT_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The Jupyter Notebook.
   * </pre>
   *
   * <code>JUPYTER = 1;</code>
   */
  public static final int JUPYTER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The Kerberos security feature.
   * </pre>
   *
   * <code>KERBEROS = 7;</code>
   */
  public static final int KERBEROS_VALUE = 7;
  /**
   *
   *
   * <pre>
   * The Presto query engine.
   * </pre>
   *
   * <code>PRESTO = 6;</code>
   */
  public static final int PRESTO_VALUE = 6;
  /**
   *
   *
   * <pre>
   * The Zeppelin notebook.
   * </pre>
   *
   * <code>ZEPPELIN = 4;</code>
   */
  public static final int ZEPPELIN_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The Zookeeper service.
   * </pre>
   *
   * <code>ZOOKEEPER = 8;</code>
   */
  public static final int ZOOKEEPER_VALUE = 8;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static Component valueOf(int value) {
    return forNumber(value);
  }

  public static Component forNumber(int value) {
    switch (value) {
      case 0:
        return COMPONENT_UNSPECIFIED;
      case 5:
        return ANACONDA;
      case 9:
        return DRUID;
      case 3:
        return HIVE_WEBHCAT;
      case 1:
        return JUPYTER;
      case 7:
        return KERBEROS;
      case 6:
        return PRESTO;
      case 4:
        return ZEPPELIN;
      case 8:
        return ZOOKEEPER;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Component> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<Component> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<Component>() {
        public Component findValueByNumber(int number) {
          return Component.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.dataproc.v1beta2.SharedProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Component[] VALUES = values();

  public static Component valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private Component(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.dataproc.v1beta2.Component)
}