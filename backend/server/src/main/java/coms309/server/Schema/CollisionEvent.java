// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataObject.proto

package coms309.server.Schema;

/**
 * <pre>
 *Buffer to hold collision event between
 *tower and enemy.
 * </pre>
 *
 * Protobuf type {@code coms309.server.CollisionEvent}
 */
public  final class CollisionEvent extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coms309.server.CollisionEvent)
    CollisionEventOrBuilder {
  // Use CollisionEvent.newBuilder() to construct.
  private CollisionEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CollisionEvent() {
    towerId_ = 0;
    enemyId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CollisionEvent(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            towerId_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            enemyId_ = input.readUInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_CollisionEvent_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_CollisionEvent_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            coms309.server.Schema.CollisionEvent.class, coms309.server.Schema.CollisionEvent.Builder.class);
  }

  private int bitField0_;
  public static final int TOWERID_FIELD_NUMBER = 1;
  private int towerId_;
  /**
   * <code>required uint32 towerId = 1;</code>
   */
  public boolean hasTowerId() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required uint32 towerId = 1;</code>
   */
  public int getTowerId() {
    return towerId_;
  }

  public static final int ENEMYID_FIELD_NUMBER = 2;
  private int enemyId_;
  /**
   * <code>required uint32 enemyId = 2;</code>
   */
  public boolean hasEnemyId() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required uint32 enemyId = 2;</code>
   */
  public int getEnemyId() {
    return enemyId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasTowerId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasEnemyId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeUInt32(1, towerId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeUInt32(2, enemyId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, towerId_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, enemyId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof coms309.server.Schema.CollisionEvent)) {
      return super.equals(obj);
    }
    coms309.server.Schema.CollisionEvent other = (coms309.server.Schema.CollisionEvent) obj;

    boolean result = true;
    result = result && (hasTowerId() == other.hasTowerId());
    if (hasTowerId()) {
      result = result && (getTowerId()
          == other.getTowerId());
    }
    result = result && (hasEnemyId() == other.hasEnemyId());
    if (hasEnemyId()) {
      result = result && (getEnemyId()
          == other.getEnemyId());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasTowerId()) {
      hash = (37 * hash) + TOWERID_FIELD_NUMBER;
      hash = (53 * hash) + getTowerId();
    }
    if (hasEnemyId()) {
      hash = (37 * hash) + ENEMYID_FIELD_NUMBER;
      hash = (53 * hash) + getEnemyId();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static coms309.server.Schema.CollisionEvent parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static coms309.server.Schema.CollisionEvent parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.CollisionEvent parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.CollisionEvent parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(coms309.server.Schema.CollisionEvent prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   *Buffer to hold collision event between
   *tower and enemy.
   * </pre>
   *
   * Protobuf type {@code coms309.server.CollisionEvent}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coms309.server.CollisionEvent)
      coms309.server.Schema.CollisionEventOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_CollisionEvent_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_CollisionEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              coms309.server.Schema.CollisionEvent.class, coms309.server.Schema.CollisionEvent.Builder.class);
    }

    // Construct using coms309.server.Schema.CollisionEvent.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      towerId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      enemyId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_CollisionEvent_descriptor;
    }

    public coms309.server.Schema.CollisionEvent getDefaultInstanceForType() {
      return coms309.server.Schema.CollisionEvent.getDefaultInstance();
    }

    public coms309.server.Schema.CollisionEvent build() {
      coms309.server.Schema.CollisionEvent result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public coms309.server.Schema.CollisionEvent buildPartial() {
      coms309.server.Schema.CollisionEvent result = new coms309.server.Schema.CollisionEvent(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.towerId_ = towerId_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.enemyId_ = enemyId_;
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof coms309.server.Schema.CollisionEvent) {
        return mergeFrom((coms309.server.Schema.CollisionEvent)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(coms309.server.Schema.CollisionEvent other) {
      if (other == coms309.server.Schema.CollisionEvent.getDefaultInstance()) return this;
      if (other.hasTowerId()) {
        setTowerId(other.getTowerId());
      }
      if (other.hasEnemyId()) {
        setEnemyId(other.getEnemyId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasTowerId()) {
        return false;
      }
      if (!hasEnemyId()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      coms309.server.Schema.CollisionEvent parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (coms309.server.Schema.CollisionEvent) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int towerId_ ;
    /**
     * <code>required uint32 towerId = 1;</code>
     */
    public boolean hasTowerId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 towerId = 1;</code>
     */
    public int getTowerId() {
      return towerId_;
    }
    /**
     * <code>required uint32 towerId = 1;</code>
     */
    public Builder setTowerId(int value) {
      bitField0_ |= 0x00000001;
      towerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint32 towerId = 1;</code>
     */
    public Builder clearTowerId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      towerId_ = 0;
      onChanged();
      return this;
    }

    private int enemyId_ ;
    /**
     * <code>required uint32 enemyId = 2;</code>
     */
    public boolean hasEnemyId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 enemyId = 2;</code>
     */
    public int getEnemyId() {
      return enemyId_;
    }
    /**
     * <code>required uint32 enemyId = 2;</code>
     */
    public Builder setEnemyId(int value) {
      bitField0_ |= 0x00000002;
      enemyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint32 enemyId = 2;</code>
     */
    public Builder clearEnemyId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      enemyId_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:coms309.server.CollisionEvent)
  }

  // @@protoc_insertion_point(class_scope:coms309.server.CollisionEvent)
  private static final coms309.server.Schema.CollisionEvent DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new coms309.server.Schema.CollisionEvent();
  }

  public static coms309.server.Schema.CollisionEvent getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<CollisionEvent>
      PARSER = new com.google.protobuf.AbstractParser<CollisionEvent>() {
    public CollisionEvent parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new CollisionEvent(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CollisionEvent> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CollisionEvent> getParserForType() {
    return PARSER;
  }

  public coms309.server.Schema.CollisionEvent getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
