// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.transactions;

/**
 * Protobuf type {@code transactions.CreateTransactionRequest}
 */
public  final class CreateTransactionRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateTransactionRequest, CreateTransactionRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:transactions.CreateTransactionRequest)
    CreateTransactionRequestOrBuilder {
  private CreateTransactionRequest() {
    sourceAccountID_ = "";
    remarks_ = "";
  }
  public static final int SOURCEACCOUNTID_FIELD_NUMBER = 1;
  private java.lang.String sourceAccountID_;
  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getSourceAccountID() {
    return sourceAccountID_;
  }
  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSourceAccountIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(sourceAccountID_);
  }
  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setSourceAccountID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    sourceAccountID_ = value;
  }
  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearSourceAccountID() {
    
    sourceAccountID_ = getDefaultInstance().getSourceAccountID();
  }
  /**
   * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setSourceAccountIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    sourceAccountID_ = value.toStringUtf8();
  }

  public static final int SOURCEOFFLINEUSER_FIELD_NUMBER = 5;
  private types.All.OfflineUserInfo sourceOfflineUser_;
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasSourceOfflineUser() {
    return sourceOfflineUser_ != null;
  }
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.OfflineUserInfo getSourceOfflineUser() {
    return sourceOfflineUser_ == null ? types.All.OfflineUserInfo.getDefaultInstance() : sourceOfflineUser_;
  }
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setSourceOfflineUser(types.All.OfflineUserInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    sourceOfflineUser_ = value;
    
    }
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setSourceOfflineUser(
      types.All.OfflineUserInfo.Builder builderForValue) {
    sourceOfflineUser_ = builderForValue.build();
    
  }
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSourceOfflineUser(types.All.OfflineUserInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (sourceOfflineUser_ != null &&
        sourceOfflineUser_ != types.All.OfflineUserInfo.getDefaultInstance()) {
      sourceOfflineUser_ =
        types.All.OfflineUserInfo.newBuilder(sourceOfflineUser_).mergeFrom(value).buildPartial();
    } else {
      sourceOfflineUser_ = value;
    }
    
  }
  /**
   * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearSourceOfflineUser() {  sourceOfflineUser_ = null;
    
  }

  public static final int DESTINATIONACCOUNT_FIELD_NUMBER = 2;
  private to.bnk.api.transactions.BankAccountInfo destinationAccount_;
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasDestinationAccount() {
    return destinationAccount_ != null;
  }
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.transactions.BankAccountInfo getDestinationAccount() {
    return destinationAccount_ == null ? to.bnk.api.transactions.BankAccountInfo.getDefaultInstance() : destinationAccount_;
  }
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDestinationAccount(to.bnk.api.transactions.BankAccountInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    destinationAccount_ = value;
    
    }
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDestinationAccount(
      to.bnk.api.transactions.BankAccountInfo.Builder builderForValue) {
    destinationAccount_ = builderForValue.build();
    
  }
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDestinationAccount(to.bnk.api.transactions.BankAccountInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (destinationAccount_ != null &&
        destinationAccount_ != to.bnk.api.transactions.BankAccountInfo.getDefaultInstance()) {
      destinationAccount_ =
        to.bnk.api.transactions.BankAccountInfo.newBuilder(destinationAccount_).mergeFrom(value).buildPartial();
    } else {
      destinationAccount_ = value;
    }
    
  }
  /**
   * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearDestinationAccount() {  destinationAccount_ = null;
    
  }

  public static final int DESTINATIONOFFLINEUSER_FIELD_NUMBER = 6;
  private types.All.OfflineUserInfo destinationOfflineUser_;
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasDestinationOfflineUser() {
    return destinationOfflineUser_ != null;
  }
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.OfflineUserInfo getDestinationOfflineUser() {
    return destinationOfflineUser_ == null ? types.All.OfflineUserInfo.getDefaultInstance() : destinationOfflineUser_;
  }
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDestinationOfflineUser(types.All.OfflineUserInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    destinationOfflineUser_ = value;
    
    }
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDestinationOfflineUser(
      types.All.OfflineUserInfo.Builder builderForValue) {
    destinationOfflineUser_ = builderForValue.build();
    
  }
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeDestinationOfflineUser(types.All.OfflineUserInfo value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (destinationOfflineUser_ != null &&
        destinationOfflineUser_ != types.All.OfflineUserInfo.getDefaultInstance()) {
      destinationOfflineUser_ =
        types.All.OfflineUserInfo.newBuilder(destinationOfflineUser_).mergeFrom(value).buildPartial();
    } else {
      destinationOfflineUser_ = value;
    }
    
  }
  /**
   * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearDestinationOfflineUser() {  destinationOfflineUser_ = null;
    
  }

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private types.All.Amount amount_;
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasAmount() {
    return amount_ != null;
  }
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.Amount getAmount() {
    return amount_ == null ? types.All.Amount.getDefaultInstance() : amount_;
  }
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAmount(types.All.Amount value) {
    if (value == null) {
      throw new NullPointerException();
    }
    amount_ = value;
    
    }
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAmount(
      types.All.Amount.Builder builderForValue) {
    amount_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAmount(types.All.Amount value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (amount_ != null &&
        amount_ != types.All.Amount.getDefaultInstance()) {
      amount_ =
        types.All.Amount.newBuilder(amount_).mergeFrom(value).buildPartial();
    } else {
      amount_ = value;
    }
    
  }
  /**
   * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAmount() {  amount_ = null;
    
  }

  public static final int REMARKS_FIELD_NUMBER = 4;
  private java.lang.String remarks_;
  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getRemarks() {
    return remarks_;
  }
  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRemarksBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(remarks_);
  }
  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRemarks(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    remarks_ = value;
  }
  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearRemarks() {
    
    remarks_ = getDefaultInstance().getRemarks();
  }
  /**
   * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setRemarksBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    remarks_ = value.toStringUtf8();
  }

  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.transactions.CreateTransactionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.transactions.CreateTransactionRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code transactions.CreateTransactionRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.transactions.CreateTransactionRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:transactions.CreateTransactionRequest)
      to.bnk.api.transactions.CreateTransactionRequestOrBuilder {
    // Construct using to.bnk.api.transactions.CreateTransactionRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getSourceAccountID() {
      return instance.getSourceAccountID();
    }
    /**
     * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSourceAccountIDBytes() {
      return instance.getSourceAccountIDBytes();
    }
    /**
     * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setSourceAccountID(
        java.lang.String value) {
      copyOnWrite();
      instance.setSourceAccountID(value);
      return this;
    }
    /**
     * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearSourceAccountID() {
      copyOnWrite();
      instance.clearSourceAccountID();
      return this;
    }
    /**
     * <code>string SourceAccountID = 1[json_name = "source_account_id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setSourceAccountIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setSourceAccountIDBytes(value);
      return this;
    }

    /**
     * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasSourceOfflineUser() {
      return instance.hasSourceOfflineUser();
    }
    /**
     * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.OfflineUserInfo getSourceOfflineUser() {
      return instance.getSourceOfflineUser();
    }
    /**
     * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setSourceOfflineUser(types.All.OfflineUserInfo value) {
      copyOnWrite();
      instance.setSourceOfflineUser(value);
      return this;
      }
    /**
     * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setSourceOfflineUser(
        types.All.OfflineUserInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setSourceOfflineUser(builderForValue);
      return this;
    }
    /**
     * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeSourceOfflineUser(types.All.OfflineUserInfo value) {
      copyOnWrite();
      instance.mergeSourceOfflineUser(value);
      return this;
    }
    /**
     * <code>.types.OfflineUserInfo SourceOfflineUser = 5[json_name = "source_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearSourceOfflineUser() {  copyOnWrite();
      instance.clearSourceOfflineUser();
      return this;
    }

    /**
     * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasDestinationAccount() {
      return instance.hasDestinationAccount();
    }
    /**
     * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.transactions.BankAccountInfo getDestinationAccount() {
      return instance.getDestinationAccount();
    }
    /**
     * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDestinationAccount(to.bnk.api.transactions.BankAccountInfo value) {
      copyOnWrite();
      instance.setDestinationAccount(value);
      return this;
      }
    /**
     * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDestinationAccount(
        to.bnk.api.transactions.BankAccountInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setDestinationAccount(builderForValue);
      return this;
    }
    /**
     * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeDestinationAccount(to.bnk.api.transactions.BankAccountInfo value) {
      copyOnWrite();
      instance.mergeDestinationAccount(value);
      return this;
    }
    /**
     * <code>.transactions.BankAccountInfo DestinationAccount = 2[json_name = "destination_account", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearDestinationAccount() {  copyOnWrite();
      instance.clearDestinationAccount();
      return this;
    }

    /**
     * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasDestinationOfflineUser() {
      return instance.hasDestinationOfflineUser();
    }
    /**
     * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.OfflineUserInfo getDestinationOfflineUser() {
      return instance.getDestinationOfflineUser();
    }
    /**
     * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDestinationOfflineUser(types.All.OfflineUserInfo value) {
      copyOnWrite();
      instance.setDestinationOfflineUser(value);
      return this;
      }
    /**
     * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDestinationOfflineUser(
        types.All.OfflineUserInfo.Builder builderForValue) {
      copyOnWrite();
      instance.setDestinationOfflineUser(builderForValue);
      return this;
    }
    /**
     * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeDestinationOfflineUser(types.All.OfflineUserInfo value) {
      copyOnWrite();
      instance.mergeDestinationOfflineUser(value);
      return this;
    }
    /**
     * <code>.types.OfflineUserInfo DestinationOfflineUser = 6[json_name = "destination_offline_user", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearDestinationOfflineUser() {  copyOnWrite();
      instance.clearDestinationOfflineUser();
      return this;
    }

    /**
     * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasAmount() {
      return instance.hasAmount();
    }
    /**
     * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.Amount getAmount() {
      return instance.getAmount();
    }
    /**
     * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAmount(types.All.Amount value) {
      copyOnWrite();
      instance.setAmount(value);
      return this;
      }
    /**
     * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAmount(
        types.All.Amount.Builder builderForValue) {
      copyOnWrite();
      instance.setAmount(builderForValue);
      return this;
    }
    /**
     * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeAmount(types.All.Amount value) {
      copyOnWrite();
      instance.mergeAmount(value);
      return this;
    }
    /**
     * <code>.types.Amount Amount = 3[json_name = "amount", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAmount() {  copyOnWrite();
      instance.clearAmount();
      return this;
    }

    /**
     * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getRemarks() {
      return instance.getRemarks();
    }
    /**
     * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getRemarksBytes() {
      return instance.getRemarksBytes();
    }
    /**
     * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRemarks(
        java.lang.String value) {
      copyOnWrite();
      instance.setRemarks(value);
      return this;
    }
    /**
     * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearRemarks() {
      copyOnWrite();
      instance.clearRemarks();
      return this;
    }
    /**
     * <code>string Remarks = 4[json_name = "remarks", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setRemarksBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setRemarksBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:transactions.CreateTransactionRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.transactions.CreateTransactionRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "sourceAccountID_",
            "destinationAccount_",
            "amount_",
            "remarks_",
            "sourceOfflineUser_",
            "destinationOfflineUser_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\t" +
              "\u0003\t\u0004\u0208\u0005\t\u0006\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.transactions.CreateTransactionRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.transactions.CreateTransactionRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.transactions.CreateTransactionRequest>(
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


  // @@protoc_insertion_point(class_scope:transactions.CreateTransactionRequest)
  private static final to.bnk.api.transactions.CreateTransactionRequest DEFAULT_INSTANCE;
  static {
    CreateTransactionRequest defaultInstance = new CreateTransactionRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateTransactionRequest.class, defaultInstance);
  }

  public static to.bnk.api.transactions.CreateTransactionRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateTransactionRequest> PARSER;

  public static com.google.protobuf.Parser<CreateTransactionRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

