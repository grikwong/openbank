// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: all.proto

package to.bnk.api.counterparty;

/**
 * Protobuf type {@code counterparty.Metadata}
 */
public  final class Metadata extends
    com.google.protobuf.GeneratedMessageLite<
        Metadata, Metadata.Builder> implements
    // @@protoc_insertion_point(message_implements:counterparty.Metadata)
    MetadataOrBuilder {
  private Metadata() {
    publicAlias_ = "";
    moreInfo_ = "";
    uRL_ = "";
    imageURL_ = "";
    openCorporatesURL_ = "";
    privateAlias_ = "";
  }
  public static final int PUBLICALIAS_FIELD_NUMBER = 1;
  private java.lang.String publicAlias_;
  /**
   * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getPublicAlias() {
    return publicAlias_;
  }
  /**
   * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPublicAliasBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(publicAlias_);
  }
  /**
   * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setPublicAlias(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    publicAlias_ = value;
  }
  /**
   * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearPublicAlias() {
    
    publicAlias_ = getDefaultInstance().getPublicAlias();
  }
  /**
   * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setPublicAliasBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    publicAlias_ = value.toStringUtf8();
  }

  public static final int MOREINFO_FIELD_NUMBER = 2;
  private java.lang.String moreInfo_;
  /**
   * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getMoreInfo() {
    return moreInfo_;
  }
  /**
   * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMoreInfoBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(moreInfo_);
  }
  /**
   * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setMoreInfo(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    moreInfo_ = value;
  }
  /**
   * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearMoreInfo() {
    
    moreInfo_ = getDefaultInstance().getMoreInfo();
  }
  /**
   * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setMoreInfoBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    moreInfo_ = value.toStringUtf8();
  }

  public static final int URL_FIELD_NUMBER = 3;
  private java.lang.String uRL_;
  /**
   * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getURL() {
    return uRL_;
  }
  /**
   * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getURLBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(uRL_);
  }
  /**
   * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setURL(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    uRL_ = value;
  }
  /**
   * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearURL() {
    
    uRL_ = getDefaultInstance().getURL();
  }
  /**
   * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setURLBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    uRL_ = value.toStringUtf8();
  }

  public static final int IMAGEURL_FIELD_NUMBER = 4;
  private java.lang.String imageURL_;
  /**
   * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getImageURL() {
    return imageURL_;
  }
  /**
   * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageURLBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(imageURL_);
  }
  /**
   * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setImageURL(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    imageURL_ = value;
  }
  /**
   * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearImageURL() {
    
    imageURL_ = getDefaultInstance().getImageURL();
  }
  /**
   * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setImageURLBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    imageURL_ = value.toStringUtf8();
  }

  public static final int OPENCORPORATESURL_FIELD_NUMBER = 5;
  private java.lang.String openCorporatesURL_;
  /**
   * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getOpenCorporatesURL() {
    return openCorporatesURL_;
  }
  /**
   * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOpenCorporatesURLBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(openCorporatesURL_);
  }
  /**
   * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setOpenCorporatesURL(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    openCorporatesURL_ = value;
  }
  /**
   * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearOpenCorporatesURL() {
    
    openCorporatesURL_ = getDefaultInstance().getOpenCorporatesURL();
  }
  /**
   * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setOpenCorporatesURLBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    openCorporatesURL_ = value.toStringUtf8();
  }

  public static final int CORPORATELOCATION_FIELD_NUMBER = 6;
  private to.bnk.api.types.Location corporateLocation_;
  /**
   * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasCorporateLocation() {
    return corporateLocation_ != null;
  }
  /**
   * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.types.Location getCorporateLocation() {
    return corporateLocation_ == null ? to.bnk.api.types.Location.getDefaultInstance() : corporateLocation_;
  }
  /**
   * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCorporateLocation(to.bnk.api.types.Location value) {
    if (value == null) {
      throw new NullPointerException();
    }
    corporateLocation_ = value;
    
    }
  /**
   * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setCorporateLocation(
      to.bnk.api.types.Location.Builder builderForValue) {
    corporateLocation_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeCorporateLocation(to.bnk.api.types.Location value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (corporateLocation_ != null &&
        corporateLocation_ != to.bnk.api.types.Location.getDefaultInstance()) {
      corporateLocation_ =
        to.bnk.api.types.Location.newBuilder(corporateLocation_).mergeFrom(value).buildPartial();
    } else {
      corporateLocation_ = value;
    }
    
  }
  /**
   * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearCorporateLocation() {  corporateLocation_ = null;
    
  }

  public static final int PHYSICALLOCATION_FIELD_NUMBER = 7;
  private to.bnk.api.types.Location physicalLocation_;
  /**
   * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public boolean hasPhysicalLocation() {
    return physicalLocation_ != null;
  }
  /**
   * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public to.bnk.api.types.Location getPhysicalLocation() {
    return physicalLocation_ == null ? to.bnk.api.types.Location.getDefaultInstance() : physicalLocation_;
  }
  /**
   * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setPhysicalLocation(to.bnk.api.types.Location value) {
    if (value == null) {
      throw new NullPointerException();
    }
    physicalLocation_ = value;
    
    }
  /**
   * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setPhysicalLocation(
      to.bnk.api.types.Location.Builder builderForValue) {
    physicalLocation_ = builderForValue.build();
    
  }
  /**
   * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergePhysicalLocation(to.bnk.api.types.Location value) {
    if (value == null) {
      throw new NullPointerException();
    }
    if (physicalLocation_ != null &&
        physicalLocation_ != to.bnk.api.types.Location.getDefaultInstance()) {
      physicalLocation_ =
        to.bnk.api.types.Location.newBuilder(physicalLocation_).mergeFrom(value).buildPartial();
    } else {
      physicalLocation_ = value;
    }
    
  }
  /**
   * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearPhysicalLocation() {  physicalLocation_ = null;
    
  }

  public static final int PRIVATEALIAS_FIELD_NUMBER = 8;
  private java.lang.String privateAlias_;
  /**
   * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public java.lang.String getPrivateAlias() {
    return privateAlias_;
  }
  /**
   * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPrivateAliasBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(privateAlias_);
  }
  /**
   * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setPrivateAlias(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    privateAlias_ = value;
  }
  /**
   * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void clearPrivateAlias() {
    
    privateAlias_ = getDefaultInstance().getPrivateAlias();
  }
  /**
   * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
   */
  private void setPrivateAliasBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    privateAlias_ = value.toStringUtf8();
  }

  public static to.bnk.api.counterparty.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.counterparty.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.counterparty.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static to.bnk.api.counterparty.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(to.bnk.api.counterparty.Metadata prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code counterparty.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        to.bnk.api.counterparty.Metadata, Builder> implements
      // @@protoc_insertion_point(builder_implements:counterparty.Metadata)
      to.bnk.api.counterparty.MetadataOrBuilder {
    // Construct using to.bnk.api.counterparty.Metadata.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getPublicAlias() {
      return instance.getPublicAlias();
    }
    /**
     * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPublicAliasBytes() {
      return instance.getPublicAliasBytes();
    }
    /**
     * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setPublicAlias(
        java.lang.String value) {
      copyOnWrite();
      instance.setPublicAlias(value);
      return this;
    }
    /**
     * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearPublicAlias() {
      copyOnWrite();
      instance.clearPublicAlias();
      return this;
    }
    /**
     * <code>string PublicAlias = 1[json_name = "public_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setPublicAliasBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPublicAliasBytes(value);
      return this;
    }

    /**
     * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getMoreInfo() {
      return instance.getMoreInfo();
    }
    /**
     * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getMoreInfoBytes() {
      return instance.getMoreInfoBytes();
    }
    /**
     * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setMoreInfo(
        java.lang.String value) {
      copyOnWrite();
      instance.setMoreInfo(value);
      return this;
    }
    /**
     * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearMoreInfo() {
      copyOnWrite();
      instance.clearMoreInfo();
      return this;
    }
    /**
     * <code>string MoreInfo = 2[json_name = "more_info", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setMoreInfoBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMoreInfoBytes(value);
      return this;
    }

    /**
     * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getURL() {
      return instance.getURL();
    }
    /**
     * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getURLBytes() {
      return instance.getURLBytes();
    }
    /**
     * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setURL(
        java.lang.String value) {
      copyOnWrite();
      instance.setURL(value);
      return this;
    }
    /**
     * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearURL() {
      copyOnWrite();
      instance.clearURL();
      return this;
    }
    /**
     * <code>string URL = 3[json_name = "url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setURLBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setURLBytes(value);
      return this;
    }

    /**
     * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getImageURL() {
      return instance.getImageURL();
    }
    /**
     * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getImageURLBytes() {
      return instance.getImageURLBytes();
    }
    /**
     * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setImageURL(
        java.lang.String value) {
      copyOnWrite();
      instance.setImageURL(value);
      return this;
    }
    /**
     * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearImageURL() {
      copyOnWrite();
      instance.clearImageURL();
      return this;
    }
    /**
     * <code>string ImageURL = 4[json_name = "image_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setImageURLBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setImageURLBytes(value);
      return this;
    }

    /**
     * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getOpenCorporatesURL() {
      return instance.getOpenCorporatesURL();
    }
    /**
     * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getOpenCorporatesURLBytes() {
      return instance.getOpenCorporatesURLBytes();
    }
    /**
     * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setOpenCorporatesURL(
        java.lang.String value) {
      copyOnWrite();
      instance.setOpenCorporatesURL(value);
      return this;
    }
    /**
     * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearOpenCorporatesURL() {
      copyOnWrite();
      instance.clearOpenCorporatesURL();
      return this;
    }
    /**
     * <code>string OpenCorporatesURL = 5[json_name = "open_corporates_url", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setOpenCorporatesURLBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setOpenCorporatesURLBytes(value);
      return this;
    }

    /**
     * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasCorporateLocation() {
      return instance.hasCorporateLocation();
    }
    /**
     * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.types.Location getCorporateLocation() {
      return instance.getCorporateLocation();
    }
    /**
     * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCorporateLocation(to.bnk.api.types.Location value) {
      copyOnWrite();
      instance.setCorporateLocation(value);
      return this;
      }
    /**
     * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setCorporateLocation(
        to.bnk.api.types.Location.Builder builderForValue) {
      copyOnWrite();
      instance.setCorporateLocation(builderForValue);
      return this;
    }
    /**
     * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergeCorporateLocation(to.bnk.api.types.Location value) {
      copyOnWrite();
      instance.mergeCorporateLocation(value);
      return this;
    }
    /**
     * <code>.types.Location CorporateLocation = 6[json_name = "corporate_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearCorporateLocation() {  copyOnWrite();
      instance.clearCorporateLocation();
      return this;
    }

    /**
     * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public boolean hasPhysicalLocation() {
      return instance.hasPhysicalLocation();
    }
    /**
     * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public to.bnk.api.types.Location getPhysicalLocation() {
      return instance.getPhysicalLocation();
    }
    /**
     * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setPhysicalLocation(to.bnk.api.types.Location value) {
      copyOnWrite();
      instance.setPhysicalLocation(value);
      return this;
      }
    /**
     * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setPhysicalLocation(
        to.bnk.api.types.Location.Builder builderForValue) {
      copyOnWrite();
      instance.setPhysicalLocation(builderForValue);
      return this;
    }
    /**
     * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder mergePhysicalLocation(to.bnk.api.types.Location value) {
      copyOnWrite();
      instance.mergePhysicalLocation(value);
      return this;
    }
    /**
     * <code>.types.Location PhysicalLocation = 7[json_name = "physical_location", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearPhysicalLocation() {  copyOnWrite();
      instance.clearPhysicalLocation();
      return this;
    }

    /**
     * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public java.lang.String getPrivateAlias() {
      return instance.getPrivateAlias();
    }
    /**
     * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPrivateAliasBytes() {
      return instance.getPrivateAliasBytes();
    }
    /**
     * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setPrivateAlias(
        java.lang.String value) {
      copyOnWrite();
      instance.setPrivateAlias(value);
      return this;
    }
    /**
     * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder clearPrivateAlias() {
      copyOnWrite();
      instance.clearPrivateAlias();
      return this;
    }
    /**
     * <code>string PrivateAlias = 8[json_name = "private_alias", ctype = STRING, deprecated = false, lazy = false, jstype = JS_NORMAL, weak = false];</code>
     */
    public Builder setPrivateAliasBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setPrivateAliasBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:counterparty.Metadata)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new to.bnk.api.counterparty.Metadata();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "publicAlias_",
            "moreInfo_",
            "uRL_",
            "imageURL_",
            "openCorporatesURL_",
            "corporateLocation_",
            "physicalLocation_",
            "privateAlias_",
          };
          java.lang.String info =
              "\u0000\b\u0000\u0000\u0001\b\b\u0000\u0000\u0000\u0001\u0208\u0002\u0208\u0003\u0208" +
              "\u0004\u0208\u0005\u0208\u0006\t\u0007\t\b\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<to.bnk.api.counterparty.Metadata> parser = PARSER;
        if (parser == null) {
          synchronized (to.bnk.api.counterparty.Metadata.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<to.bnk.api.counterparty.Metadata>(
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


  // @@protoc_insertion_point(class_scope:counterparty.Metadata)
  private static final to.bnk.api.counterparty.Metadata DEFAULT_INSTANCE;
  static {
    Metadata defaultInstance = new Metadata();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      Metadata.class, defaultInstance);
  }

  public static to.bnk.api.counterparty.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Metadata> PARSER;

  public static com.google.protobuf.Parser<Metadata> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

