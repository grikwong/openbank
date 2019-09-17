// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.branch;

/**
 * Protobuf type {@code branch.GetBranchRequest}
 */
public  final class GetBranchRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetBranchRequest, GetBranchRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:branch.GetBranchRequest)
    GetBranchRequestOrBuilder {
  private GetBranchRequest() {
    branchID_ = "";
  }
  public static final int BRANCHID_FIELD_NUMBER = 1;
  private java.lang.String branchID_;
  /**
   * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getBranchID() {
    return branchID_;
  }
  /**
   * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBranchIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(branchID_);
  }
  /**
   * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBranchID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    branchID_ = value;
  }
  /**
   * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearBranchID() {
    
    branchID_ = getDefaultInstance().getBranchID();
  }
  /**
   * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBranchIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    branchID_ = value.toStringUtf8();
  }

  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.branch.GetBranchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.branch.GetBranchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.branch.GetBranchRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.branch.GetBranchRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code branch.GetBranchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.branch.GetBranchRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:branch.GetBranchRequest)
      to.bnk.api.branch.GetBranchRequestOrBuilder {
    // Construct using to.bnk.api.branch.GetBranchRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getBranchID() {
      return instance.getBranchID();
    }
    /**
     * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBranchIDBytes() {
      return instance.getBranchIDBytes();
    }
    /**
     * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBranchID(
        java.lang.String value) {
      copyOnWrite();
      instance.setBranchID(value);
      return this;
    }
    /**
     * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearBranchID() {
      copyOnWrite();
      instance.clearBranchID();
      return this;
    }
    /**
     * <code>string BranchID = 1[json_name = "branch_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBranchIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBranchIDBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:branch.GetBranchRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.branch.GetBranchRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "branchID_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.branch.GetBranchRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.branch.GetBranchRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.branch.GetBranchRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:branch.GetBranchRequest)
  private static final to.bnk.api.branch.GetBranchRequest DEFAULT_INSTANCE;
  static {
    GetBranchRequest defaultInstance = new GetBranchRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetBranchRequest.class, defaultInstance);
  }

  public static to.bnk.api.branch.GetBranchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetBranchRequest> PARSER;

  public static com.google.protobuf.Parser<GetBranchRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

