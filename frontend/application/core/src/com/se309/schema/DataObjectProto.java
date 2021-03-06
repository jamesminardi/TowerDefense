// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataObject.proto

package com.se309.schema;

public final class DataObjectProto {
  private DataObjectProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_DataObjectSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_DataObjectSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_GamestateSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_GamestateSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_MessageSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_MessageSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_TowerSchema_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_TowerSchema_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_ConnectedClients_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_ConnectedClients_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_ConnectedClients_Client_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_ConnectedClients_Client_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_gameTick_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_gameTick_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_coms309_server_gameTick_EnemyUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_coms309_server_gameTick_EnemyUpdate_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\020DataObject.proto\022\016coms309.server\"\217\002\n\020D" +
      "ataObjectSchema\0224\n\tgamestate\030\001 \001(\0132\037.com" +
      "s309.server.GamestateSchemaH\000\0220\n\007message" +
      "\030\002 \001(\0132\035.coms309.server.MessageSchemaH\000\022" +
      ",\n\005tower\030\003 \001(\0132\033.coms309.server.TowerSch" +
      "emaH\000\0223\n\007clients\030\004 \001(\0132 .coms309.server." +
      "ConnectedClientsH\000\022(\n\004tick\030\005 \001(\0132\030.coms3" +
      "09.server.gameTickH\000B\006\n\004data\"r\n\017Gamestat" +
      "eSchema\022\022\n\ndifficulty\030\001 \001(\r\022\016\n\006status\030\002 " +
      "\001(\r\022\013\n\003map\030\003 \001(\r\022\r\n\005round\030\004 \001(\r\022\016\n\006healt",
      "h\030\005 \001(\r\022\017\n\007balance\030\006 \001(\r\">\n\rMessageSchem" +
      "a\022\016\n\006author\030\001 \001(\t\022\014\n\004code\030\002 \002(\t\022\017\n\007messa" +
      "ge\030\003 \002(\t\"D\n\013TowerSchema\022\t\n\001x\030\001 \002(\r\022\t\n\001y\030" +
      "\002 \002(\r\022\016\n\006typeId\030\003 \002(\r\022\017\n\007ownerId\030\004 \001(\r\"}" +
      "\n\020ConnectedClients\0228\n\007clients\030\001 \003(\0132\'.co" +
      "ms309.server.ConnectedClients.Client\032/\n\006" +
      "Client\022\013\n\003pid\030\001 \001(\r\022\n\n\002id\030\002 \001(\004\022\014\n\004name\030" +
      "\003 \001(\t\"\211\001\n\010gameTick\0229\n\013enemyUpdate\030\001 \003(\0132" +
      "$.coms309.server.gameTick.EnemyUpdate\032B\n" +
      "\013EnemyUpdate\022\017\n\007enemyId\030\001 \002(\r\022\016\n\006health\030",
      "\002 \002(\r\022\022\n\nattackedBy\030\003 \001(\rB*\n\025coms309.ser" +
      "ver.SchemaB\017DataObjectProtoP\001"
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
    internal_static_coms309_server_DataObjectSchema_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_coms309_server_DataObjectSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_DataObjectSchema_descriptor,
        new String[] { "Gamestate", "Message", "Tower", "Clients", "Tick", "Data", });
    internal_static_coms309_server_GamestateSchema_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_coms309_server_GamestateSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_GamestateSchema_descriptor,
        new String[] { "Difficulty", "Status", "Map", "Round", "Health", "Balance", });
    internal_static_coms309_server_MessageSchema_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_coms309_server_MessageSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_MessageSchema_descriptor,
        new String[] { "Author", "Code", "Message", });
    internal_static_coms309_server_TowerSchema_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_coms309_server_TowerSchema_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_TowerSchema_descriptor,
        new String[] { "X", "Y", "TypeId", "OwnerId", });
    internal_static_coms309_server_ConnectedClients_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_coms309_server_ConnectedClients_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_ConnectedClients_descriptor,
        new String[] { "Clients", });
    internal_static_coms309_server_ConnectedClients_Client_descriptor =
      internal_static_coms309_server_ConnectedClients_descriptor.getNestedTypes().get(0);
    internal_static_coms309_server_ConnectedClients_Client_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_ConnectedClients_Client_descriptor,
        new String[] { "Pid", "Id", "Name", });
    internal_static_coms309_server_gameTick_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_coms309_server_gameTick_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_gameTick_descriptor,
        new String[] { "EnemyUpdate", });
    internal_static_coms309_server_gameTick_EnemyUpdate_descriptor =
      internal_static_coms309_server_gameTick_descriptor.getNestedTypes().get(0);
    internal_static_coms309_server_gameTick_EnemyUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_coms309_server_gameTick_EnemyUpdate_descriptor,
        new String[] { "EnemyId", "Health", "AttackedBy", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
