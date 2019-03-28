// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/job.proto

package com.google.cloud.talent.v4beta1;

public final class JobResourceProto {
  private JobResourceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/talent/v4beta1/job.proto\022"
          + "\033google.cloud.talent.v4beta1\032\034google/api"
          + "/annotations.proto\032(google/cloud/talent/"
          + "v4beta1/common.proto\032\037google/protobuf/ti"
          + "mestamp.proto\032\036google/protobuf/wrappers."
          + "proto\"\247\016\n\003Job\022\014\n\004name\030\001 \001(\t\022\017\n\007company\030\002"
          + " \001(\t\022\026\n\016requisition_id\030\003 \001(\t\022\r\n\005title\030\004 "
          + "\001(\t\022\023\n\013description\030\005 \001(\t\022\021\n\taddresses\030\006 "
          + "\003(\t\022J\n\020application_info\030\007 \001(\01320.google.c"
          + "loud.talent.v4beta1.Job.ApplicationInfo\022"
          + "=\n\014job_benefits\030\010 \003(\0162\'.google.cloud.tal"
          + "ent.v4beta1.JobBenefit\022H\n\021compensation_i"
          + "nfo\030\t \001(\0132-.google.cloud.talent.v4beta1."
          + "CompensationInfo\022Q\n\021custom_attributes\030\n "
          + "\003(\01326.google.cloud.talent.v4beta1.Job.Cu"
          + "stomAttributesEntry\022=\n\014degree_types\030\013 \003("
          + "\0162\'.google.cloud.talent.v4beta1.DegreeTy"
          + "pe\022\022\n\ndepartment\030\014 \001(\t\022E\n\020employment_typ"
          + "es\030\r \003(\0162+.google.cloud.talent.v4beta1.E"
          + "mploymentType\022\022\n\nincentives\030\016 \001(\t\022\025\n\rlan"
          + "guage_code\030\017 \001(\t\0228\n\tjob_level\030\020 \001(\0162%.go"
          + "ogle.cloud.talent.v4beta1.JobLevel\022\027\n\017pr"
          + "omotion_value\030\021 \001(\005\022\026\n\016qualifications\030\022 "
          + "\001(\t\022\030\n\020responsibilities\030\023 \001(\t\022B\n\016posting"
          + "_region\030\024 \001(\0162*.google.cloud.talent.v4be"
          + "ta1.PostingRegion\022;\n\nvisibility\030\025 \001(\0162\'."
          + "google.cloud.talent.v4beta1.Visibility\0222"
          + "\n\016job_start_time\030\026 \001(\0132\032.google.protobuf"
          + ".Timestamp\0220\n\014job_end_time\030\027 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\0228\n\024posting_publish_"
          + "time\030\030 \001(\0132\032.google.protobuf.Timestamp\0227"
          + "\n\023posting_expire_time\030\031 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\0227\n\023posting_create_time\030\032"
          + " \001(\0132\032.google.protobuf.Timestamp\0227\n\023post"
          + "ing_update_time\030\033 \001(\0132\032.google.protobuf."
          + "Timestamp\022\034\n\024company_display_name\030\034 \001(\t\022"
          + "B\n\014derived_info\030\035 \001(\0132,.google.cloud.tal"
          + "ent.v4beta1.Job.DerivedInfo\022N\n\022processin"
          + "g_options\030\036 \001(\01322.google.cloud.talent.v4"
          + "beta1.Job.ProcessingOptions\032D\n\017Applicati"
          + "onInfo\022\016\n\006emails\030\001 \003(\t\022\023\n\013instruction\030\002 "
          + "\001(\t\022\014\n\004uris\030\003 \003(\t\032\211\001\n\013DerivedInfo\0228\n\tloc"
          + "ations\030\001 \003(\0132%.google.cloud.talent.v4bet"
          + "a1.Location\022@\n\016job_categories\030\003 \003(\0162(.go"
          + "ogle.cloud.talent.v4beta1.JobCategory\032\210\001"
          + "\n\021ProcessingOptions\022)\n!disable_street_ad"
          + "dress_resolution\030\001 \001(\010\022H\n\021html_sanitizat"
          + "ion\030\002 \001(\0162-.google.cloud.talent.v4beta1."
          + "HtmlSanitization\032e\n\025CustomAttributesEntr"
          + "y\022\013\n\003key\030\001 \001(\t\022;\n\005value\030\002 \001(\0132,.google.c"
          + "loud.talent.v4beta1.CustomAttribute:\0028\001B"
          + "~\n\037com.google.cloud.talent.v4beta1B\020JobR"
          + "esourceProtoP\001ZAgoogle.golang.org/genpro"
          + "to/googleapis/cloud/talent/v4beta1;talen"
          + "t\242\002\003CTSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_talent_v4beta1_Job_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Job_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_descriptor,
            new java.lang.String[] {
              "Name",
              "Company",
              "RequisitionId",
              "Title",
              "Description",
              "Addresses",
              "ApplicationInfo",
              "JobBenefits",
              "CompensationInfo",
              "CustomAttributes",
              "DegreeTypes",
              "Department",
              "EmploymentTypes",
              "Incentives",
              "LanguageCode",
              "JobLevel",
              "PromotionValue",
              "Qualifications",
              "Responsibilities",
              "PostingRegion",
              "Visibility",
              "JobStartTime",
              "JobEndTime",
              "PostingPublishTime",
              "PostingExpireTime",
              "PostingCreateTime",
              "PostingUpdateTime",
              "CompanyDisplayName",
              "DerivedInfo",
              "ProcessingOptions",
            });
    internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_ApplicationInfo_descriptor,
            new java.lang.String[] {
              "Emails", "Instruction", "Uris",
            });
    internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_DerivedInfo_descriptor,
            new java.lang.String[] {
              "Locations", "JobCategories",
            });
    internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_ProcessingOptions_descriptor,
            new java.lang.String[] {
              "DisableStreetAddressResolution", "HtmlSanitization",
            });
    internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_descriptor =
        internal_static_google_cloud_talent_v4beta1_Job_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_talent_v4beta1_Job_CustomAttributesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}