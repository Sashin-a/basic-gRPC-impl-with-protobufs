// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: users.proto

package com.epam.stubs.user;

public final class Users {
  private Users() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_epam_stubs_user_UserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_epam_stubs_user_UserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_epam_stubs_user_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_epam_stubs_user_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013users.proto\022\023com.epam.stubs.user\032\037goog" +
      "le/protobuf/timestamp.proto\"j\n\013UserReque" +
      "st\022\020\n\010username\030\001 \001(\t\022\r\n\005fName\030\002 \001(\t\022\r\n\005l" +
      "Name\030\003 \001(\t\022+\n\006gender\030\004 \001(\0162\033.com.epam.st" +
      "ubs.user.Gender\"\244\001\n\014UserResponse\022\016\n\006user" +
      "Id\030\001 \001(\005\022\r\n\005fName\030\002 \001(\t\022\r\n\005lName\030\003 \001(\t\022\020" +
      "\n\010username\030\004 \001(\t\022\'\n\003doj\030\005 \001(\0132\032.google.p" +
      "rotobuf.Timestamp\022+\n\006gender\030\006 \001(\0162\033.com." +
      "epam.stubs.user.Gender*)\n\006Gender\022\010\n\004MALE" +
      "\020\000\022\n\n\006FEMALE\020\001\022\t\n\005OTHER\020\0032\274\001\n\013UserServic" +
      "e\022U\n\016getUserDetails\022 .com.epam.stubs.use" +
      "r.UserRequest\032!.com.epam.stubs.user.User" +
      "Response\022V\n\017saveUserDetails\022 .com.epam.s" +
      "tubs.user.UserRequest\032!.com.epam.stubs.u" +
      "ser.UserResponseB\027\n\023com.epam.stubs.userP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_epam_stubs_user_UserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_epam_stubs_user_UserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_epam_stubs_user_UserRequest_descriptor,
        new java.lang.String[] { "Username", "FName", "LName", "Gender", });
    internal_static_com_epam_stubs_user_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_epam_stubs_user_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_epam_stubs_user_UserResponse_descriptor,
        new java.lang.String[] { "UserId", "FName", "LName", "Username", "Doj", "Gender", });
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
