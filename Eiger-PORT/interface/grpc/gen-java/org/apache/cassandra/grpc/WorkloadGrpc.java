package org.apache.cassandra.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: workload.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkloadGrpc {

  private WorkloadGrpc() {}

  public static final String SERVICE_NAME = "workloadgenerator.workload.Workload";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.apache.cassandra.grpc.ReadRequest,
      org.apache.cassandra.grpc.ReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Read",
      requestType = org.apache.cassandra.grpc.ReadRequest.class,
      responseType = org.apache.cassandra.grpc.ReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.cassandra.grpc.ReadRequest,
      org.apache.cassandra.grpc.ReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<org.apache.cassandra.grpc.ReadRequest, org.apache.cassandra.grpc.ReadResponse> getReadMethod;
    if ((getReadMethod = WorkloadGrpc.getReadMethod) == null) {
      synchronized (WorkloadGrpc.class) {
        if ((getReadMethod = WorkloadGrpc.getReadMethod) == null) {
          WorkloadGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<org.apache.cassandra.grpc.ReadRequest, org.apache.cassandra.grpc.ReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.cassandra.grpc.ReadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.cassandra.grpc.ReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkloadMethodDescriptorSupplier("Read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.apache.cassandra.grpc.WriteRequest,
      org.apache.cassandra.grpc.WriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = org.apache.cassandra.grpc.WriteRequest.class,
      responseType = org.apache.cassandra.grpc.WriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.apache.cassandra.grpc.WriteRequest,
      org.apache.cassandra.grpc.WriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<org.apache.cassandra.grpc.WriteRequest, org.apache.cassandra.grpc.WriteResponse> getWriteMethod;
    if ((getWriteMethod = WorkloadGrpc.getWriteMethod) == null) {
      synchronized (WorkloadGrpc.class) {
        if ((getWriteMethod = WorkloadGrpc.getWriteMethod) == null) {
          WorkloadGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<org.apache.cassandra.grpc.WriteRequest, org.apache.cassandra.grpc.WriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.cassandra.grpc.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.apache.cassandra.grpc.WriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkloadMethodDescriptorSupplier("Write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkloadStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkloadStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkloadStub>() {
        @java.lang.Override
        public WorkloadStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkloadStub(channel, callOptions);
        }
      };
    return WorkloadStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkloadBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkloadBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkloadBlockingStub>() {
        @java.lang.Override
        public WorkloadBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkloadBlockingStub(channel, callOptions);
        }
      };
    return WorkloadBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkloadFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkloadFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkloadFutureStub>() {
        @java.lang.Override
        public WorkloadFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkloadFutureStub(channel, callOptions);
        }
      };
    return WorkloadFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void read(org.apache.cassandra.grpc.ReadRequest request,
        io.grpc.stub.StreamObserver<org.apache.cassandra.grpc.ReadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    default void write(org.apache.cassandra.grpc.WriteRequest request,
        io.grpc.stub.StreamObserver<org.apache.cassandra.grpc.WriteResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Workload.
   */
  public static abstract class WorkloadImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkloadGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Workload.
   */
  public static final class WorkloadStub
      extends io.grpc.stub.AbstractAsyncStub<WorkloadStub> {
    private WorkloadStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkloadStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkloadStub(channel, callOptions);
    }

    /**
     */
    public void read(org.apache.cassandra.grpc.ReadRequest request,
        io.grpc.stub.StreamObserver<org.apache.cassandra.grpc.ReadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(org.apache.cassandra.grpc.WriteRequest request,
        io.grpc.stub.StreamObserver<org.apache.cassandra.grpc.WriteResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Workload.
   */
  public static final class WorkloadBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkloadBlockingStub> {
    private WorkloadBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkloadBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkloadBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.apache.cassandra.grpc.ReadResponse read(org.apache.cassandra.grpc.ReadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.apache.cassandra.grpc.WriteResponse write(org.apache.cassandra.grpc.WriteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Workload.
   */
  public static final class WorkloadFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkloadFutureStub> {
    private WorkloadFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkloadFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkloadFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.cassandra.grpc.ReadResponse> read(
        org.apache.cassandra.grpc.ReadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.apache.cassandra.grpc.WriteResponse> write(
        org.apache.cassandra.grpc.WriteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_WRITE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((org.apache.cassandra.grpc.ReadRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.cassandra.grpc.ReadResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((org.apache.cassandra.grpc.WriteRequest) request,
              (io.grpc.stub.StreamObserver<org.apache.cassandra.grpc.WriteResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReadMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.apache.cassandra.grpc.ReadRequest,
              org.apache.cassandra.grpc.ReadResponse>(
                service, METHODID_READ)))
        .addMethod(
          getWriteMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              org.apache.cassandra.grpc.WriteRequest,
              org.apache.cassandra.grpc.WriteResponse>(
                service, METHODID_WRITE)))
        .build();
  }

  private static abstract class WorkloadBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkloadBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.apache.cassandra.grpc.WorkloadProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Workload");
    }
  }

  private static final class WorkloadFileDescriptorSupplier
      extends WorkloadBaseDescriptorSupplier {
    WorkloadFileDescriptorSupplier() {}
  }

  private static final class WorkloadMethodDescriptorSupplier
      extends WorkloadBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkloadMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WorkloadGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkloadFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
