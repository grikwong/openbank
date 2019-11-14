// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.customer;

/**
 * Protobuf type {@code customer.GetFirehoseCustomerResponse}
 */
public  final class GetFirehoseCustomerResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GetFirehoseCustomerResponse, GetFirehoseCustomerResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:customer.GetFirehoseCustomerResponse)
    GetFirehoseCustomerResponseOrBuilder {
  private GetFirehoseCustomerResponse() {
    customers_ = emptyProtobufList();
  }
  public static final int CUSTOMERS_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<to.bnk.api.customer.Customer> customers_;
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.util.List<to.bnk.api.customer.Customer> getCustomersList() {
    return customers_;
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public java.util.List<? extends to.bnk.api.customer.CustomerOrBuilder> 
      getCustomersOrBuilderList() {
    return customers_;
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getCustomersCount() {
    return customers_.size();
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.customer.Customer getCustomers(int index) {
    return customers_.get(index);
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public to.bnk.api.customer.CustomerOrBuilder getCustomersOrBuilder(
      int index) {
    return customers_.get(index);
  }
  private void ensureCustomersIsMutable() {
    if (!customers_.isModifiable()) {
      customers_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(customers_);
     }
  }

  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomers(
      int index, to.bnk.api.customer.Customer value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureCustomersIsMutable();
    customers_.set(index, value);
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomers(
      int index, to.bnk.api.customer.Customer.Builder builderForValue) {
    ensureCustomersIsMutable();
    customers_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addCustomers(to.bnk.api.customer.Customer value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureCustomersIsMutable();
    customers_.add(value);
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addCustomers(
      int index, to.bnk.api.customer.Customer value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureCustomersIsMutable();
    customers_.add(index, value);
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addCustomers(
      to.bnk.api.customer.Customer.Builder builderForValue) {
    ensureCustomersIsMutable();
    customers_.add(builderForValue.build());
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addCustomers(
      int index, to.bnk.api.customer.Customer.Builder builderForValue) {
    ensureCustomersIsMutable();
    customers_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAllCustomers(
      java.lang.Iterable<? extends to.bnk.api.customer.Customer> values) {
    ensureCustomersIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, customers_);
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCustomers() {
    customers_ = emptyProtobufList();
  }
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void removeCustomers(int index) {
    ensureCustomersIsMutable();
    customers_.remove(index);
  }

  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.customer.GetFirehoseCustomerResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.customer.GetFirehoseCustomerResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code customer.GetFirehoseCustomerResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.customer.GetFirehoseCustomerResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:customer.GetFirehoseCustomerResponse)
      to.bnk.api.customer.GetFirehoseCustomerResponseOrBuilder {
    // Construct using to.bnk.api.customer.GetFirehoseCustomerResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.util.List<to.bnk.api.customer.Customer> getCustomersList() {
      return java.util.Collections.unmodifiableList(
          instance.getCustomersList());
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getCustomersCount() {
      return instance.getCustomersCount();
    }/**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.customer.Customer getCustomers(int index) {
      return instance.getCustomers(index);
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomers(
        int index, to.bnk.api.customer.Customer value) {
      copyOnWrite();
      instance.setCustomers(index, value);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomers(
        int index, to.bnk.api.customer.Customer.Builder builderForValue) {
      copyOnWrite();
      instance.setCustomers(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addCustomers(to.bnk.api.customer.Customer value) {
      copyOnWrite();
      instance.addCustomers(value);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addCustomers(
        int index, to.bnk.api.customer.Customer value) {
      copyOnWrite();
      instance.addCustomers(index, value);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addCustomers(
        to.bnk.api.customer.Customer.Builder builderForValue) {
      copyOnWrite();
      instance.addCustomers(builderForValue);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addCustomers(
        int index, to.bnk.api.customer.Customer.Builder builderForValue) {
      copyOnWrite();
      instance.addCustomers(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAllCustomers(
        java.lang.Iterable<? extends to.bnk.api.customer.Customer> values) {
      copyOnWrite();
      instance.addAllCustomers(values);
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCustomers() {
      copyOnWrite();
      instance.clearCustomers();
      return this;
    }
    /**
     * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder removeCustomers(int index) {
      copyOnWrite();
      instance.removeCustomers(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:customer.GetFirehoseCustomerResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.customer.GetFirehoseCustomerResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "customers_",
            to.bnk.api.customer.Customer.class,
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
        com.google.protobuf.Parser<to.bnk.api.customer.GetFirehoseCustomerResponse> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.customer.GetFirehoseCustomerResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.customer.GetFirehoseCustomerResponse>(
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


  // @@protoc_insertion_point(class_scope:customer.GetFirehoseCustomerResponse)
  private static final to.bnk.api.customer.GetFirehoseCustomerResponse DEFAULT_INSTANCE;
  static {
    GetFirehoseCustomerResponse defaultInstance = new GetFirehoseCustomerResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetFirehoseCustomerResponse.class, defaultInstance);
  }

  public static to.bnk.api.customer.GetFirehoseCustomerResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetFirehoseCustomerResponse> PARSER;

  public static com.google.protobuf.Parser<GetFirehoseCustomerResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

