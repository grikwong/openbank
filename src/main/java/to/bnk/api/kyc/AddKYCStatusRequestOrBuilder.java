// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.kyc;

public interface AddKYCStatusRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kyc.AddKYCStatusRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getCustomerID();
  /**
   * <code>string CustomerID = 1[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getCustomerIDBytes();

  /**
   * <code>string CustomerNumber = 2[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.lang.String getCustomerNumber();
  /**
   * <code>string CustomerNumber = 2[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.ByteString
      getCustomerNumberBytes();

  /**
   * <code>bool Ok = 3[json_name = "ok", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean getOk();

  /**
   * <code>.google.protobuf.Timestamp Date = 4[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  boolean hasDate();
  /**
   * <code>.google.protobuf.Timestamp Date = 4[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  com.google.protobuf.Timestamp getDate();
}
