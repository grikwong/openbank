// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.auth;

/**
 * Protobuf type {@code auth.CreateAccessTokenRequest}
 */
public  final class CreateAccessTokenRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateAccessTokenRequest, CreateAccessTokenRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:auth.CreateAccessTokenRequest)
    CreateAccessTokenRequestOrBuilder {
  private CreateAccessTokenRequest() {
    code_ = "";
    redirectURI_ = "";
    refreshToken_ = "";
  }
  public static final int GRANTTYPE_FIELD_NUMBER = 1;
  private int grantType_;
  /**
   * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getGrantTypeValue() {
    return grantType_;
  }
  /**
   * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.auth.GrantType getGrantType() {
    to.bnk.api.auth.GrantType result = to.bnk.api.auth.GrantType.forNumber(grantType_);
    return result == null ? to.bnk.api.auth.GrantType.UNRECOGNIZED : result;
  }
  /**
   * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setGrantTypeValue(int value) {
      grantType_ = value;
  }
  /**
   * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setGrantType(to.bnk.api.auth.GrantType value) {
    if (value == null) {
      throw new NullPointerException();
    }
    
    grantType_ = value.getNumber();
  }
  /**
   * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearGrantType() {
    
    grantType_ = 0;
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

  public static final int REDIRECTURI_FIELD_NUMBER = 3;
  private java.lang.String redirectURI_;
  /**
   * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getRedirectURI() {
    return redirectURI_;
  }
  /**
   * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRedirectURIBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(redirectURI_);
  }
  /**
   * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRedirectURI(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    redirectURI_ = value;
  }
  /**
   * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearRedirectURI() {
    
    redirectURI_ = getDefaultInstance().getRedirectURI();
  }
  /**
   * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRedirectURIBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    redirectURI_ = value.toStringUtf8();
  }

  public static final int REFRESHTOKEN_FIELD_NUMBER = 4;
  private java.lang.String refreshToken_;
  /**
   * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getRefreshToken() {
    return refreshToken_;
  }
  /**
   * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRefreshTokenBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(refreshToken_);
  }
  /**
   * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRefreshToken(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    refreshToken_ = value;
  }
  /**
   * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearRefreshToken() {
    
    refreshToken_ = getDefaultInstance().getRefreshToken();
  }
  /**
   * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRefreshTokenBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    refreshToken_ = value.toStringUtf8();
  }

  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.auth.CreateAccessTokenRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.auth.CreateAccessTokenRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code auth.CreateAccessTokenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.auth.CreateAccessTokenRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:auth.CreateAccessTokenRequest)
      to.bnk.api.auth.CreateAccessTokenRequestOrBuilder {
    // Construct using to.bnk.api.auth.CreateAccessTokenRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getGrantTypeValue() {
      return instance.getGrantTypeValue();
    }
    /**
     * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setGrantTypeValue(int value) {
      copyOnWrite();
      instance.setGrantTypeValue(value);
      return this;
    }
    /**
     * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.auth.GrantType getGrantType() {
      return instance.getGrantType();
    }
    /**
     * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setGrantType(to.bnk.api.auth.GrantType value) {
      copyOnWrite();
      instance.setGrantType(value);
      return this;
    }
    /**
     * <code>.auth.GrantType GrantType = 1[json_name = "grant_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearGrantType() {
      copyOnWrite();
      instance.clearGrantType();
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
     * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getRedirectURI() {
      return instance.getRedirectURI();
    }
    /**
     * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRedirectURIBytes() {
      return instance.getRedirectURIBytes();
    }
    /**
     * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRedirectURI(
        java.lang.String value) {
      copyOnWrite();
      instance.setRedirectURI(value);
      return this;
    }
    /**
     * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearRedirectURI() {
      copyOnWrite();
      instance.clearRedirectURI();
      return this;
    }
    /**
     * <code>string RedirectURI = 3[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRedirectURIBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRedirectURIBytes(value);
      return this;
    }

    /**
     * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getRefreshToken() {
      return instance.getRefreshToken();
    }
    /**
     * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRefreshTokenBytes() {
      return instance.getRefreshTokenBytes();
    }
    /**
     * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRefreshToken(
        java.lang.String value) {
      copyOnWrite();
      instance.setRefreshToken(value);
      return this;
    }
    /**
     * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearRefreshToken() {
      copyOnWrite();
      instance.clearRefreshToken();
      return this;
    }
    /**
     * <code>string RefreshToken = 4[json_name = "refresh_token", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRefreshTokenBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRefreshTokenBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:auth.CreateAccessTokenRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.auth.CreateAccessTokenRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "grantType_",
            "code_",
            "redirectURI_",
            "refreshToken_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002\u0208" +
              "\u0003\u0208\u0004\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.auth.CreateAccessTokenRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.auth.CreateAccessTokenRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.auth.CreateAccessTokenRequest>(
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


  // @@protoc_insertion_point(class_scope:auth.CreateAccessTokenRequest)
  private static final to.bnk.api.auth.CreateAccessTokenRequest DEFAULT_INSTANCE;
  static {
    CreateAccessTokenRequest defaultInstance = new CreateAccessTokenRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateAccessTokenRequest.class, defaultInstance);
  }

  public static to.bnk.api.auth.CreateAccessTokenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateAccessTokenRequest> PARSER;

  public static com.google.protobuf.Parser<CreateAccessTokenRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

