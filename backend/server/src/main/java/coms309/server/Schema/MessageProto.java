// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Message.proto

package coms309.server.Schema;

public final class MessageProto {
  private MessageProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_MessageSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_MessageSchema_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rMessage.proto\022\016coms309.server\">\n\rMessa" +
      "geSchema\022\016\n\006author\030\001 \002(\t\022\014\n\004code\030\002 \002(\t\022\017" +
      "\n\007message\030\003 \002(\tB\'\n\025coms309.server.Schema" +
      "B\014MessageProtoP\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_coms309_server_MessageSchema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_coms309_server_MessageSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_MessageSchema_descriptor,
        new java.lang.String[] { "Author", "Code", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
