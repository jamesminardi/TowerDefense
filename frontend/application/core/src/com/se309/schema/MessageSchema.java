// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataObject.proto

package com.se309.schema;

/**
 * Protobuf type {@code coms309.server.MessageSchema}
 */
public  final class MessageSchema extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coms309.server.MessageSchema)
    MessageSchemaOrBuilder {
  // Use MessageSchema.newBuilder() to construct.
  private MessageSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageSchema() {
    author_ = "";
    code_ = "";
    message_ = "";
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageSchema(
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
          case 10: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000001;
            author_ = bs;
            break;
          }
          case 18: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000002;
            code_ = bs;
            break;
          }
          case 26: {
            com.google.protobuf.ByteString bs = input.readBytes();
            bitField0_ |= 0x00000004;
            message_ = bs;
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
    return com.se309.schema.DataObjectProto.internal_static_coms309_server_MessageSchema_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.se309.schema.DataObjectProto.internal_static_coms309_server_MessageSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.se309.schema.MessageSchema.class, com.se309.schema.MessageSchema.Builder.class);
  }

  private int bitField0_;
  public static final int AUTHOR_FIELD_NUMBER = 1;
  private volatile Object author_;
  /**
   * <code>optional string author = 1;</code>
   */
  public boolean hasAuthor() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional string author = 1;</code>
   */
  public String getAuthor() {
    Object ref = author_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        author_ = s;
      }
      return s;
    }
  }
  /**
   * <code>optional string author = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAuthorBytes() {
    Object ref = author_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      author_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private volatile Object code_;
  /**
   * <code>required string code = 2;</code>
   */
  public boolean hasCode() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>required string code = 2;</code>
   */
  public String getCode() {
    Object ref = code_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        code_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string code = 2;</code>
   */
  public com.google.protobuf.ByteString
      getCodeBytes() {
    Object ref = code_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      code_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile Object message_;
  /**
   * <code>required string message = 3;</code>
   */
  public boolean hasMessage() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>required string message = 3;</code>
   */
  public String getMessage() {
    Object ref = message_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      if (bs.isValidUtf8()) {
        message_ = s;
      }
      return s;
    }
  }
  /**
   * <code>required string message = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    Object ref = message_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasCode()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasMessage()) {
      memoizedIsInitialized = 0;
      return false;
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, author_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, code_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, author_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, code_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.se309.schema.MessageSchema)) {
      return super.equals(obj);
    }
    com.se309.schema.MessageSchema other = (com.se309.schema.MessageSchema) obj;

    boolean result = true;
    result = result && (hasAuthor() == other.hasAuthor());
    if (hasAuthor()) {
      result = result && getAuthor()
          .equals(other.getAuthor());
    }
    result = result && (hasCode() == other.hasCode());
    if (hasCode()) {
      result = result && getCode()
          .equals(other.getCode());
    }
    result = result && (hasMessage() == other.hasMessage());
    if (hasMessage()) {
      result = result && getMessage()
          .equals(other.getMessage());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (hasAuthor()) {
      hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
      hash = (53 * hash) + getAuthor().hashCode();
    }
    if (hasCode()) {
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode().hashCode();
    }
    if (hasMessage()) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.se309.schema.MessageSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.se309.schema.MessageSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.se309.schema.MessageSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.se309.schema.MessageSchema parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.se309.schema.MessageSchema parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.se309.schema.MessageSchema parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.se309.schema.MessageSchema parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.se309.schema.MessageSchema parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.se309.schema.MessageSchema parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.se309.schema.MessageSchema parseFrom(
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
  public static Builder newBuilder(com.se309.schema.MessageSchema prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code coms309.server.MessageSchema}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coms309.server.MessageSchema)
      com.se309.schema.MessageSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.se309.schema.DataObjectProto.internal_static_coms309_server_MessageSchema_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.se309.schema.DataObjectProto.internal_static_coms309_server_MessageSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.se309.schema.MessageSchema.class, com.se309.schema.MessageSchema.Builder.class);
    }

    // Construct using com.se309.schema.MessageSchema.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
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
      author_ = "";
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = "";
      bitField0_ = (bitField0_ & ~0x00000002);
      message_ = "";
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.se309.schema.DataObjectProto.internal_static_coms309_server_MessageSchema_descriptor;
    }

    public com.se309.schema.MessageSchema getDefaultInstanceForType() {
      return com.se309.schema.MessageSchema.getDefaultInstance();
    }

    public com.se309.schema.MessageSchema build() {
      com.se309.schema.MessageSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.se309.schema.MessageSchema buildPartial() {
      com.se309.schema.MessageSchema result = new com.se309.schema.MessageSchema(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.author_ = author_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.code_ = code_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.message_ = message_;
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
      if (other instanceof com.se309.schema.MessageSchema) {
        return mergeFrom((com.se309.schema.MessageSchema)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.se309.schema.MessageSchema other) {
      if (other == com.se309.schema.MessageSchema.getDefaultInstance()) return this;
      if (other.hasAuthor()) {
        bitField0_ |= 0x00000001;
        author_ = other.author_;
        onChanged();
      }
      if (other.hasCode()) {
        bitField0_ |= 0x00000002;
        code_ = other.code_;
        onChanged();
      }
      if (other.hasMessage()) {
        bitField0_ |= 0x00000004;
        message_ = other.message_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      if (!hasCode()) {
        return false;
      }
      if (!hasMessage()) {
        return false;
      }
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.se309.schema.MessageSchema parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.se309.schema.MessageSchema) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private Object author_ = "";
    /**
     * <code>optional string author = 1;</code>
     */
    public boolean hasAuthor() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string author = 1;</code>
     */
    public String getAuthor() {
      Object ref = author_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          author_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>optional string author = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAuthorBytes() {
      Object ref = author_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        author_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string author = 1;</code>
     */
    public Builder setAuthor(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      author_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string author = 1;</code>
     */
    public Builder clearAuthor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      author_ = getDefaultInstance().getAuthor();
      onChanged();
      return this;
    }
    /**
     * <code>optional string author = 1;</code>
     */
    public Builder setAuthorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      author_ = value;
      onChanged();
      return this;
    }

    private Object code_ = "";
    /**
     * <code>required string code = 2;</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string code = 2;</code>
     */
    public String getCode() {
      Object ref = code_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          code_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>required string code = 2;</code>
     */
    public com.google.protobuf.ByteString
        getCodeBytes() {
      Object ref = code_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string code = 2;</code>
     */
    public Builder setCode(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string code = 2;</code>
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      code_ = getDefaultInstance().getCode();
      onChanged();
      return this;
    }
    /**
     * <code>required string code = 2;</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      code_ = value;
      onChanged();
      return this;
    }

    private Object message_ = "";
    /**
     * <code>required string message = 3;</code>
     */
    public boolean hasMessage() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required string message = 3;</code>
     */
    public String getMessage() {
      Object ref = message_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          message_ = s;
        }
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>required string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>required string message = 3;</code>
     */
    public Builder setMessage(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>required string message = 3;</code>
     */
    public Builder clearMessage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>required string message = 3;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      message_ = value;
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


    // @@protoc_insertion_point(builder_scope:coms309.server.MessageSchema)
  }

  // @@protoc_insertion_point(class_scope:coms309.server.MessageSchema)
  private static final com.se309.schema.MessageSchema DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.se309.schema.MessageSchema();
  }

  public static com.se309.schema.MessageSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @Deprecated public static final com.google.protobuf.Parser<MessageSchema>
      PARSER = new com.google.protobuf.AbstractParser<MessageSchema>() {
    public MessageSchema parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new MessageSchema(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageSchema> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<MessageSchema> getParserForType() {
    return PARSER;
  }

  public com.se309.schema.MessageSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

