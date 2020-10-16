// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compiler/ir/serialization.common/src/KotlinIr.proto

package org.jetbrains.kotlin.backend.common.serialization.proto;

/**
 * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference}
 */
public final class IrLocalDelegatedPropertyReference extends
    org.jetbrains.kotlin.protobuf.GeneratedMessageLite implements
    // @@protoc_insertion_point(message_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference)
    IrLocalDelegatedPropertyReferenceOrBuilder {
  // Use IrLocalDelegatedPropertyReference.newBuilder() to construct.
  private IrLocalDelegatedPropertyReference(org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder builder) {
    super(builder);
    this.unknownFields = builder.getUnknownFields();
  }
  private IrLocalDelegatedPropertyReference(boolean noInit) { this.unknownFields = org.jetbrains.kotlin.protobuf.ByteString.EMPTY;}

  private static final IrLocalDelegatedPropertyReference defaultInstance;
  public static IrLocalDelegatedPropertyReference getDefaultInstance() {
    return defaultInstance;
  }

  public IrLocalDelegatedPropertyReference getDefaultInstanceForType() {
    return defaultInstance;
  }

  private final org.jetbrains.kotlin.protobuf.ByteString unknownFields;
  private IrLocalDelegatedPropertyReference(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    initFields();
    int mutable_bitField0_ = 0;
    org.jetbrains.kotlin.protobuf.ByteString.Output unknownFieldsOutput =
        org.jetbrains.kotlin.protobuf.ByteString.newOutput();
    org.jetbrains.kotlin.protobuf.CodedOutputStream unknownFieldsCodedOutput =
        org.jetbrains.kotlin.protobuf.CodedOutputStream.newInstance(
            unknownFieldsOutput, 1);
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownField(input, unknownFieldsCodedOutput,
                                   extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            bitField0_ |= 0x00000001;
            delegate_ = input.readInt32();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            getter_ = input.readInt32();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            setter_ = input.readInt32();
            break;
          }
          case 32: {
            bitField0_ |= 0x00000008;
            symbol_ = input.readInt32();
            break;
          }
          case 42: {
            org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.Builder subBuilder = null;
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
              subBuilder = origin_.toBuilder();
            }
            origin_ = input.readMessage(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.PARSER, extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(origin_);
              origin_ = subBuilder.buildPartial();
            }
            bitField0_ |= 0x00000010;
            break;
          }
        }
      }
    } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException(
          e.getMessage()).setUnfinishedMessage(this);
    } finally {
      try {
        unknownFieldsCodedOutput.flush();
      } catch (java.io.IOException e) {
      // Should not happen
      } finally {
        unknownFields = unknownFieldsOutput.toByteString();
      }
      makeExtensionsImmutable();
    }
  }
  public static org.jetbrains.kotlin.protobuf.Parser<IrLocalDelegatedPropertyReference> PARSER =
      new org.jetbrains.kotlin.protobuf.AbstractParser<IrLocalDelegatedPropertyReference>() {
    public IrLocalDelegatedPropertyReference parsePartialFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
      return new IrLocalDelegatedPropertyReference(input, extensionRegistry);
    }
  };

  @java.lang.Override
  public org.jetbrains.kotlin.protobuf.Parser<IrLocalDelegatedPropertyReference> getParserForType() {
    return PARSER;
  }

  private int bitField0_;
  public static final int DELEGATE_FIELD_NUMBER = 1;
  private int delegate_;
  /**
   * <code>required int32 delegate = 1;</code>
   */
  public boolean hasDelegate() {
    return ((bitField0_ & 0x00000001) == 0x00000001);
  }
  /**
   * <code>required int32 delegate = 1;</code>
   */
  public int getDelegate() {
    return delegate_;
  }

  public static final int GETTER_FIELD_NUMBER = 2;
  private int getter_;
  /**
   * <code>optional int32 getter = 2;</code>
   */
  public boolean hasGetter() {
    return ((bitField0_ & 0x00000002) == 0x00000002);
  }
  /**
   * <code>optional int32 getter = 2;</code>
   */
  public int getGetter() {
    return getter_;
  }

  public static final int SETTER_FIELD_NUMBER = 3;
  private int setter_;
  /**
   * <code>optional int32 setter = 3;</code>
   */
  public boolean hasSetter() {
    return ((bitField0_ & 0x00000004) == 0x00000004);
  }
  /**
   * <code>optional int32 setter = 3;</code>
   */
  public int getSetter() {
    return setter_;
  }

  public static final int SYMBOL_FIELD_NUMBER = 4;
  private int symbol_;
  /**
   * <code>required int32 symbol = 4;</code>
   */
  public boolean hasSymbol() {
    return ((bitField0_ & 0x00000008) == 0x00000008);
  }
  /**
   * <code>required int32 symbol = 4;</code>
   */
  public int getSymbol() {
    return symbol_;
  }

  public static final int ORIGIN_FIELD_NUMBER = 5;
  private org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin_;
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
   */
  public boolean hasOrigin() {
    return ((bitField0_ & 0x00000010) == 0x00000010);
  }
  /**
   * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
   */
  public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getOrigin() {
    return origin_;
  }

  private void initFields() {
    delegate_ = 0;
    getter_ = 0;
    setter_ = 0;
    symbol_ = 0;
    origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
  }
  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    if (!hasDelegate()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (!hasSymbol()) {
      memoizedIsInitialized = 0;
      return false;
    }
    if (hasOrigin()) {
      if (!getOrigin().isInitialized()) {
        memoizedIsInitialized = 0;
        return false;
      }
    }
    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(org.jetbrains.kotlin.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      output.writeInt32(1, delegate_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      output.writeInt32(2, getter_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      output.writeInt32(3, setter_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      output.writeInt32(4, symbol_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      output.writeMessage(5, origin_);
    }
    output.writeRawBytes(unknownFields);
  }

  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) == 0x00000001)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(1, delegate_);
    }
    if (((bitField0_ & 0x00000002) == 0x00000002)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(2, getter_);
    }
    if (((bitField0_ & 0x00000004) == 0x00000004)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(3, setter_);
    }
    if (((bitField0_ & 0x00000008) == 0x00000008)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeInt32Size(4, symbol_);
    }
    if (((bitField0_ & 0x00000010) == 0x00000010)) {
      size += org.jetbrains.kotlin.protobuf.CodedOutputStream
        .computeMessageSize(5, origin_);
    }
    size += unknownFields.size();
    memoizedSerializedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  protected java.lang.Object writeReplace()
      throws java.io.ObjectStreamException {
    return super.writeReplace();
  }

  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(
      org.jetbrains.kotlin.protobuf.ByteString data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(byte[] data)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(
      byte[] data,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseDelimitedFrom(
      java.io.InputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parseFrom(
      org.jetbrains.kotlin.protobuf.CodedInputStream input,
      org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }

  /**
   * Protobuf type {@code org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference}
   */
  public static final class Builder extends
      org.jetbrains.kotlin.protobuf.GeneratedMessageLite.Builder<
        org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference, Builder>
      implements
      // @@protoc_insertion_point(builder_implements:org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference)
      org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReferenceOrBuilder {
    // Construct using org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
    }
    private static Builder create() {
      return new Builder();
    }

    public Builder clear() {
      super.clear();
      delegate_ = 0;
      bitField0_ = (bitField0_ & ~0x00000001);
      getter_ = 0;
      bitField0_ = (bitField0_ & ~0x00000002);
      setter_ = 0;
      bitField0_ = (bitField0_ & ~0x00000004);
      symbol_ = 0;
      bitField0_ = (bitField0_ & ~0x00000008);
      origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    public Builder clone() {
      return create().mergeFrom(buildPartial());
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference getDefaultInstanceForType() {
      return org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference.getDefaultInstance();
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference build() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference buildPartial() {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference result = new org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
        to_bitField0_ |= 0x00000001;
      }
      result.delegate_ = delegate_;
      if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
        to_bitField0_ |= 0x00000002;
      }
      result.getter_ = getter_;
      if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
        to_bitField0_ |= 0x00000004;
      }
      result.setter_ = setter_;
      if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
        to_bitField0_ |= 0x00000008;
      }
      result.symbol_ = symbol_;
      if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
        to_bitField0_ |= 0x00000010;
      }
      result.origin_ = origin_;
      result.bitField0_ = to_bitField0_;
      return result;
    }

    public Builder mergeFrom(org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference other) {
      if (other == org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference.getDefaultInstance()) return this;
      if (other.hasDelegate()) {
        setDelegate(other.getDelegate());
      }
      if (other.hasGetter()) {
        setGetter(other.getGetter());
      }
      if (other.hasSetter()) {
        setSetter(other.getSetter());
      }
      if (other.hasSymbol()) {
        setSymbol(other.getSymbol());
      }
      if (other.hasOrigin()) {
        mergeOrigin(other.getOrigin());
      }
      setUnknownFields(
          getUnknownFields().concat(other.unknownFields));
      return this;
    }

    public final boolean isInitialized() {
      if (!hasDelegate()) {
        
        return false;
      }
      if (!hasSymbol()) {
        
        return false;
      }
      if (hasOrigin()) {
        if (!getOrigin().isInitialized()) {
          
          return false;
        }
      }
      return true;
    }

    public Builder mergeFrom(
        org.jetbrains.kotlin.protobuf.CodedInputStream input,
        org.jetbrains.kotlin.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (org.jetbrains.kotlin.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int delegate_ ;
    /**
     * <code>required int32 delegate = 1;</code>
     */
    public boolean hasDelegate() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 delegate = 1;</code>
     */
    public int getDelegate() {
      return delegate_;
    }
    /**
     * <code>required int32 delegate = 1;</code>
     */
    public Builder setDelegate(int value) {
      bitField0_ |= 0x00000001;
      delegate_ = value;
      
      return this;
    }
    /**
     * <code>required int32 delegate = 1;</code>
     */
    public Builder clearDelegate() {
      bitField0_ = (bitField0_ & ~0x00000001);
      delegate_ = 0;
      
      return this;
    }

    private int getter_ ;
    /**
     * <code>optional int32 getter = 2;</code>
     */
    public boolean hasGetter() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 getter = 2;</code>
     */
    public int getGetter() {
      return getter_;
    }
    /**
     * <code>optional int32 getter = 2;</code>
     */
    public Builder setGetter(int value) {
      bitField0_ |= 0x00000002;
      getter_ = value;
      
      return this;
    }
    /**
     * <code>optional int32 getter = 2;</code>
     */
    public Builder clearGetter() {
      bitField0_ = (bitField0_ & ~0x00000002);
      getter_ = 0;
      
      return this;
    }

    private int setter_ ;
    /**
     * <code>optional int32 setter = 3;</code>
     */
    public boolean hasSetter() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 setter = 3;</code>
     */
    public int getSetter() {
      return setter_;
    }
    /**
     * <code>optional int32 setter = 3;</code>
     */
    public Builder setSetter(int value) {
      bitField0_ |= 0x00000004;
      setter_ = value;
      
      return this;
    }
    /**
     * <code>optional int32 setter = 3;</code>
     */
    public Builder clearSetter() {
      bitField0_ = (bitField0_ & ~0x00000004);
      setter_ = 0;
      
      return this;
    }

    private int symbol_ ;
    /**
     * <code>required int32 symbol = 4;</code>
     */
    public boolean hasSymbol() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required int32 symbol = 4;</code>
     */
    public int getSymbol() {
      return symbol_;
    }
    /**
     * <code>required int32 symbol = 4;</code>
     */
    public Builder setSymbol(int value) {
      bitField0_ |= 0x00000008;
      symbol_ = value;
      
      return this;
    }
    /**
     * <code>required int32 symbol = 4;</code>
     */
    public Builder clearSymbol() {
      bitField0_ = (bitField0_ & ~0x00000008);
      symbol_ = 0;
      
      return this;
    }

    private org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
     */
    public boolean hasOrigin() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
     */
    public org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin getOrigin() {
      return origin_;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
     */
    public Builder setOrigin(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin value) {
      if (value == null) {
        throw new NullPointerException();
      }
      origin_ = value;

      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
     */
    public Builder setOrigin(
        org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.Builder builderForValue) {
      origin_ = builderForValue.build();

      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
     */
    public Builder mergeOrigin(org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin value) {
      if (((bitField0_ & 0x00000010) == 0x00000010) &&
          origin_ != org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance()) {
        origin_ =
          org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.newBuilder(origin_).mergeFrom(value).buildPartial();
      } else {
        origin_ = value;
      }

      bitField0_ |= 0x00000010;
      return this;
    }
    /**
     * <code>optional .org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin origin = 5;</code>
     */
    public Builder clearOrigin() {
      origin_ = org.jetbrains.kotlin.backend.common.serialization.proto.IrStatementOrigin.getDefaultInstance();

      bitField0_ = (bitField0_ & ~0x00000010);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference)
  }

  static {
    defaultInstance = new IrLocalDelegatedPropertyReference(true);
    defaultInstance.initFields();
  }

  // @@protoc_insertion_point(class_scope:org.jetbrains.kotlin.backend.common.serialization.proto.IrLocalDelegatedPropertyReference)
}