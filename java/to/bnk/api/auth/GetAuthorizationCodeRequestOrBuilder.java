// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.auth;

public interface GetAuthorizationCodeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:auth.GetAuthorizationCodeRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getClientID();
  /**
   * <code>string ClientID = 1[json_name = "client_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getClientIDBytes();

  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getRedirectURI();
  /**
   * <code>string RedirectURI = 2[json_name = "redirect_uri", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getRedirectURIBytes();
}
