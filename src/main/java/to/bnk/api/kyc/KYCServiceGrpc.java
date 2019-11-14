package to.bnk.api.kyc;

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
public final class KYCServiceGrpc {

  private KYCServiceGrpc() {}

  public static final String SERVICE_NAME = "kyc.KYCService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCCheckRequest,
      to.bnk.api.kyc.AddKYCCheckResponse> getAddKYCCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKYCCheck",
      requestType = to.bnk.api.kyc.AddKYCCheckRequest.class,
      responseType = to.bnk.api.kyc.AddKYCCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCCheckRequest,
      to.bnk.api.kyc.AddKYCCheckResponse> getAddKYCCheckMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCCheckRequest, to.bnk.api.kyc.AddKYCCheckResponse> getAddKYCCheckMethod;
    if ((getAddKYCCheckMethod = KYCServiceGrpc.getAddKYCCheckMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getAddKYCCheckMethod = KYCServiceGrpc.getAddKYCCheckMethod) == null) {
          KYCServiceGrpc.getAddKYCCheckMethod = getAddKYCCheckMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.AddKYCCheckRequest, to.bnk.api.kyc.AddKYCCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKYCCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCCheckResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddKYCCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCDocumentRequest,
      to.bnk.api.kyc.AddKYCDocumentResponse> getAddKYCDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKYCDocument",
      requestType = to.bnk.api.kyc.AddKYCDocumentRequest.class,
      responseType = to.bnk.api.kyc.AddKYCDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCDocumentRequest,
      to.bnk.api.kyc.AddKYCDocumentResponse> getAddKYCDocumentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCDocumentRequest, to.bnk.api.kyc.AddKYCDocumentResponse> getAddKYCDocumentMethod;
    if ((getAddKYCDocumentMethod = KYCServiceGrpc.getAddKYCDocumentMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getAddKYCDocumentMethod = KYCServiceGrpc.getAddKYCDocumentMethod) == null) {
          KYCServiceGrpc.getAddKYCDocumentMethod = getAddKYCDocumentMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.AddKYCDocumentRequest, to.bnk.api.kyc.AddKYCDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKYCDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCDocumentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddKYCDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCMediaRequest,
      to.bnk.api.kyc.AddKYCMediaResponse> getAddKYCMediaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKYCMedia",
      requestType = to.bnk.api.kyc.AddKYCMediaRequest.class,
      responseType = to.bnk.api.kyc.AddKYCMediaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCMediaRequest,
      to.bnk.api.kyc.AddKYCMediaResponse> getAddKYCMediaMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCMediaRequest, to.bnk.api.kyc.AddKYCMediaResponse> getAddKYCMediaMethod;
    if ((getAddKYCMediaMethod = KYCServiceGrpc.getAddKYCMediaMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getAddKYCMediaMethod = KYCServiceGrpc.getAddKYCMediaMethod) == null) {
          KYCServiceGrpc.getAddKYCMediaMethod = getAddKYCMediaMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.AddKYCMediaRequest, to.bnk.api.kyc.AddKYCMediaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKYCMedia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCMediaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCMediaResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddKYCMediaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCStatusRequest,
      to.bnk.api.kyc.AddKYCStatusResponse> getAddKYCStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddKYCStatus",
      requestType = to.bnk.api.kyc.AddKYCStatusRequest.class,
      responseType = to.bnk.api.kyc.AddKYCStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCStatusRequest,
      to.bnk.api.kyc.AddKYCStatusResponse> getAddKYCStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.AddKYCStatusRequest, to.bnk.api.kyc.AddKYCStatusResponse> getAddKYCStatusMethod;
    if ((getAddKYCStatusMethod = KYCServiceGrpc.getAddKYCStatusMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getAddKYCStatusMethod = KYCServiceGrpc.getAddKYCStatusMethod) == null) {
          KYCServiceGrpc.getAddKYCStatusMethod = getAddKYCStatusMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.AddKYCStatusRequest, to.bnk.api.kyc.AddKYCStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddKYCStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.AddKYCStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddKYCStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCCheckRequest,
      to.bnk.api.kyc.GetCustomerKYCCheckResponse> getGetCustomerKYCCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerKYCCheck",
      requestType = to.bnk.api.kyc.GetCustomerKYCCheckRequest.class,
      responseType = to.bnk.api.kyc.GetCustomerKYCCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCCheckRequest,
      to.bnk.api.kyc.GetCustomerKYCCheckResponse> getGetCustomerKYCCheckMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCCheckRequest, to.bnk.api.kyc.GetCustomerKYCCheckResponse> getGetCustomerKYCCheckMethod;
    if ((getGetCustomerKYCCheckMethod = KYCServiceGrpc.getGetCustomerKYCCheckMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getGetCustomerKYCCheckMethod = KYCServiceGrpc.getGetCustomerKYCCheckMethod) == null) {
          KYCServiceGrpc.getGetCustomerKYCCheckMethod = getGetCustomerKYCCheckMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.GetCustomerKYCCheckRequest, to.bnk.api.kyc.GetCustomerKYCCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerKYCCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetCustomerKYCCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetCustomerKYCCheckResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerKYCCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCDocumentRequest,
      to.bnk.api.kyc.GetCustomerKYCDocumentResponse> getGetCustomerKYCDocumentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerKYCDocument",
      requestType = to.bnk.api.kyc.GetCustomerKYCDocumentRequest.class,
      responseType = to.bnk.api.kyc.GetCustomerKYCDocumentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCDocumentRequest,
      to.bnk.api.kyc.GetCustomerKYCDocumentResponse> getGetCustomerKYCDocumentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCDocumentRequest, to.bnk.api.kyc.GetCustomerKYCDocumentResponse> getGetCustomerKYCDocumentMethod;
    if ((getGetCustomerKYCDocumentMethod = KYCServiceGrpc.getGetCustomerKYCDocumentMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getGetCustomerKYCDocumentMethod = KYCServiceGrpc.getGetCustomerKYCDocumentMethod) == null) {
          KYCServiceGrpc.getGetCustomerKYCDocumentMethod = getGetCustomerKYCDocumentMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.GetCustomerKYCDocumentRequest, to.bnk.api.kyc.GetCustomerKYCDocumentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerKYCDocument"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetCustomerKYCDocumentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetCustomerKYCDocumentResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerKYCDocumentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCStatusRequest,
      to.bnk.api.kyc.GetCustomerKYCStatusResponse> getGetCustomerKYCStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerKYCStatus",
      requestType = to.bnk.api.kyc.GetCustomerKYCStatusRequest.class,
      responseType = to.bnk.api.kyc.GetCustomerKYCStatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCStatusRequest,
      to.bnk.api.kyc.GetCustomerKYCStatusResponse> getGetCustomerKYCStatusMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.GetCustomerKYCStatusRequest, to.bnk.api.kyc.GetCustomerKYCStatusResponse> getGetCustomerKYCStatusMethod;
    if ((getGetCustomerKYCStatusMethod = KYCServiceGrpc.getGetCustomerKYCStatusMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getGetCustomerKYCStatusMethod = KYCServiceGrpc.getGetCustomerKYCStatusMethod) == null) {
          KYCServiceGrpc.getGetCustomerKYCStatusMethod = getGetCustomerKYCStatusMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.GetCustomerKYCStatusRequest, to.bnk.api.kyc.GetCustomerKYCStatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerKYCStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetCustomerKYCStatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetCustomerKYCStatusResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerKYCStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.kyc.GetKYCMediaRequest,
      to.bnk.api.kyc.GetKYCMediaResponse> getGetKYCMediaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetKYCMedia",
      requestType = to.bnk.api.kyc.GetKYCMediaRequest.class,
      responseType = to.bnk.api.kyc.GetKYCMediaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.kyc.GetKYCMediaRequest,
      to.bnk.api.kyc.GetKYCMediaResponse> getGetKYCMediaMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.kyc.GetKYCMediaRequest, to.bnk.api.kyc.GetKYCMediaResponse> getGetKYCMediaMethod;
    if ((getGetKYCMediaMethod = KYCServiceGrpc.getGetKYCMediaMethod) == null) {
      synchronized (KYCServiceGrpc.class) {
        if ((getGetKYCMediaMethod = KYCServiceGrpc.getGetKYCMediaMethod) == null) {
          KYCServiceGrpc.getGetKYCMediaMethod = getGetKYCMediaMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.kyc.GetKYCMediaRequest, to.bnk.api.kyc.GetKYCMediaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetKYCMedia"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetKYCMediaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.kyc.GetKYCMediaResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetKYCMediaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static KYCServiceStub newStub(io.grpc.Channel channel) {
    return new KYCServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static KYCServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new KYCServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static KYCServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new KYCServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class KYCServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addKYCCheck(to.bnk.api.kyc.AddKYCCheckRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddKYCCheckMethod(), responseObserver);
    }

    /**
     */
    public void addKYCDocument(to.bnk.api.kyc.AddKYCDocumentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCDocumentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddKYCDocumentMethod(), responseObserver);
    }

    /**
     */
    public void addKYCMedia(to.bnk.api.kyc.AddKYCMediaRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCMediaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddKYCMediaMethod(), responseObserver);
    }

    /**
     */
    public void addKYCStatus(to.bnk.api.kyc.AddKYCStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddKYCStatusMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerKYCCheck(to.bnk.api.kyc.GetCustomerKYCCheckRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerKYCCheckMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerKYCDocument(to.bnk.api.kyc.GetCustomerKYCDocumentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCDocumentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerKYCDocumentMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerKYCStatus(to.bnk.api.kyc.GetCustomerKYCStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCStatusResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerKYCStatusMethod(), responseObserver);
    }

    /**
     */
    public void getKYCMedia(to.bnk.api.kyc.GetKYCMediaRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetKYCMediaResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetKYCMediaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddKYCCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.AddKYCCheckRequest,
                to.bnk.api.kyc.AddKYCCheckResponse>(
                  this, METHODID_ADD_KYCCHECK)))
          .addMethod(
            getAddKYCDocumentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.AddKYCDocumentRequest,
                to.bnk.api.kyc.AddKYCDocumentResponse>(
                  this, METHODID_ADD_KYCDOCUMENT)))
          .addMethod(
            getAddKYCMediaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.AddKYCMediaRequest,
                to.bnk.api.kyc.AddKYCMediaResponse>(
                  this, METHODID_ADD_KYCMEDIA)))
          .addMethod(
            getAddKYCStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.AddKYCStatusRequest,
                to.bnk.api.kyc.AddKYCStatusResponse>(
                  this, METHODID_ADD_KYCSTATUS)))
          .addMethod(
            getGetCustomerKYCCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.GetCustomerKYCCheckRequest,
                to.bnk.api.kyc.GetCustomerKYCCheckResponse>(
                  this, METHODID_GET_CUSTOMER_KYCCHECK)))
          .addMethod(
            getGetCustomerKYCDocumentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.GetCustomerKYCDocumentRequest,
                to.bnk.api.kyc.GetCustomerKYCDocumentResponse>(
                  this, METHODID_GET_CUSTOMER_KYCDOCUMENT)))
          .addMethod(
            getGetCustomerKYCStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.GetCustomerKYCStatusRequest,
                to.bnk.api.kyc.GetCustomerKYCStatusResponse>(
                  this, METHODID_GET_CUSTOMER_KYCSTATUS)))
          .addMethod(
            getGetKYCMediaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.kyc.GetKYCMediaRequest,
                to.bnk.api.kyc.GetKYCMediaResponse>(
                  this, METHODID_GET_KYCMEDIA)))
          .build();
    }
  }

  /**
   */
  public static final class KYCServiceStub extends io.grpc.stub.AbstractStub<KYCServiceStub> {
    private KYCServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KYCServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KYCServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KYCServiceStub(channel, callOptions);
    }

    /**
     */
    public void addKYCCheck(to.bnk.api.kyc.AddKYCCheckRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddKYCCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addKYCDocument(to.bnk.api.kyc.AddKYCDocumentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCDocumentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddKYCDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addKYCMedia(to.bnk.api.kyc.AddKYCMediaRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCMediaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddKYCMediaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addKYCStatus(to.bnk.api.kyc.AddKYCStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddKYCStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerKYCCheck(to.bnk.api.kyc.GetCustomerKYCCheckRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerKYCCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerKYCDocument(to.bnk.api.kyc.GetCustomerKYCDocumentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCDocumentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerKYCDocumentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerKYCStatus(to.bnk.api.kyc.GetCustomerKYCStatusRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCStatusResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerKYCStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getKYCMedia(to.bnk.api.kyc.GetKYCMediaRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetKYCMediaResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetKYCMediaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class KYCServiceBlockingStub extends io.grpc.stub.AbstractStub<KYCServiceBlockingStub> {
    private KYCServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KYCServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KYCServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KYCServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.kyc.AddKYCCheckResponse addKYCCheck(to.bnk.api.kyc.AddKYCCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddKYCCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.AddKYCDocumentResponse addKYCDocument(to.bnk.api.kyc.AddKYCDocumentRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddKYCDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.AddKYCMediaResponse addKYCMedia(to.bnk.api.kyc.AddKYCMediaRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddKYCMediaMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.AddKYCStatusResponse addKYCStatus(to.bnk.api.kyc.AddKYCStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddKYCStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.GetCustomerKYCCheckResponse getCustomerKYCCheck(to.bnk.api.kyc.GetCustomerKYCCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerKYCCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.GetCustomerKYCDocumentResponse getCustomerKYCDocument(to.bnk.api.kyc.GetCustomerKYCDocumentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerKYCDocumentMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.GetCustomerKYCStatusResponse getCustomerKYCStatus(to.bnk.api.kyc.GetCustomerKYCStatusRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerKYCStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.kyc.GetKYCMediaResponse getKYCMedia(to.bnk.api.kyc.GetKYCMediaRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetKYCMediaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class KYCServiceFutureStub extends io.grpc.stub.AbstractStub<KYCServiceFutureStub> {
    private KYCServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private KYCServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected KYCServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new KYCServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.AddKYCCheckResponse> addKYCCheck(
        to.bnk.api.kyc.AddKYCCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddKYCCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.AddKYCDocumentResponse> addKYCDocument(
        to.bnk.api.kyc.AddKYCDocumentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddKYCDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.AddKYCMediaResponse> addKYCMedia(
        to.bnk.api.kyc.AddKYCMediaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddKYCMediaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.AddKYCStatusResponse> addKYCStatus(
        to.bnk.api.kyc.AddKYCStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddKYCStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.GetCustomerKYCCheckResponse> getCustomerKYCCheck(
        to.bnk.api.kyc.GetCustomerKYCCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerKYCCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.GetCustomerKYCDocumentResponse> getCustomerKYCDocument(
        to.bnk.api.kyc.GetCustomerKYCDocumentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerKYCDocumentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.GetCustomerKYCStatusResponse> getCustomerKYCStatus(
        to.bnk.api.kyc.GetCustomerKYCStatusRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerKYCStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.kyc.GetKYCMediaResponse> getKYCMedia(
        to.bnk.api.kyc.GetKYCMediaRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetKYCMediaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_KYCCHECK = 0;
  private static final int METHODID_ADD_KYCDOCUMENT = 1;
  private static final int METHODID_ADD_KYCMEDIA = 2;
  private static final int METHODID_ADD_KYCSTATUS = 3;
  private static final int METHODID_GET_CUSTOMER_KYCCHECK = 4;
  private static final int METHODID_GET_CUSTOMER_KYCDOCUMENT = 5;
  private static final int METHODID_GET_CUSTOMER_KYCSTATUS = 6;
  private static final int METHODID_GET_KYCMEDIA = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final KYCServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(KYCServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_KYCCHECK:
          serviceImpl.addKYCCheck((to.bnk.api.kyc.AddKYCCheckRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCCheckResponse>) responseObserver);
          break;
        case METHODID_ADD_KYCDOCUMENT:
          serviceImpl.addKYCDocument((to.bnk.api.kyc.AddKYCDocumentRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCDocumentResponse>) responseObserver);
          break;
        case METHODID_ADD_KYCMEDIA:
          serviceImpl.addKYCMedia((to.bnk.api.kyc.AddKYCMediaRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCMediaResponse>) responseObserver);
          break;
        case METHODID_ADD_KYCSTATUS:
          serviceImpl.addKYCStatus((to.bnk.api.kyc.AddKYCStatusRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.AddKYCStatusResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_KYCCHECK:
          serviceImpl.getCustomerKYCCheck((to.bnk.api.kyc.GetCustomerKYCCheckRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCCheckResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_KYCDOCUMENT:
          serviceImpl.getCustomerKYCDocument((to.bnk.api.kyc.GetCustomerKYCDocumentRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCDocumentResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_KYCSTATUS:
          serviceImpl.getCustomerKYCStatus((to.bnk.api.kyc.GetCustomerKYCStatusRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetCustomerKYCStatusResponse>) responseObserver);
          break;
        case METHODID_GET_KYCMEDIA:
          serviceImpl.getKYCMedia((to.bnk.api.kyc.GetKYCMediaRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.kyc.GetKYCMediaResponse>) responseObserver);
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
      synchronized (KYCServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAddKYCCheckMethod())
              .addMethod(getAddKYCDocumentMethod())
              .addMethod(getAddKYCMediaMethod())
              .addMethod(getAddKYCStatusMethod())
              .addMethod(getGetCustomerKYCCheckMethod())
              .addMethod(getGetCustomerKYCDocumentMethod())
              .addMethod(getGetCustomerKYCStatusMethod())
              .addMethod(getGetKYCMediaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
