// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.card;

public interface GetUserCardsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:card.GetUserCardsResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .card.Card Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.util.List<to.bnk.api.card.Card> 
      getResultList();
  /**
   * <code>repeated .card.Card Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.card.Card getResult(int index);
  /**
   * <code>repeated .card.Card Result = 1[json_name = "result", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getResultCount();
}
