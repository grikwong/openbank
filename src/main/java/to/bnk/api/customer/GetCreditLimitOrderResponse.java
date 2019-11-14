// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.customer;

/**
 * Protobuf type {@code customer.GetCreditLimitOrderResponse}
 */
public  final class GetCreditLimitOrderResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GetCreditLimitOrderResponse, GetCreditLimitOrderResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:customer.GetCreditLimitOrderResponse)
    GetCreditLimitOrderResponseOrBuilder {
  private GetCreditLimitOrderResponse() {
    result_ = emptyProtobufList();
  }
  public static final int RESULT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<to.bnk.api.customer.CreditLimitOrder> result_;
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.util.List<to.bnk.api.customer.CreditLimitOrder> getResultList() {
    return result_;
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public java.util.List<? extends to.bnk.api.customer.CreditLimitOrderOrBuilder> 
      getResultOrBuilderList() {
    return result_;
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getResultCount() {
    return result_.size();
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.customer.CreditLimitOrder getResult(int index) {
    return result_.get(index);
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public to.bnk.api.customer.CreditLimitOrderOrBuilder getResultOrBuilder(
      int index) {
    return result_.get(index);
  }
  private void ensureResultIsMutable() {
    if (!result_.isModifiable()) {
      result_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(result_);
     }
  }

  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setResult(
      int index, to.bnk.api.customer.CreditLimitOrder value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureResultIsMutable();
    result_.set(index, value);
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setResult(
      int index, to.bnk.api.customer.CreditLimitOrder.Builder builderForValue) {
    ensureResultIsMutable();
    result_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(to.bnk.api.customer.CreditLimitOrder value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureResultIsMutable();
    result_.add(value);
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(
      int index, to.bnk.api.customer.CreditLimitOrder value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureResultIsMutable();
    result_.add(index, value);
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(
      to.bnk.api.customer.CreditLimitOrder.Builder builderForValue) {
    ensureResultIsMutable();
    result_.add(builderForValue.build());
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(
      int index, to.bnk.api.customer.CreditLimitOrder.Builder builderForValue) {
    ensureResultIsMutable();
    result_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAllResult(
      java.lang.Iterable<? extends to.bnk.api.customer.CreditLimitOrder> values) {
    ensureResultIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, result_);
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearResult() {
    result_ = emptyProtobufList();
  }
  /**
   * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void removeResult(int index) {
    ensureResultIsMutable();
    result_.remove(index);
  }

  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetCreditLimitOrderResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.customer.GetCreditLimitOrderResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code customer.GetCreditLimitOrderResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.customer.GetCreditLimitOrderResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:customer.GetCreditLimitOrderResponse)
      to.bnk.api.customer.GetCreditLimitOrderResponseOrBuilder {
    // Construct using to.bnk.api.customer.GetCreditLimitOrderResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.util.List<to.bnk.api.customer.CreditLimitOrder> getResultList() {
      return java.util.Collections.unmodifiableList(
          instance.getResultList());
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getResultCount() {
      return instance.getResultCount();
    }/**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.customer.CreditLimitOrder getResult(int index) {
      return instance.getResult(index);
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setResult(
        int index, to.bnk.api.customer.CreditLimitOrder value) {
      copyOnWrite();
      instance.setResult(index, value);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setResult(
        int index, to.bnk.api.customer.CreditLimitOrder.Builder builderForValue) {
      copyOnWrite();
      instance.setResult(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(to.bnk.api.customer.CreditLimitOrder value) {
      copyOnWrite();
      instance.addResult(value);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(
        int index, to.bnk.api.customer.CreditLimitOrder value) {
      copyOnWrite();
      instance.addResult(index, value);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(
        to.bnk.api.customer.CreditLimitOrder.Builder builderForValue) {
      copyOnWrite();
      instance.addResult(builderForValue);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(
        int index, to.bnk.api.customer.CreditLimitOrder.Builder builderForValue) {
      copyOnWrite();
      instance.addResult(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAllResult(
        java.lang.Iterable<? extends to.bnk.api.customer.CreditLimitOrder> values) {
      copyOnWrite();
      instance.addAllResult(values);
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }
    /**
     * <code>repeated .customer.CreditLimitOrder Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder removeResult(int index) {
      copyOnWrite();
      instance.removeResult(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:customer.GetCreditLimitOrderResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.customer.GetCreditLimitOrderResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "result_",
            to.bnk.api.customer.CreditLimitOrder.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.customer.GetCreditLimitOrderResponse> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.customer.GetCreditLimitOrderResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.customer.GetCreditLimitOrderResponse>(
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


  // @@protoc_insertion_point(class_scope:customer.GetCreditLimitOrderResponse)
  private static final to.bnk.api.customer.GetCreditLimitOrderResponse DEFAULT_INSTANCE;
  static {
    GetCreditLimitOrderResponse defaultInstance = new GetCreditLimitOrderResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetCreditLimitOrderResponse.class, defaultInstance);
  }

  public static to.bnk.api.customer.GetCreditLimitOrderResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetCreditLimitOrderResponse> PARSER;

  public static com.google.protobuf.Parser<GetCreditLimitOrderResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

