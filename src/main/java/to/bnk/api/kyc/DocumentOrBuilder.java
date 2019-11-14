// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.kyc;

public interface DocumentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyc.Document)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getBankID();
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getBankIDBytes();

  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getCustomerID();
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getCustomerIDBytes();

  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getID();
  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getIDBytes();

  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getCustomerNumber();
  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getCustomerNumberBytes();

  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getType();
  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>string Number = 6[json_name = "number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getNumber();
  /**
   * <code>string Number = 6[json_name = "number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getNumberBytes();

  /**
   * <code>.google.protobuf.Timestamp IssueDate = 7[json_name = "issue_date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasIssueDate();
  /**
   * <code>.google.protobuf.Timestamp IssueDate = 7[json_name = "issue_date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.Timestamp getIssueDate();

  /**
   * <code>string IssuePlace = 8[json_name = "issue_place", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getIssuePlace();
  /**
   * <code>string IssuePlace = 8[json_name = "issue_place", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getIssuePlaceBytes();

  /**
   * <code>.google.protobuf.Timestamp ExpiryDate = 9[json_name = "expiry_date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasExpiryDate();
  /**
   * <code>.google.protobuf.Timestamp ExpiryDate = 9[json_name = "expiry_date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.Timestamp getExpiryDate();
}
