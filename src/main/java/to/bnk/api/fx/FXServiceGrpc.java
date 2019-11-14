package to.bnk.api.fx;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.23.0)",
    comments = "Source: all.proto")
public final class FXServiceGrpc {

  private FXServiceGrpc() {}

  public static final String SERVICE_NAME = "fx.FXService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.fx.GetCurrentFXRateRequest,
      to.bnk.api.fx.FX> getGetCurrentFXRateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCurrentFXRate",
      requestType = to.bnk.api.fx.GetCurrentFXRateRequest.class,
      responseType = to.bnk.api.fx.FX.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.fx.GetCurrentFXRateRequest,
      to.bnk.api.fx.FX> getGetCurrentFXRateMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.fx.GetCurrentFXRateRequest, to.bnk.api.fx.FX> getGetCurrentFXRateMethod;
    if ((getGetCurrentFXRateMethod = FXServiceGrpc.getGetCurrentFXRateMethod) == null) {
      synchronized (FXServiceGrpc.class) {
        if ((getGetCurrentFXRateMethod = FXServiceGrpc.getGetCurrentFXRateMethod) == null) {
          FXServiceGrpc.getGetCurrentFXRateMethod = getGetCurrentFXRateMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.fx.GetCurrentFXRateRequest, to.bnk.api.fx.FX>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCurrentFXRate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.fx.GetCurrentFXRateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.fx.FX.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCurrentFXRateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.fx.CreateFXRequest,
      to.bnk.api.fx.FX> getCreateFXMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFX",
      requestType = to.bnk.api.fx.CreateFXRequest.class,
      responseType = to.bnk.api.fx.FX.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.fx.CreateFXRequest,
      to.bnk.api.fx.FX> getCreateFXMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.fx.CreateFXRequest, to.bnk.api.fx.FX> getCreateFXMethod;
    if ((getCreateFXMethod = FXServiceGrpc.getCreateFXMethod) == null) {
      synchronized (FXServiceGrpc.class) {
        if ((getCreateFXMethod = FXServiceGrpc.getCreateFXMethod) == null) {
          FXServiceGrpc.getCreateFXMethod = getCreateFXMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.fx.CreateFXRequest, to.bnk.api.fx.FX>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFX"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.fx.CreateFXRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.fx.FX.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateFXMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.fx.UpdateFXRequest,
      com.google.protobuf.Empty> getUpdateFXMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFX",
      requestType = to.bnk.api.fx.UpdateFXRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.fx.UpdateFXRequest,
      com.google.protobuf.Empty> getUpdateFXMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.fx.UpdateFXRequest, com.google.protobuf.Empty> getUpdateFXMethod;
    if ((getUpdateFXMethod = FXServiceGrpc.getUpdateFXMethod) == null) {
      synchronized (FXServiceGrpc.class) {
        if ((getUpdateFXMethod = FXServiceGrpc.getUpdateFXMethod) == null) {
          FXServiceGrpc.getUpdateFXMethod = getUpdateFXMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.fx.UpdateFXRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFX"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.fx.UpdateFXRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateFXMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FXServiceStub newStub(io.grpc.Channel channel) {
    return new FXServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FXServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new FXServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FXServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new FXServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class FXServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCurrentFXRate(to.bnk.api.fx.GetCurrentFXRateRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.fx.FX> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCurrentFXRateMethod(), responseObserver);
    }

    /**
     */
    public void createFX(to.bnk.api.fx.CreateFXRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.fx.FX> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateFXMethod(), responseObserver);
    }

    /**
     */
    public void updateFX(to.bnk.api.fx.UpdateFXRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateFXMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCurrentFXRateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.fx.GetCurrentFXRateRequest,
                to.bnk.api.fx.FX>(
                  this, METHODID_GET_CURRENT_FXRATE)))
          .addMethod(
            getCreateFXMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.fx.CreateFXRequest,
                to.bnk.api.fx.FX>(
                  this, METHODID_CREATE_FX)))
          .addMethod(
            getUpdateFXMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.fx.UpdateFXRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_FX)))
          .build();
    }
  }

  /**
   */
  public static final class FXServiceStub extends io.grpc.stub.AbstractStub<FXServiceStub> {
    private FXServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FXServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FXServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FXServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCurrentFXRate(to.bnk.api.fx.GetCurrentFXRateRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.fx.FX> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCurrentFXRateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFX(to.bnk.api.fx.CreateFXRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.fx.FX> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateFXMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFX(to.bnk.api.fx.UpdateFXRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateFXMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FXServiceBlockingStub extends io.grpc.stub.AbstractStub<FXServiceBlockingStub> {
    private FXServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FXServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FXServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FXServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.fx.FX getCurrentFXRate(to.bnk.api.fx.GetCurrentFXRateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCurrentFXRateMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.fx.FX createFX(to.bnk.api.fx.CreateFXRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateFXMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateFX(to.bnk.api.fx.UpdateFXRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateFXMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FXServiceFutureStub extends io.grpc.stub.AbstractStub<FXServiceFutureStub> {
    private FXServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private FXServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FXServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new FXServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.fx.FX> getCurrentFXRate(
        to.bnk.api.fx.GetCurrentFXRateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCurrentFXRateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.fx.FX> createFX(
        to.bnk.api.fx.CreateFXRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateFXMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateFX(
        to.bnk.api.fx.UpdateFXRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateFXMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CURRENT_FXRATE = 0;
  private static final int METHODID_CREATE_FX = 1;
  private static final int METHODID_UPDATE_FX = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FXServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FXServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CURRENT_FXRATE:
          serviceImpl.getCurrentFXRate((to.bnk.api.fx.GetCurrentFXRateRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.fx.FX>) responseObserver);
          break;
        case METHODID_CREATE_FX:
          serviceImpl.createFX((to.bnk.api.fx.CreateFXRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.fx.FX>) responseObserver);
          break;
        case METHODID_UPDATE_FX:
          serviceImpl.updateFX((to.bnk.api.fx.UpdateFXRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (FXServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetCurrentFXRateMethod())
              .addMethod(getCreateFXMethod())
              .addMethod(getUpdateFXMethod())
              .build();
        }
      }
    }
    return result;
  }
}
