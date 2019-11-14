package to.bnk.api.accountapplications;

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
public final class AccountApplicationServiceGrpc {

  private AccountApplicationServiceGrpc() {}

  public static final String SERVICE_NAME = "accountapplications.AccountApplicationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accountapplications.CreateAccountApplicationRequest,
      to.bnk.api.accountapplications.CreateAccountApplicationResponse> getCreateAccountApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccountApplication",
      requestType = to.bnk.api.accountapplications.CreateAccountApplicationRequest.class,
      responseType = to.bnk.api.accountapplications.CreateAccountApplicationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accountapplications.CreateAccountApplicationRequest,
      to.bnk.api.accountapplications.CreateAccountApplicationResponse> getCreateAccountApplicationMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accountapplications.CreateAccountApplicationRequest, to.bnk.api.accountapplications.CreateAccountApplicationResponse> getCreateAccountApplicationMethod;
    if ((getCreateAccountApplicationMethod = AccountApplicationServiceGrpc.getCreateAccountApplicationMethod) == null) {
      synchronized (AccountApplicationServiceGrpc.class) {
        if ((getCreateAccountApplicationMethod = AccountApplicationServiceGrpc.getCreateAccountApplicationMethod) == null) {
          AccountApplicationServiceGrpc.getCreateAccountApplicationMethod = getCreateAccountApplicationMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.accountapplications.CreateAccountApplicationRequest, to.bnk.api.accountapplications.CreateAccountApplicationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccountApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.CreateAccountApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.CreateAccountApplicationResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateAccountApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accountapplications.GetAccountApplicationRequest,
      to.bnk.api.accountapplications.AccountApplication> getGetAccountApplicationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountApplication",
      requestType = to.bnk.api.accountapplications.GetAccountApplicationRequest.class,
      responseType = to.bnk.api.accountapplications.AccountApplication.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accountapplications.GetAccountApplicationRequest,
      to.bnk.api.accountapplications.AccountApplication> getGetAccountApplicationMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accountapplications.GetAccountApplicationRequest, to.bnk.api.accountapplications.AccountApplication> getGetAccountApplicationMethod;
    if ((getGetAccountApplicationMethod = AccountApplicationServiceGrpc.getGetAccountApplicationMethod) == null) {
      synchronized (AccountApplicationServiceGrpc.class) {
        if ((getGetAccountApplicationMethod = AccountApplicationServiceGrpc.getGetAccountApplicationMethod) == null) {
          AccountApplicationServiceGrpc.getGetAccountApplicationMethod = getGetAccountApplicationMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.accountapplications.GetAccountApplicationRequest, to.bnk.api.accountapplications.AccountApplication>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountApplication"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.GetAccountApplicationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.AccountApplication.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAccountApplicationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accountapplications.GetAccountApplicationsRequest,
      to.bnk.api.accountapplications.GetAccountApplicationsResponse> getGetAccountApplicationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountApplications",
      requestType = to.bnk.api.accountapplications.GetAccountApplicationsRequest.class,
      responseType = to.bnk.api.accountapplications.GetAccountApplicationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accountapplications.GetAccountApplicationsRequest,
      to.bnk.api.accountapplications.GetAccountApplicationsResponse> getGetAccountApplicationsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accountapplications.GetAccountApplicationsRequest, to.bnk.api.accountapplications.GetAccountApplicationsResponse> getGetAccountApplicationsMethod;
    if ((getGetAccountApplicationsMethod = AccountApplicationServiceGrpc.getGetAccountApplicationsMethod) == null) {
      synchronized (AccountApplicationServiceGrpc.class) {
        if ((getGetAccountApplicationsMethod = AccountApplicationServiceGrpc.getGetAccountApplicationsMethod) == null) {
          AccountApplicationServiceGrpc.getGetAccountApplicationsMethod = getGetAccountApplicationsMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.accountapplications.GetAccountApplicationsRequest, to.bnk.api.accountapplications.GetAccountApplicationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountApplications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.GetAccountApplicationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.GetAccountApplicationsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetAccountApplicationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest,
      com.google.protobuf.Empty> getUpdateAccountApplicationStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAccountApplicationStatus",
      requestType = to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest,
      com.google.protobuf.Empty> getUpdateAccountApplicationStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest, com.google.protobuf.Empty> getUpdateAccountApplicationStatusMethod;
    if ((getUpdateAccountApplicationStatusMethod = AccountApplicationServiceGrpc.getUpdateAccountApplicationStatusMethod) == null) {
      synchronized (AccountApplicationServiceGrpc.class) {
        if ((getUpdateAccountApplicationStatusMethod = AccountApplicationServiceGrpc.getUpdateAccountApplicationStatusMethod) == null) {
          AccountApplicationServiceGrpc.getUpdateAccountApplicationStatusMethod = getUpdateAccountApplicationStatusMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAccountApplicationStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateAccountApplicationStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountApplicationServiceStub newStub(io.grpc.Channel channel) {
    return new AccountApplicationServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountApplicationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountApplicationServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountApplicationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountApplicationServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountApplicationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createAccountApplication(to.bnk.api.accountapplications.CreateAccountApplicationRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.CreateAccountApplicationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateAccountApplicationMethod(), responseObserver);
    }

    /**
     */
    public void getAccountApplication(to.bnk.api.accountapplications.GetAccountApplicationRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.AccountApplication> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountApplicationMethod(), responseObserver);
    }

    /**
     */
    public void getAccountApplications(to.bnk.api.accountapplications.GetAccountApplicationsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.GetAccountApplicationsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountApplicationsMethod(), responseObserver);
    }

    /**
     */
    public void updateAccountApplicationStatus(to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateAccountApplicationStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateAccountApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accountapplications.CreateAccountApplicationRequest,
                to.bnk.api.accountapplications.CreateAccountApplicationResponse>(
                  this, METHODID_CREATE_ACCOUNT_APPLICATION)))
          .addMethod(
            getGetAccountApplicationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accountapplications.GetAccountApplicationRequest,
                to.bnk.api.accountapplications.AccountApplication>(
                  this, METHODID_GET_ACCOUNT_APPLICATION)))
          .addMethod(
            getGetAccountApplicationsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accountapplications.GetAccountApplicationsRequest,
                to.bnk.api.accountapplications.GetAccountApplicationsResponse>(
                  this, METHODID_GET_ACCOUNT_APPLICATIONS)))
          .addMethod(
            getUpdateAccountApplicationStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_ACCOUNT_APPLICATION_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class AccountApplicationServiceStub extends io.grpc.stub.AbstractStub<AccountApplicationServiceStub> {
    private AccountApplicationServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountApplicationServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountApplicationServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountApplicationServiceStub(channel, callOptions);
    }

    /**
     */
    public void createAccountApplication(to.bnk.api.accountapplications.CreateAccountApplicationRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.CreateAccountApplicationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateAccountApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountApplication(to.bnk.api.accountapplications.GetAccountApplicationRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.AccountApplication> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountApplicationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountApplications(to.bnk.api.accountapplications.GetAccountApplicationsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.GetAccountApplicationsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountApplicationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAccountApplicationStatus(to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateAccountApplicationStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountApplicationServiceBlockingStub extends io.grpc.stub.AbstractStub<AccountApplicationServiceBlockingStub> {
    private AccountApplicationServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountApplicationServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountApplicationServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountApplicationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.accountapplications.CreateAccountApplicationResponse createAccountApplication(to.bnk.api.accountapplications.CreateAccountApplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateAccountApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.accountapplications.AccountApplication getAccountApplication(to.bnk.api.accountapplications.GetAccountApplicationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountApplicationMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.accountapplications.GetAccountApplicationsResponse getAccountApplications(to.bnk.api.accountapplications.GetAccountApplicationsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountApplicationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateAccountApplicationStatus(to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateAccountApplicationStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountApplicationServiceFutureStub extends io.grpc.stub.AbstractStub<AccountApplicationServiceFutureStub> {
    private AccountApplicationServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountApplicationServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountApplicationServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountApplicationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accountapplications.CreateAccountApplicationResponse> createAccountApplication(
        to.bnk.api.accountapplications.CreateAccountApplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateAccountApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accountapplications.AccountApplication> getAccountApplication(
        to.bnk.api.accountapplications.GetAccountApplicationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountApplicationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.accountapplications.GetAccountApplicationsResponse> getAccountApplications(
        to.bnk.api.accountapplications.GetAccountApplicationsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountApplicationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateAccountApplicationStatus(
        to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateAccountApplicationStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ACCOUNT_APPLICATION = 0;
  private static final int METHODID_GET_ACCOUNT_APPLICATION = 1;
  private static final int METHODID_GET_ACCOUNT_APPLICATIONS = 2;
  private static final int METHODID_UPDATE_ACCOUNT_APPLICATION_STATUS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountApplicationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountApplicationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ACCOUNT_APPLICATION:
          serviceImpl.createAccountApplication((to.bnk.api.accountapplications.CreateAccountApplicationRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.CreateAccountApplicationResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_APPLICATION:
          serviceImpl.getAccountApplication((to.bnk.api.accountapplications.GetAccountApplicationRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.AccountApplication>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_APPLICATIONS:
          serviceImpl.getAccountApplications((to.bnk.api.accountapplications.GetAccountApplicationsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.accountapplications.GetAccountApplicationsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_ACCOUNT_APPLICATION_STATUS:
          serviceImpl.updateAccountApplicationStatus((to.bnk.api.accountapplications.UpdateAccountApplicationStatusRequest) request,
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
      synchronized (AccountApplicationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateAccountApplicationMethod())
              .addMethod(getGetAccountApplicationMethod())
              .addMethod(getGetAccountApplicationsMethod())
              .addMethod(getUpdateAccountApplicationStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
