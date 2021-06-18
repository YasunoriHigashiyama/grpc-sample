// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sendmail.proto

package jp.co.neosystem.grpc;

/**
 * Protobuf type {@code sendmail.MailRequest}
 */
public final class MailRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sendmail.MailRequest)
    MailRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MailRequest.newBuilder() to construct.
  private MailRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MailRequest() {
    from_ = "";
    to_ = "";
    subject_ = "";
    text_ = "";
    attach_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MailRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MailRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            from_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            to_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            subject_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            text_ = s;
            break;
          }
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              attach_ = new java.util.ArrayList<com.google.protobuf.ByteString>();
              mutable_bitField0_ |= 0x00000001;
            }
            attach_.add(input.readBytes());
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        attach_ = java.util.Collections.unmodifiableList(attach_); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return jp.co.neosystem.grpc.Sendmail.internal_static_sendmail_MailRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return jp.co.neosystem.grpc.Sendmail.internal_static_sendmail_MailRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            jp.co.neosystem.grpc.MailRequest.class, jp.co.neosystem.grpc.MailRequest.Builder.class);
  }

  public static final int FROM_FIELD_NUMBER = 1;
  private volatile java.lang.Object from_;
  /**
   * <code>string from = 1;</code>
   * @return The from.
   */
  @java.lang.Override
  public java.lang.String getFrom() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      from_ = s;
      return s;
    }
  }
  /**
   * <code>string from = 1;</code>
   * @return The bytes for from.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFromBytes() {
    java.lang.Object ref = from_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      from_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TO_FIELD_NUMBER = 2;
  private volatile java.lang.Object to_;
  /**
   * <code>string to = 2;</code>
   * @return The to.
   */
  @java.lang.Override
  public java.lang.String getTo() {
    java.lang.Object ref = to_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      to_ = s;
      return s;
    }
  }
  /**
   * <code>string to = 2;</code>
   * @return The bytes for to.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToBytes() {
    java.lang.Object ref = to_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      to_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBJECT_FIELD_NUMBER = 3;
  private volatile java.lang.Object subject_;
  /**
   * <code>string subject = 3;</code>
   * @return The subject.
   */
  @java.lang.Override
  public java.lang.String getSubject() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subject_ = s;
      return s;
    }
  }
  /**
   * <code>string subject = 3;</code>
   * @return The bytes for subject.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSubjectBytes() {
    java.lang.Object ref = subject_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      subject_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TEXT_FIELD_NUMBER = 4;
  private volatile java.lang.Object text_;
  /**
   * <code>string text = 4;</code>
   * @return The text.
   */
  @java.lang.Override
  public java.lang.String getText() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      text_ = s;
      return s;
    }
  }
  /**
   * <code>string text = 4;</code>
   * @return The bytes for text.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTextBytes() {
    java.lang.Object ref = text_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      text_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTACH_FIELD_NUMBER = 5;
  private java.util.List<com.google.protobuf.ByteString> attach_;
  /**
   * <code>repeated bytes attach = 5;</code>
   * @return A list containing the attach.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getAttachList() {
    return attach_;
  }
  /**
   * <code>repeated bytes attach = 5;</code>
   * @return The count of attach.
   */
  public int getAttachCount() {
    return attach_.size();
  }
  /**
   * <code>repeated bytes attach = 5;</code>
   * @param index The index of the element to return.
   * @return The attach at the given index.
   */
  public com.google.protobuf.ByteString getAttach(int index) {
    return attach_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getFromBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, from_);
    }
    if (!getToBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, to_);
    }
    if (!getSubjectBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subject_);
    }
    if (!getTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, text_);
    }
    for (int i = 0; i < attach_.size(); i++) {
      output.writeBytes(5, attach_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getFromBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, from_);
    }
    if (!getToBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, to_);
    }
    if (!getSubjectBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subject_);
    }
    if (!getTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, text_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < attach_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(attach_.get(i));
      }
      size += dataSize;
      size += 1 * getAttachList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof jp.co.neosystem.grpc.MailRequest)) {
      return super.equals(obj);
    }
    jp.co.neosystem.grpc.MailRequest other = (jp.co.neosystem.grpc.MailRequest) obj;

    if (!getFrom()
        .equals(other.getFrom())) return false;
    if (!getTo()
        .equals(other.getTo())) return false;
    if (!getSubject()
        .equals(other.getSubject())) return false;
    if (!getText()
        .equals(other.getText())) return false;
    if (!getAttachList()
        .equals(other.getAttachList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + FROM_FIELD_NUMBER;
    hash = (53 * hash) + getFrom().hashCode();
    hash = (37 * hash) + TO_FIELD_NUMBER;
    hash = (53 * hash) + getTo().hashCode();
    hash = (37 * hash) + SUBJECT_FIELD_NUMBER;
    hash = (53 * hash) + getSubject().hashCode();
    hash = (37 * hash) + TEXT_FIELD_NUMBER;
    hash = (53 * hash) + getText().hashCode();
    if (getAttachCount() > 0) {
      hash = (37 * hash) + ATTACH_FIELD_NUMBER;
      hash = (53 * hash) + getAttachList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static jp.co.neosystem.grpc.MailRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static jp.co.neosystem.grpc.MailRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static jp.co.neosystem.grpc.MailRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(jp.co.neosystem.grpc.MailRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code sendmail.MailRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sendmail.MailRequest)
      jp.co.neosystem.grpc.MailRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return jp.co.neosystem.grpc.Sendmail.internal_static_sendmail_MailRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return jp.co.neosystem.grpc.Sendmail.internal_static_sendmail_MailRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              jp.co.neosystem.grpc.MailRequest.class, jp.co.neosystem.grpc.MailRequest.Builder.class);
    }

    // Construct using jp.co.neosystem.grpc.MailRequest.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      from_ = "";

      to_ = "";

      subject_ = "";

      text_ = "";

      attach_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return jp.co.neosystem.grpc.Sendmail.internal_static_sendmail_MailRequest_descriptor;
    }

    @java.lang.Override
    public jp.co.neosystem.grpc.MailRequest getDefaultInstanceForType() {
      return jp.co.neosystem.grpc.MailRequest.getDefaultInstance();
    }

    @java.lang.Override
    public jp.co.neosystem.grpc.MailRequest build() {
      jp.co.neosystem.grpc.MailRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public jp.co.neosystem.grpc.MailRequest buildPartial() {
      jp.co.neosystem.grpc.MailRequest result = new jp.co.neosystem.grpc.MailRequest(this);
      int from_bitField0_ = bitField0_;
      result.from_ = from_;
      result.to_ = to_;
      result.subject_ = subject_;
      result.text_ = text_;
      if (((bitField0_ & 0x00000001) != 0)) {
        attach_ = java.util.Collections.unmodifiableList(attach_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.attach_ = attach_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof jp.co.neosystem.grpc.MailRequest) {
        return mergeFrom((jp.co.neosystem.grpc.MailRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(jp.co.neosystem.grpc.MailRequest other) {
      if (other == jp.co.neosystem.grpc.MailRequest.getDefaultInstance()) return this;
      if (!other.getFrom().isEmpty()) {
        from_ = other.from_;
        onChanged();
      }
      if (!other.getTo().isEmpty()) {
        to_ = other.to_;
        onChanged();
      }
      if (!other.getSubject().isEmpty()) {
        subject_ = other.subject_;
        onChanged();
      }
      if (!other.getText().isEmpty()) {
        text_ = other.text_;
        onChanged();
      }
      if (!other.attach_.isEmpty()) {
        if (attach_.isEmpty()) {
          attach_ = other.attach_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAttachIsMutable();
          attach_.addAll(other.attach_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      jp.co.neosystem.grpc.MailRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (jp.co.neosystem.grpc.MailRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object from_ = "";
    /**
     * <code>string from = 1;</code>
     * @return The from.
     */
    public java.lang.String getFrom() {
      java.lang.Object ref = from_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        from_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string from = 1;</code>
     * @return The bytes for from.
     */
    public com.google.protobuf.ByteString
        getFromBytes() {
      java.lang.Object ref = from_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        from_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string from = 1;</code>
     * @param value The from to set.
     * @return This builder for chaining.
     */
    public Builder setFrom(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      from_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFrom() {
      
      from_ = getDefaultInstance().getFrom();
      onChanged();
      return this;
    }
    /**
     * <code>string from = 1;</code>
     * @param value The bytes for from to set.
     * @return This builder for chaining.
     */
    public Builder setFromBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      from_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object to_ = "";
    /**
     * <code>string to = 2;</code>
     * @return The to.
     */
    public java.lang.String getTo() {
      java.lang.Object ref = to_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        to_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string to = 2;</code>
     * @return The bytes for to.
     */
    public com.google.protobuf.ByteString
        getToBytes() {
      java.lang.Object ref = to_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        to_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string to = 2;</code>
     * @param value The to to set.
     * @return This builder for chaining.
     */
    public Builder setTo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      to_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string to = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTo() {
      
      to_ = getDefaultInstance().getTo();
      onChanged();
      return this;
    }
    /**
     * <code>string to = 2;</code>
     * @param value The bytes for to to set.
     * @return This builder for chaining.
     */
    public Builder setToBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      to_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object subject_ = "";
    /**
     * <code>string subject = 3;</code>
     * @return The subject.
     */
    public java.lang.String getSubject() {
      java.lang.Object ref = subject_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subject_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string subject = 3;</code>
     * @return The bytes for subject.
     */
    public com.google.protobuf.ByteString
        getSubjectBytes() {
      java.lang.Object ref = subject_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        subject_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string subject = 3;</code>
     * @param value The subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubject(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      subject_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSubject() {
      
      subject_ = getDefaultInstance().getSubject();
      onChanged();
      return this;
    }
    /**
     * <code>string subject = 3;</code>
     * @param value The bytes for subject to set.
     * @return This builder for chaining.
     */
    public Builder setSubjectBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      subject_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object text_ = "";
    /**
     * <code>string text = 4;</code>
     * @return The text.
     */
    public java.lang.String getText() {
      java.lang.Object ref = text_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        text_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string text = 4;</code>
     * @return The bytes for text.
     */
    public com.google.protobuf.ByteString
        getTextBytes() {
      java.lang.Object ref = text_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        text_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string text = 4;</code>
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      text_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string text = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearText() {
      
      text_ = getDefaultInstance().getText();
      onChanged();
      return this;
    }
    /**
     * <code>string text = 4;</code>
     * @param value The bytes for text to set.
     * @return This builder for chaining.
     */
    public Builder setTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      text_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> attach_ = java.util.Collections.emptyList();
    private void ensureAttachIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        attach_ = new java.util.ArrayList<com.google.protobuf.ByteString>(attach_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @return A list containing the attach.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getAttachList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(attach_) : attach_;
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @return The count of attach.
     */
    public int getAttachCount() {
      return attach_.size();
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @param index The index of the element to return.
     * @return The attach at the given index.
     */
    public com.google.protobuf.ByteString getAttach(int index) {
      return attach_.get(index);
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @param index The index to set the value at.
     * @param value The attach to set.
     * @return This builder for chaining.
     */
    public Builder setAttach(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAttachIsMutable();
      attach_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @param value The attach to add.
     * @return This builder for chaining.
     */
    public Builder addAttach(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureAttachIsMutable();
      attach_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @param values The attach to add.
     * @return This builder for chaining.
     */
    public Builder addAllAttach(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureAttachIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, attach_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes attach = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearAttach() {
      attach_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:sendmail.MailRequest)
  }

  // @@protoc_insertion_point(class_scope:sendmail.MailRequest)
  private static final jp.co.neosystem.grpc.MailRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new jp.co.neosystem.grpc.MailRequest();
  }

  public static jp.co.neosystem.grpc.MailRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MailRequest>
      PARSER = new com.google.protobuf.AbstractParser<MailRequest>() {
    @java.lang.Override
    public MailRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MailRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MailRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MailRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public jp.co.neosystem.grpc.MailRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

