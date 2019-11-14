// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.auth;

/**
 * Protobuf type {@code auth.GetAuthorizationCodeRequest}
 */
public  final class GetAuthorizationCodeRequest extends
    com.google.protobuf.GeneratedMessageLite<
        GetAuthorizationCodeRequest, GetAuthorizationCodeRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:auth.GetAuthorizationCodeRequest)
    GetAuthorizationCodeRequestOrBuilder {
  private GetAuthorizationCodeRequest() {
    clientID_ = "";
    redirectURI_ = "";
  }
  public static final int CLIENTID_FIELD_NUMBER = 1;
  private java.lang.String clientID_;
  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getClientID() {
    return clientID_;
  }
  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(clientID_);
  }
  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setClientID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    clientID_ = value;
  }
  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearClientID() {
    
    clientID_ = getDefaultInstance().getClientID();
  }
  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setClientIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    clientID_ = value.toStringUtf8();
  }

  public static final int REDIRECTURI_FIELD_NUMBER = 2;
  private java.lang.String redirectURI_;
  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getRedirectURI() {
    return redirectURI_;
  }
  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRedirectURIBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(redirectURI_);
  }
  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRedirectURI(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    redirectURI_ = value;
  }
  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearRedirectURI() {
    
    redirectURI_ = getDefaultInstance().getRedirectURI();
  }
  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRedirectURIBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    redirectURI_ = value.toStringUtf8();
  }

  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.auth.GetAuthorizationCodeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.auth.GetAuthorizationCodeRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code auth.GetAuthorizationCodeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.auth.GetAuthorizationCodeRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:auth.GetAuthorizationCodeRequest)
      to.bnk.api.auth.GetAuthorizationCodeRequestOrBuilder {
    // Construct using to.bnk.api.auth.GetAuthorizationCodeRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getClientID() {
      return instance.getClientID();
    }
    /**
     * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getClientIDBytes() {
      return instance.getClientIDBytes();
    }
    /**
     * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setClientID(
        java.lang.String value) {
      copyOnWrite();
      instance.setClientID(value);
      return this;
    }
    /**
     * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearClientID() {
      copyOnWrite();
      instance.clearClientID();
      return this;
    }
    /**
     * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setClientIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setClientIDBytes(value);
      return this;
    }

    /**
     * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getRedirectURI() {
      return instance.getRedirectURI();
    }
    /**
     * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRedirectURIBytes() {
      return instance.getRedirectURIBytes();
    }
    /**
     * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRedirectURI(
        java.lang.String value) {
      copyOnWrite();
      instance.setRedirectURI(value);
      return this;
    }
    /**
     * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearRedirectURI() {
      copyOnWrite();
      instance.clearRedirectURI();
      return this;
    }
    /**
     * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRedirectURIBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRedirectURIBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:auth.GetAuthorizationCodeRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.auth.GetAuthorizationCodeRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "clientID_",
            "redirectURI_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.auth.GetAuthorizationCodeRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.auth.GetAuthorizationCodeRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.auth.GetAuthorizationCodeRequest>(
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


  // @@protoc_insertion_point(class_scope:auth.GetAuthorizationCodeRequest)
  private static final to.bnk.api.auth.GetAuthorizationCodeRequest DEFAULT_INSTANCE;
  static {
    GetAuthorizationCodeRequest defaultInstance = new GetAuthorizationCodeRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      GetAuthorizationCodeRequest.class, defaultInstance);
  }

  public static to.bnk.api.auth.GetAuthorizationCodeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<GetAuthorizationCodeRequest> PARSER;

  public static com.google.protobuf.Parser<GetAuthorizationCodeRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

