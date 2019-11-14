package to.bnk.api.bank;

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
public final class BankServiceGrpc {

  private BankServiceGrpc() {}

  public static final String SERVICE_NAME = "bank.BankService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.bank.GetBankRequest,
      to.bnk.api.bank.Bank> getGetBankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBank",
      requestType = to.bnk.api.bank.GetBankRequest.class,
      responseType = to.bnk.api.bank.Bank.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.bank.GetBankRequest,
      to.bnk.api.bank.Bank> getGetBankMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.bank.GetBankRequest, to.bnk.api.bank.Bank> getGetBankMethod;
    if ((getGetBankMethod = BankServiceGrpc.getGetBankMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBankMethod = BankServiceGrpc.getGetBankMethod) == null) {
          BankServiceGrpc.getGetBankMethod = getGetBankMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.bank.GetBankRequest, to.bnk.api.bank.Bank>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.GetBankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.Bank.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBankMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      to.bnk.api.bank.GetBanksResponse> getGetBanksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBanks",
      requestType = com.google.protobuf.Empty.class,
      responseType = to.bnk.api.bank.GetBanksResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      to.bnk.api.bank.GetBanksResponse> getGetBanksMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, to.bnk.api.bank.GetBanksResponse> getGetBanksMethod;
    if ((getGetBanksMethod = BankServiceGrpc.getGetBanksMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getGetBanksMethod = BankServiceGrpc.getGetBanksMethod) == null) {
          BankServiceGrpc.getGetBanksMethod = getGetBanksMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, to.bnk.api.bank.GetBanksResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBanks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.GetBanksResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBanksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.bank.CreateBankRequest,
      to.bnk.api.bank.Bank> getCreateBankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBank",
      requestType = to.bnk.api.bank.CreateBankRequest.class,
      responseType = to.bnk.api.bank.Bank.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.bank.CreateBankRequest,
      to.bnk.api.bank.Bank> getCreateBankMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.bank.CreateBankRequest, to.bnk.api.bank.Bank> getCreateBankMethod;
    if ((getCreateBankMethod = BankServiceGrpc.getCreateBankMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCreateBankMethod = BankServiceGrpc.getCreateBankMethod) == null) {
          BankServiceGrpc.getCreateBankMethod = getCreateBankMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.bank.CreateBankRequest, to.bnk.api.bank.Bank>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.CreateBankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.Bank.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateBankMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.bank.UpdateBankRequest,
      to.bnk.api.bank.Bank> getUpdateBankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBank",
      requestType = to.bnk.api.bank.UpdateBankRequest.class,
      responseType = to.bnk.api.bank.Bank.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.bank.UpdateBankRequest,
      to.bnk.api.bank.Bank> getUpdateBankMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.bank.UpdateBankRequest, to.bnk.api.bank.Bank> getUpdateBankMethod;
    if ((getUpdateBankMethod = BankServiceGrpc.getUpdateBankMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getUpdateBankMethod = BankServiceGrpc.getUpdateBankMethod) == null) {
          BankServiceGrpc.getUpdateBankMethod = getUpdateBankMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.bank.UpdateBankRequest, to.bnk.api.bank.Bank>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.UpdateBankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.Bank.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateBankMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.bank.DeleteBankRequest,
      com.google.protobuf.Empty> getDeleteBankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBank",
      requestType = to.bnk.api.bank.DeleteBankRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.bank.DeleteBankRequest,
      com.google.protobuf.Empty> getDeleteBankMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.bank.DeleteBankRequest, com.google.protobuf.Empty> getDeleteBankMethod;
    if ((getDeleteBankMethod = BankServiceGrpc.getDeleteBankMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getDeleteBankMethod = BankServiceGrpc.getDeleteBankMethod) == null) {
          BankServiceGrpc.getDeleteBankMethod = getDeleteBankMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.bank.DeleteBankRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.DeleteBankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteBankMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.bank.CreateTransactionTypeAtBankRequest,
      to.bnk.api.bank.TransactionType> getCreateTranscationTypeAtBankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTranscationTypeAtBank",
      requestType = to.bnk.api.bank.CreateTransactionTypeAtBankRequest.class,
      responseType = to.bnk.api.bank.TransactionType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.bank.CreateTransactionTypeAtBankRequest,
      to.bnk.api.bank.TransactionType> getCreateTranscationTypeAtBankMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.bank.CreateTransactionTypeAtBankRequest, to.bnk.api.bank.TransactionType> getCreateTranscationTypeAtBankMethod;
    if ((getCreateTranscationTypeAtBankMethod = BankServiceGrpc.getCreateTranscationTypeAtBankMethod) == null) {
      synchronized (BankServiceGrpc.class) {
        if ((getCreateTranscationTypeAtBankMethod = BankServiceGrpc.getCreateTranscationTypeAtBankMethod) == null) {
          BankServiceGrpc.getCreateTranscationTypeAtBankMethod = getCreateTranscationTypeAtBankMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.bank.CreateTransactionTypeAtBankRequest, to.bnk.api.bank.TransactionType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTranscationTypeAtBank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.CreateTransactionTypeAtBankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.bank.TransactionType.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateTranscationTypeAtBankMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BankServiceStub newStub(io.grpc.Channel channel) {
    return new BankServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BankServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BankServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BankServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BankServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class BankServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBank(to.bnk.api.bank.GetBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBankMethod(), responseObserver);
    }

    /**
     */
    public void getBanks(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.GetBanksResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBanksMethod(), responseObserver);
    }

    /**
     */
    public void createBank(to.bnk.api.bank.CreateBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateBankMethod(), responseObserver);
    }

    /**
     */
    public void updateBank(to.bnk.api.bank.UpdateBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateBankMethod(), responseObserver);
    }

    /**
     */
    public void deleteBank(to.bnk.api.bank.DeleteBankRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteBankMethod(), responseObserver);
    }

    /**
     */
    public void createTranscationTypeAtBank(to.bnk.api.bank.CreateTransactionTypeAtBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.TransactionType> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTranscationTypeAtBankMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBankMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.bank.GetBankRequest,
                to.bnk.api.bank.Bank>(
                  this, METHODID_GET_BANK)))
          .addMethod(
            getGetBanksMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                to.bnk.api.bank.GetBanksResponse>(
                  this, METHODID_GET_BANKS)))
          .addMethod(
            getCreateBankMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.bank.CreateBankRequest,
                to.bnk.api.bank.Bank>(
                  this, METHODID_CREATE_BANK)))
          .addMethod(
            getUpdateBankMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.bank.UpdateBankRequest,
                to.bnk.api.bank.Bank>(
                  this, METHODID_UPDATE_BANK)))
          .addMethod(
            getDeleteBankMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.bank.DeleteBankRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_BANK)))
          .addMethod(
            getCreateTranscationTypeAtBankMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.bank.CreateTransactionTypeAtBankRequest,
                to.bnk.api.bank.TransactionType>(
                  this, METHODID_CREATE_TRANSCATION_TYPE_AT_BANK)))
          .build();
    }
  }

  /**
   */
  public static final class BankServiceStub extends io.grpc.stub.AbstractStub<BankServiceStub> {
    private BankServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBank(to.bnk.api.bank.GetBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBankMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBanks(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.GetBanksResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBanksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBank(to.bnk.api.bank.CreateBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateBankMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBank(to.bnk.api.bank.UpdateBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateBankMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBank(to.bnk.api.bank.DeleteBankRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteBankMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTranscationTypeAtBank(to.bnk.api.bank.CreateTransactionTypeAtBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.bank.TransactionType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTranscationTypeAtBankMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BankServiceBlockingStub extends io.grpc.stub.AbstractStub<BankServiceBlockingStub> {
    private BankServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.bank.Bank getBank(to.bnk.api.bank.GetBankRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBankMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.bank.GetBanksResponse getBanks(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetBanksMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.bank.Bank createBank(to.bnk.api.bank.CreateBankRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateBankMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.bank.Bank updateBank(to.bnk.api.bank.UpdateBankRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateBankMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBank(to.bnk.api.bank.DeleteBankRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteBankMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.bank.TransactionType createTranscationTypeAtBank(to.bnk.api.bank.CreateTransactionTypeAtBankRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTranscationTypeAtBankMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BankServiceFutureStub extends io.grpc.stub.AbstractStub<BankServiceFutureStub> {
    private BankServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BankServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BankServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BankServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.bank.Bank> getBank(
        to.bnk.api.bank.GetBankRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBankMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.bank.GetBanksResponse> getBanks(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBanksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.bank.Bank> createBank(
        to.bnk.api.bank.CreateBankRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateBankMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.bank.Bank> updateBank(
        to.bnk.api.bank.UpdateBankRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateBankMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBank(
        to.bnk.api.bank.DeleteBankRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteBankMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.bank.TransactionType> createTranscationTypeAtBank(
        to.bnk.api.bank.CreateTransactionTypeAtBankRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTranscationTypeAtBankMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BANK = 0;
  private static final int METHODID_GET_BANKS = 1;
  private static final int METHODID_CREATE_BANK = 2;
  private static final int METHODID_UPDATE_BANK = 3;
  private static final int METHODID_DELETE_BANK = 4;
  private static final int METHODID_CREATE_TRANSCATION_TYPE_AT_BANK = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BankServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BankServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BANK:
          serviceImpl.getBank((to.bnk.api.bank.GetBankRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank>) responseObserver);
          break;
        case METHODID_GET_BANKS:
          serviceImpl.getBanks((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.bank.GetBanksResponse>) responseObserver);
          break;
        case METHODID_CREATE_BANK:
          serviceImpl.createBank((to.bnk.api.bank.CreateBankRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank>) responseObserver);
          break;
        case METHODID_UPDATE_BANK:
          serviceImpl.updateBank((to.bnk.api.bank.UpdateBankRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.bank.Bank>) responseObserver);
          break;
        case METHODID_DELETE_BANK:
          serviceImpl.deleteBank((to.bnk.api.bank.DeleteBankRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TRANSCATION_TYPE_AT_BANK:
          serviceImpl.createTranscationTypeAtBank((to.bnk.api.bank.CreateTransactionTypeAtBankRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.bank.TransactionType>) responseObserver);
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
      synchronized (BankServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetBankMethod())
              .addMethod(getGetBanksMethod())
              .addMethod(getCreateBankMethod())
              .addMethod(getUpdateBankMethod())
              .addMethod(getDeleteBankMethod())
              .addMethod(getCreateTranscationTypeAtBankMethod())
              .build();
        }
      }
    }
    return result;
  }
}
