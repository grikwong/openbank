// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactions;

/**
 * Protobuf type {@code transactions.GetTransactionsByAccountResponse}
 */
public  final class GetTransactionsByAccountResponse extends
    com.google.protobuf.GeneratedMessageLite<
        GetTransactionsByAccountResponse, GetTransactionsByAccountResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:transactions.GetTransactionsByAccountResponse)
    GetTransactionsByAccountResponseOrBuilder {
  private GetTransactionsByAccountResponse() {
    result_ = emptyProtobufList();
  }
  public static final int RESULT_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<to.bnk.api.transactions.Transaction> result_;
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.util.List<to.bnk.api.transactions.Transaction> getResultList() {
    return result_;
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public java.util.List<? extends to.bnk.api.transactions.TransactionOrBuilder> 
      getResultOrBuilderList() {
    return result_;
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getResultCount() {
    return result_.size();
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.transactions.Transaction getResult(int index) {
    return result_.get(index);
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public to.bnk.api.transactions.TransactionOrBuilder getResultOrBuilder(
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
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setResult(
      int index, to.bnk.api.transactions.Transaction value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureResultIsMutable();
    result_.set(index, value);
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setResult(
      int index, to.bnk.api.transactions.Transaction.Builder builderForValue) {
    ensureResultIsMutable();
    result_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(to.bnk.api.transactions.Transaction value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureResultIsMutable();
    result_.add(value);
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(
      int index, to.bnk.api.transactions.Transaction value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureResultIsMutable();
    result_.add(index, value);
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(
      to.bnk.api.transactions.Transaction.Builder builderForValue) {
    ensureResultIsMutable();
    result_.add(builderForValue.build());
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addResult(
      int index, to.bnk.api.transactions.Transaction.Builder builderForValue) {
    ensureResultIsMutable();
    result_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAllResult(
      java.lang.Iterable<? extends to.bnk.api.transactions.Transaction> values) {
    ensureResultIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, result_);
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearResult() {
    result_ = emptyProtobufList();
  }
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void removeResult(int index) {
    ensureResultIsMutable();
    result_.remove(index);
  }

  public static final int HASMORE_FIELD_NUMBER = 2;
  private boolean hasMore_;
  /**
   * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean getHasMore() {
    return hasMore_;
  }
  /**
   * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setHasMore(boolean value) {
    
    hasMore_ = value;
  }
  /**
   * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearHasMore() {
    
    hasMore_ = false;
  }

  public static final int LASTRUNNINGBALANCE_FIELD_NUMBER = 3;
  private types.All.Amount lastRunningBalance_;
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasLastRunningBalance() {
    return lastRunningBalance_ != null;
  }
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.Amount getLastRunningBalance() {
    return lastRunningBalance_ == null ? types.All.Amount.getDefaultInstance() : lastRunningBalance_;
  }
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setLastRunningBalance(types.All.Amount value) {
    if (value == null) {
      throw new NullPointerException();
    }
    lastRunningBalance_ = value;
    
    }
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setLastRunningBalance(
      types.All.Amount.Builder builderForValue) {
    lastRunningBalance_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeLastRunningBalance(types.All.Amount value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (lastRunningBalance_ != null &&
        lastRunningBalance_ != types.All.Amount.getDefaultInstance()) {
      lastRunningBalance_ =
        types.All.Amount.newBuilder(lastRunningBalance_).mergeFrom(value).buildPartial();
    } else {
      lastRunningBalance_ = value;
    }
    
  }
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearLastRunningBalance() {  lastRunningBalance_ = null;
    
  }

  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.GetTransactionsByAccountResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.transactions.GetTransactionsByAccountResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code transactions.GetTransactionsByAccountResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.transactions.GetTransactionsByAccountResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:transactions.GetTransactionsByAccountResponse)
      to.bnk.api.transactions.GetTransactionsByAccountResponseOrBuilder {
    // Construct using to.bnk.api.transactions.GetTransactionsByAccountResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.util.List<to.bnk.api.transactions.Transaction> getResultList() {
      return java.util.Collections.unmodifiableList(
          instance.getResultList());
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getResultCount() {
      return instance.getResultCount();
    }/**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.transactions.Transaction getResult(int index) {
      return instance.getResult(index);
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setResult(
        int index, to.bnk.api.transactions.Transaction value) {
      copyOnWrite();
      instance.setResult(index, value);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setResult(
        int index, to.bnk.api.transactions.Transaction.Builder builderForValue) {
      copyOnWrite();
      instance.setResult(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(to.bnk.api.transactions.Transaction value) {
      copyOnWrite();
      instance.addResult(value);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(
        int index, to.bnk.api.transactions.Transaction value) {
      copyOnWrite();
      instance.addResult(index, value);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(
        to.bnk.api.transactions.Transaction.Builder builderForValue) {
      copyOnWrite();
      instance.addResult(builderForValue);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addResult(
        int index, to.bnk.api.transactions.Transaction.Builder builderForValue) {
      copyOnWrite();
      instance.addResult(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAllResult(
        java.lang.Iterable<? extends to.bnk.api.transactions.Transaction> values) {
      copyOnWrite();
      instance.addAllResult(values);
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearResult() {
      copyOnWrite();
      instance.clearResult();
      return this;
    }
    /**
     * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder removeResult(int index) {
      copyOnWrite();
      instance.removeResult(index);
      return this;
    }

    /**
     * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean getHasMore() {
      return instance.getHasMore();
    }
    /**
     * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setHasMore(boolean value) {
      copyOnWrite();
      instance.setHasMore(value);
      return this;
    }
    /**
     * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearHasMore() {
      copyOnWrite();
      instance.clearHasMore();
      return this;
    }

    /**
     * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasLastRunningBalance() {
      return instance.hasLastRunningBalance();
    }
    /**
     * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.Amount getLastRunningBalance() {
      return instance.getLastRunningBalance();
    }
    /**
     * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setLastRunningBalance(types.All.Amount value) {
      copyOnWrite();
      instance.setLastRunningBalance(value);
      return this;
      }
    /**
     * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setLastRunningBalance(
        types.All.Amount.Builder builderForValue) {
      copyOnWrite();
      instance.setLastRunningBalance(builderForValue);
      return this;
    }
    /**
     * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeLastRunningBalance(types.All.Amount value) {
      copyOnWrite();
      instance.mergeLastRunningBalance(value);
      return this;
    }
    /**
     * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearLastRunningBalance() {  copyOnWrite();
      instance.clearLastRunningBalance();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:transactions.GetTransactionsByAccountResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.transactions.GetTransactionsByAccountResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "result_",
            to.bnk.api.transactions.Transaction.class,
            "hasMore_",
            "lastRunningBalance_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002\u0007" +
              "\u0003\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.transactions.GetTransactionsByAccountResponse> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.transactions.GetTransactionsByAccountResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.transactions.GetTransactionsByAccountResponse>(
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


  // @@protoc_insertion_point(class_scope:transactions.GetTransactionsByAccountResponse)
  private static final to.bnk.api.transactions.GetTransactionsByAccountResponse DEFAULT_INSTANCE;
  static {
    GetTransactionsByAccountResponse defaultInstance = new GetTransactionsByAccountResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetTransactionsByAccountResponse.class, defaultInstance);
  }

  public static to.bnk.api.transactions.GetTransactionsByAccountResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetTransactionsByAccountResponse> PARSER;

  public static com.google.protobuf.Parser<GetTransactionsByAccountResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

