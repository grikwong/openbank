// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactions;

public interface GetTransactionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:transactions.GetTransactionsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.util.List<to.bnk.api.transactions.Transaction> 
      getResultList();
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.transactions.Transaction getResult(int index);
  /**
   * <code>repeated .transactions.Transaction Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getResultCount();

  /**
   * <code>bool HasMore = 2[json_name = "has_more", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean getHasMore();

  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasLastRunningBalance();
  /**
   * <code>.types.Amount LastRunningBalance = 3[json_name = "last_running_balance", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  types.All.Amount getLastRunningBalance();
}
