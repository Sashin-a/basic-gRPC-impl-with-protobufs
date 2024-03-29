// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package com.epam.stubs.user;

/**
 * Protobuf type {@code com.epam.stubs.user.UserResponse}
 */
public final class UserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.epam.stubs.user.UserResponse)
    UserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserResponse.newBuilder() to construct.
  private UserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserResponse() {
    fName_ = "";
    lName_ = "";
    username_ = "";
    gender_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UserResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            userId_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            fName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            lName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            username_ = s;
            break;
          }
          case 42: {
            com.google.protobuf.Timestamp.Builder subBuilder = null;
            if (doj_ != null) {
              subBuilder = doj_.toBuilder();
            }
            doj_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(doj_);
              doj_ = subBuilder.buildPartial();
            }

            break;
          }
          case 48: {
            int rawValue = input.readEnum();

            gender_ = rawValue;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.epam.stubs.user.Users.internal_static_com_epam_stubs_user_UserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.epam.stubs.user.Users.internal_static_com_epam_stubs_user_UserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.epam.stubs.user.UserResponse.class, com.epam.stubs.user.UserResponse.Builder.class);
  }

  public static final int USERID_FIELD_NUMBER = 1;
  private int userId_;
  /**
   * <code>int32 userId = 1;</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int FNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object fName_;
  /**
   * <code>string fName = 2;</code>
   * @return The fName.
   */
  @java.lang.Override
  public java.lang.String getFName() {
    java.lang.Object ref = fName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fName_ = s;
      return s;
    }
  }
  /**
   * <code>string fName = 2;</code>
   * @return The bytes for fName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFNameBytes() {
    java.lang.Object ref = fName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object lName_;
  /**
   * <code>string lName = 3;</code>
   * @return The lName.
   */
  @java.lang.Override
  public java.lang.String getLName() {
    java.lang.Object ref = lName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lName_ = s;
      return s;
    }
  }
  /**
   * <code>string lName = 3;</code>
   * @return The bytes for lName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLNameBytes() {
    java.lang.Object ref = lName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USERNAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object username_;
  /**
   * <code>string username = 4;</code>
   * @return The username.
   */
  @java.lang.Override
  public java.lang.String getUsername() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      username_ = s;
      return s;
    }
  }
  /**
   * <code>string username = 4;</code>
   * @return The bytes for username.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUsernameBytes() {
    java.lang.Object ref = username_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      username_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DOJ_FIELD_NUMBER = 5;
  private com.google.protobuf.Timestamp doj_;
  /**
   * <code>.google.protobuf.Timestamp doj = 5;</code>
   * @return Whether the doj field is set.
   */
  @java.lang.Override
  public boolean hasDoj() {
    return doj_ != null;
  }
  /**
   * <code>.google.protobuf.Timestamp doj = 5;</code>
   * @return The doj.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getDoj() {
    return doj_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : doj_;
  }
  /**
   * <code>.google.protobuf.Timestamp doj = 5;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getDojOrBuilder() {
    return getDoj();
  }

  public static final int GENDER_FIELD_NUMBER = 6;
  private int gender_;
  /**
   * <code>.com.epam.stubs.user.Gender gender = 6;</code>
   * @return The enum numeric value on the wire for gender.
   */
  @java.lang.Override public int getGenderValue() {
    return gender_;
  }
  /**
   * <code>.com.epam.stubs.user.Gender gender = 6;</code>
   * @return The gender.
   */
  @java.lang.Override public com.epam.stubs.user.Gender getGender() {
    @SuppressWarnings("deprecation")
    com.epam.stubs.user.Gender result = com.epam.stubs.user.Gender.valueOf(gender_);
    return result == null ? com.epam.stubs.user.Gender.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (!getFNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, fName_);
    }
    if (!getLNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, lName_);
    }
    if (!getUsernameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, username_);
    }
    if (doj_ != null) {
      output.writeMessage(5, getDoj());
    }
    if (gender_ != com.epam.stubs.user.Gender.MALE.getNumber()) {
      output.writeEnum(6, gender_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userId_);
    }
    if (!getFNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, fName_);
    }
    if (!getLNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, lName_);
    }
    if (!getUsernameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, username_);
    }
    if (doj_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, getDoj());
    }
    if (gender_ != com.epam.stubs.user.Gender.MALE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, gender_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.epam.stubs.user.UserResponse)) {
      return super.equals(obj);
    }
    com.epam.stubs.user.UserResponse other = (com.epam.stubs.user.UserResponse) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (!getFName()
        .equals(other.getFName())) return false;
    if (!getLName()
        .equals(other.getLName())) return false;
    if (!getUsername()
        .equals(other.getUsername())) return false;
    if (hasDoj() != other.hasDoj()) return false;
    if (hasDoj()) {
      if (!getDoj()
          .equals(other.getDoj())) return false;
    }
    if (gender_ != other.gender_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + FNAME_FIELD_NUMBER;
    hash = (53 * hash) + getFName().hashCode();
    hash = (37 * hash) + LNAME_FIELD_NUMBER;
    hash = (53 * hash) + getLName().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUsername().hashCode();
    if (hasDoj()) {
      hash = (37 * hash) + DOJ_FIELD_NUMBER;
      hash = (53 * hash) + getDoj().hashCode();
    }
    hash = (37 * hash) + GENDER_FIELD_NUMBER;
    hash = (53 * hash) + gender_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.epam.stubs.user.UserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.epam.stubs.user.UserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.epam.stubs.user.UserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.epam.stubs.user.UserResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.epam.stubs.user.UserResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.epam.stubs.user.UserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.epam.stubs.user.UserResponse)
      com.epam.stubs.user.UserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.epam.stubs.user.Users.internal_static_com_epam_stubs_user_UserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.epam.stubs.user.Users.internal_static_com_epam_stubs_user_UserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.epam.stubs.user.UserResponse.class, com.epam.stubs.user.UserResponse.Builder.class);
    }

    // Construct using com.epam.stubs.user.UserResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userId_ = 0;

      fName_ = "";

      lName_ = "";

      username_ = "";

      if (dojBuilder_ == null) {
        doj_ = null;
      } else {
        doj_ = null;
        dojBuilder_ = null;
      }
      gender_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.epam.stubs.user.Users.internal_static_com_epam_stubs_user_UserResponse_descriptor;
    }

    @java.lang.Override
    public com.epam.stubs.user.UserResponse getDefaultInstanceForType() {
      return com.epam.stubs.user.UserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.epam.stubs.user.UserResponse build() {
      com.epam.stubs.user.UserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.epam.stubs.user.UserResponse buildPartial() {
      com.epam.stubs.user.UserResponse result = new com.epam.stubs.user.UserResponse(this);
      result.userId_ = userId_;
      result.fName_ = fName_;
      result.lName_ = lName_;
      result.username_ = username_;
      if (dojBuilder_ == null) {
        result.doj_ = doj_;
      } else {
        result.doj_ = dojBuilder_.build();
      }
      result.gender_ = gender_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.epam.stubs.user.UserResponse) {
        return mergeFrom((com.epam.stubs.user.UserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.epam.stubs.user.UserResponse other) {
      if (other == com.epam.stubs.user.UserResponse.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (!other.getFName().isEmpty()) {
        fName_ = other.fName_;
        onChanged();
      }
      if (!other.getLName().isEmpty()) {
        lName_ = other.lName_;
        onChanged();
      }
      if (!other.getUsername().isEmpty()) {
        username_ = other.username_;
        onChanged();
      }
      if (other.hasDoj()) {
        mergeDoj(other.getDoj());
      }
      if (other.gender_ != 0) {
        setGenderValue(other.getGenderValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.epam.stubs.user.UserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.epam.stubs.user.UserResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int userId_ ;
    /**
     * <code>int32 userId = 1;</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 userId = 1;</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {
      
      userId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 userId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      
      userId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fName_ = "";
    /**
     * <code>string fName = 2;</code>
     * @return The fName.
     */
    public java.lang.String getFName() {
      java.lang.Object ref = fName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fName = 2;</code>
     * @return The bytes for fName.
     */
    public com.google.protobuf.ByteString
        getFNameBytes() {
      java.lang.Object ref = fName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fName = 2;</code>
     * @param value The fName to set.
     * @return This builder for chaining.
     */
    public Builder setFName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFName() {
      
      fName_ = getDefaultInstance().getFName();
      onChanged();
      return this;
    }
    /**
     * <code>string fName = 2;</code>
     * @param value The bytes for fName to set.
     * @return This builder for chaining.
     */
    public Builder setFNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lName_ = "";
    /**
     * <code>string lName = 3;</code>
     * @return The lName.
     */
    public java.lang.String getLName() {
      java.lang.Object ref = lName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string lName = 3;</code>
     * @return The bytes for lName.
     */
    public com.google.protobuf.ByteString
        getLNameBytes() {
      java.lang.Object ref = lName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string lName = 3;</code>
     * @param value The lName to set.
     * @return This builder for chaining.
     */
    public Builder setLName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string lName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLName() {
      
      lName_ = getDefaultInstance().getLName();
      onChanged();
      return this;
    }
    /**
     * <code>string lName = 3;</code>
     * @param value The bytes for lName to set.
     * @return This builder for chaining.
     */
    public Builder setLNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object username_ = "";
    /**
     * <code>string username = 4;</code>
     * @return The username.
     */
    public java.lang.String getUsername() {
      java.lang.Object ref = username_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        username_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string username = 4;</code>
     * @return The bytes for username.
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      java.lang.Object ref = username_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        username_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string username = 4;</code>
     * @param value The username to set.
     * @return This builder for chaining.
     */
    public Builder setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string username = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
      onChanged();
      return this;
    }
    /**
     * <code>string username = 4;</code>
     * @param value The bytes for username to set.
     * @return This builder for chaining.
     */
    public Builder setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp doj_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> dojBuilder_;
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     * @return Whether the doj field is set.
     */
    public boolean hasDoj() {
      return dojBuilder_ != null || doj_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     * @return The doj.
     */
    public com.google.protobuf.Timestamp getDoj() {
      if (dojBuilder_ == null) {
        return doj_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : doj_;
      } else {
        return dojBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    public Builder setDoj(com.google.protobuf.Timestamp value) {
      if (dojBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        doj_ = value;
        onChanged();
      } else {
        dojBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    public Builder setDoj(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (dojBuilder_ == null) {
        doj_ = builderForValue.build();
        onChanged();
      } else {
        dojBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    public Builder mergeDoj(com.google.protobuf.Timestamp value) {
      if (dojBuilder_ == null) {
        if (doj_ != null) {
          doj_ =
            com.google.protobuf.Timestamp.newBuilder(doj_).mergeFrom(value).buildPartial();
        } else {
          doj_ = value;
        }
        onChanged();
      } else {
        dojBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    public Builder clearDoj() {
      if (dojBuilder_ == null) {
        doj_ = null;
        onChanged();
      } else {
        doj_ = null;
        dojBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    public com.google.protobuf.Timestamp.Builder getDojBuilder() {
      
      onChanged();
      return getDojFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getDojOrBuilder() {
      if (dojBuilder_ != null) {
        return dojBuilder_.getMessageOrBuilder();
      } else {
        return doj_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : doj_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp doj = 5;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getDojFieldBuilder() {
      if (dojBuilder_ == null) {
        dojBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getDoj(),
                getParentForChildren(),
                isClean());
        doj_ = null;
      }
      return dojBuilder_;
    }

    private int gender_ = 0;
    /**
     * <code>.com.epam.stubs.user.Gender gender = 6;</code>
     * @return The enum numeric value on the wire for gender.
     */
    @java.lang.Override public int getGenderValue() {
      return gender_;
    }
    /**
     * <code>.com.epam.stubs.user.Gender gender = 6;</code>
     * @param value The enum numeric value on the wire for gender to set.
     * @return This builder for chaining.
     */
    public Builder setGenderValue(int value) {
      
      gender_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.epam.stubs.user.Gender gender = 6;</code>
     * @return The gender.
     */
    @java.lang.Override
    public com.epam.stubs.user.Gender getGender() {
      @SuppressWarnings("deprecation")
      com.epam.stubs.user.Gender result = com.epam.stubs.user.Gender.valueOf(gender_);
      return result == null ? com.epam.stubs.user.Gender.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.epam.stubs.user.Gender gender = 6;</code>
     * @param value The gender to set.
     * @return This builder for chaining.
     */
    public Builder setGender(com.epam.stubs.user.Gender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      gender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.epam.stubs.user.Gender gender = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGender() {
      
      gender_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.epam.stubs.user.UserResponse)
  }

  // @@protoc_insertion_point(class_scope:com.epam.stubs.user.UserResponse)
  private static final com.epam.stubs.user.UserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.epam.stubs.user.UserResponse();
  }

  public static com.epam.stubs.user.UserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserResponse>() {
    @java.lang.Override
    public UserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.epam.stubs.user.UserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

