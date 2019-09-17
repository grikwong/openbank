// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.atm;

/**
 * Protobuf type {@code atm.CreateATMRequest}
 */
public  final class CreateATMRequest extends
    com.google.protobuf.GeneratedMessageLite<
        CreateATMRequest, CreateATMRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:atm.CreateATMRequest)
    CreateATMRequestOrBuilder {
  private CreateATMRequest() {
    bankID_ = "";
    name_ = "";
    description_ = "";
    metadata_ = "";
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

  public static final int NAME_FIELD_NUMBER = 2;
  private java.lang.String name_;
  /**
   * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getName() {
    return name_;
  }
  /**
   * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(name_);
  }
  /**
   * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setName(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    name_ = value;
  }
  /**
   * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearName() {
    
    name_ = getDefaultInstance().getName();
  }
  /**
   * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setNameBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    name_ = value.toStringUtf8();
  }

  public static final int ADDRESS_FIELD_NUMBER = 3;
  private types.All.Address address_;
  /**
   * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasAddress() {
    return address_ != null;
  }
  /**
   * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.Address getAddress() {
    return address_ == null ? types.All.Address.getDefaultInstance() : address_;
  }
  /**
   * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAddress(types.All.Address value) {
    if (value == null) {
      throw new NullPointerException();
    }
    address_ = value;
    
    }
  /**
   * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setAddress(
      types.All.Address.Builder builderForValue) {
    address_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeAddress(types.All.Address value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (address_ != null &&
        address_ != types.All.Address.getDefaultInstance()) {
      address_ =
        types.All.Address.newBuilder(address_).mergeFrom(value).buildPartial();
    } else {
      address_ = value;
    }
    
  }
  /**
   * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearAddress() {  address_ = null;
    
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private types.All.Location location_;
  /**
   * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasLocation() {
    return location_ != null;
  }
  /**
   * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public types.All.Location getLocation() {
    return location_ == null ? types.All.Location.getDefaultInstance() : location_;
  }
  /**
   * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setLocation(types.All.Location value) {
    if (value == null) {
      throw new NullPointerException();
    }
    location_ = value;
    
    }
  /**
   * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setLocation(
      types.All.Location.Builder builderForValue) {
    location_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeLocation(types.All.Location value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (location_ != null &&
        location_ != types.All.Location.getDefaultInstance()) {
      location_ =
        types.All.Location.newBuilder(location_).mergeFrom(value).buildPartial();
    } else {
      location_ = value;
    }
    
  }
  /**
   * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearLocation() {  location_ = null;
    
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 5;
  private java.lang.String description_;
  /**
   * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    return description_;
  }
  /**
   * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(description_);
  }
  /**
   * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDescription(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    description_ = value;
  }
  /**
   * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearDescription() {
    
    description_ = getDefaultInstance().getDescription();
  }
  /**
   * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setDescriptionBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    description_ = value.toStringUtf8();
  }

  public static final int METADATA_FIELD_NUMBER = 6;
  private java.lang.String metadata_;
  /**
   * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getMetadata() {
    return metadata_;
  }
  /**
   * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMetadataBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(metadata_);
  }
  /**
   * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setMetadata(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    metadata_ = value;
  }
  /**
   * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearMetadata() {
    
    metadata_ = getDefaultInstance().getMetadata();
  }
  /**
   * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setMetadataBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    metadata_ = value.toStringUtf8();
  }

  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.atm.CreateATMRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.atm.CreateATMRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.atm.CreateATMRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.atm.CreateATMRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code atm.CreateATMRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.atm.CreateATMRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:atm.CreateATMRequest)
      to.bnk.api.atm.CreateATMRequestOrBuilder {
    // Construct using to.bnk.api.atm.CreateATMRequest.newBuilder()
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
     * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getName() {
      return instance.getName();
    }
    /**
     * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return instance.getNameBytes();
    }
    /**
     * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setName(
        java.lang.String value) {
      copyOnWrite();
      instance.setName(value);
      return this;
    }
    /**
     * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearName() {
      copyOnWrite();
      instance.clearName();
      return this;
    }
    /**
     * <code>string Name = 2[json_name = "name", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setNameBytes(value);
      return this;
    }

    /**
     * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasAddress() {
      return instance.hasAddress();
    }
    /**
     * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.Address getAddress() {
      return instance.getAddress();
    }
    /**
     * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAddress(types.All.Address value) {
      copyOnWrite();
      instance.setAddress(value);
      return this;
      }
    /**
     * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setAddress(
        types.All.Address.Builder builderForValue) {
      copyOnWrite();
      instance.setAddress(builderForValue);
      return this;
    }
    /**
     * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeAddress(types.All.Address value) {
      copyOnWrite();
      instance.mergeAddress(value);
      return this;
    }
    /**
     * <code>.types.Address Address = 3[json_name = "3", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearAddress() {  copyOnWrite();
      instance.clearAddress();
      return this;
    }

    /**
     * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasLocation() {
      return instance.hasLocation();
    }
    /**
     * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public types.All.Location getLocation() {
      return instance.getLocation();
    }
    /**
     * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setLocation(types.All.Location value) {
      copyOnWrite();
      instance.setLocation(value);
      return this;
      }
    /**
     * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setLocation(
        types.All.Location.Builder builderForValue) {
      copyOnWrite();
      instance.setLocation(builderForValue);
      return this;
    }
    /**
     * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeLocation(types.All.Location value) {
      copyOnWrite();
      instance.mergeLocation(value);
      return this;
    }
    /**
     * <code>.types.Location Location = 4[json_name = "location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearLocation() {  copyOnWrite();
      instance.clearLocation();
      return this;
    }

    /**
     * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getDescription() {
      return instance.getDescription();
    }
    /**
     * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      return instance.getDescriptionBytes();
    }
    /**
     * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDescription(
        java.lang.String value) {
      copyOnWrite();
      instance.setDescription(value);
      return this;
    }
    /**
     * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearDescription() {
      copyOnWrite();
      instance.clearDescription();
      return this;
    }
    /**
     * <code>string Description = 5[json_name = "description", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDescriptionBytes(value);
      return this;
    }

    /**
     * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getMetadata() {
      return instance.getMetadata();
    }
    /**
     * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMetadataBytes() {
      return instance.getMetadataBytes();
    }
    /**
     * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setMetadata(
        java.lang.String value) {
      copyOnWrite();
      instance.setMetadata(value);
      return this;
    }
    /**
     * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearMetadata() {
      copyOnWrite();
      instance.clearMetadata();
      return this;
    }
    /**
     * <code>string Metadata = 6[json_name = "metadata", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setMetadataBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMetadataBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:atm.CreateATMRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.atm.CreateATMRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "bankID_",
            "name_",
            "address_",
            "location_",
            "description_",
            "metadata_",
          };
          java.lang.String info =
              "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\t\u0004\t\u0005\u0208\u0006\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.atm.CreateATMRequest> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.atm.CreateATMRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.atm.CreateATMRequest>(
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


  // @@protoc_insertion_point(class_scope:atm.CreateATMRequest)
  private static final to.bnk.api.atm.CreateATMRequest DEFAULT_INSTANCE;
  static {
    CreateATMRequest defaultInstance = new CreateATMRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      CreateATMRequest.class, defaultInstance);
  }

  public static to.bnk.api.atm.CreateATMRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<CreateATMRequest> PARSER;

  public static com.google.protobuf.Parser<CreateATMRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

