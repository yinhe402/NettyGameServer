// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: common.proto

package com.wolf.shoot.message.auto.common;

import com.google.protobuf.AbstractMessage;

public final class CommonMessageProBuf {
  private CommonMessageProBuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CommonServerErrorResponseWithCmdProBufOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CommonServerErrorResponseWithCmdProBuf)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 cmd = 1;</code>
     */
    boolean hasCmd();
    /**
     * <code>required int32 cmd = 1;</code>
     */
    int getCmd();

    /**
     * <code>required int32 code = 2;</code>
     */
    boolean hasCode();
    /**
     * <code>required int32 code = 2;</code>
     */
    int getCode();

    /**
     * <pre>
     *错误参数，格式：xx,xxx,xxxx
     * </pre>
     *
     * <code>optional string arg = 3;</code>
     */
    boolean hasArg();
    /**
     * <pre>
     *错误参数，格式：xx,xxx,xxxx
     * </pre>
     *
     * <code>optional string arg = 3;</code>
     */
    java.lang.String getArg();
    /**
     * <pre>
     *错误参数，格式：xx,xxx,xxxx
     * </pre>
     *
     * <code>optional string arg = 3;</code>
     */
    com.google.protobuf.ByteString
        getArgBytes();
  }
  /**
   * Protobuf type {@code CommonServerErrorResponseWithCmdProBuf}
   */
  public  static final class CommonServerErrorResponseWithCmdProBuf extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CommonServerErrorResponseWithCmdProBuf)
      CommonServerErrorResponseWithCmdProBufOrBuilder {
    // Use CommonServerErrorResponseWithCmdProBuf.newBuilder() to construct.
    private CommonServerErrorResponseWithCmdProBuf(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CommonServerErrorResponseWithCmdProBuf() {
      cmd_ = 0;
      code_ = 0;
      arg_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CommonServerErrorResponseWithCmdProBuf(
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
              cmd_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              code_ = input.readInt32();
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              arg_ = bs;
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
      return CommonMessageProBuf.internal_static_CommonServerErrorResponseWithCmdProBuf_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return CommonMessageProBuf.internal_static_CommonServerErrorResponseWithCmdProBuf_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.class, CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.Builder.class);
    }

    private int bitField0_;
    public static final int CMD_FIELD_NUMBER = 1;
    private int cmd_;
    /**
     * <code>required int32 cmd = 1;</code>
     */
    public boolean hasCmd() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 cmd = 1;</code>
     */
    public int getCmd() {
      return cmd_;
    }

    public static final int CODE_FIELD_NUMBER = 2;
    private int code_;
    /**
     * <code>required int32 code = 2;</code>
     */
    public boolean hasCode() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 code = 2;</code>
     */
    public int getCode() {
      return code_;
    }

    public static final int ARG_FIELD_NUMBER = 3;
    private volatile java.lang.Object arg_;
    /**
     * <pre>
     *错误参数，格式：xx,xxx,xxxx
     * </pre>
     *
     * <code>optional string arg = 3;</code>
     */
    public boolean hasArg() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <pre>
     *错误参数，格式：xx,xxx,xxxx
     * </pre>
     *
     * <code>optional string arg = 3;</code>
     */
    public java.lang.String getArg() {
      java.lang.Object ref = arg_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          arg_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *错误参数，格式：xx,xxx,xxxx
     * </pre>
     *
     * <code>optional string arg = 3;</code>
     */
    public com.google.protobuf.ByteString
        getArgBytes() {
      java.lang.Object ref = arg_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        arg_ = b;
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

      if (!hasCmd()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCode()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, cmd_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, code_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, arg_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, cmd_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, code_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, arg_);
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
      if (!(obj instanceof CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf)) {
        return super.equals(obj);
      }
      CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf other = (CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf) obj;

      boolean result = true;
      result = result && (hasCmd() == other.hasCmd());
      if (hasCmd()) {
        result = result && (getCmd()
            == other.getCmd());
      }
      result = result && (hasCode() == other.hasCode());
      if (hasCode()) {
        result = result && (getCode()
            == other.getCode());
      }
      result = result && (hasArg() == other.hasArg());
      if (hasArg()) {
        result = result && getArg()
            .equals(other.getArg());
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
      if (hasCmd()) {
        hash = (37 * hash) + CMD_FIELD_NUMBER;
        hash = (53 * hash) + getCmd();
      }
      if (hasCode()) {
        hash = (37 * hash) + CODE_FIELD_NUMBER;
        hash = (53 * hash) + getCode();
      }
      if (hasArg()) {
        hash = (37 * hash) + ARG_FIELD_NUMBER;
        hash = (53 * hash) + getArg().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parseFrom(
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
    public static Builder newBuilder(CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf prototype) {
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
     * Protobuf type {@code CommonServerErrorResponseWithCmdProBuf}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CommonServerErrorResponseWithCmdProBuf)
        CommonMessageProBuf.CommonServerErrorResponseWithCmdProBufOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return CommonMessageProBuf.internal_static_CommonServerErrorResponseWithCmdProBuf_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return CommonMessageProBuf.internal_static_CommonServerErrorResponseWithCmdProBuf_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.class, CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.Builder.class);
      }

      // Construct using CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.newBuilder()
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
        cmd_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        code_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        arg_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return CommonMessageProBuf.internal_static_CommonServerErrorResponseWithCmdProBuf_descriptor;
      }

      public CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf getDefaultInstanceForType() {
        return CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.getDefaultInstance();
      }

      public CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf build() {
        CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf result = buildPartial();
        if (!result.isInitialized()) {
          throw AbstractMessage.Builder.newUninitializedMessageException(result);
        }
        return result;
      }

      public CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf buildPartial() {
        CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf result = new CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.cmd_ = cmd_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.code_ = code_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.arg_ = arg_;
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
        if (other instanceof CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf) {
          return mergeFrom((CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf other) {
        if (other == CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf.getDefaultInstance()) return this;
        if (other.hasCmd()) {
          setCmd(other.getCmd());
        }
        if (other.hasCode()) {
          setCode(other.getCode());
        }
        if (other.hasArg()) {
          bitField0_ |= 0x00000004;
          arg_ = other.arg_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        if (!hasCmd()) {
          return false;
        }
        if (!hasCode()) {
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int cmd_ ;
      /**
       * <code>required int32 cmd = 1;</code>
       */
      public boolean hasCmd() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 cmd = 1;</code>
       */
      public int getCmd() {
        return cmd_;
      }
      /**
       * <code>required int32 cmd = 1;</code>
       */
      public Builder setCmd(int value) {
        bitField0_ |= 0x00000001;
        cmd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 cmd = 1;</code>
       */
      public Builder clearCmd() {
        bitField0_ = (bitField0_ & ~0x00000001);
        cmd_ = 0;
        onChanged();
        return this;
      }

      private int code_ ;
      /**
       * <code>required int32 code = 2;</code>
       */
      public boolean hasCode() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 code = 2;</code>
       */
      public int getCode() {
        return code_;
      }
      /**
       * <code>required int32 code = 2;</code>
       */
      public Builder setCode(int value) {
        bitField0_ |= 0x00000002;
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 code = 2;</code>
       */
      public Builder clearCode() {
        bitField0_ = (bitField0_ & ~0x00000002);
        code_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object arg_ = "";
      /**
       * <pre>
       *错误参数，格式：xx,xxx,xxxx
       * </pre>
       *
       * <code>optional string arg = 3;</code>
       */
      public boolean hasArg() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <pre>
       *错误参数，格式：xx,xxx,xxxx
       * </pre>
       *
       * <code>optional string arg = 3;</code>
       */
      public java.lang.String getArg() {
        java.lang.Object ref = arg_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            arg_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *错误参数，格式：xx,xxx,xxxx
       * </pre>
       *
       * <code>optional string arg = 3;</code>
       */
      public com.google.protobuf.ByteString
          getArgBytes() {
        java.lang.Object ref = arg_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          arg_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *错误参数，格式：xx,xxx,xxxx
       * </pre>
       *
       * <code>optional string arg = 3;</code>
       */
      public Builder setArg(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        arg_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *错误参数，格式：xx,xxx,xxxx
       * </pre>
       *
       * <code>optional string arg = 3;</code>
       */
      public Builder clearArg() {
        bitField0_ = (bitField0_ & ~0x00000004);
        arg_ = getDefaultInstance().getArg();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *错误参数，格式：xx,xxx,xxxx
       * </pre>
       *
       * <code>optional string arg = 3;</code>
       */
      public Builder setArgBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        arg_ = value;
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


      // @@protoc_insertion_point(builder_scope:CommonServerErrorResponseWithCmdProBuf)
    }

    // @@protoc_insertion_point(class_scope:CommonServerErrorResponseWithCmdProBuf)
    private static final CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf();
    }

    public static CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<CommonServerErrorResponseWithCmdProBuf>
        PARSER = new com.google.protobuf.AbstractParser<CommonServerErrorResponseWithCmdProBuf>() {
      public CommonServerErrorResponseWithCmdProBuf parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new CommonServerErrorResponseWithCmdProBuf(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CommonServerErrorResponseWithCmdProBuf> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CommonServerErrorResponseWithCmdProBuf> getParserForType() {
      return PARSER;
    }

    public CommonMessageProBuf.CommonServerErrorResponseWithCmdProBuf getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CommonServerErrorResponseWithCmdProBuf_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CommonServerErrorResponseWithCmdProBuf_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014common.proto\"P\n&CommonServerErrorRespo" +
      "nseWithCmdProBuf\022\013\n\003cmd\030\001 \002(\005\022\014\n\004code\030\002 " +
      "\002(\005\022\013\n\003arg\030\003 \001(\tB=\n&com.wolf.shoot.net.m" +
      "essage.auto.commonB\023CommonMessageProBuf"
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
    internal_static_CommonServerErrorResponseWithCmdProBuf_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CommonServerErrorResponseWithCmdProBuf_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CommonServerErrorResponseWithCmdProBuf_descriptor,
        new java.lang.String[] { "Cmd", "Code", "Arg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}