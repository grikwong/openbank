// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.kyc;

/**
 * Protobuf type {@code kyc.GetKYCMediaRequest}
 */
public  final class GetKYCMediaRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetKYCMediaRequest, GetKYCMediaRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:kyc.GetKYCMediaRequest)
    GetKYCMediaRequestOrBuilder {
  private GetKYCMediaRequest() {
    customerID_ = "";
  }
  public static final int CUSTOMERID_FIELD_NUMBER = 1;
  private java.lang.String customerID_;
  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCustomerID() {
    return customerID_;
  }
  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(customerID_);
  }
  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    customerID_ = value;
  }
  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCustomerID() {
    
    customerID_ = getDefaultInstance().getCustomerID();
  }
  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    customerID_ = value.toStringUtf8();
  }

  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.kyc.GetKYCMediaRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.kyc.GetKYCMediaRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code kyc.GetKYCMediaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.kyc.GetKYCMediaRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:kyc.GetKYCMediaRequest)
      to.bnk.api.kyc.GetKYCMediaRequestOrBuilder {
    // Construct using to.bnk.api.kyc.GetKYCMediaRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCustomerID() {
      return instance.getCustomerID();
    }
    /**
     * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomerIDBytes() {
      return instance.getCustomerIDBytes();
    }
    /**
     * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerID(
        java.lang.String value) {
      copyOnWrite();
      instance.setCustomerID(value);
      return this;
    }
    /**
     * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCustomerID() {
      copyOnWrite();
      instance.clearCustomerID();
      return this;
    }
    /**
     * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCustomerIDBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:kyc.GetKYCMediaRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.kyc.GetKYCMediaRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "customerID_",
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
        com.google.protobuf.Parser<to.bnk.api.kyc.GetKYCMediaRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.kyc.GetKYCMediaRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.kyc.GetKYCMediaRequest>(
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


  // @@protoc_insertion_point(class_scope:kyc.GetKYCMediaRequest)
  private static final to.bnk.api.kyc.GetKYCMediaRequest DEFAULT_INSTANCE;
  static {
    GetKYCMediaRequest defaultInstance = new GetKYCMediaRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetKYCMediaRequest.class, defaultInstance);
  }

  public static to.bnk.api.kyc.GetKYCMediaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetKYCMediaRequest> PARSER;

  public static com.google.protobuf.Parser<GetKYCMediaRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

