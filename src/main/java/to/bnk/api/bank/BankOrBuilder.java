// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.bank;

public interface BankOrBuilder extends
    // @@protoc_insertion_point(interface_extends:bank.Bank)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getID();
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getIDBytes();

  /**
   * <code>string FullName = 2[json_name = "full_name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getFullName();
  /**
   * <code>string FullName = 2[json_name = "full_name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getFullNameBytes();

  /**
   * <code>string ShortName = 3[json_name = "short_name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getShortName();
  /**
   * <code>string ShortName = 3[json_name = "short_name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getShortNameBytes();

  /**
   * <code>string LogoURL = 4[json_name = "logo_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getLogoURL();
  /**
   * <code>string LogoURL = 4[json_name = "logo_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getLogoURLBytes();

  /**
   * <code>string WebsiteURL = 5[json_name = "website_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getWebsiteURL();
  /**
   * <code>string WebsiteURL = 5[json_name = "website_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getWebsiteURLBytes();

  /**
   * <code>string SwiftBIC = 6[json_name = "swift_bic", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getSwiftBIC();
  /**
   * <code>string SwiftBIC = 6[json_name = "swift_bic", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getSwiftBICBytes();

  /**
   * <code>string NationalIdentifier = 7[json_name = "national_identifier", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getNationalIdentifier();
  /**
   * <code>string NationalIdentifier = 7[json_name = "national_identifier", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getNationalIdentifierBytes();

  /**
   * <code>.bank.BankRouting BankRouting = 8[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasBankRouting();
  /**
   * <code>.bank.BankRouting BankRouting = 8[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.bank.BankRouting getBankRouting();
}
