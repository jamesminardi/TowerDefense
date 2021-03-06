// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DataObject.proto

package coms309.server.Schema;

/**
 * <pre>
 *Buffer to hold lobby data
 * </pre>
 *
 * Protobuf type {@code coms309.server.GamestateSchema}
 */
public  final class GamestateSchema extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coms309.server.GamestateSchema)
    GamestateSchemaOrBuilder {
  // Use GamestateSchema.newBuilder() to construct.
  private GamestateSchema(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GamestateSchema() {
    difficulty_ = 0;
    status_ = 0;
    map_ = 0;
    round_ = 0;
    health_ = 0;
    balance_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GamestateSchema(
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
            difficulty_ = input.readUInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            status_ = input.readUInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            map_ = input.readUInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            round_ = input.readUInt32();
            break;
          }
          case 40: {
            bitField0_ |= 0x00000010;
            health_ = input.readUInt32();
            break;
          }
          case 48: {
            bitField0_ |= 0x00000020;
            balance_ = input.readUInt32();
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
    return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_GamestateSchema_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_GamestateSchema_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            coms309.server.Schema.GamestateSchema.class, coms309.server.Schema.GamestateSchema.Builder.class);
  }

  private int bitField0_;
  public static final int DIFFICULTY_FIELD_NUMBER = 1;
  private int difficulty_;
  /**
   * <code>optional uint32 difficulty = 1;</code>
   */
  public boolean hasDifficulty() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>optional uint32 difficulty = 1;</code>
   */
  public int getDifficulty() {
    return difficulty_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>optional uint32 status = 2;</code>
   */
  public boolean hasStatus() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional uint32 status = 2;</code>
   */
  public int getStatus() {
    return status_;
  }

  public static final int MAP_FIELD_NUMBER = 3;
  private int map_;
  /**
   * <code>optional uint32 map = 3;</code>
   */
  public boolean hasMap() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional uint32 map = 3;</code>
   */
  public int getMap() {
    return map_;
  }

  public static final int ROUND_FIELD_NUMBER = 4;
  private int round_;
  /**
   * <code>optional uint32 round = 4;</code>
   */
  public boolean hasRound() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>optional uint32 round = 4;</code>
   */
  public int getRound() {
    return round_;
  }

  public static final int HEALTH_FIELD_NUMBER = 5;
  private int health_;
  /**
   * <code>optional uint32 health = 5;</code>
   */
  public boolean hasHealth() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional uint32 health = 5;</code>
   */
  public int getHealth() {
    return health_;
  }

  public static final int BALANCE_FIELD_NUMBER = 6;
  private int balance_;
  /**
   * <code>optional uint32 balance = 6;</code>
   */
  public boolean hasBalance() {
    return ((bitField0_ & 0x00000020) == 0x00000020);
  }
  /**
   * <code>optional uint32 balance = 6;</code>
   */
  public int getBalance() {
    return balance_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeUInt32(1, difficulty_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeUInt32(2, status_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeUInt32(3, map_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeUInt32(4, round_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeUInt32(5, health_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      output.writeUInt32(6, balance_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, difficulty_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, status_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, map_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, round_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, health_);
    }
    if (((bitField0_ & 0x00000020) == 0x00000020)) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, balance_);
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
    if (!(obj instanceof coms309.server.Schema.GamestateSchema)) {
      return super.equals(obj);
    }
    coms309.server.Schema.GamestateSchema other = (coms309.server.Schema.GamestateSchema) obj;

    boolean result = true;
    result = result && (hasDifficulty() == other.hasDifficulty());
    if (hasDifficulty()) {
      result = result && (getDifficulty()
          == other.getDifficulty());
    }
    result = result && (hasStatus() == other.hasStatus());
    if (hasStatus()) {
      result = result && (getStatus()
          == other.getStatus());
    }
    result = result && (hasMap() == other.hasMap());
    if (hasMap()) {
      result = result && (getMap()
          == other.getMap());
    }
    result = result && (hasRound() == other.hasRound());
    if (hasRound()) {
      result = result && (getRound()
          == other.getRound());
    }
    result = result && (hasHealth() == other.hasHealth());
    if (hasHealth()) {
      result = result && (getHealth()
          == other.getHealth());
    }
    result = result && (hasBalance() == other.hasBalance());
    if (hasBalance()) {
      result = result && (getBalance()
          == other.getBalance());
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
    if (hasDifficulty()) {
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
    }
    if (hasStatus()) {
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus();
    }
    if (hasMap()) {
      hash = (37 * hash) + MAP_FIELD_NUMBER;
      hash = (53 * hash) + getMap();
    }
    if (hasRound()) {
      hash = (37 * hash) + ROUND_FIELD_NUMBER;
      hash = (53 * hash) + getRound();
    }
    if (hasHealth()) {
      hash = (37 * hash) + HEALTH_FIELD_NUMBER;
      hash = (53 * hash) + getHealth();
    }
    if (hasBalance()) {
      hash = (37 * hash) + BALANCE_FIELD_NUMBER;
      hash = (53 * hash) + getBalance();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static coms309.server.Schema.GamestateSchema parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static coms309.server.Schema.GamestateSchema parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.GamestateSchema parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static coms309.server.Schema.GamestateSchema parseFrom(
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
  public static Builder newBuilder(coms309.server.Schema.GamestateSchema prototype) {
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
   *Buffer to hold lobby data
   * </pre>
   *
   * Protobuf type {@code coms309.server.GamestateSchema}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coms309.server.GamestateSchema)
      coms309.server.Schema.GamestateSchemaOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_GamestateSchema_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_GamestateSchema_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              coms309.server.Schema.GamestateSchema.class, coms309.server.Schema.GamestateSchema.Builder.class);
    }

    // Construct using coms309.server.Schema.GamestateSchema.newBuilder()
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
      difficulty_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      status_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      map_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      round_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      health_ = 0;
      bitField0_ = (bitField0_ & ~0x00000010);
      balance_ = 0;
      bitField0_ = (bitField0_ & ~0x00000020);
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return coms309.server.Schema.DataObjectProto.internal_static_coms309_server_GamestateSchema_descriptor;
    }

    public coms309.server.Schema.GamestateSchema getDefaultInstanceForType() {
      return coms309.server.Schema.GamestateSchema.getDefaultInstance();
    }

    public coms309.server.Schema.GamestateSchema build() {
      coms309.server.Schema.GamestateSchema result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public coms309.server.Schema.GamestateSchema buildPartial() {
      coms309.server.Schema.GamestateSchema result = new coms309.server.Schema.GamestateSchema(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.difficulty_ = difficulty_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.status_ = status_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.map_ = map_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.round_ = round_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.health_ = health_;
      if (((from_bitField0_ & 0x00000020) == 0x00000020)) {
        to_bitField0_ |= 0x00000020;
      }
      result.balance_ = balance_;
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
      if (other instanceof coms309.server.Schema.GamestateSchema) {
        return mergeFrom((coms309.server.Schema.GamestateSchema)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(coms309.server.Schema.GamestateSchema other) {
      if (other == coms309.server.Schema.GamestateSchema.getDefaultInstance()) return this;
      if (other.hasDifficulty()) {
        setDifficulty(other.getDifficulty());
      }
      if (other.hasStatus()) {
        setStatus(other.getStatus());
      }
      if (other.hasMap()) {
        setMap(other.getMap());
      }
      if (other.hasRound()) {
        setRound(other.getRound());
      }
      if (other.hasHealth()) {
        setHealth(other.getHealth());
      }
      if (other.hasBalance()) {
        setBalance(other.getBalance());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      coms309.server.Schema.GamestateSchema parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (coms309.server.Schema.GamestateSchema) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int difficulty_ ;
    /**
     * <code>optional uint32 difficulty = 1;</code>
     */
    public boolean hasDifficulty() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional uint32 difficulty = 1;</code>
     */
    public int getDifficulty() {
      return difficulty_;
    }
    /**
     * <code>optional uint32 difficulty = 1;</code>
     */
    public Builder setDifficulty(int value) {
      bitField0_ |= 0x00000001;
      difficulty_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 difficulty = 1;</code>
     */
    public Builder clearDifficulty() {
      bitField0_ = (bitField0_ & ~0x00000001);
      difficulty_ = 0;
      onChanged();
      return this;
    }

    private int status_ ;
    /**
     * <code>optional uint32 status = 2;</code>
     */
    public boolean hasStatus() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional uint32 status = 2;</code>
     */
    public int getStatus() {
      return status_;
    }
    /**
     * <code>optional uint32 status = 2;</code>
     */
    public Builder setStatus(int value) {
      bitField0_ |= 0x00000002;
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 status = 2;</code>
     */
    public Builder clearStatus() {
      bitField0_ = (bitField0_ & ~0x00000002);
      status_ = 0;
      onChanged();
      return this;
    }

    private int map_ ;
    /**
     * <code>optional uint32 map = 3;</code>
     */
    public boolean hasMap() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional uint32 map = 3;</code>
     */
    public int getMap() {
      return map_;
    }
    /**
     * <code>optional uint32 map = 3;</code>
     */
    public Builder setMap(int value) {
      bitField0_ |= 0x00000004;
      map_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 map = 3;</code>
     */
    public Builder clearMap() {
      bitField0_ = (bitField0_ & ~0x00000004);
      map_ = 0;
      onChanged();
      return this;
    }

    private int round_ ;
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public boolean hasRound() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public int getRound() {
      return round_;
    }
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public Builder setRound(int value) {
      bitField0_ |= 0x00000008;
      round_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 round = 4;</code>
     */
    public Builder clearRound() {
      bitField0_ = (bitField0_ & ~0x00000008);
      round_ = 0;
      onChanged();
      return this;
    }

    private int health_ ;
    /**
     * <code>optional uint32 health = 5;</code>
     */
    public boolean hasHealth() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional uint32 health = 5;</code>
     */
    public int getHealth() {
      return health_;
    }
    /**
     * <code>optional uint32 health = 5;</code>
     */
    public Builder setHealth(int value) {
      bitField0_ |= 0x00000010;
      health_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 health = 5;</code>
     */
    public Builder clearHealth() {
      bitField0_ = (bitField0_ & ~0x00000010);
      health_ = 0;
      onChanged();
      return this;
    }

    private int balance_ ;
    /**
     * <code>optional uint32 balance = 6;</code>
     */
    public boolean hasBalance() {
      return ((bitField0_ & 0x00000020) == 0x00000020);
    }
    /**
     * <code>optional uint32 balance = 6;</code>
     */
    public int getBalance() {
      return balance_;
    }
    /**
     * <code>optional uint32 balance = 6;</code>
     */
    public Builder setBalance(int value) {
      bitField0_ |= 0x00000020;
      balance_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 balance = 6;</code>
     */
    public Builder clearBalance() {
      bitField0_ = (bitField0_ & ~0x00000020);
      balance_ = 0;
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


    // @@protoc_insertion_point(builder_scope:coms309.server.GamestateSchema)
  }

  // @@protoc_insertion_point(class_scope:coms309.server.GamestateSchema)
  private static final coms309.server.Schema.GamestateSchema DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new coms309.server.Schema.GamestateSchema();
  }

  public static coms309.server.Schema.GamestateSchema getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<GamestateSchema>
      PARSER = new com.google.protobuf.AbstractParser<GamestateSchema>() {
    public GamestateSchema parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GamestateSchema(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GamestateSchema> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GamestateSchema> getParserForType() {
    return PARSER;
  }

  public coms309.server.Schema.GamestateSchema getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

