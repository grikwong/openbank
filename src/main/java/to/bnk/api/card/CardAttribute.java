// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.card;

/**
 * Protobuf type {@code card.CardAttribute}
 */
public  final class CardAttribute extends
    com.google.protobuf.GeneratedMessageLite<
        CardAttribute, CardAttribute.Builder> implements
    // @@protoc_insertion_point(message_implements:card.CardAttribute)
    CardAttributeOrBuilder {
  private CardAttribute() {
    iD_ = "";
    cardID_ = "";
    name_ = "";
    type_ = "";
    value_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String iD_;
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getID() {
    return iD_;
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(iD_);
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    iD_ = value;
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearID() {
    
    iD_ = getDefaultInstance().getID();
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    iD_ = value.toStringUtf8();
  }

  public static final int CARDID_FIELD_NUMBER = 2;
  private java.lang.String cardID_;
  /**
   * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCardID() {
    return cardID_;
  }
  /**
   * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCardIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(cardID_);
  }
  /**
   * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCardID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    cardID_ = value;
  }
  /**
   * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCardID() {
    
    cardID_ = getDefaultInstance().getCardID();
  }
  /**
   * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCardIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    cardID_ = value.toStringUtf8();
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private java.lang.String name_;
  /**
   * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int TYPE_FIELD_NUMBER = 4;
  private java.lang.String type_;
  /**
   * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getType() {
    return type_;
  }
  /**
   * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(type_);
  }
  /**
   * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setType(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    type_ = value;
  }
  /**
   * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearType() {
    
    type_ = getDefaultInstance().getType();
  }
  /**
   * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTypeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    type_ = value.toStringUtf8();
  }

  public static final int VALUE_FIELD_NUMBER = 5;
  private java.lang.String value_;
  /**
   * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getValue() {
    return value_;
  }
  /**
   * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(value_);
  }
  /**
   * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setValue(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    value_ = value;
  }
  /**
   * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearValue() {
    
    value_ = getDefaultInstance().getValue();
  }
  /**
   * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setValueBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    value_ = value.toStringUtf8();
  }

  public static to.bnk.api.card.CardAttribute parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.card.CardAttribute parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.card.CardAttribute parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.card.CardAttribute parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.card.CardAttribute prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code card.CardAttribute}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.card.CardAttribute, Builder> implements
      // @@protoc_insertion_point(builder_implements:card.CardAttribute)
      to.bnk.api.card.CardAttributeOrBuilder {
    // Construct using to.bnk.api.card.CardAttribute.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getID() {
      return instance.getID();
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIDBytes() {
      return instance.getIDBytes();
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setID(
        java.lang.String value) {
      copyOnWrite();
      instance.setID(value);
      return this;
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearID() {
      copyOnWrite();
      instance.clearID();
      return this;
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIDBytes(value);
      return this;
    }

    /**
     * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCardID() {
      return instance.getCardID();
    }
    /**
     * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCardIDBytes() {
      return instance.getCardIDBytes();
    }
    /**
     * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCardID(
        java.lang.String value) {
      copyOnWrite();
      instance.setCardID(value);
      return this;
    }
    /**
     * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCardID() {
      copyOnWrite();
      instance.clearCardID();
      return this;
    }
    /**
     * <code>string CardID = 2[json_name = "card_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCardIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCardIDBytes(value);
      return this;
    }

    /**
     * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>string Name = 3[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getType() {
      return instance.getType();
    }
    /**
     * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return instance.getTypeBytes();
    }
    /**
     * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setType(
        java.lang.String value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }
    /**
     * <code>string Type = 4[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTypeBytes(value);
      return this;
    }

    /**
     * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getValue() {
      return instance.getValue();
    }
    /**
     * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getValueBytes() {
      return instance.getValueBytes();
    }
    /**
     * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setValue(
        java.lang.String value) {
      copyOnWrite();
      instance.setValue(value);
      return this;
    }
    /**
     * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearValue() {
      copyOnWrite();
      instance.clearValue();
      return this;
    }
    /**
     * <code>string Value = 5[json_name = "value", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setValueBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:card.CardAttribute)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.card.CardAttribute();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "iD_",
            "cardID_",
            "name_",
            "type_",
            "value_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u0208\u0004\u0208\u0005\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.card.CardAttribute> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.card.CardAttribute.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.card.CardAttribute>(
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


  // @@protoc_insertion_point(class_scope:card.CardAttribute)
  private static final to.bnk.api.card.CardAttribute DEFAULT_INSTANCE;
  static {
    CardAttribute defaultInstance = new CardAttribute();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CardAttribute.class, defaultInstance);
  }

  public static to.bnk.api.card.CardAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CardAttribute> PARSER;

  public static com.google.protobuf.Parser<CardAttribute> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

