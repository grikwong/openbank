// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactions;

public interface TransactionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:transactions.Transaction)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getTransactionID();
  /**
   * <code>string TransactionID = 1[json_name = "transaction_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getTransactionIDBytes();

  /**
   * <code>.transactions.BankAccountInfo SourceAccount = 2[json_name = "source_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasSourceAccount();
  /**
   * <code>.transactions.BankAccountInfo SourceAccount = 2[json_name = "source_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.transactions.BankAccountInfo getSourceAccount();

  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 11[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasSourceOfflineUser();
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 11[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.OfflineUserInfo getSourceOfflineUser();

  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 3[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasDestinationAccount();
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 3[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.transactions.BankAccountInfo getDestinationAccount();

  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 12[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasDestinationOfflineUser();
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 12[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.OfflineUserInfo getDestinationOfflineUser();

  /**
   * <code>.google.protobuf.Timestamp Date = 4[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasDate();
  /**
   * <code>.google.protobuf.Timestamp Date = 4[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.Timestamp getDate();

  /**
   * <code>.transactions.Type Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getTypeValue();
  /**
   * <code>.transactions.Type Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.transactions.Type getType();

  /**
   * <code>.transactions.Status Status = 6[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getStatusValue();
  /**
   * <code>.transactions.Status Status = 6[json_name = "status", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.transactions.Status getStatus();

  /**
   * <code>.types.Amount Amount = 7[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasAmount();
  /**
   * <code>.types.Amount Amount = 7[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.Amount getAmount();

  /**
   * <code>string Description = 8[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getDescription();
  /**
   * <code>string Description = 8[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string UserID = 9[json_name = "user_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getUserID();
  /**
   * <code>string UserID = 9[json_name = "user_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getUserIDBytes();

  /**
   * <code>string Remarks = 10[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getRemarks();
  /**
   * <code>string Remarks = 10[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getRemarksBytes();
}
