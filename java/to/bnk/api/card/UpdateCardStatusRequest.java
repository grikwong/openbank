// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.card;

/**
 * Protobuf type {@code card.UpdateCardStatusRequest}
 */
public  final class UpdateCardStatusRequest extends
    com.google.protobuf.GeneratedMessageLite<
        UpdateCardStatusRequest, UpdateCardStatusRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:card.UpdateCardStatusRequest)
    UpdateCardStatusRequestOrBuilder {
  private UpdateCardStatusRequest() {
    cardToken_ = "";
  }
  public static final int CARDTOKEN_FIELD_NUMBER = 1;
  private java.lang.String cardToken_;
  /**
   * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCardToken() {
    return cardToken_;
  }
  /**
   * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCardTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cardToken_);
  }
  /**
   * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCardToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cardToken_ = value;
  }
  /**
   * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCardToken() {
    
    cardToken_ = getDefaultInstance().getCardToken();
  }
  /**
   * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCardTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cardToken_ = value.toStringUtf8();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.CardStatus getStatus() {
    types.All.CardStatus result = types.All.CardStatus.forNumber(status_);
    return result == null ? types.All.CardStatus.UNRECOGNIZED : result;
  }
  /**
   * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setStatusValue(int value) {
      status_ = value;
  }
  /**
   * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setStatus(types.All.CardStatus value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    status_ = value.getNumber();
  }
  /**
   * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearStatus() {
    
    status_ = 0;
  }

  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.card.UpdateCardStatusRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.card.UpdateCardStatusRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code card.UpdateCardStatusRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.card.UpdateCardStatusRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:card.UpdateCardStatusRequest)
      to.bnk.api.card.UpdateCardStatusRequestOrBuilder {
    // Construct using to.bnk.api.card.UpdateCardStatusRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCardToken() {
      return instance.getCardToken();
    }
    /**
     * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCardTokenBytes() {
      return instance.getCardTokenBytes();
    }
    /**
     * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCardToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setCardToken(value);
      return this;
    }
    /**
     * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCardToken() {
      copyOnWrite();
      instance.clearCardToken();
      return this;
    }
    /**
     * <code>string CardToken = 1[json_name = "card_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCardTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCardTokenBytes(value);
      return this;
    }

    /**
     * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getStatusValue() {
      return instance.getStatusValue();
    }
    /**
     * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setStatusValue(int value) {
      copyOnWrite();
      instance.setStatusValue(value);
      return this;
    }
    /**
     * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.CardStatus getStatus() {
      return instance.getStatus();
    }
    /**
     * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setStatus(types.All.CardStatus value) {
      copyOnWrite();
      instance.setStatus(value);
      return this;
    }
    /**
     * <code>.types.CardStatus Status = 2[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearStatus() {
      copyOnWrite();
      instance.clearStatus();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:card.UpdateCardStatusRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.card.UpdateCardStatusRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "cardToken_",
            "status_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\f" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.card.UpdateCardStatusRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.card.UpdateCardStatusRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.card.UpdateCardStatusRequest>(
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


  // @@protoc_insertion_point(class_scope:card.UpdateCardStatusRequest)
  private static final to.bnk.api.card.UpdateCardStatusRequest DEFAULT_INSTANCE;
  static {
    UpdateCardStatusRequest defaultInstance = new UpdateCardStatusRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      UpdateCardStatusRequest.class, defaultInstance);
  }

  public static to.bnk.api.card.UpdateCardStatusRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<UpdateCardStatusRequest> PARSER;

  public static com.google.protobuf.Parser<UpdateCardStatusRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

