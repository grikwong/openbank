package to.bnk.api.counterparty;

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
public final class CounterPartyServiceGrpc {

  private CounterPartyServiceGrpc() {}

  public static final String SERVICE_NAME = "counterparty.CounterPartyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.counterparty.CreateCounterPartyRequest,
      to.bnk.api.counterparty.CreateCounterPartyResponse> getCreateCounterPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCounterParty",
      requestType = to.bnk.api.counterparty.CreateCounterPartyRequest.class,
      responseType = to.bnk.api.counterparty.CreateCounterPartyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.counterparty.CreateCounterPartyRequest,
      to.bnk.api.counterparty.CreateCounterPartyResponse> getCreateCounterPartyMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.counterparty.CreateCounterPartyRequest, to.bnk.api.counterparty.CreateCounterPartyResponse> getCreateCounterPartyMethod;
    if ((getCreateCounterPartyMethod = CounterPartyServiceGrpc.getCreateCounterPartyMethod) == null) {
      synchronized (CounterPartyServiceGrpc.class) {
        if ((getCreateCounterPartyMethod = CounterPartyServiceGrpc.getCreateCounterPartyMethod) == null) {
          CounterPartyServiceGrpc.getCreateCounterPartyMethod = getCreateCounterPartyMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.counterparty.CreateCounterPartyRequest, to.bnk.api.counterparty.CreateCounterPartyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCounterParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.CreateCounterPartyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.CreateCounterPartyResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateCounterPartyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetCounterPartyRequest,
      to.bnk.api.counterparty.CounterParty> getGetCounterPartyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCounterParty",
      requestType = to.bnk.api.counterparty.GetCounterPartyRequest.class,
      responseType = to.bnk.api.counterparty.CounterParty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetCounterPartyRequest,
      to.bnk.api.counterparty.CounterParty> getGetCounterPartyMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetCounterPartyRequest, to.bnk.api.counterparty.CounterParty> getGetCounterPartyMethod;
    if ((getGetCounterPartyMethod = CounterPartyServiceGrpc.getGetCounterPartyMethod) == null) {
      synchronized (CounterPartyServiceGrpc.class) {
        if ((getGetCounterPartyMethod = CounterPartyServiceGrpc.getGetCounterPartyMethod) == null) {
          CounterPartyServiceGrpc.getGetCounterPartyMethod = getGetCounterPartyMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.counterparty.GetCounterPartyRequest, to.bnk.api.counterparty.CounterParty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCounterParty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetCounterPartyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.CounterParty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCounterPartyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetCounterPartiesRequest,
      to.bnk.api.counterparty.GetCounterPartiesResponse> getGetCounterPartiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCounterParties",
      requestType = to.bnk.api.counterparty.GetCounterPartiesRequest.class,
      responseType = to.bnk.api.counterparty.GetCounterPartiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetCounterPartiesRequest,
      to.bnk.api.counterparty.GetCounterPartiesResponse> getGetCounterPartiesMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetCounterPartiesRequest, to.bnk.api.counterparty.GetCounterPartiesResponse> getGetCounterPartiesMethod;
    if ((getGetCounterPartiesMethod = CounterPartyServiceGrpc.getGetCounterPartiesMethod) == null) {
      synchronized (CounterPartyServiceGrpc.class) {
        if ((getGetCounterPartiesMethod = CounterPartyServiceGrpc.getGetCounterPartiesMethod) == null) {
          CounterPartyServiceGrpc.getGetCounterPartiesMethod = getGetCounterPartiesMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.counterparty.GetCounterPartiesRequest, to.bnk.api.counterparty.GetCounterPartiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCounterParties"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetCounterPartiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetCounterPartiesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCounterPartiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetOtherAccountByIDRequest,
      to.bnk.api.counterparty.GetOtherAccountByIDResponse> getGetOtherAccountByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOtherAccountByID",
      requestType = to.bnk.api.counterparty.GetOtherAccountByIDRequest.class,
      responseType = to.bnk.api.counterparty.GetOtherAccountByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetOtherAccountByIDRequest,
      to.bnk.api.counterparty.GetOtherAccountByIDResponse> getGetOtherAccountByIDMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetOtherAccountByIDRequest, to.bnk.api.counterparty.GetOtherAccountByIDResponse> getGetOtherAccountByIDMethod;
    if ((getGetOtherAccountByIDMethod = CounterPartyServiceGrpc.getGetOtherAccountByIDMethod) == null) {
      synchronized (CounterPartyServiceGrpc.class) {
        if ((getGetOtherAccountByIDMethod = CounterPartyServiceGrpc.getGetOtherAccountByIDMethod) == null) {
          CounterPartyServiceGrpc.getGetOtherAccountByIDMethod = getGetOtherAccountByIDMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.counterparty.GetOtherAccountByIDRequest, to.bnk.api.counterparty.GetOtherAccountByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOtherAccountByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetOtherAccountByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetOtherAccountByIDResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOtherAccountByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetOtherAccountsRequest,
      to.bnk.api.counterparty.GetOtherAccountsResponse> getGetOtherAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetOtherAccounts",
      requestType = to.bnk.api.counterparty.GetOtherAccountsRequest.class,
      responseType = to.bnk.api.counterparty.GetOtherAccountsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetOtherAccountsRequest,
      to.bnk.api.counterparty.GetOtherAccountsResponse> getGetOtherAccountsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.counterparty.GetOtherAccountsRequest, to.bnk.api.counterparty.GetOtherAccountsResponse> getGetOtherAccountsMethod;
    if ((getGetOtherAccountsMethod = CounterPartyServiceGrpc.getGetOtherAccountsMethod) == null) {
      synchronized (CounterPartyServiceGrpc.class) {
        if ((getGetOtherAccountsMethod = CounterPartyServiceGrpc.getGetOtherAccountsMethod) == null) {
          CounterPartyServiceGrpc.getGetOtherAccountsMethod = getGetOtherAccountsMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.counterparty.GetOtherAccountsRequest, to.bnk.api.counterparty.GetOtherAccountsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetOtherAccounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetOtherAccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.counterparty.GetOtherAccountsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetOtherAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CounterPartyServiceStub newStub(io.grpc.Channel channel) {
    return new CounterPartyServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CounterPartyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CounterPartyServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CounterPartyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CounterPartyServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CounterPartyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCounterParty(to.bnk.api.counterparty.CreateCounterPartyRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.CreateCounterPartyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCounterPartyMethod(), responseObserver);
    }

    /**
     */
    public void getCounterParty(to.bnk.api.counterparty.GetCounterPartyRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.CounterParty> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCounterPartyMethod(), responseObserver);
    }

    /**
     */
    public void getCounterParties(to.bnk.api.counterparty.GetCounterPartiesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetCounterPartiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCounterPartiesMethod(), responseObserver);
    }

    /**
     */
    public void getOtherAccountByID(to.bnk.api.counterparty.GetOtherAccountByIDRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetOtherAccountByIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOtherAccountByIDMethod(), responseObserver);
    }

    /**
     */
    public void getOtherAccounts(to.bnk.api.counterparty.GetOtherAccountsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetOtherAccountsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetOtherAccountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCounterPartyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.counterparty.CreateCounterPartyRequest,
                to.bnk.api.counterparty.CreateCounterPartyResponse>(
                  this, METHODID_CREATE_COUNTER_PARTY)))
          .addMethod(
            getGetCounterPartyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.counterparty.GetCounterPartyRequest,
                to.bnk.api.counterparty.CounterParty>(
                  this, METHODID_GET_COUNTER_PARTY)))
          .addMethod(
            getGetCounterPartiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.counterparty.GetCounterPartiesRequest,
                to.bnk.api.counterparty.GetCounterPartiesResponse>(
                  this, METHODID_GET_COUNTER_PARTIES)))
          .addMethod(
            getGetOtherAccountByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.counterparty.GetOtherAccountByIDRequest,
                to.bnk.api.counterparty.GetOtherAccountByIDResponse>(
                  this, METHODID_GET_OTHER_ACCOUNT_BY_ID)))
          .addMethod(
            getGetOtherAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.counterparty.GetOtherAccountsRequest,
                to.bnk.api.counterparty.GetOtherAccountsResponse>(
                  this, METHODID_GET_OTHER_ACCOUNTS)))
          .build();
    }
  }

  /**
   */
  public static final class CounterPartyServiceStub extends io.grpc.stub.AbstractStub<CounterPartyServiceStub> {
    private CounterPartyServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CounterPartyServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterPartyServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CounterPartyServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCounterParty(to.bnk.api.counterparty.CreateCounterPartyRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.CreateCounterPartyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCounterPartyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCounterParty(to.bnk.api.counterparty.GetCounterPartyRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.CounterParty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCounterPartyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCounterParties(to.bnk.api.counterparty.GetCounterPartiesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetCounterPartiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCounterPartiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOtherAccountByID(to.bnk.api.counterparty.GetOtherAccountByIDRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetOtherAccountByIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOtherAccountByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOtherAccounts(to.bnk.api.counterparty.GetOtherAccountsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetOtherAccountsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetOtherAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CounterPartyServiceBlockingStub extends io.grpc.stub.AbstractStub<CounterPartyServiceBlockingStub> {
    private CounterPartyServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CounterPartyServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterPartyServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CounterPartyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.counterparty.CreateCounterPartyResponse createCounterParty(to.bnk.api.counterparty.CreateCounterPartyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCounterPartyMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.counterparty.CounterParty getCounterParty(to.bnk.api.counterparty.GetCounterPartyRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCounterPartyMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.counterparty.GetCounterPartiesResponse getCounterParties(to.bnk.api.counterparty.GetCounterPartiesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCounterPartiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.counterparty.GetOtherAccountByIDResponse getOtherAccountByID(to.bnk.api.counterparty.GetOtherAccountByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOtherAccountByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.counterparty.GetOtherAccountsResponse getOtherAccounts(to.bnk.api.counterparty.GetOtherAccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetOtherAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CounterPartyServiceFutureStub extends io.grpc.stub.AbstractStub<CounterPartyServiceFutureStub> {
    private CounterPartyServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CounterPartyServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CounterPartyServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CounterPartyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.counterparty.CreateCounterPartyResponse> createCounterParty(
        to.bnk.api.counterparty.CreateCounterPartyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCounterPartyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.counterparty.CounterParty> getCounterParty(
        to.bnk.api.counterparty.GetCounterPartyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCounterPartyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.counterparty.GetCounterPartiesResponse> getCounterParties(
        to.bnk.api.counterparty.GetCounterPartiesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCounterPartiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.counterparty.GetOtherAccountByIDResponse> getOtherAccountByID(
        to.bnk.api.counterparty.GetOtherAccountByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOtherAccountByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.counterparty.GetOtherAccountsResponse> getOtherAccounts(
        to.bnk.api.counterparty.GetOtherAccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetOtherAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUNTER_PARTY = 0;
  private static final int METHODID_GET_COUNTER_PARTY = 1;
  private static final int METHODID_GET_COUNTER_PARTIES = 2;
  private static final int METHODID_GET_OTHER_ACCOUNT_BY_ID = 3;
  private static final int METHODID_GET_OTHER_ACCOUNTS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CounterPartyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CounterPartyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COUNTER_PARTY:
          serviceImpl.createCounterParty((to.bnk.api.counterparty.CreateCounterPartyRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.counterparty.CreateCounterPartyResponse>) responseObserver);
          break;
        case METHODID_GET_COUNTER_PARTY:
          serviceImpl.getCounterParty((to.bnk.api.counterparty.GetCounterPartyRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.counterparty.CounterParty>) responseObserver);
          break;
        case METHODID_GET_COUNTER_PARTIES:
          serviceImpl.getCounterParties((to.bnk.api.counterparty.GetCounterPartiesRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetCounterPartiesResponse>) responseObserver);
          break;
        case METHODID_GET_OTHER_ACCOUNT_BY_ID:
          serviceImpl.getOtherAccountByID((to.bnk.api.counterparty.GetOtherAccountByIDRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetOtherAccountByIDResponse>) responseObserver);
          break;
        case METHODID_GET_OTHER_ACCOUNTS:
          serviceImpl.getOtherAccounts((to.bnk.api.counterparty.GetOtherAccountsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.counterparty.GetOtherAccountsResponse>) responseObserver);
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
      synchronized (CounterPartyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateCounterPartyMethod())
              .addMethod(getGetCounterPartyMethod())
              .addMethod(getGetCounterPartiesMethod())
              .addMethod(getGetOtherAccountByIDMethod())
              .addMethod(getGetOtherAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
