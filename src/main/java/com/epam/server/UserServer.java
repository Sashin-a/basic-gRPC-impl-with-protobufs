package com.epam.server;

import com.epam.dto.User;
import com.epam.service.UserServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class UserServer {

    private Server server;

    public void startServer() throws IOException {
        Integer port =51234;
        server = ServerBuilder.forPort(port).addService(new UserServiceImpl()).build().start();
    }

    public void stopServer() throws InterruptedException {
        if(server!=null)
        {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUnitlShutdown() throws InterruptedException {
        if(server!=null)
        {
            server.awaitTermination();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        UserServer uServer = new UserServer();
        uServer.startServer();
        uServer.blockUnitlShutdown();
    }
}
