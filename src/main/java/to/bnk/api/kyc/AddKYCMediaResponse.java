// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.kyc;

/**
 * Protobuf type {@code kyc.AddKYCMediaResponse}
 */
public  final class AddKYCMediaResponse extends
    com.google.protobuf.GeneratedMessageLite<
        AddKYCMediaResponse, AddKYCMediaResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:kyc.AddKYCMediaResponse)
    AddKYCMediaResponseOrBuilder {
  private AddKYCMediaResponse() {
    bankID_ = "";
    customerID_ = "";
    iD_ = "";
    customerNumber_ = "";
    type_ = "";
    uRL_ = "";
    relatesToKycDocumentID_ = "";
    relatesToKycCheckID_ = "";
  }
  public static final int BANKID_FIELD_NUMBER = 1;
  private java.lang.String bankID_;
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getBankID() {
    return bankID_;
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBankIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(bankID_);
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBankID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    bankID_ = value;
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearBankID() {
    
    bankID_ = getDefaultInstance().getBankID();
  }
  /**
   * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBankIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    bankID_ = value.toStringUtf8();
  }

  public static final int CUSTOMERID_FIELD_NUMBER = 2;
  private java.lang.String customerID_;
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCustomerID() {
    return customerID_;
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(customerID_);
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    customerID_ = value;
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCustomerID() {
    
    customerID_ = getDefaultInstance().getCustomerID();
  }
  /**
   * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    customerID_ = value.toStringUtf8();
  }

  public static final int ID_FIELD_NUMBER = 3;
  private java.lang.String iD_;
  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getID() {
    return iD_;
  }
  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(iD_);
  }
  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    iD_ = value;
  }
  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearID() {
    
    iD_ = getDefaultInstance().getID();
  }
  /**
   * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    iD_ = value.toStringUtf8();
  }

  public static final int CUSTOMERNUMBER_FIELD_NUMBER = 4;
  private java.lang.String customerNumber_;
  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getCustomerNumber() {
    return customerNumber_;
  }
  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCustomerNumberBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(customerNumber_);
  }
  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerNumber(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    customerNumber_ = value;
  }
  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCustomerNumber() {
    
    customerNumber_ = getDefaultInstance().getCustomerNumber();
  }
  /**
   * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCustomerNumberBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    customerNumber_ = value.toStringUtf8();
  }

  public static final int TYPE_FIELD_NUMBER = 5;
  private java.lang.String type_;
  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getType() {
    return type_;
  }
  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(type_);
  }
  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setType(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    type_ = value;
  }
  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearType() {
    
    type_ = getDefaultInstance().getType();
  }
  /**
   * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setTypeBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    type_ = value.toStringUtf8();
  }

  public static final int URL_FIELD_NUMBER = 6;
  private java.lang.String uRL_;
  /**
   * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getURL() {
    return uRL_;
  }
  /**
   * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getURLBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(uRL_);
  }
  /**
   * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setURL(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    uRL_ = value;
  }
  /**
   * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearURL() {
    
    uRL_ = getDefaultInstance().getURL();
  }
  /**
   * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setURLBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    uRL_ = value.toStringUtf8();
  }

  public static final int DATE_FIELD_NUMBER = 7;
  private com.google.protobuf.Timestamp date_;
  /**
   * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasDate() {
    return date_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDate() {
    return date_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : date_;
  }
  /**
   * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDate(com.google.protobuf.Timestamp value) {
    if (value == null) {
      throw new NullPointerException();
    }
    date_ = value;
    
    }
  /**
   * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDate(
      com.google.protobuf.Timestamp.Builder builderForValue) {
    date_ = builderForValue.build();
    
  }
  /**
   * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDate(com.google.protobuf.Timestamp value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (date_ != null &&
        date_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
      date_ =
        com.google.protobuf.Timestamp.newBuilder(date_).mergeFrom(value).buildPartial();
    } else {
      date_ = value;
    }
    
  }
  /**
   * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearDate() {  date_ = null;
    
  }

  public static final int RELATESTOKYCDOCUMENTID_FIELD_NUMBER = 8;
  private java.lang.String relatesToKycDocumentID_;
  /**
   * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getRelatesToKycDocumentID() {
    return relatesToKycDocumentID_;
  }
  /**
   * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelatesToKycDocumentIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(relatesToKycDocumentID_);
  }
  /**
   * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRelatesToKycDocumentID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    relatesToKycDocumentID_ = value;
  }
  /**
   * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearRelatesToKycDocumentID() {
    
    relatesToKycDocumentID_ = getDefaultInstance().getRelatesToKycDocumentID();
  }
  /**
   * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRelatesToKycDocumentIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    relatesToKycDocumentID_ = value.toStringUtf8();
  }

  public static final int RELATESTOKYCCHECKID_FIELD_NUMBER = 9;
  private java.lang.String relatesToKycCheckID_;
  /**
   * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getRelatesToKycCheckID() {
    return relatesToKycCheckID_;
  }
  /**
   * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRelatesToKycCheckIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(relatesToKycCheckID_);
  }
  /**
   * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRelatesToKycCheckID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    relatesToKycCheckID_ = value;
  }
  /**
   * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearRelatesToKycCheckID() {
    
    relatesToKycCheckID_ = getDefaultInstance().getRelatesToKycCheckID();
  }
  /**
   * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRelatesToKycCheckIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    relatesToKycCheckID_ = value.toStringUtf8();
  }

  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.kyc.AddKYCMediaResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.kyc.AddKYCMediaResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code kyc.AddKYCMediaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.kyc.AddKYCMediaResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:kyc.AddKYCMediaResponse)
      to.bnk.api.kyc.AddKYCMediaResponseOrBuilder {
    // Construct using to.bnk.api.kyc.AddKYCMediaResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getBankID() {
      return instance.getBankID();
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBankIDBytes() {
      return instance.getBankIDBytes();
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBankID(
        java.lang.String value) {
      copyOnWrite();
      instance.setBankID(value);
      return this;
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearBankID() {
      copyOnWrite();
      instance.clearBankID();
      return this;
    }
    /**
     * <code>string BankID = 1[json_name = "bank_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBankIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setBankIDBytes(value);
      return this;
    }

    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCustomerID() {
      return instance.getCustomerID();
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomerIDBytes() {
      return instance.getCustomerIDBytes();
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerID(
        java.lang.String value) {
      copyOnWrite();
      instance.setCustomerID(value);
      return this;
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCustomerID() {
      copyOnWrite();
      instance.clearCustomerID();
      return this;
    }
    /**
     * <code>string CustomerID = 2[json_name = "customer_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCustomerIDBytes(value);
      return this;
    }

    /**
     * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getID() {
      return instance.getID();
    }
    /**
     * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIDBytes() {
      return instance.getIDBytes();
    }
    /**
     * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setID(
        java.lang.String value) {
      copyOnWrite();
      instance.setID(value);
      return this;
    }
    /**
     * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearID() {
      copyOnWrite();
      instance.clearID();
      return this;
    }
    /**
     * <code>string ID = 3[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIDBytes(value);
      return this;
    }

    /**
     * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getCustomerNumber() {
      return instance.getCustomerNumber();
    }
    /**
     * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCustomerNumberBytes() {
      return instance.getCustomerNumberBytes();
    }
    /**
     * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerNumber(
        java.lang.String value) {
      copyOnWrite();
      instance.setCustomerNumber(value);
      return this;
    }
    /**
     * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCustomerNumber() {
      copyOnWrite();
      instance.clearCustomerNumber();
      return this;
    }
    /**
     * <code>string CustomerNumber = 4[json_name = "customer_number", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCustomerNumberBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setCustomerNumberBytes(value);
      return this;
    }

    /**
     * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getType() {
      return instance.getType();
    }
    /**
     * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      return instance.getTypeBytes();
    }
    /**
     * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setType(
        java.lang.String value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }
    /**
     * <code>string Type = 5[json_name = "type", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setTypeBytes(value);
      return this;
    }

    /**
     * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getURL() {
      return instance.getURL();
    }
    /**
     * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getURLBytes() {
      return instance.getURLBytes();
    }
    /**
     * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setURL(
        java.lang.String value) {
      copyOnWrite();
      instance.setURL(value);
      return this;
    }
    /**
     * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearURL() {
      copyOnWrite();
      instance.clearURL();
      return this;
    }
    /**
     * <code>string URL = 6[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setURLBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setURLBytes(value);
      return this;
    }

    /**
     * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasDate() {
      return instance.hasDate();
    }
    /**
     * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getDate() {
      return instance.getDate();
    }
    /**
     * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDate(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.setDate(value);
      return this;
      }
    /**
     * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDate(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      copyOnWrite();
      instance.setDate(builderForValue);
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeDate(com.google.protobuf.Timestamp value) {
      copyOnWrite();
      instance.mergeDate(value);
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp Date = 7[json_name = "date", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearDate() {  copyOnWrite();
      instance.clearDate();
      return this;
    }

    /**
     * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getRelatesToKycDocumentID() {
      return instance.getRelatesToKycDocumentID();
    }
    /**
     * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRelatesToKycDocumentIDBytes() {
      return instance.getRelatesToKycDocumentIDBytes();
    }
    /**
     * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRelatesToKycDocumentID(
        java.lang.String value) {
      copyOnWrite();
      instance.setRelatesToKycDocumentID(value);
      return this;
    }
    /**
     * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearRelatesToKycDocumentID() {
      copyOnWrite();
      instance.clearRelatesToKycDocumentID();
      return this;
    }
    /**
     * <code>string RelatesToKycDocumentID = 8[json_name = "relates_to_kyc_document_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRelatesToKycDocumentIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRelatesToKycDocumentIDBytes(value);
      return this;
    }

    /**
     * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getRelatesToKycCheckID() {
      return instance.getRelatesToKycCheckID();
    }
    /**
     * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRelatesToKycCheckIDBytes() {
      return instance.getRelatesToKycCheckIDBytes();
    }
    /**
     * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRelatesToKycCheckID(
        java.lang.String value) {
      copyOnWrite();
      instance.setRelatesToKycCheckID(value);
      return this;
    }
    /**
     * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearRelatesToKycCheckID() {
      copyOnWrite();
      instance.clearRelatesToKycCheckID();
      return this;
    }
    /**
     * <code>string RelatesToKycCheckID = 9[json_name = "relates_to_kyc_check_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRelatesToKycCheckIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRelatesToKycCheckIDBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:kyc.AddKYCMediaResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.kyc.AddKYCMediaResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bankID_",
            "customerID_",
            "iD_",
            "customerNumber_",
            "type_",
            "uRL_",
            "date_",
            "relatesToKycDocumentID_",
            "relatesToKycCheckID_",
          };
          java.lang.String info =
              "\u0000\t\u0000\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208" +
              "\u0004\u0208\u0005\u0208\u0006\u0208\u0007\t\b\u0208\t\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.kyc.AddKYCMediaResponse> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.kyc.AddKYCMediaResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.kyc.AddKYCMediaResponse>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:kyc.AddKYCMediaResponse)
  private static final to.bnk.api.kyc.AddKYCMediaResponse DEFAULT_INSTANCE;
  static {
    AddKYCMediaResponse defaultInstance = new AddKYCMediaResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      AddKYCMediaResponse.class, defaultInstance);
  }

  public static to.bnk.api.kyc.AddKYCMediaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<AddKYCMediaResponse> PARSER;

  public static com.google.protobuf.Parser<AddKYCMediaResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

