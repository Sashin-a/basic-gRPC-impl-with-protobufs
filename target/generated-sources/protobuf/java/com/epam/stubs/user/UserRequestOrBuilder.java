// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package com.epam.stubs.user;

public interface UserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.epam.stubs.user.UserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string username = 1;</code>
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   * <code>string username = 1;</code>
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString
      getUsernameBytes();

  /**
   * <code>string fName = 2;</code>
   * @return The fName.
   */
  java.lang.String getFName();
  /**
   * <code>string fName = 2;</code>
   * @return The bytes for fName.
   */
  com.google.protobuf.ByteString
      getFNameBytes();

  /**
   * <code>string lName = 3;</code>
   * @return The lName.
   */
  java.lang.String getLName();
  /**
   * <code>string lName = 3;</code>
   * @return The bytes for lName.
   */
  com.google.protobuf.ByteString
      getLNameBytes();

  /**
   * <code>.com.epam.stubs.user.Gender gender = 4;</code>
   * @return The enum numeric value on the wire for gender.
   */
  int getGenderValue();
  /**
   * <code>.com.epam.stubs.user.Gender gender = 4;</code>
   * @return The gender.
   */
  com.epam.stubs.user.Gender getGender();
}
