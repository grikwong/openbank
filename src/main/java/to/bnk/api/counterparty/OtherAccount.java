// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.counterparty;

/**
 * Protobuf type {@code counterparty.OtherAccount}
 */
public  final class OtherAccount extends
    com.google.protobuf.GeneratedMessageLite<
        OtherAccount, OtherAccount.Builder> implements
    // @@protoc_insertion_point(message_implements:counterparty.OtherAccount)
    OtherAccountOrBuilder {
  private OtherAccount() {
    iD_ = "";
    accountRoutings_ = emptyProtobufList();
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String iD_;
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getID() {
    return iD_;
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIDBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(iD_);
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setID(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    iD_ = value;
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearID() {
    
    iD_ = getDefaultInstance().getID();
  }
  /**
   * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setIDBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    iD_ = value.toStringUtf8();
  }

  public static final int HOLDER_FIELD_NUMBER = 2;
  private to.bnk.api.counterparty.Holder holder_;
  /**
   * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasHolder() {
    return holder_ != null;
  }
  /**
   * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.counterparty.Holder getHolder() {
    return holder_ == null ? to.bnk.api.counterparty.Holder.getDefaultInstance() : holder_;
  }
  /**
   * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setHolder(to.bnk.api.counterparty.Holder value) {
    if (value == null) {
      throw new NullPointerException();
    }
    holder_ = value;
    
    }
  /**
   * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setHolder(
      to.bnk.api.counterparty.Holder.Builder builderForValue) {
    holder_ = builderForValue.build();
    
  }
  /**
   * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeHolder(to.bnk.api.counterparty.Holder value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (holder_ != null &&
        holder_ != to.bnk.api.counterparty.Holder.getDefaultInstance()) {
      holder_ =
        to.bnk.api.counterparty.Holder.newBuilder(holder_).mergeFrom(value).buildPartial();
    } else {
      holder_ = value;
    }
    
  }
  /**
   * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearHolder() {  holder_ = null;
    
  }

  public static final int BANKROUTING_FIELD_NUMBER = 3;
  private to.bnk.api.counterparty.BankRouting bankRouting_;
  /**
   * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasBankRouting() {
    return bankRouting_ != null;
  }
  /**
   * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.counterparty.BankRouting getBankRouting() {
    return bankRouting_ == null ? to.bnk.api.counterparty.BankRouting.getDefaultInstance() : bankRouting_;
  }
  /**
   * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBankRouting(to.bnk.api.counterparty.BankRouting value) {
    if (value == null) {
      throw new NullPointerException();
    }
    bankRouting_ = value;
    
    }
  /**
   * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setBankRouting(
      to.bnk.api.counterparty.BankRouting.Builder builderForValue) {
    bankRouting_ = builderForValue.build();
    
  }
  /**
   * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeBankRouting(to.bnk.api.counterparty.BankRouting value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (bankRouting_ != null &&
        bankRouting_ != to.bnk.api.counterparty.BankRouting.getDefaultInstance()) {
      bankRouting_ =
        to.bnk.api.counterparty.BankRouting.newBuilder(bankRouting_).mergeFrom(value).buildPartial();
    } else {
      bankRouting_ = value;
    }
    
  }
  /**
   * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearBankRouting() {  bankRouting_ = null;
    
  }

  public static final int ACCOUNTROUTINGS_FIELD_NUMBER = 4;
  private com.google.protobuf.Internal.ProtobufList<to.bnk.api.counterparty.AccountRoutings> accountRoutings_;
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.util.List<to.bnk.api.counterparty.AccountRoutings> getAccountRoutingsList() {
    return accountRoutings_;
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public java.util.List<? extends to.bnk.api.counterparty.AccountRoutingsOrBuilder> 
      getAccountRoutingsOrBuilderList() {
    return accountRoutings_;
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public int getAccountRoutingsCount() {
    return accountRoutings_.size();
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.counterparty.AccountRoutings getAccountRoutings(int index) {
    return accountRoutings_.get(index);
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  public to.bnk.api.counterparty.AccountRoutingsOrBuilder getAccountRoutingsOrBuilder(
      int index) {
    return accountRoutings_.get(index);
  }
  private void ensureAccountRoutingsIsMutable() {
    if (!accountRoutings_.isModifiable()) {
      accountRoutings_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(accountRoutings_);
     }
  }

  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccountRoutings(
      int index, to.bnk.api.counterparty.AccountRoutings value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureAccountRoutingsIsMutable();
    accountRoutings_.set(index, value);
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAccountRoutings(
      int index, to.bnk.api.counterparty.AccountRoutings.Builder builderForValue) {
    ensureAccountRoutingsIsMutable();
    accountRoutings_.set(index, builderForValue.build());
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccountRoutings(to.bnk.api.counterparty.AccountRoutings value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureAccountRoutingsIsMutable();
    accountRoutings_.add(value);
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccountRoutings(
      int index, to.bnk.api.counterparty.AccountRoutings value) {
    if (value == null) {
      throw new NullPointerException();
    }
    ensureAccountRoutingsIsMutable();
    accountRoutings_.add(index, value);
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccountRoutings(
      to.bnk.api.counterparty.AccountRoutings.Builder builderForValue) {
    ensureAccountRoutingsIsMutable();
    accountRoutings_.add(builderForValue.build());
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAccountRoutings(
      int index, to.bnk.api.counterparty.AccountRoutings.Builder builderForValue) {
    ensureAccountRoutingsIsMutable();
    accountRoutings_.add(index, builderForValue.build());
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void addAllAccountRoutings(
      java.lang.Iterable<? extends to.bnk.api.counterparty.AccountRoutings> values) {
    ensureAccountRoutingsIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, accountRoutings_);
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAccountRoutings() {
    accountRoutings_ = emptyProtobufList();
  }
  /**
   * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void removeAccountRoutings(int index) {
    ensureAccountRoutingsIsMutable();
    accountRoutings_.remove(index);
  }

  public static final int METADATA_FIELD_NUMBER = 5;
  private to.bnk.api.counterparty.Metadata metadata_;
  /**
   * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.counterparty.Metadata getMetadata() {
    return metadata_ == null ? to.bnk.api.counterparty.Metadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setMetadata(to.bnk.api.counterparty.Metadata value) {
    if (value == null) {
      throw new NullPointerException();
    }
    metadata_ = value;
    
    }
  /**
   * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setMetadata(
      to.bnk.api.counterparty.Metadata.Builder builderForValue) {
    metadata_ = builderForValue.build();
    
  }
  /**
   * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeMetadata(to.bnk.api.counterparty.Metadata value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (metadata_ != null &&
        metadata_ != to.bnk.api.counterparty.Metadata.getDefaultInstance()) {
      metadata_ =
        to.bnk.api.counterparty.Metadata.newBuilder(metadata_).mergeFrom(value).buildPartial();
    } else {
      metadata_ = value;
    }
    
  }
  /**
   * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearMetadata() {  metadata_ = null;
    
  }

  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.counterparty.OtherAccount parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.counterparty.OtherAccount parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.counterparty.OtherAccount parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.counterparty.OtherAccount prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code counterparty.OtherAccount}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.counterparty.OtherAccount, Builder> implements
      // @@protoc_insertion_point(builder_implements:counterparty.OtherAccount)
      to.bnk.api.counterparty.OtherAccountOrBuilder {
    // Construct using to.bnk.api.counterparty.OtherAccount.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getID() {
      return instance.getID();
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getIDBytes() {
      return instance.getIDBytes();
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setID(
        java.lang.String value) {
      copyOnWrite();
      instance.setID(value);
      return this;
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearID() {
      copyOnWrite();
      instance.clearID();
      return this;
    }
    /**
     * <code>string ID = 1[json_name = "id", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setIDBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setIDBytes(value);
      return this;
    }

    /**
     * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasHolder() {
      return instance.hasHolder();
    }
    /**
     * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.counterparty.Holder getHolder() {
      return instance.getHolder();
    }
    /**
     * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setHolder(to.bnk.api.counterparty.Holder value) {
      copyOnWrite();
      instance.setHolder(value);
      return this;
      }
    /**
     * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setHolder(
        to.bnk.api.counterparty.Holder.Builder builderForValue) {
      copyOnWrite();
      instance.setHolder(builderForValue);
      return this;
    }
    /**
     * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeHolder(to.bnk.api.counterparty.Holder value) {
      copyOnWrite();
      instance.mergeHolder(value);
      return this;
    }
    /**
     * <code>.counterparty.Holder Holder = 2[json_name = "holder", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearHolder() {  copyOnWrite();
      instance.clearHolder();
      return this;
    }

    /**
     * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasBankRouting() {
      return instance.hasBankRouting();
    }
    /**
     * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.counterparty.BankRouting getBankRouting() {
      return instance.getBankRouting();
    }
    /**
     * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBankRouting(to.bnk.api.counterparty.BankRouting value) {
      copyOnWrite();
      instance.setBankRouting(value);
      return this;
      }
    /**
     * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setBankRouting(
        to.bnk.api.counterparty.BankRouting.Builder builderForValue) {
      copyOnWrite();
      instance.setBankRouting(builderForValue);
      return this;
    }
    /**
     * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeBankRouting(to.bnk.api.counterparty.BankRouting value) {
      copyOnWrite();
      instance.mergeBankRouting(value);
      return this;
    }
    /**
     * <code>.counterparty.BankRouting BankRouting = 3[json_name = "bank_routing", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearBankRouting() {  copyOnWrite();
      instance.clearBankRouting();
      return this;
    }

    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.util.List<to.bnk.api.counterparty.AccountRoutings> getAccountRoutingsList() {
      return java.util.Collections.unmodifiableList(
          instance.getAccountRoutingsList());
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public int getAccountRoutingsCount() {
      return instance.getAccountRoutingsCount();
    }/**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.counterparty.AccountRoutings getAccountRoutings(int index) {
      return instance.getAccountRoutings(index);
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccountRoutings(
        int index, to.bnk.api.counterparty.AccountRoutings value) {
      copyOnWrite();
      instance.setAccountRoutings(index, value);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAccountRoutings(
        int index, to.bnk.api.counterparty.AccountRoutings.Builder builderForValue) {
      copyOnWrite();
      instance.setAccountRoutings(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccountRoutings(to.bnk.api.counterparty.AccountRoutings value) {
      copyOnWrite();
      instance.addAccountRoutings(value);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccountRoutings(
        int index, to.bnk.api.counterparty.AccountRoutings value) {
      copyOnWrite();
      instance.addAccountRoutings(index, value);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccountRoutings(
        to.bnk.api.counterparty.AccountRoutings.Builder builderForValue) {
      copyOnWrite();
      instance.addAccountRoutings(builderForValue);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAccountRoutings(
        int index, to.bnk.api.counterparty.AccountRoutings.Builder builderForValue) {
      copyOnWrite();
      instance.addAccountRoutings(index, builderForValue);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder addAllAccountRoutings(
        java.lang.Iterable<? extends to.bnk.api.counterparty.AccountRoutings> values) {
      copyOnWrite();
      instance.addAllAccountRoutings(values);
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAccountRoutings() {
      copyOnWrite();
      instance.clearAccountRoutings();
      return this;
    }
    /**
     * <code>repeated .counterparty.AccountRoutings AccountRoutings = 4[json_name = "account_routings", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder removeAccountRoutings(int index) {
      copyOnWrite();
      instance.removeAccountRoutings(index);
      return this;
    }

    /**
     * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasMetadata() {
      return instance.hasMetadata();
    }
    /**
     * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.counterparty.Metadata getMetadata() {
      return instance.getMetadata();
    }
    /**
     * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setMetadata(to.bnk.api.counterparty.Metadata value) {
      copyOnWrite();
      instance.setMetadata(value);
      return this;
      }
    /**
     * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setMetadata(
        to.bnk.api.counterparty.Metadata.Builder builderForValue) {
      copyOnWrite();
      instance.setMetadata(builderForValue);
      return this;
    }
    /**
     * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeMetadata(to.bnk.api.counterparty.Metadata value) {
      copyOnWrite();
      instance.mergeMetadata(value);
      return this;
    }
    /**
     * <code>.counterparty.Metadata Metadata = 5[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearMetadata() {  copyOnWrite();
      instance.clearMetadata();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:counterparty.OtherAccount)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.counterparty.OtherAccount();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "iD_",
            "holder_",
            "bankRouting_",
            "accountRoutings_",
            to.bnk.api.counterparty.AccountRoutings.class,
            "metadata_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0208\u0002\t" +
              "\u0003\t\u0004\u001b\u0005\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.counterparty.OtherAccount> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.counterparty.OtherAccount.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.counterparty.OtherAccount>(
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


  // @@protoc_insertion_point(class_scope:counterparty.OtherAccount)
  private static final to.bnk.api.counterparty.OtherAccount DEFAULT_INSTANCE;
  static {
    OtherAccount defaultInstance = new OtherAccount();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      OtherAccount.class, defaultInstance);
  }

  public static to.bnk.api.counterparty.OtherAccount getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<OtherAccount> PARSER;

  public static com.google.protobuf.Parser<OtherAccount> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

