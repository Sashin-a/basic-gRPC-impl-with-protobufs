package com.epam.service;

import com.epam.dto.User;
import com.epam.stubs.user.Gender;
import com.epam.stubs.user.UserRequest;
import com.epam.stubs.user.UserResponse;
import com.epam.stubs.user.UserServiceGrpc;
import io.grpc.stub.StreamObserver;


public class UserServiceImpl extends UserServiceGrpc.UserServiceImplBase {

    @Override
    public void getUserDetails(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        User user = new User();
        user.setfName("Sashin");
        user.setlName("Agrawal");
        user.setGender("MALE");
        user.setUserId(570122);
        user.setDoj("2022-07-31");

        UserResponse userResponse = UserResponse.newBuilder()
                                    .setFName(user.getfName())
                .setLName(user.getlName())
                .setGender(Gender.valueOf(user.getGender()))
                .setUserId(user.getUserId())
                .setUsername("sashin_agrawal")
                .build();

//        return userResponse;
        responseObserver.onNext(userResponse);
        responseObserver.onCompleted();

    }

    @Override
    public void saveUserDetails(UserRequest request, StreamObserver<UserResponse> responseObserver) {
        User user = new User();

        user.setUsername(request.getUsername());
        user.setfName(request.getFName());
        user.setlName(request.getLName());
        user.setGender(request.getGender().toString());


        UserResponse response = UserResponse.newBuilder().setUsername(user.getUsername())
                .setGender(Gender.valueOf(user.getGender()))
                .setLName(request.getLName())
                .setFName(request.getFName())
                .setUserId(12345)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
