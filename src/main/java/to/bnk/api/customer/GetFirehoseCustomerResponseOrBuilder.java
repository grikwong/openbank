// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.customer;

public interface GetFirehoseCustomerResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:customer.GetFirehoseCustomerResponse)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  java.util.List<to.bnk.api.customer.Customer> 
      getCustomersList();
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  to.bnk.api.customer.Customer getCustomers(int index);
  /**
   * <code>repeated .customer.Customer Customers = 1[json_name = "customers", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  int getCustomersCount();
}
