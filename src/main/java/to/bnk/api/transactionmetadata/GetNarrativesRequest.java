// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactionmetadata;

/**
 * Protobuf type {@code transactionmetadata.GetNarrativesRequest}
 */
public  final class GetNarrativesRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetNarrativesRequest, GetNarrativesRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:transactionmetadata.GetNarrativesRequest)
    GetNarrativesRequestOrBuilder {
  private GetNarrativesRequest() {
    bankID_ = "";
    accountID_ = "";
    transactionID_ = "";
  }
  public static final int BANKID_FIELD_NUMBER = 1;
  private java.lang.String bankID_;
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getBankID() {
    return bankID_;
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBankIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bankID_);
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBankID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    bankID_ = value;
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearBankID() {
    
    bankID_ = getDefaultInstance().getBankID();
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBankIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    bankID_ = value.toStringUtf8();
  }

  public static final int ACCOUNTID_FIELD_NUMBER = 2;
  private java.lang.String accountID_;
  /**
   * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getAccountID() {
    return accountID_;
  }
  /**
   * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAccountIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(accountID_);
  }
  /**
   * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccountID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    accountID_ = value;
  }
  /**
   * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAccountID() {
    
    accountID_ = getDefaultInstance().getAccountID();
  }
  /**
   * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccountIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    accountID_ = value.toStringUtf8();
  }

  public static final int TRANSACTIONID_FIELD_NUMBER = 3;
  private java.lang.String transactionID_;
  /**
   * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getTransactionID() {
    return transactionID_;
  }
  /**
   * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTransactionIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(transactionID_);
  }
  /**
   * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTransactionID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    transactionID_ = value;
  }
  /**
   * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearTransactionID() {
    
    transactionID_ = getDefaultInstance().getTransactionID();
  }
  /**
   * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTransactionIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    transactionID_ = value.toStringUtf8();
  }

  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactionmetadata.GetNarrativesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.transactionmetadata.GetNarrativesRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code transactionmetadata.GetNarrativesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.transactionmetadata.GetNarrativesRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:transactionmetadata.GetNarrativesRequest)
      to.bnk.api.transactionmetadata.GetNarrativesRequestOrBuilder {
    // Construct using to.bnk.api.transactionmetadata.GetNarrativesRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getBankID() {
      return instance.getBankID();
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBankIDBytes() {
      return instance.getBankIDBytes();
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBankID(
        java.lang.String value) {
      copyOnWrite();
      instance.setBankID(value);
      return this;
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearBankID() {
      copyOnWrite();
      instance.clearBankID();
      return this;
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBankIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBankIDBytes(value);
      return this;
    }

    /**
     * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getAccountID() {
      return instance.getAccountID();
    }
    /**
     * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAccountIDBytes() {
      return instance.getAccountIDBytes();
    }
    /**
     * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccountID(
        java.lang.String value) {
      copyOnWrite();
      instance.setAccountID(value);
      return this;
    }
    /**
     * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAccountID() {
      copyOnWrite();
      instance.clearAccountID();
      return this;
    }
    /**
     * <code>string AccountID = 2[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccountIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAccountIDBytes(value);
      return this;
    }

    /**
     * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getTransactionID() {
      return instance.getTransactionID();
    }
    /**
     * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTransactionIDBytes() {
      return instance.getTransactionIDBytes();
    }
    /**
     * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTransactionID(
        java.lang.String value) {
      copyOnWrite();
      instance.setTransactionID(value);
      return this;
    }
    /**
     * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearTransactionID() {
      copyOnWrite();
      instance.clearTransactionID();
      return this;
    }
    /**
     * <code>string TransactionID = 3[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTransactionIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTransactionIDBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:transactionmetadata.GetNarrativesRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.transactionmetadata.GetNarrativesRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bankID_",
            "accountID_",
            "transactionID_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.transactionmetadata.GetNarrativesRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.transactionmetadata.GetNarrativesRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.transactionmetadata.GetNarrativesRequest>(
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


  // @@protoc_insertion_point(class_scope:transactionmetadata.GetNarrativesRequest)
  private static final to.bnk.api.transactionmetadata.GetNarrativesRequest DEFAULT_INSTANCE;
  static {
    GetNarrativesRequest defaultInstance = new GetNarrativesRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetNarrativesRequest.class, defaultInstance);
  }

  public static to.bnk.api.transactionmetadata.GetNarrativesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetNarrativesRequest> PARSER;

  public static com.google.protobuf.Parser<GetNarrativesRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

