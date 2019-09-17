// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactions;

public interface CreateTransactionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:transactions.CreateTransactionRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getSourceAccountID();
  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getSourceAccountIDBytes();

  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasSourceOfflineUser();
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.OfflineUserInfo getSourceOfflineUser();

  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasDestinationAccount();
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.transactions.BankAccountInfo getDestinationAccount();

  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasDestinationOfflineUser();
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.OfflineUserInfo getDestinationOfflineUser();

  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasAmount();
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.Amount getAmount();

  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getRemarks();
  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getRemarksBytes();
}
