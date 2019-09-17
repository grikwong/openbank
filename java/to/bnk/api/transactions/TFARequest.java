// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactions;

/**
 * Protobuf type {@code transactions.TFARequest}
 */
public  final class TFARequest extends
    com.google.protobuf.GeneratedMessageLite<
        TFARequest, TFARequest.Builder> implements
    // @@protoc_insertion_point(message_implements:transactions.TFARequest)
    TFARequestOrBuilder {
  private TFARequest() {
    transactionID_ = "";
    code_ = "";
    authorizationID_ = "";
  }
  public static final int TRANSACTIONID_FIELD_NUMBER = 1;
  private java.lang.String transactionID_;
  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getTransactionID() {
    return transactionID_;
  }
  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(transactionID_);
  }
  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTransactionID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    transactionID_ = value;
  }
  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearTransactionID() {
    
    transactionID_ = getDefaultInstance().getTransactionID();
  }
  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTransactionIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    transactionID_ = value.toStringUtf8();
  }

  public static final int CODE_FIELD_NUMBER = 2;
  private java.lang.String code_;
  /**
   * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCode() {
    return code_;
  }
  /**
   * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCodeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(code_);
  }
  /**
   * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCode(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    code_ = value;
  }
  /**
   * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCode() {
    
    code_ = getDefaultInstance().getCode();
  }
  /**
   * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCodeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    code_ = value.toStringUtf8();
  }

  public static final int AUTHORIZATIONID_FIELD_NUMBER = 3;
  private java.lang.String authorizationID_;
  /**
   * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getAuthorizationID() {
    return authorizationID_;
  }
  /**
   * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAuthorizationIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(authorizationID_);
  }
  /**
   * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAuthorizationID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    authorizationID_ = value;
  }
  /**
   * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAuthorizationID() {
    
    authorizationID_ = getDefaultInstance().getAuthorizationID();
  }
  /**
   * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAuthorizationIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    authorizationID_ = value.toStringUtf8();
  }

  public static final int TFATYPE_FIELD_NUMBER = 4;
  private int tFAType_;
  /**
   * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getTFATypeValue() {
    return tFAType_;
  }
  /**
   * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.transactions.TFAType getTFAType() {
    to.bnk.api.transactions.TFAType result = to.bnk.api.transactions.TFAType.forNumber(tFAType_);
    return result == null ? to.bnk.api.transactions.TFAType.UNRECOGNIZED : result;
  }
  /**
   * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTFATypeValue(int value) {
      tFAType_ = value;
  }
  /**
   * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTFAType(to.bnk.api.transactions.TFAType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    tFAType_ = value.getNumber();
  }
  /**
   * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearTFAType() {
    
    tFAType_ = 0;
  }

  public static to.bnk.api.transactions.TFARequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactions.TFARequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.TFARequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.TFARequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.transactions.TFARequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code transactions.TFARequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.transactions.TFARequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:transactions.TFARequest)
      to.bnk.api.transactions.TFARequestOrBuilder {
    // Construct using to.bnk.api.transactions.TFARequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getTransactionID() {
      return instance.getTransactionID();
    }
    /**
     * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTransactionIDBytes() {
      return instance.getTransactionIDBytes();
    }
    /**
     * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTransactionID(
        java.lang.String value) {
      copyOnWrite();
      instance.setTransactionID(value);
      return this;
    }
    /**
     * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearTransactionID() {
      copyOnWrite();
      instance.clearTransactionID();
      return this;
    }
    /**
     * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTransactionIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTransactionIDBytes(value);
      return this;
    }

    /**
     * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCode() {
      return instance.getCode();
    }
    /**
     * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodeBytes() {
      return instance.getCodeBytes();
    }
    /**
     * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCode(
        java.lang.String value) {
      copyOnWrite();
      instance.setCode(value);
      return this;
    }
    /**
     * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCode() {
      copyOnWrite();
      instance.clearCode();
      return this;
    }
    /**
     * <code>string Code = 2[json_name = "code", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCodeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCodeBytes(value);
      return this;
    }

    /**
     * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getAuthorizationID() {
      return instance.getAuthorizationID();
    }
    /**
     * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAuthorizationIDBytes() {
      return instance.getAuthorizationIDBytes();
    }
    /**
     * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAuthorizationID(
        java.lang.String value) {
      copyOnWrite();
      instance.setAuthorizationID(value);
      return this;
    }
    /**
     * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAuthorizationID() {
      copyOnWrite();
      instance.clearAuthorizationID();
      return this;
    }
    /**
     * <code>string AuthorizationID = 3[json_name = "authorization_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAuthorizationIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAuthorizationIDBytes(value);
      return this;
    }

    /**
     * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getTFATypeValue() {
      return instance.getTFATypeValue();
    }
    /**
     * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTFATypeValue(int value) {
      copyOnWrite();
      instance.setTFATypeValue(value);
      return this;
    }
    /**
     * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.transactions.TFAType getTFAType() {
      return instance.getTFAType();
    }
    /**
     * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTFAType(to.bnk.api.transactions.TFAType value) {
      copyOnWrite();
      instance.setTFAType(value);
      return this;
    }
    /**
     * <code>.transactions.TFAType TFAType = 4[json_name = "tfa_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearTFAType() {
      copyOnWrite();
      instance.clearTFAType();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:transactions.TFARequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.transactions.TFARequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "transactionID_",
            "code_",
            "authorizationID_",
            "tFAType_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\f";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.transactions.TFARequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.transactions.TFARequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.transactions.TFARequest>(
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


  // @@protoc_insertion_point(class_scope:transactions.TFARequest)
  private static final to.bnk.api.transactions.TFARequest DEFAULT_INSTANCE;
  static {
    TFARequest defaultInstance = new TFARequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      TFARequest.class, defaultInstance);
  }

  public static to.bnk.api.transactions.TFARequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<TFARequest> PARSER;

  public static com.google.protobuf.Parser<TFARequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

