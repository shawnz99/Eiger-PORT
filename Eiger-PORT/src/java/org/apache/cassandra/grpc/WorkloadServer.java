package org.apache.cassandra.grpc;

import java.io.IOException;

import io.grpc.Grpc;
import io.grpc.Server;
import io.grpc.InsecureServerCredentials;
import io.grpc.stub.StreamObserver;
import io.grpc.BindableService;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.apache.cassandra.grpc.WorkloadGrpc.WorkloadImplBase;
import org.apache.cassandra.grpc.ReadRequest;
import org.apache.cassandra.grpc.ReadResponse;
import org.apache.cassandra.grpc.WriteRequest;
import org.apache.cassandra.grpc.WriteResponse;

public class WorkloadServer {
    public static final Logger LOG = Logger.getLogger(WorkloadServer.class.getName());
    private Server server;    

    public void start() throws IOException {
        final int port = 8080;
        server = Grpc.newServerBuilderForPort(port, InsecureServerCredentials.create())
            .addService(new WorkloadImpl())
            .build()
            .start();
        LOG.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                System.err.println("*** Shutting down gRPC server since JVM is shutting down");
                try {
                    WorkloadServer.this.stop();
                } catch (InterruptedException e) {
                    e.printStackTrace(System.err);
                }
                System.err.println("*** Server shut down");
            }
        });
    }

    public void stop() throws InterruptedException {
        final int timeout = 300;
        if (server != null) {
            server.shutdown().awaitTermination(timeout, TimeUnit.SECONDS);
        }
    }

    // public static void main(String[] args) throws Exception {
    //     WorkloadServer server = new WorkloadServer();
    //     server.start();
    //     // block until shutdown
    // }
    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    private static class WorkloadImpl extends WorkloadImplBase {
        @Override
        public void read(ReadRequest req, StreamObserver<ReadResponse> responseObserver) {
            System.out.println("Read Req: " + req);

            String value = "World";

            ReadResponse response = ReadResponse.newBuilder()
                    .setValue(value)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }

        @Override
        public void write(WriteRequest req, StreamObserver<WriteResponse> responseObserver) {
            System.out.println("Write req: " + req);

            WriteResponse response = WriteResponse.newBuilder()
                    .setSuccess(true)
                    .build();

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        }
    }
}
