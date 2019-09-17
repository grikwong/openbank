// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.accounts;

public interface CreateAccountResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:accounts.CreateAccountResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getAccountID();
  /**
   * <code>string AccountID = 1[json_name = "account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getAccountIDBytes();

  /**
   * <code>string CreditTransactionNumber = 2[json_name = "credit_transaction_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getCreditTransactionNumber();
  /**
   * <code>string CreditTransactionNumber = 2[json_name = "credit_transaction_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getCreditTransactionNumberBytes();

  /**
   * <code>string DebitTransactionNumber = 3[json_name = "debit_transaction_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getDebitTransactionNumber();
  /**
   * <code>string DebitTransactionNumber = 3[json_name = "debit_transaction_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getDebitTransactionNumberBytes();

  /**
   * <code>.types.MajorType MajorType = 4[json_name = "major_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getMajorTypeValue();
  /**
   * <code>.types.MajorType MajorType = 4[json_name = "major_type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.MajorType getMajorType();

  /**
   * <code>string Minor = 5[json_name = "minor", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getMinor();
  /**
   * <code>string Minor = 5[json_name = "minor", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getMinorBytes();
}
