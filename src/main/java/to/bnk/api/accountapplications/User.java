// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.accountapplications;

/**
 * Protobuf type {@code accountapplications.User}
 */
public  final class User extends
    com.google.protobuf.GeneratedMessageLite<
        User, User.Builder> implements
    // @@protoc_insertion_point(message_implements:accountapplications.User)
    UserOrBuilder {
  private User() {
    iD_ = "";
    email_ = "";
    username_ = "";
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

  public static final int EMAIL_FIELD_NUMBER = 2;
  private java.lang.String email_;
  /**
   * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getEmail() {
    return email_;
  }
  /**
   * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEmailBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(email_);
  }
  /**
   * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setEmail(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    email_ = value;
  }
  /**
   * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearEmail() {
    
    email_ = getDefaultInstance().getEmail();
  }
  /**
   * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setEmailBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    email_ = value.toStringUtf8();
  }

  public static final int USERNAME_FIELD_NUMBER = 3;
  private java.lang.String username_;
  /**
   * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    return username_;
  }
  /**
   * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(username_);
  }
  /**
   * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setUsername(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    username_ = value;
  }
  /**
   * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearUsername() {
    
    username_ = getDefaultInstance().getUsername();
  }
  /**
   * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setUsernameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    username_ = value.toStringUtf8();
  }

  public static to.bnk.api.accountapplications.User parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.accountapplications.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.accountapplications.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.accountapplications.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.accountapplications.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.accountapplications.User parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.accountapplications.User prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code accountapplications.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.accountapplications.User, Builder> implements
      // @@protoc_insertion_point(builder_implements:accountapplications.User)
      to.bnk.api.accountapplications.UserOrBuilder {
    // Construct using to.bnk.api.accountapplications.User.newBuilder()
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
     * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getEmail() {
      return instance.getEmail();
    }
    /**
     * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEmailBytes() {
      return instance.getEmailBytes();
    }
    /**
     * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setEmail(
        java.lang.String value) {
      copyOnWrite();
      instance.setEmail(value);
      return this;
    }
    /**
     * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearEmail() {
      copyOnWrite();
      instance.clearEmail();
      return this;
    }
    /**
     * <code>string Email = 2[json_name = "email", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setEmailBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setEmailBytes(value);
      return this;
    }

    /**
     * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getUsername() {
      return instance.getUsername();
    }
    /**
     * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      return instance.getUsernameBytes();
    }
    /**
     * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setUsername(
        java.lang.String value) {
      copyOnWrite();
      instance.setUsername(value);
      return this;
    }
    /**
     * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearUsername() {
      copyOnWrite();
      instance.clearUsername();
      return this;
    }
    /**
     * <code>string Username = 3[json_name = "username", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUsernameBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:accountapplications.User)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.accountapplications.User();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "iD_",
            "email_",
            "username_",
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
        com.google.protobuf.Parser<to.bnk.api.accountapplications.User> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.accountapplications.User.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.accountapplications.User>(
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


  // @@protoc_insertion_point(class_scope:accountapplications.User)
  private static final to.bnk.api.accountapplications.User DEFAULT_INSTANCE;
  static {
    User defaultInstance = new User();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      User.class, defaultInstance);
  }

  public static to.bnk.api.accountapplications.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<User> PARSER;

  public static com.google.protobuf.Parser<User> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

