// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.customer;

/**
 * Protobuf type {@code customer.GetCustomerByCustomerNumberRequest}
 */
public  final class GetCustomerByCustomerNumberRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetCustomerByCustomerNumberRequest, GetCustomerByCustomerNumberRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:customer.GetCustomerByCustomerNumberRequest)
    GetCustomerByCustomerNumberRequestOrBuilder {
  private GetCustomerByCustomerNumberRequest() {
    bankID_ = "";
    customerID_ = "";
    customerNumber_ = "";
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

  public static final int CUSTOMERID_FIELD_NUMBER = 2;
  private java.lang.String customerID_;
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCustomerID() {
    return customerID_;
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(customerID_);
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    customerID_ = value;
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCustomerID() {
    
    customerID_ = getDefaultInstance().getCustomerID();
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    customerID_ = value.toStringUtf8();
  }

  public static final int CUSTOMERNUMBER_FIELD_NUMBER = 3;
  private java.lang.String customerNumber_;
  /**
   * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCustomerNumber() {
    return customerNumber_;
  }
  /**
   * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerNumberBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(customerNumber_);
  }
  /**
   * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerNumber(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    customerNumber_ = value;
  }
  /**
   * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCustomerNumber() {
    
    customerNumber_ = getDefaultInstance().getCustomerNumber();
  }
  /**
   * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerNumberBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    customerNumber_ = value.toStringUtf8();
  }

  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.customer.GetCustomerByCustomerNumberRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code customer.GetCustomerByCustomerNumberRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.customer.GetCustomerByCustomerNumberRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:customer.GetCustomerByCustomerNumberRequest)
      to.bnk.api.customer.GetCustomerByCustomerNumberRequestOrBuilder {
    // Construct using to.bnk.api.customer.GetCustomerByCustomerNumberRequest.newBuilder()
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
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCustomerID() {
      return instance.getCustomerID();
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomerIDBytes() {
      return instance.getCustomerIDBytes();
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerID(
        java.lang.String value) {
      copyOnWrite();
      instance.setCustomerID(value);
      return this;
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCustomerID() {
      copyOnWrite();
      instance.clearCustomerID();
      return this;
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCustomerIDBytes(value);
      return this;
    }

    /**
     * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCustomerNumber() {
      return instance.getCustomerNumber();
    }
    /**
     * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomerNumberBytes() {
      return instance.getCustomerNumberBytes();
    }
    /**
     * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerNumber(
        java.lang.String value) {
      copyOnWrite();
      instance.setCustomerNumber(value);
      return this;
    }
    /**
     * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCustomerNumber() {
      copyOnWrite();
      instance.clearCustomerNumber();
      return this;
    }
    /**
     * <code>string CustomerNumber = 3[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerNumberBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCustomerNumberBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:customer.GetCustomerByCustomerNumberRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.customer.GetCustomerByCustomerNumberRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bankID_",
            "customerID_",
            "customerNumber_",
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
        com.google.protobuf.Parser<to.bnk.api.customer.GetCustomerByCustomerNumberRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.customer.GetCustomerByCustomerNumberRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.customer.GetCustomerByCustomerNumberRequest>(
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


  // @@protoc_insertion_point(class_scope:customer.GetCustomerByCustomerNumberRequest)
  private static final to.bnk.api.customer.GetCustomerByCustomerNumberRequest DEFAULT_INSTANCE;
  static {
    GetCustomerByCustomerNumberRequest defaultInstance = new GetCustomerByCustomerNumberRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetCustomerByCustomerNumberRequest.class, defaultInstance);
  }

  public static to.bnk.api.customer.GetCustomerByCustomerNumberRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetCustomerByCustomerNumberRequest> PARSER;

  public static com.google.protobuf.Parser<GetCustomerByCustomerNumberRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

