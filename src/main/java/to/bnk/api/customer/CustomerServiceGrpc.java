package to.bnk.api.customer;

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
public final class CustomerServiceGrpc {

  private CustomerServiceGrpc() {}

  public static final String SERVICE_NAME = "customer.CustomerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.AddAddressToCustomerRequest,
      to.bnk.api.customer.AddAddressToCustomerResponse> getAddAddressToCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAddressToCustomer",
      requestType = to.bnk.api.customer.AddAddressToCustomerRequest.class,
      responseType = to.bnk.api.customer.AddAddressToCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.AddAddressToCustomerRequest,
      to.bnk.api.customer.AddAddressToCustomerResponse> getAddAddressToCustomerMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.AddAddressToCustomerRequest, to.bnk.api.customer.AddAddressToCustomerResponse> getAddAddressToCustomerMethod;
    if ((getAddAddressToCustomerMethod = CustomerServiceGrpc.getAddAddressToCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getAddAddressToCustomerMethod = CustomerServiceGrpc.getAddAddressToCustomerMethod) == null) {
          CustomerServiceGrpc.getAddAddressToCustomerMethod = getAddAddressToCustomerMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.AddAddressToCustomerRequest, to.bnk.api.customer.AddAddressToCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAddressToCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.AddAddressToCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.AddAddressToCustomerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddAddressToCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.AddSocialMediaHandleRequest,
      to.bnk.api.customer.AddSocialMediaHandleResponse> getAddSocialMediaHandleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSocialMediaHandle",
      requestType = to.bnk.api.customer.AddSocialMediaHandleRequest.class,
      responseType = to.bnk.api.customer.AddSocialMediaHandleResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.AddSocialMediaHandleRequest,
      to.bnk.api.customer.AddSocialMediaHandleResponse> getAddSocialMediaHandleMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.AddSocialMediaHandleRequest, to.bnk.api.customer.AddSocialMediaHandleResponse> getAddSocialMediaHandleMethod;
    if ((getAddSocialMediaHandleMethod = CustomerServiceGrpc.getAddSocialMediaHandleMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getAddSocialMediaHandleMethod = CustomerServiceGrpc.getAddSocialMediaHandleMethod) == null) {
          CustomerServiceGrpc.getAddSocialMediaHandleMethod = getAddSocialMediaHandleMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.AddSocialMediaHandleRequest, to.bnk.api.customer.AddSocialMediaHandleResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSocialMediaHandle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.AddSocialMediaHandleRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.AddSocialMediaHandleResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAddSocialMediaHandleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.CreateCustomerRequest,
      to.bnk.api.customer.CreateCustomerResponse> getCreateCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCustomer",
      requestType = to.bnk.api.customer.CreateCustomerRequest.class,
      responseType = to.bnk.api.customer.CreateCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.CreateCustomerRequest,
      to.bnk.api.customer.CreateCustomerResponse> getCreateCustomerMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.CreateCustomerRequest, to.bnk.api.customer.CreateCustomerResponse> getCreateCustomerMethod;
    if ((getCreateCustomerMethod = CustomerServiceGrpc.getCreateCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateCustomerMethod = CustomerServiceGrpc.getCreateCustomerMethod) == null) {
          CustomerServiceGrpc.getCreateCustomerMethod = getCreateCustomerMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.CreateCustomerRequest, to.bnk.api.customer.CreateCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.CreateCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.CreateCustomerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.CreateCreditLimitOrderRequest,
      to.bnk.api.customer.CreateCreditLimitOrderResponse> getCreateCreditLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCreditLimitOrder",
      requestType = to.bnk.api.customer.CreateCreditLimitOrderRequest.class,
      responseType = to.bnk.api.customer.CreateCreditLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.CreateCreditLimitOrderRequest,
      to.bnk.api.customer.CreateCreditLimitOrderResponse> getCreateCreditLimitOrderMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.CreateCreditLimitOrderRequest, to.bnk.api.customer.CreateCreditLimitOrderResponse> getCreateCreditLimitOrderMethod;
    if ((getCreateCreditLimitOrderMethod = CustomerServiceGrpc.getCreateCreditLimitOrderMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateCreditLimitOrderMethod = CustomerServiceGrpc.getCreateCreditLimitOrderMethod) == null) {
          CustomerServiceGrpc.getCreateCreditLimitOrderMethod = getCreateCreditLimitOrderMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.CreateCreditLimitOrderRequest, to.bnk.api.customer.CreateCreditLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCreditLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.CreateCreditLimitOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.CreateCreditLimitOrderResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateCreditLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.CreateUserCustomerLinkRequest,
      to.bnk.api.customer.CreateUserCustomerLinkResponse> getCreateUserCustomerLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUserCustomerLink",
      requestType = to.bnk.api.customer.CreateUserCustomerLinkRequest.class,
      responseType = to.bnk.api.customer.CreateUserCustomerLinkResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.CreateUserCustomerLinkRequest,
      to.bnk.api.customer.CreateUserCustomerLinkResponse> getCreateUserCustomerLinkMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.CreateUserCustomerLinkRequest, to.bnk.api.customer.CreateUserCustomerLinkResponse> getCreateUserCustomerLinkMethod;
    if ((getCreateUserCustomerLinkMethod = CustomerServiceGrpc.getCreateUserCustomerLinkMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getCreateUserCustomerLinkMethod = CustomerServiceGrpc.getCreateUserCustomerLinkMethod) == null) {
          CustomerServiceGrpc.getCreateUserCustomerLinkMethod = getCreateUserCustomerLinkMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.CreateUserCustomerLinkRequest, to.bnk.api.customer.CreateUserCustomerLinkResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUserCustomerLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.CreateUserCustomerLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.CreateUserCustomerLinkResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateUserCustomerLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.DeleteCustomerAddressRequest,
      com.google.protobuf.Empty> getDeleteCustomerAddressMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteCustomerAddress",
      requestType = to.bnk.api.customer.DeleteCustomerAddressRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.DeleteCustomerAddressRequest,
      com.google.protobuf.Empty> getDeleteCustomerAddressMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.DeleteCustomerAddressRequest, com.google.protobuf.Empty> getDeleteCustomerAddressMethod;
    if ((getDeleteCustomerAddressMethod = CustomerServiceGrpc.getDeleteCustomerAddressMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getDeleteCustomerAddressMethod = CustomerServiceGrpc.getDeleteCustomerAddressMethod) == null) {
          CustomerServiceGrpc.getDeleteCustomerAddressMethod = getDeleteCustomerAddressMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.DeleteCustomerAddressRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteCustomerAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.DeleteCustomerAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteCustomerAddressMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.DeleteTaxResidenceRequest,
      com.google.protobuf.Empty> getDeleteTaxResidenceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTaxResidence",
      requestType = to.bnk.api.customer.DeleteTaxResidenceRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.DeleteTaxResidenceRequest,
      com.google.protobuf.Empty> getDeleteTaxResidenceMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.DeleteTaxResidenceRequest, com.google.protobuf.Empty> getDeleteTaxResidenceMethod;
    if ((getDeleteTaxResidenceMethod = CustomerServiceGrpc.getDeleteTaxResidenceMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getDeleteTaxResidenceMethod = CustomerServiceGrpc.getDeleteTaxResidenceMethod) == null) {
          CustomerServiceGrpc.getDeleteTaxResidenceMethod = getDeleteTaxResidenceMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.DeleteTaxResidenceRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTaxResidence"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.DeleteTaxResidenceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteTaxResidenceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCRMEventsRequest,
      to.bnk.api.customer.GetCRMEventsResponse> getGetCRMEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCRMEvents",
      requestType = to.bnk.api.customer.GetCRMEventsRequest.class,
      responseType = to.bnk.api.customer.GetCRMEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCRMEventsRequest,
      to.bnk.api.customer.GetCRMEventsResponse> getGetCRMEventsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCRMEventsRequest, to.bnk.api.customer.GetCRMEventsResponse> getGetCRMEventsMethod;
    if ((getGetCRMEventsMethod = CustomerServiceGrpc.getGetCRMEventsMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCRMEventsMethod = CustomerServiceGrpc.getGetCRMEventsMethod) == null) {
          CustomerServiceGrpc.getGetCRMEventsMethod = getGetCRMEventsMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCRMEventsRequest, to.bnk.api.customer.GetCRMEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCRMEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCRMEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCRMEventsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCRMEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCreditLimitOrderByIDRequest,
      to.bnk.api.customer.GetCreditLimitOrderByIDResponse> getGetCreditLimitOrderByIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCreditLimitOrderByID",
      requestType = to.bnk.api.customer.GetCreditLimitOrderByIDRequest.class,
      responseType = to.bnk.api.customer.GetCreditLimitOrderByIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCreditLimitOrderByIDRequest,
      to.bnk.api.customer.GetCreditLimitOrderByIDResponse> getGetCreditLimitOrderByIDMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCreditLimitOrderByIDRequest, to.bnk.api.customer.GetCreditLimitOrderByIDResponse> getGetCreditLimitOrderByIDMethod;
    if ((getGetCreditLimitOrderByIDMethod = CustomerServiceGrpc.getGetCreditLimitOrderByIDMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCreditLimitOrderByIDMethod = CustomerServiceGrpc.getGetCreditLimitOrderByIDMethod) == null) {
          CustomerServiceGrpc.getGetCreditLimitOrderByIDMethod = getGetCreditLimitOrderByIDMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCreditLimitOrderByIDRequest, to.bnk.api.customer.GetCreditLimitOrderByIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCreditLimitOrderByID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCreditLimitOrderByIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCreditLimitOrderByIDResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCreditLimitOrderByIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCreditLimitOrderRequest,
      to.bnk.api.customer.GetCreditLimitOrderResponse> getGetCreditLimitOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCreditLimitOrder",
      requestType = to.bnk.api.customer.GetCreditLimitOrderRequest.class,
      responseType = to.bnk.api.customer.GetCreditLimitOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCreditLimitOrderRequest,
      to.bnk.api.customer.GetCreditLimitOrderResponse> getGetCreditLimitOrderMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCreditLimitOrderRequest, to.bnk.api.customer.GetCreditLimitOrderResponse> getGetCreditLimitOrderMethod;
    if ((getGetCreditLimitOrderMethod = CustomerServiceGrpc.getGetCreditLimitOrderMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCreditLimitOrderMethod = CustomerServiceGrpc.getGetCreditLimitOrderMethod) == null) {
          CustomerServiceGrpc.getGetCreditLimitOrderMethod = getGetCreditLimitOrderMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCreditLimitOrderRequest, to.bnk.api.customer.GetCreditLimitOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCreditLimitOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCreditLimitOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCreditLimitOrderResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCreditLimitOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerAddressesRequest,
      to.bnk.api.customer.GetCustomerAddressesResponse> getGetCustomerAddressesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerAddresses",
      requestType = to.bnk.api.customer.GetCustomerAddressesRequest.class,
      responseType = to.bnk.api.customer.GetCustomerAddressesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerAddressesRequest,
      to.bnk.api.customer.GetCustomerAddressesResponse> getGetCustomerAddressesMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerAddressesRequest, to.bnk.api.customer.GetCustomerAddressesResponse> getGetCustomerAddressesMethod;
    if ((getGetCustomerAddressesMethod = CustomerServiceGrpc.getGetCustomerAddressesMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerAddressesMethod = CustomerServiceGrpc.getGetCustomerAddressesMethod) == null) {
          CustomerServiceGrpc.getGetCustomerAddressesMethod = getGetCustomerAddressesMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCustomerAddressesRequest, to.bnk.api.customer.GetCustomerAddressesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerAddresses"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomerAddressesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomerAddressesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerAddressesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest,
      to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse> getGetCustomerSocialMediaHandlesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerSocialMediaHandles",
      requestType = to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest.class,
      responseType = to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest,
      to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse> getGetCustomerSocialMediaHandlesMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest, to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse> getGetCustomerSocialMediaHandlesMethod;
    if ((getGetCustomerSocialMediaHandlesMethod = CustomerServiceGrpc.getGetCustomerSocialMediaHandlesMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerSocialMediaHandlesMethod = CustomerServiceGrpc.getGetCustomerSocialMediaHandlesMethod) == null) {
          CustomerServiceGrpc.getGetCustomerSocialMediaHandlesMethod = getGetCustomerSocialMediaHandlesMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest, to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerSocialMediaHandles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerSocialMediaHandlesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerByCustomerIDRequest,
      to.bnk.api.customer.Customer> getGetCustomerByCustomerIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerByCustomerID",
      requestType = to.bnk.api.customer.GetCustomerByCustomerIDRequest.class,
      responseType = to.bnk.api.customer.Customer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerByCustomerIDRequest,
      to.bnk.api.customer.Customer> getGetCustomerByCustomerIDMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerByCustomerIDRequest, to.bnk.api.customer.Customer> getGetCustomerByCustomerIDMethod;
    if ((getGetCustomerByCustomerIDMethod = CustomerServiceGrpc.getGetCustomerByCustomerIDMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerByCustomerIDMethod = CustomerServiceGrpc.getGetCustomerByCustomerIDMethod) == null) {
          CustomerServiceGrpc.getGetCustomerByCustomerIDMethod = getGetCustomerByCustomerIDMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCustomerByCustomerIDRequest, to.bnk.api.customer.Customer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerByCustomerID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomerByCustomerIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.Customer.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerByCustomerIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerByCustomerNumberRequest,
      to.bnk.api.customer.Customer> getGetCustomerByCustomerNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomerByCustomerNumber",
      requestType = to.bnk.api.customer.GetCustomerByCustomerNumberRequest.class,
      responseType = to.bnk.api.customer.Customer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerByCustomerNumberRequest,
      to.bnk.api.customer.Customer> getGetCustomerByCustomerNumberMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomerByCustomerNumberRequest, to.bnk.api.customer.Customer> getGetCustomerByCustomerNumberMethod;
    if ((getGetCustomerByCustomerNumberMethod = CustomerServiceGrpc.getGetCustomerByCustomerNumberMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomerByCustomerNumberMethod = CustomerServiceGrpc.getGetCustomerByCustomerNumberMethod) == null) {
          CustomerServiceGrpc.getGetCustomerByCustomerNumberMethod = getGetCustomerByCustomerNumberMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCustomerByCustomerNumberRequest, to.bnk.api.customer.Customer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomerByCustomerNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomerByCustomerNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.Customer.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomerByCustomerNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomersForCurrentUserRequest,
      to.bnk.api.customer.GetCustomersForCurrentUserResponse> getGetCustomersForCurrentUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomersForCurrentUser",
      requestType = to.bnk.api.customer.GetCustomersForCurrentUserRequest.class,
      responseType = to.bnk.api.customer.GetCustomersForCurrentUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomersForCurrentUserRequest,
      to.bnk.api.customer.GetCustomersForCurrentUserResponse> getGetCustomersForCurrentUserMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomersForCurrentUserRequest, to.bnk.api.customer.GetCustomersForCurrentUserResponse> getGetCustomersForCurrentUserMethod;
    if ((getGetCustomersForCurrentUserMethod = CustomerServiceGrpc.getGetCustomersForCurrentUserMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomersForCurrentUserMethod = CustomerServiceGrpc.getGetCustomersForCurrentUserMethod) == null) {
          CustomerServiceGrpc.getGetCustomersForCurrentUserMethod = getGetCustomersForCurrentUserMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCustomersForCurrentUserRequest, to.bnk.api.customer.GetCustomersForCurrentUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomersForCurrentUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomersForCurrentUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomersForCurrentUserResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomersForCurrentUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest,
      to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse> getGetCustomersForCurrentUserAtBankMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCustomersForCurrentUserAtBank",
      requestType = to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest.class,
      responseType = to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest,
      to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse> getGetCustomersForCurrentUserAtBankMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest, to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse> getGetCustomersForCurrentUserAtBankMethod;
    if ((getGetCustomersForCurrentUserAtBankMethod = CustomerServiceGrpc.getGetCustomersForCurrentUserAtBankMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetCustomersForCurrentUserAtBankMethod = CustomerServiceGrpc.getGetCustomersForCurrentUserAtBankMethod) == null) {
          CustomerServiceGrpc.getGetCustomersForCurrentUserAtBankMethod = getGetCustomersForCurrentUserAtBankMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest, to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetCustomersForCurrentUserAtBank"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCustomersForCurrentUserAtBankMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetFirehoseCustomerRequest,
      to.bnk.api.customer.GetFirehoseCustomerResponse> getGetFirehoseCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFirehoseCustomer",
      requestType = to.bnk.api.customer.GetFirehoseCustomerRequest.class,
      responseType = to.bnk.api.customer.GetFirehoseCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetFirehoseCustomerRequest,
      to.bnk.api.customer.GetFirehoseCustomerResponse> getGetFirehoseCustomerMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetFirehoseCustomerRequest, to.bnk.api.customer.GetFirehoseCustomerResponse> getGetFirehoseCustomerMethod;
    if ((getGetFirehoseCustomerMethod = CustomerServiceGrpc.getGetFirehoseCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetFirehoseCustomerMethod = CustomerServiceGrpc.getGetFirehoseCustomerMethod) == null) {
          CustomerServiceGrpc.getGetFirehoseCustomerMethod = getGetFirehoseCustomerMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetFirehoseCustomerRequest, to.bnk.api.customer.GetFirehoseCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFirehoseCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetFirehoseCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetFirehoseCustomerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetFirehoseCustomerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.customer.GetTaxResidenceOfCustomerRequest,
      to.bnk.api.customer.GetTaxResidenceOfCustomerResponse> getGetTaxResidenceOfCustomerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTaxResidenceOfCustomer",
      requestType = to.bnk.api.customer.GetTaxResidenceOfCustomerRequest.class,
      responseType = to.bnk.api.customer.GetTaxResidenceOfCustomerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.customer.GetTaxResidenceOfCustomerRequest,
      to.bnk.api.customer.GetTaxResidenceOfCustomerResponse> getGetTaxResidenceOfCustomerMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.customer.GetTaxResidenceOfCustomerRequest, to.bnk.api.customer.GetTaxResidenceOfCustomerResponse> getGetTaxResidenceOfCustomerMethod;
    if ((getGetTaxResidenceOfCustomerMethod = CustomerServiceGrpc.getGetTaxResidenceOfCustomerMethod) == null) {
      synchronized (CustomerServiceGrpc.class) {
        if ((getGetTaxResidenceOfCustomerMethod = CustomerServiceGrpc.getGetTaxResidenceOfCustomerMethod) == null) {
          CustomerServiceGrpc.getGetTaxResidenceOfCustomerMethod = getGetTaxResidenceOfCustomerMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.customer.GetTaxResidenceOfCustomerRequest, to.bnk.api.customer.GetTaxResidenceOfCustomerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTaxResidenceOfCustomer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetTaxResidenceOfCustomerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.customer.GetTaxResidenceOfCustomerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTaxResidenceOfCustomerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CustomerServiceStub newStub(io.grpc.Channel channel) {
    return new CustomerServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CustomerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CustomerServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CustomerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CustomerServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class CustomerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addAddressToCustomer(to.bnk.api.customer.AddAddressToCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.AddAddressToCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddAddressToCustomerMethod(), responseObserver);
    }

    /**
     */
    public void addSocialMediaHandle(to.bnk.api.customer.AddSocialMediaHandleRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.AddSocialMediaHandleResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddSocialMediaHandleMethod(), responseObserver);
    }

    /**
     */
    public void createCustomer(to.bnk.api.customer.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCustomerMethod(), responseObserver);
    }

    /**
     */
    public void createCreditLimitOrder(to.bnk.api.customer.CreateCreditLimitOrderRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateCreditLimitOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCreditLimitOrderMethod(), responseObserver);
    }

    /**
     */
    public void createUserCustomerLink(to.bnk.api.customer.CreateUserCustomerLinkRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateUserCustomerLinkResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserCustomerLinkMethod(), responseObserver);
    }

    /**
     */
    public void deleteCustomerAddress(to.bnk.api.customer.DeleteCustomerAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCustomerAddressMethod(), responseObserver);
    }

    /**
     */
    public void deleteTaxResidence(to.bnk.api.customer.DeleteTaxResidenceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTaxResidenceMethod(), responseObserver);
    }

    /**
     */
    public void getCRMEvents(to.bnk.api.customer.GetCRMEventsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCRMEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCRMEventsMethod(), responseObserver);
    }

    /**
     */
    public void getCreditLimitOrderByID(to.bnk.api.customer.GetCreditLimitOrderByIDRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCreditLimitOrderByIDResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCreditLimitOrderByIDMethod(), responseObserver);
    }

    /**
     */
    public void getCreditLimitOrder(to.bnk.api.customer.GetCreditLimitOrderRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCreditLimitOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCreditLimitOrderMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerAddresses(to.bnk.api.customer.GetCustomerAddressesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomerAddressesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerAddressesMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerSocialMediaHandles(to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerSocialMediaHandlesMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerByCustomerID(to.bnk.api.customer.GetCustomerByCustomerIDRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerByCustomerIDMethod(), responseObserver);
    }

    /**
     */
    public void getCustomerByCustomerNumber(to.bnk.api.customer.GetCustomerByCustomerNumberRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomerByCustomerNumberMethod(), responseObserver);
    }

    /**
     */
    public void getCustomersForCurrentUser(to.bnk.api.customer.GetCustomersForCurrentUserRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomersForCurrentUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomersForCurrentUserMethod(), responseObserver);
    }

    /**
     */
    public void getCustomersForCurrentUserAtBank(to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCustomersForCurrentUserAtBankMethod(), responseObserver);
    }

    /**
     */
    public void getFirehoseCustomer(to.bnk.api.customer.GetFirehoseCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetFirehoseCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetFirehoseCustomerMethod(), responseObserver);
    }

    /**
     */
    public void getTaxResidenceOfCustomer(to.bnk.api.customer.GetTaxResidenceOfCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetTaxResidenceOfCustomerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTaxResidenceOfCustomerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddAddressToCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.AddAddressToCustomerRequest,
                to.bnk.api.customer.AddAddressToCustomerResponse>(
                  this, METHODID_ADD_ADDRESS_TO_CUSTOMER)))
          .addMethod(
            getAddSocialMediaHandleMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.AddSocialMediaHandleRequest,
                to.bnk.api.customer.AddSocialMediaHandleResponse>(
                  this, METHODID_ADD_SOCIAL_MEDIA_HANDLE)))
          .addMethod(
            getCreateCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.CreateCustomerRequest,
                to.bnk.api.customer.CreateCustomerResponse>(
                  this, METHODID_CREATE_CUSTOMER)))
          .addMethod(
            getCreateCreditLimitOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.CreateCreditLimitOrderRequest,
                to.bnk.api.customer.CreateCreditLimitOrderResponse>(
                  this, METHODID_CREATE_CREDIT_LIMIT_ORDER)))
          .addMethod(
            getCreateUserCustomerLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.CreateUserCustomerLinkRequest,
                to.bnk.api.customer.CreateUserCustomerLinkResponse>(
                  this, METHODID_CREATE_USER_CUSTOMER_LINK)))
          .addMethod(
            getDeleteCustomerAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.DeleteCustomerAddressRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_CUSTOMER_ADDRESS)))
          .addMethod(
            getDeleteTaxResidenceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.DeleteTaxResidenceRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TAX_RESIDENCE)))
          .addMethod(
            getGetCRMEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCRMEventsRequest,
                to.bnk.api.customer.GetCRMEventsResponse>(
                  this, METHODID_GET_CRMEVENTS)))
          .addMethod(
            getGetCreditLimitOrderByIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCreditLimitOrderByIDRequest,
                to.bnk.api.customer.GetCreditLimitOrderByIDResponse>(
                  this, METHODID_GET_CREDIT_LIMIT_ORDER_BY_ID)))
          .addMethod(
            getGetCreditLimitOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCreditLimitOrderRequest,
                to.bnk.api.customer.GetCreditLimitOrderResponse>(
                  this, METHODID_GET_CREDIT_LIMIT_ORDER)))
          .addMethod(
            getGetCustomerAddressesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCustomerAddressesRequest,
                to.bnk.api.customer.GetCustomerAddressesResponse>(
                  this, METHODID_GET_CUSTOMER_ADDRESSES)))
          .addMethod(
            getGetCustomerSocialMediaHandlesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest,
                to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse>(
                  this, METHODID_GET_CUSTOMER_SOCIAL_MEDIA_HANDLES)))
          .addMethod(
            getGetCustomerByCustomerIDMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCustomerByCustomerIDRequest,
                to.bnk.api.customer.Customer>(
                  this, METHODID_GET_CUSTOMER_BY_CUSTOMER_ID)))
          .addMethod(
            getGetCustomerByCustomerNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCustomerByCustomerNumberRequest,
                to.bnk.api.customer.Customer>(
                  this, METHODID_GET_CUSTOMER_BY_CUSTOMER_NUMBER)))
          .addMethod(
            getGetCustomersForCurrentUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCustomersForCurrentUserRequest,
                to.bnk.api.customer.GetCustomersForCurrentUserResponse>(
                  this, METHODID_GET_CUSTOMERS_FOR_CURRENT_USER)))
          .addMethod(
            getGetCustomersForCurrentUserAtBankMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest,
                to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse>(
                  this, METHODID_GET_CUSTOMERS_FOR_CURRENT_USER_AT_BANK)))
          .addMethod(
            getGetFirehoseCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetFirehoseCustomerRequest,
                to.bnk.api.customer.GetFirehoseCustomerResponse>(
                  this, METHODID_GET_FIREHOSE_CUSTOMER)))
          .addMethod(
            getGetTaxResidenceOfCustomerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.customer.GetTaxResidenceOfCustomerRequest,
                to.bnk.api.customer.GetTaxResidenceOfCustomerResponse>(
                  this, METHODID_GET_TAX_RESIDENCE_OF_CUSTOMER)))
          .build();
    }
  }

  /**
   */
  public static final class CustomerServiceStub extends io.grpc.stub.AbstractStub<CustomerServiceStub> {
    private CustomerServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceStub(channel, callOptions);
    }

    /**
     */
    public void addAddressToCustomer(to.bnk.api.customer.AddAddressToCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.AddAddressToCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddAddressToCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSocialMediaHandle(to.bnk.api.customer.AddSocialMediaHandleRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.AddSocialMediaHandleResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddSocialMediaHandleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCustomer(to.bnk.api.customer.CreateCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCreditLimitOrder(to.bnk.api.customer.CreateCreditLimitOrderRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateCreditLimitOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCreditLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUserCustomerLink(to.bnk.api.customer.CreateUserCustomerLinkRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateUserCustomerLinkResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserCustomerLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCustomerAddress(to.bnk.api.customer.DeleteCustomerAddressRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCustomerAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTaxResidence(to.bnk.api.customer.DeleteTaxResidenceRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTaxResidenceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCRMEvents(to.bnk.api.customer.GetCRMEventsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCRMEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCRMEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCreditLimitOrderByID(to.bnk.api.customer.GetCreditLimitOrderByIDRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCreditLimitOrderByIDResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCreditLimitOrderByIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCreditLimitOrder(to.bnk.api.customer.GetCreditLimitOrderRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCreditLimitOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCreditLimitOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerAddresses(to.bnk.api.customer.GetCustomerAddressesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomerAddressesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerAddressesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerSocialMediaHandles(to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerSocialMediaHandlesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerByCustomerID(to.bnk.api.customer.GetCustomerByCustomerIDRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerByCustomerIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomerByCustomerNumber(to.bnk.api.customer.GetCustomerByCustomerNumberRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomerByCustomerNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomersForCurrentUser(to.bnk.api.customer.GetCustomersForCurrentUserRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomersForCurrentUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomersForCurrentUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCustomersForCurrentUserAtBank(to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCustomersForCurrentUserAtBankMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFirehoseCustomer(to.bnk.api.customer.GetFirehoseCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetFirehoseCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetFirehoseCustomerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTaxResidenceOfCustomer(to.bnk.api.customer.GetTaxResidenceOfCustomerRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.customer.GetTaxResidenceOfCustomerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTaxResidenceOfCustomerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CustomerServiceBlockingStub extends io.grpc.stub.AbstractStub<CustomerServiceBlockingStub> {
    private CustomerServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.customer.AddAddressToCustomerResponse addAddressToCustomer(to.bnk.api.customer.AddAddressToCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddAddressToCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.AddSocialMediaHandleResponse addSocialMediaHandle(to.bnk.api.customer.AddSocialMediaHandleRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddSocialMediaHandleMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.CreateCustomerResponse createCustomer(to.bnk.api.customer.CreateCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.CreateCreditLimitOrderResponse createCreditLimitOrder(to.bnk.api.customer.CreateCreditLimitOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCreditLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.CreateUserCustomerLinkResponse createUserCustomerLink(to.bnk.api.customer.CreateUserCustomerLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserCustomerLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCustomerAddress(to.bnk.api.customer.DeleteCustomerAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCustomerAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTaxResidence(to.bnk.api.customer.DeleteTaxResidenceRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTaxResidenceMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCRMEventsResponse getCRMEvents(to.bnk.api.customer.GetCRMEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCRMEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCreditLimitOrderByIDResponse getCreditLimitOrderByID(to.bnk.api.customer.GetCreditLimitOrderByIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCreditLimitOrderByIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCreditLimitOrderResponse getCreditLimitOrder(to.bnk.api.customer.GetCreditLimitOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCreditLimitOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCustomerAddressesResponse getCustomerAddresses(to.bnk.api.customer.GetCustomerAddressesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerAddressesMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse getCustomerSocialMediaHandles(to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerSocialMediaHandlesMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.Customer getCustomerByCustomerID(to.bnk.api.customer.GetCustomerByCustomerIDRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerByCustomerIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.Customer getCustomerByCustomerNumber(to.bnk.api.customer.GetCustomerByCustomerNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomerByCustomerNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCustomersForCurrentUserResponse getCustomersForCurrentUser(to.bnk.api.customer.GetCustomersForCurrentUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomersForCurrentUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse getCustomersForCurrentUserAtBank(to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCustomersForCurrentUserAtBankMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetFirehoseCustomerResponse getFirehoseCustomer(to.bnk.api.customer.GetFirehoseCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetFirehoseCustomerMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.customer.GetTaxResidenceOfCustomerResponse getTaxResidenceOfCustomer(to.bnk.api.customer.GetTaxResidenceOfCustomerRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTaxResidenceOfCustomerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CustomerServiceFutureStub extends io.grpc.stub.AbstractStub<CustomerServiceFutureStub> {
    private CustomerServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CustomerServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CustomerServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CustomerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.AddAddressToCustomerResponse> addAddressToCustomer(
        to.bnk.api.customer.AddAddressToCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddAddressToCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.AddSocialMediaHandleResponse> addSocialMediaHandle(
        to.bnk.api.customer.AddSocialMediaHandleRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddSocialMediaHandleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.CreateCustomerResponse> createCustomer(
        to.bnk.api.customer.CreateCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.CreateCreditLimitOrderResponse> createCreditLimitOrder(
        to.bnk.api.customer.CreateCreditLimitOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCreditLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.CreateUserCustomerLinkResponse> createUserCustomerLink(
        to.bnk.api.customer.CreateUserCustomerLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserCustomerLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCustomerAddress(
        to.bnk.api.customer.DeleteCustomerAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCustomerAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTaxResidence(
        to.bnk.api.customer.DeleteTaxResidenceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTaxResidenceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCRMEventsResponse> getCRMEvents(
        to.bnk.api.customer.GetCRMEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCRMEventsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCreditLimitOrderByIDResponse> getCreditLimitOrderByID(
        to.bnk.api.customer.GetCreditLimitOrderByIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCreditLimitOrderByIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCreditLimitOrderResponse> getCreditLimitOrder(
        to.bnk.api.customer.GetCreditLimitOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCreditLimitOrderMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCustomerAddressesResponse> getCustomerAddresses(
        to.bnk.api.customer.GetCustomerAddressesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerAddressesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse> getCustomerSocialMediaHandles(
        to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerSocialMediaHandlesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.Customer> getCustomerByCustomerID(
        to.bnk.api.customer.GetCustomerByCustomerIDRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerByCustomerIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.Customer> getCustomerByCustomerNumber(
        to.bnk.api.customer.GetCustomerByCustomerNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomerByCustomerNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCustomersForCurrentUserResponse> getCustomersForCurrentUser(
        to.bnk.api.customer.GetCustomersForCurrentUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomersForCurrentUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse> getCustomersForCurrentUserAtBank(
        to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCustomersForCurrentUserAtBankMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetFirehoseCustomerResponse> getFirehoseCustomer(
        to.bnk.api.customer.GetFirehoseCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetFirehoseCustomerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.customer.GetTaxResidenceOfCustomerResponse> getTaxResidenceOfCustomer(
        to.bnk.api.customer.GetTaxResidenceOfCustomerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTaxResidenceOfCustomerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_ADDRESS_TO_CUSTOMER = 0;
  private static final int METHODID_ADD_SOCIAL_MEDIA_HANDLE = 1;
  private static final int METHODID_CREATE_CUSTOMER = 2;
  private static final int METHODID_CREATE_CREDIT_LIMIT_ORDER = 3;
  private static final int METHODID_CREATE_USER_CUSTOMER_LINK = 4;
  private static final int METHODID_DELETE_CUSTOMER_ADDRESS = 5;
  private static final int METHODID_DELETE_TAX_RESIDENCE = 6;
  private static final int METHODID_GET_CRMEVENTS = 7;
  private static final int METHODID_GET_CREDIT_LIMIT_ORDER_BY_ID = 8;
  private static final int METHODID_GET_CREDIT_LIMIT_ORDER = 9;
  private static final int METHODID_GET_CUSTOMER_ADDRESSES = 10;
  private static final int METHODID_GET_CUSTOMER_SOCIAL_MEDIA_HANDLES = 11;
  private static final int METHODID_GET_CUSTOMER_BY_CUSTOMER_ID = 12;
  private static final int METHODID_GET_CUSTOMER_BY_CUSTOMER_NUMBER = 13;
  private static final int METHODID_GET_CUSTOMERS_FOR_CURRENT_USER = 14;
  private static final int METHODID_GET_CUSTOMERS_FOR_CURRENT_USER_AT_BANK = 15;
  private static final int METHODID_GET_FIREHOSE_CUSTOMER = 16;
  private static final int METHODID_GET_TAX_RESIDENCE_OF_CUSTOMER = 17;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CustomerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CustomerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_ADDRESS_TO_CUSTOMER:
          serviceImpl.addAddressToCustomer((to.bnk.api.customer.AddAddressToCustomerRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.AddAddressToCustomerResponse>) responseObserver);
          break;
        case METHODID_ADD_SOCIAL_MEDIA_HANDLE:
          serviceImpl.addSocialMediaHandle((to.bnk.api.customer.AddSocialMediaHandleRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.AddSocialMediaHandleResponse>) responseObserver);
          break;
        case METHODID_CREATE_CUSTOMER:
          serviceImpl.createCustomer((to.bnk.api.customer.CreateCustomerRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateCustomerResponse>) responseObserver);
          break;
        case METHODID_CREATE_CREDIT_LIMIT_ORDER:
          serviceImpl.createCreditLimitOrder((to.bnk.api.customer.CreateCreditLimitOrderRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateCreditLimitOrderResponse>) responseObserver);
          break;
        case METHODID_CREATE_USER_CUSTOMER_LINK:
          serviceImpl.createUserCustomerLink((to.bnk.api.customer.CreateUserCustomerLinkRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.CreateUserCustomerLinkResponse>) responseObserver);
          break;
        case METHODID_DELETE_CUSTOMER_ADDRESS:
          serviceImpl.deleteCustomerAddress((to.bnk.api.customer.DeleteCustomerAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_TAX_RESIDENCE:
          serviceImpl.deleteTaxResidence((to.bnk.api.customer.DeleteTaxResidenceRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CRMEVENTS:
          serviceImpl.getCRMEvents((to.bnk.api.customer.GetCRMEventsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCRMEventsResponse>) responseObserver);
          break;
        case METHODID_GET_CREDIT_LIMIT_ORDER_BY_ID:
          serviceImpl.getCreditLimitOrderByID((to.bnk.api.customer.GetCreditLimitOrderByIDRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCreditLimitOrderByIDResponse>) responseObserver);
          break;
        case METHODID_GET_CREDIT_LIMIT_ORDER:
          serviceImpl.getCreditLimitOrder((to.bnk.api.customer.GetCreditLimitOrderRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCreditLimitOrderResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_ADDRESSES:
          serviceImpl.getCustomerAddresses((to.bnk.api.customer.GetCustomerAddressesRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomerAddressesResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_SOCIAL_MEDIA_HANDLES:
          serviceImpl.getCustomerSocialMediaHandles((to.bnk.api.customer.GetCustomerSocialMediaHandlesRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomerSocialMediaHandlesResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_CUSTOMER_ID:
          serviceImpl.getCustomerByCustomerID((to.bnk.api.customer.GetCustomerByCustomerIDRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.Customer>) responseObserver);
          break;
        case METHODID_GET_CUSTOMER_BY_CUSTOMER_NUMBER:
          serviceImpl.getCustomerByCustomerNumber((to.bnk.api.customer.GetCustomerByCustomerNumberRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.Customer>) responseObserver);
          break;
        case METHODID_GET_CUSTOMERS_FOR_CURRENT_USER:
          serviceImpl.getCustomersForCurrentUser((to.bnk.api.customer.GetCustomersForCurrentUserRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomersForCurrentUserResponse>) responseObserver);
          break;
        case METHODID_GET_CUSTOMERS_FOR_CURRENT_USER_AT_BANK:
          serviceImpl.getCustomersForCurrentUserAtBank((to.bnk.api.customer.GetCustomersForCurrentUserAtBankRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetCustomersForCurrentUserAtBankResponse>) responseObserver);
          break;
        case METHODID_GET_FIREHOSE_CUSTOMER:
          serviceImpl.getFirehoseCustomer((to.bnk.api.customer.GetFirehoseCustomerRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetFirehoseCustomerResponse>) responseObserver);
          break;
        case METHODID_GET_TAX_RESIDENCE_OF_CUSTOMER:
          serviceImpl.getTaxResidenceOfCustomer((to.bnk.api.customer.GetTaxResidenceOfCustomerRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.customer.GetTaxResidenceOfCustomerResponse>) responseObserver);
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
      synchronized (CustomerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAddAddressToCustomerMethod())
              .addMethod(getAddSocialMediaHandleMethod())
              .addMethod(getCreateCustomerMethod())
              .addMethod(getCreateCreditLimitOrderMethod())
              .addMethod(getCreateUserCustomerLinkMethod())
              .addMethod(getDeleteCustomerAddressMethod())
              .addMethod(getDeleteTaxResidenceMethod())
              .addMethod(getGetCRMEventsMethod())
              .addMethod(getGetCreditLimitOrderByIDMethod())
              .addMethod(getGetCreditLimitOrderMethod())
              .addMethod(getGetCustomerAddressesMethod())
              .addMethod(getGetCustomerSocialMediaHandlesMethod())
              .addMethod(getGetCustomerByCustomerIDMethod())
              .addMethod(getGetCustomerByCustomerNumberMethod())
              .addMethod(getGetCustomersForCurrentUserMethod())
              .addMethod(getGetCustomersForCurrentUserAtBankMethod())
              .addMethod(getGetFirehoseCustomerMethod())
              .addMethod(getGetTaxResidenceOfCustomerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
