// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataObject.proto

package coms309.server.Schema;

/**
 * <pre>
 *Buffer to hold tower creation data
 * </pre>
 *
 * Protobuf type {@code coms309.server.TowerSchema}
 */
public  final class TowerSchema extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coms309.server.TowerSchema)
    TowerSchemaOrBuilder {
  // Use TowerSchema.newBuilder() to construct.
  private TowerSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TowerSchema() {
    x_ = 0;
    y_ = 0;
    typeId_ = 0;
    ownerId_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TowerSchema(
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
            x_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            y_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            typeId_ = input.readUInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            ownerId_ = input.readUInt32();
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
    return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_TowerSchema_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_TowerSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            coms309.server.Schema.TowerSchema.class, coms309.server.Schema.TowerSchema.Builder.class);
  }

  private int bitField0_;
  public static final int X_FIELD_NUMBER = 1;
  private int x_;
  /**
   * <code>required uint32 x = 1;</code>
   */
  public boolean hasX() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required uint32 x = 1;</code>
   */
  public int getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private int y_;
  /**
   * <code>required uint32 y = 2;</code>
   */
  public boolean hasY() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required uint32 y = 2;</code>
   */
  public int getY() {
    return y_;
  }

  public static final int TYPEID_FIELD_NUMBER = 3;
  private int typeId_;
  /**
   * <code>required uint32 typeId = 3;</code>
   */
  public boolean hasTypeId() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required uint32 typeId = 3;</code>
   */
  public int getTypeId() {
    return typeId_;
  }

  public static final int OWNERID_FIELD_NUMBER = 4;
  private int ownerId_;
  /**
   * <code>optional uint32 ownerId = 4;</code>
   */
  public boolean hasOwnerId() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional uint32 ownerId = 4;</code>
   */
  public int getOwnerId() {
    return ownerId_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasX()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasY()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasTypeId()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeUInt32(1, x_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeUInt32(2, y_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeUInt32(3, typeId_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeUInt32(4, ownerId_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, x_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, y_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, typeId_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, ownerId_);
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
    if (!(obj instanceof coms309.server.Schema.TowerSchema)) {
      return super.equals(obj);
    }
    coms309.server.Schema.TowerSchema other = (coms309.server.Schema.TowerSchema) obj;

    boolean result = true;
    result = result && (hasX() == other.hasX());
    if (hasX()) {
      result = result && (getX()
          == other.getX());
    }
    result = result && (hasY() == other.hasY());
    if (hasY()) {
      result = result && (getY()
          == other.getY());
    }
    result = result && (hasTypeId() == other.hasTypeId());
    if (hasTypeId()) {
      result = result && (getTypeId()
          == other.getTypeId());
    }
    result = result && (hasOwnerId() == other.hasOwnerId());
    if (hasOwnerId()) {
      result = result && (getOwnerId()
          == other.getOwnerId());
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
    if (hasX()) {
      hash = (37 * hash) + X_FIELD_NUMBER;
      hash = (53 * hash) + getX();
    }
    if (hasY()) {
      hash = (37 * hash) + Y_FIELD_NUMBER;
      hash = (53 * hash) + getY();
    }
    if (hasTypeId()) {
      hash = (37 * hash) + TYPEID_FIELD_NUMBER;
      hash = (53 * hash) + getTypeId();
    }
    if (hasOwnerId()) {
      hash = (37 * hash) + OWNERID_FIELD_NUMBER;
      hash = (53 * hash) + getOwnerId();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static coms309.server.Schema.TowerSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static coms309.server.Schema.TowerSchema parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.TowerSchema parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.TowerSchema parseFrom(
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
  public static Builder newBuilder(coms309.server.Schema.TowerSchema prototype) {
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
   *Buffer to hold tower creation data
   * </pre>
   *
   * Protobuf type {@code coms309.server.TowerSchema}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coms309.server.TowerSchema)
      coms309.server.Schema.TowerSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_TowerSchema_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_TowerSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              coms309.server.Schema.TowerSchema.class, coms309.server.Schema.TowerSchema.Builder.class);
    }

    // Construct using coms309.server.Schema.TowerSchema.newBuilder()
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
      x_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      y_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      typeId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      ownerId_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_TowerSchema_descriptor;
    }

    public coms309.server.Schema.TowerSchema getDefaultInstanceForType() {
      return coms309.server.Schema.TowerSchema.getDefaultInstance();
    }

    public coms309.server.Schema.TowerSchema build() {
      coms309.server.Schema.TowerSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public coms309.server.Schema.TowerSchema buildPartial() {
      coms309.server.Schema.TowerSchema result = new coms309.server.Schema.TowerSchema(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.x_ = x_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.y_ = y_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.typeId_ = typeId_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.ownerId_ = ownerId_;
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
      if (other instanceof coms309.server.Schema.TowerSchema) {
        return mergeFrom((coms309.server.Schema.TowerSchema)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(coms309.server.Schema.TowerSchema other) {
      if (other == coms309.server.Schema.TowerSchema.getDefaultInstance()) return this;
      if (other.hasX()) {
        setX(other.getX());
      }
      if (other.hasY()) {
        setY(other.getY());
      }
      if (other.hasTypeId()) {
        setTypeId(other.getTypeId());
      }
      if (other.hasOwnerId()) {
        setOwnerId(other.getOwnerId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasX()) {
        return false;
      }
      if (!hasY()) {
        return false;
      }
      if (!hasTypeId()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      coms309.server.Schema.TowerSchema parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (coms309.server.Schema.TowerSchema) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int x_ ;
    /**
     * <code>required uint32 x = 1;</code>
     */
    public boolean hasX() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required uint32 x = 1;</code>
     */
    public int getX() {
      return x_;
    }
    /**
     * <code>required uint32 x = 1;</code>
     */
    public Builder setX(int value) {
      bitField0_ |= 0x00000001;
      x_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint32 x = 1;</code>
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000001);
      x_ = 0;
      onChanged();
      return this;
    }

    private int y_ ;
    /**
     * <code>required uint32 y = 2;</code>
     */
    public boolean hasY() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required uint32 y = 2;</code>
     */
    public int getY() {
      return y_;
    }
    /**
     * <code>required uint32 y = 2;</code>
     */
    public Builder setY(int value) {
      bitField0_ |= 0x00000002;
      y_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint32 y = 2;</code>
     */
    public Builder clearY() {
      bitField0_ = (bitField0_ & ~0x00000002);
      y_ = 0;
      onChanged();
      return this;
    }

    private int typeId_ ;
    /**
     * <code>required uint32 typeId = 3;</code>
     */
    public boolean hasTypeId() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required uint32 typeId = 3;</code>
     */
    public int getTypeId() {
      return typeId_;
    }
    /**
     * <code>required uint32 typeId = 3;</code>
     */
    public Builder setTypeId(int value) {
      bitField0_ |= 0x00000004;
      typeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required uint32 typeId = 3;</code>
     */
    public Builder clearTypeId() {
      bitField0_ = (bitField0_ & ~0x00000004);
      typeId_ = 0;
      onChanged();
      return this;
    }

    private int ownerId_ ;
    /**
     * <code>optional uint32 ownerId = 4;</code>
     */
    public boolean hasOwnerId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 ownerId = 4;</code>
     */
    public int getOwnerId() {
      return ownerId_;
    }
    /**
     * <code>optional uint32 ownerId = 4;</code>
     */
    public Builder setOwnerId(int value) {
      bitField0_ |= 0x00000008;
      ownerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 ownerId = 4;</code>
     */
    public Builder clearOwnerId() {
      bitField0_ = (bitField0_ & ~0x00000008);
      ownerId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:coms309.server.TowerSchema)
  }

  // @@protoc_insertion_point(class_scope:coms309.server.TowerSchema)
  private static final coms309.server.Schema.TowerSchema DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new coms309.server.Schema.TowerSchema();
  }

  public static coms309.server.Schema.TowerSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<TowerSchema>
      PARSER = new com.google.protobuf.AbstractParser<TowerSchema>() {
    public TowerSchema parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerSchema(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TowerSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TowerSchema> getParserForType() {
    return PARSER;
  }

  public coms309.server.Schema.TowerSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

