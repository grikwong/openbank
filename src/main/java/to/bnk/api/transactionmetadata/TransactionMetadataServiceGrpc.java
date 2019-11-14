package to.bnk.api.transactionmetadata;

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
public final class TransactionMetadataServiceGrpc {

  private TransactionMetadataServiceGrpc() {}

  public static final String SERVICE_NAME = "transactionmetadata.TransactionMetadataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateTagRequest,
      to.bnk.api.transactionmetadata.Tag> getCreateTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTag",
      requestType = to.bnk.api.transactionmetadata.CreateTagRequest.class,
      responseType = to.bnk.api.transactionmetadata.Tag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateTagRequest,
      to.bnk.api.transactionmetadata.Tag> getCreateTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateTagRequest, to.bnk.api.transactionmetadata.Tag> getCreateTagMethod;
    if ((getCreateTagMethod = TransactionMetadataServiceGrpc.getCreateTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getCreateTagMethod = TransactionMetadataServiceGrpc.getCreateTagMethod) == null) {
          TransactionMetadataServiceGrpc.getCreateTagMethod = getCreateTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.CreateTagRequest, to.bnk.api.transactionmetadata.Tag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.CreateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Tag.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetTagRequest,
      to.bnk.api.transactionmetadata.Tag> getGetTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTag",
      requestType = to.bnk.api.transactionmetadata.GetTagRequest.class,
      responseType = to.bnk.api.transactionmetadata.Tag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetTagRequest,
      to.bnk.api.transactionmetadata.Tag> getGetTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetTagRequest, to.bnk.api.transactionmetadata.Tag> getGetTagMethod;
    if ((getGetTagMethod = TransactionMetadataServiceGrpc.getGetTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetTagMethod = TransactionMetadataServiceGrpc.getGetTagMethod) == null) {
          TransactionMetadataServiceGrpc.getGetTagMethod = getGetTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetTagRequest, to.bnk.api.transactionmetadata.Tag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Tag.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetTagsRequest,
      to.bnk.api.transactionmetadata.GetTagsResponse> getGetTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTags",
      requestType = to.bnk.api.transactionmetadata.GetTagsRequest.class,
      responseType = to.bnk.api.transactionmetadata.GetTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetTagsRequest,
      to.bnk.api.transactionmetadata.GetTagsResponse> getGetTagsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetTagsRequest, to.bnk.api.transactionmetadata.GetTagsResponse> getGetTagsMethod;
    if ((getGetTagsMethod = TransactionMetadataServiceGrpc.getGetTagsMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetTagsMethod = TransactionMetadataServiceGrpc.getGetTagsMethod) == null) {
          TransactionMetadataServiceGrpc.getGetTagsMethod = getGetTagsMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetTagsRequest, to.bnk.api.transactionmetadata.GetTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetTagsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateTagRequest,
      to.bnk.api.transactionmetadata.Tag> getUpdateTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTag",
      requestType = to.bnk.api.transactionmetadata.UpdateTagRequest.class,
      responseType = to.bnk.api.transactionmetadata.Tag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateTagRequest,
      to.bnk.api.transactionmetadata.Tag> getUpdateTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateTagRequest, to.bnk.api.transactionmetadata.Tag> getUpdateTagMethod;
    if ((getUpdateTagMethod = TransactionMetadataServiceGrpc.getUpdateTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getUpdateTagMethod = TransactionMetadataServiceGrpc.getUpdateTagMethod) == null) {
          TransactionMetadataServiceGrpc.getUpdateTagMethod = getUpdateTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.UpdateTagRequest, to.bnk.api.transactionmetadata.Tag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.UpdateTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Tag.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteTagRequest,
      com.google.protobuf.Empty> getDeleteTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTag",
      requestType = to.bnk.api.transactionmetadata.DeleteTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteTagRequest,
      com.google.protobuf.Empty> getDeleteTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteTagRequest, com.google.protobuf.Empty> getDeleteTagMethod;
    if ((getDeleteTagMethod = TransactionMetadataServiceGrpc.getDeleteTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getDeleteTagMethod = TransactionMetadataServiceGrpc.getDeleteTagMethod) == null) {
          TransactionMetadataServiceGrpc.getDeleteTagMethod = getDeleteTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.DeleteTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.DeleteTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateImageRequest,
      to.bnk.api.transactionmetadata.Image> getCreateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateImage",
      requestType = to.bnk.api.transactionmetadata.CreateImageRequest.class,
      responseType = to.bnk.api.transactionmetadata.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateImageRequest,
      to.bnk.api.transactionmetadata.Image> getCreateImageMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateImageRequest, to.bnk.api.transactionmetadata.Image> getCreateImageMethod;
    if ((getCreateImageMethod = TransactionMetadataServiceGrpc.getCreateImageMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getCreateImageMethod = TransactionMetadataServiceGrpc.getCreateImageMethod) == null) {
          TransactionMetadataServiceGrpc.getCreateImageMethod = getCreateImageMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.CreateImageRequest, to.bnk.api.transactionmetadata.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.CreateImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Image.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetImageRequest,
      to.bnk.api.transactionmetadata.Image> getGetImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImage",
      requestType = to.bnk.api.transactionmetadata.GetImageRequest.class,
      responseType = to.bnk.api.transactionmetadata.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetImageRequest,
      to.bnk.api.transactionmetadata.Image> getGetImageMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetImageRequest, to.bnk.api.transactionmetadata.Image> getGetImageMethod;
    if ((getGetImageMethod = TransactionMetadataServiceGrpc.getGetImageMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetImageMethod = TransactionMetadataServiceGrpc.getGetImageMethod) == null) {
          TransactionMetadataServiceGrpc.getGetImageMethod = getGetImageMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetImageRequest, to.bnk.api.transactionmetadata.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Image.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetImagesRequest,
      to.bnk.api.transactionmetadata.GetImagesResponse> getGetImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetImages",
      requestType = to.bnk.api.transactionmetadata.GetImagesRequest.class,
      responseType = to.bnk.api.transactionmetadata.GetImagesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetImagesRequest,
      to.bnk.api.transactionmetadata.GetImagesResponse> getGetImagesMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetImagesRequest, to.bnk.api.transactionmetadata.GetImagesResponse> getGetImagesMethod;
    if ((getGetImagesMethod = TransactionMetadataServiceGrpc.getGetImagesMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetImagesMethod = TransactionMetadataServiceGrpc.getGetImagesMethod) == null) {
          TransactionMetadataServiceGrpc.getGetImagesMethod = getGetImagesMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetImagesRequest, to.bnk.api.transactionmetadata.GetImagesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetImagesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetImagesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateImageRequest,
      to.bnk.api.transactionmetadata.Image> getUpdateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateImage",
      requestType = to.bnk.api.transactionmetadata.UpdateImageRequest.class,
      responseType = to.bnk.api.transactionmetadata.Image.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateImageRequest,
      to.bnk.api.transactionmetadata.Image> getUpdateImageMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateImageRequest, to.bnk.api.transactionmetadata.Image> getUpdateImageMethod;
    if ((getUpdateImageMethod = TransactionMetadataServiceGrpc.getUpdateImageMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getUpdateImageMethod = TransactionMetadataServiceGrpc.getUpdateImageMethod) == null) {
          TransactionMetadataServiceGrpc.getUpdateImageMethod = getUpdateImageMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.UpdateImageRequest, to.bnk.api.transactionmetadata.Image>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.UpdateImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Image.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteImageRequest,
      com.google.protobuf.Empty> getDeleteImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteImage",
      requestType = to.bnk.api.transactionmetadata.DeleteImageRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteImageRequest,
      com.google.protobuf.Empty> getDeleteImageMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteImageRequest, com.google.protobuf.Empty> getDeleteImageMethod;
    if ((getDeleteImageMethod = TransactionMetadataServiceGrpc.getDeleteImageMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getDeleteImageMethod = TransactionMetadataServiceGrpc.getDeleteImageMethod) == null) {
          TransactionMetadataServiceGrpc.getDeleteImageMethod = getDeleteImageMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.DeleteImageRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.DeleteImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateCommentRequest,
      to.bnk.api.transactionmetadata.Comment> getCreateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateComment",
      requestType = to.bnk.api.transactionmetadata.CreateCommentRequest.class,
      responseType = to.bnk.api.transactionmetadata.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateCommentRequest,
      to.bnk.api.transactionmetadata.Comment> getCreateCommentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateCommentRequest, to.bnk.api.transactionmetadata.Comment> getCreateCommentMethod;
    if ((getCreateCommentMethod = TransactionMetadataServiceGrpc.getCreateCommentMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getCreateCommentMethod = TransactionMetadataServiceGrpc.getCreateCommentMethod) == null) {
          TransactionMetadataServiceGrpc.getCreateCommentMethod = getCreateCommentMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.CreateCommentRequest, to.bnk.api.transactionmetadata.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.CreateCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Comment.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetCommentRequest,
      to.bnk.api.transactionmetadata.Comment> getGetCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComment",
      requestType = to.bnk.api.transactionmetadata.GetCommentRequest.class,
      responseType = to.bnk.api.transactionmetadata.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetCommentRequest,
      to.bnk.api.transactionmetadata.Comment> getGetCommentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetCommentRequest, to.bnk.api.transactionmetadata.Comment> getGetCommentMethod;
    if ((getGetCommentMethod = TransactionMetadataServiceGrpc.getGetCommentMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetCommentMethod = TransactionMetadataServiceGrpc.getGetCommentMethod) == null) {
          TransactionMetadataServiceGrpc.getGetCommentMethod = getGetCommentMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetCommentRequest, to.bnk.api.transactionmetadata.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Comment.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetCommentsRequest,
      to.bnk.api.transactionmetadata.GetCommentsResponse> getGetCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetComments",
      requestType = to.bnk.api.transactionmetadata.GetCommentsRequest.class,
      responseType = to.bnk.api.transactionmetadata.GetCommentsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetCommentsRequest,
      to.bnk.api.transactionmetadata.GetCommentsResponse> getGetCommentsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetCommentsRequest, to.bnk.api.transactionmetadata.GetCommentsResponse> getGetCommentsMethod;
    if ((getGetCommentsMethod = TransactionMetadataServiceGrpc.getGetCommentsMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetCommentsMethod = TransactionMetadataServiceGrpc.getGetCommentsMethod) == null) {
          TransactionMetadataServiceGrpc.getGetCommentsMethod = getGetCommentsMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetCommentsRequest, to.bnk.api.transactionmetadata.GetCommentsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetCommentsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetCommentsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateCommentRequest,
      to.bnk.api.transactionmetadata.Comment> getUpdateCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateComment",
      requestType = to.bnk.api.transactionmetadata.UpdateCommentRequest.class,
      responseType = to.bnk.api.transactionmetadata.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateCommentRequest,
      to.bnk.api.transactionmetadata.Comment> getUpdateCommentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateCommentRequest, to.bnk.api.transactionmetadata.Comment> getUpdateCommentMethod;
    if ((getUpdateCommentMethod = TransactionMetadataServiceGrpc.getUpdateCommentMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getUpdateCommentMethod = TransactionMetadataServiceGrpc.getUpdateCommentMethod) == null) {
          TransactionMetadataServiceGrpc.getUpdateCommentMethod = getUpdateCommentMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.UpdateCommentRequest, to.bnk.api.transactionmetadata.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.UpdateCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Comment.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteCommentRequest,
      com.google.protobuf.Empty> getDeleteCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteComment",
      requestType = to.bnk.api.transactionmetadata.DeleteCommentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteCommentRequest,
      com.google.protobuf.Empty> getDeleteCommentMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteCommentRequest, com.google.protobuf.Empty> getDeleteCommentMethod;
    if ((getDeleteCommentMethod = TransactionMetadataServiceGrpc.getDeleteCommentMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getDeleteCommentMethod = TransactionMetadataServiceGrpc.getDeleteCommentMethod) == null) {
          TransactionMetadataServiceGrpc.getDeleteCommentMethod = getDeleteCommentMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.DeleteCommentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.DeleteCommentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateNarrativeRequest,
      to.bnk.api.transactionmetadata.Narrative> getCreateNarrativeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNarrative",
      requestType = to.bnk.api.transactionmetadata.CreateNarrativeRequest.class,
      responseType = to.bnk.api.transactionmetadata.Narrative.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateNarrativeRequest,
      to.bnk.api.transactionmetadata.Narrative> getCreateNarrativeMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateNarrativeRequest, to.bnk.api.transactionmetadata.Narrative> getCreateNarrativeMethod;
    if ((getCreateNarrativeMethod = TransactionMetadataServiceGrpc.getCreateNarrativeMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getCreateNarrativeMethod = TransactionMetadataServiceGrpc.getCreateNarrativeMethod) == null) {
          TransactionMetadataServiceGrpc.getCreateNarrativeMethod = getCreateNarrativeMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.CreateNarrativeRequest, to.bnk.api.transactionmetadata.Narrative>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNarrative"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.CreateNarrativeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Narrative.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateNarrativeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetNarrativeRequest,
      to.bnk.api.transactionmetadata.Narrative> getGetNarrativeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNarrative",
      requestType = to.bnk.api.transactionmetadata.GetNarrativeRequest.class,
      responseType = to.bnk.api.transactionmetadata.Narrative.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetNarrativeRequest,
      to.bnk.api.transactionmetadata.Narrative> getGetNarrativeMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetNarrativeRequest, to.bnk.api.transactionmetadata.Narrative> getGetNarrativeMethod;
    if ((getGetNarrativeMethod = TransactionMetadataServiceGrpc.getGetNarrativeMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetNarrativeMethod = TransactionMetadataServiceGrpc.getGetNarrativeMethod) == null) {
          TransactionMetadataServiceGrpc.getGetNarrativeMethod = getGetNarrativeMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetNarrativeRequest, to.bnk.api.transactionmetadata.Narrative>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNarrative"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetNarrativeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Narrative.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetNarrativeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetNarrativesRequest,
      to.bnk.api.transactionmetadata.GetNarrativesResponse> getGetNarrativesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNarratives",
      requestType = to.bnk.api.transactionmetadata.GetNarrativesRequest.class,
      responseType = to.bnk.api.transactionmetadata.GetNarrativesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetNarrativesRequest,
      to.bnk.api.transactionmetadata.GetNarrativesResponse> getGetNarrativesMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetNarrativesRequest, to.bnk.api.transactionmetadata.GetNarrativesResponse> getGetNarrativesMethod;
    if ((getGetNarrativesMethod = TransactionMetadataServiceGrpc.getGetNarrativesMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetNarrativesMethod = TransactionMetadataServiceGrpc.getGetNarrativesMethod) == null) {
          TransactionMetadataServiceGrpc.getGetNarrativesMethod = getGetNarrativesMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetNarrativesRequest, to.bnk.api.transactionmetadata.GetNarrativesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNarratives"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetNarrativesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetNarrativesResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetNarrativesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateNarrativeRequest,
      to.bnk.api.transactionmetadata.Narrative> getUpdateNarrativeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNarrative",
      requestType = to.bnk.api.transactionmetadata.UpdateNarrativeRequest.class,
      responseType = to.bnk.api.transactionmetadata.Narrative.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateNarrativeRequest,
      to.bnk.api.transactionmetadata.Narrative> getUpdateNarrativeMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateNarrativeRequest, to.bnk.api.transactionmetadata.Narrative> getUpdateNarrativeMethod;
    if ((getUpdateNarrativeMethod = TransactionMetadataServiceGrpc.getUpdateNarrativeMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getUpdateNarrativeMethod = TransactionMetadataServiceGrpc.getUpdateNarrativeMethod) == null) {
          TransactionMetadataServiceGrpc.getUpdateNarrativeMethod = getUpdateNarrativeMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.UpdateNarrativeRequest, to.bnk.api.transactionmetadata.Narrative>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNarrative"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.UpdateNarrativeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.Narrative.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateNarrativeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteNarrativeRequest,
      com.google.protobuf.Empty> getDeleteNarrativeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNarrative",
      requestType = to.bnk.api.transactionmetadata.DeleteNarrativeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteNarrativeRequest,
      com.google.protobuf.Empty> getDeleteNarrativeMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteNarrativeRequest, com.google.protobuf.Empty> getDeleteNarrativeMethod;
    if ((getDeleteNarrativeMethod = TransactionMetadataServiceGrpc.getDeleteNarrativeMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getDeleteNarrativeMethod = TransactionMetadataServiceGrpc.getDeleteNarrativeMethod) == null) {
          TransactionMetadataServiceGrpc.getDeleteNarrativeMethod = getDeleteNarrativeMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.DeleteNarrativeRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNarrative"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.DeleteNarrativeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteNarrativeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateWhereTagRequest,
      to.bnk.api.transactionmetadata.WhereTag> getCreateWhereTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWhereTag",
      requestType = to.bnk.api.transactionmetadata.CreateWhereTagRequest.class,
      responseType = to.bnk.api.transactionmetadata.WhereTag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateWhereTagRequest,
      to.bnk.api.transactionmetadata.WhereTag> getCreateWhereTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.CreateWhereTagRequest, to.bnk.api.transactionmetadata.WhereTag> getCreateWhereTagMethod;
    if ((getCreateWhereTagMethod = TransactionMetadataServiceGrpc.getCreateWhereTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getCreateWhereTagMethod = TransactionMetadataServiceGrpc.getCreateWhereTagMethod) == null) {
          TransactionMetadataServiceGrpc.getCreateWhereTagMethod = getCreateWhereTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.CreateWhereTagRequest, to.bnk.api.transactionmetadata.WhereTag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWhereTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.CreateWhereTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.WhereTag.getDefaultInstance()))
              .build();
        }
      }
    }
    return getCreateWhereTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetWhereTagRequest,
      to.bnk.api.transactionmetadata.WhereTag> getGetWhereTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWhereTag",
      requestType = to.bnk.api.transactionmetadata.GetWhereTagRequest.class,
      responseType = to.bnk.api.transactionmetadata.WhereTag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetWhereTagRequest,
      to.bnk.api.transactionmetadata.WhereTag> getGetWhereTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetWhereTagRequest, to.bnk.api.transactionmetadata.WhereTag> getGetWhereTagMethod;
    if ((getGetWhereTagMethod = TransactionMetadataServiceGrpc.getGetWhereTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetWhereTagMethod = TransactionMetadataServiceGrpc.getGetWhereTagMethod) == null) {
          TransactionMetadataServiceGrpc.getGetWhereTagMethod = getGetWhereTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetWhereTagRequest, to.bnk.api.transactionmetadata.WhereTag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWhereTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetWhereTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.WhereTag.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetWhereTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetWhereTagsRequest,
      to.bnk.api.transactionmetadata.GetWhereTagsResponse> getGetWhereTagsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWhereTags",
      requestType = to.bnk.api.transactionmetadata.GetWhereTagsRequest.class,
      responseType = to.bnk.api.transactionmetadata.GetWhereTagsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetWhereTagsRequest,
      to.bnk.api.transactionmetadata.GetWhereTagsResponse> getGetWhereTagsMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.GetWhereTagsRequest, to.bnk.api.transactionmetadata.GetWhereTagsResponse> getGetWhereTagsMethod;
    if ((getGetWhereTagsMethod = TransactionMetadataServiceGrpc.getGetWhereTagsMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getGetWhereTagsMethod = TransactionMetadataServiceGrpc.getGetWhereTagsMethod) == null) {
          TransactionMetadataServiceGrpc.getGetWhereTagsMethod = getGetWhereTagsMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.GetWhereTagsRequest, to.bnk.api.transactionmetadata.GetWhereTagsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWhereTags"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetWhereTagsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.GetWhereTagsResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetWhereTagsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateWhereTagRequest,
      to.bnk.api.transactionmetadata.WhereTag> getUpdateWhereTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWhereTag",
      requestType = to.bnk.api.transactionmetadata.UpdateWhereTagRequest.class,
      responseType = to.bnk.api.transactionmetadata.WhereTag.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateWhereTagRequest,
      to.bnk.api.transactionmetadata.WhereTag> getUpdateWhereTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.UpdateWhereTagRequest, to.bnk.api.transactionmetadata.WhereTag> getUpdateWhereTagMethod;
    if ((getUpdateWhereTagMethod = TransactionMetadataServiceGrpc.getUpdateWhereTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getUpdateWhereTagMethod = TransactionMetadataServiceGrpc.getUpdateWhereTagMethod) == null) {
          TransactionMetadataServiceGrpc.getUpdateWhereTagMethod = getUpdateWhereTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.UpdateWhereTagRequest, to.bnk.api.transactionmetadata.WhereTag>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWhereTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.UpdateWhereTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.WhereTag.getDefaultInstance()))
              .build();
        }
      }
    }
    return getUpdateWhereTagMethod;
  }

  private static volatile io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteWhereTagRequest,
      com.google.protobuf.Empty> getDeleteWhereTagMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWhereTag",
      requestType = to.bnk.api.transactionmetadata.DeleteWhereTagRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteWhereTagRequest,
      com.google.protobuf.Empty> getDeleteWhereTagMethod() {
    io.grpc.MethodDescriptor<to.bnk.api.transactionmetadata.DeleteWhereTagRequest, com.google.protobuf.Empty> getDeleteWhereTagMethod;
    if ((getDeleteWhereTagMethod = TransactionMetadataServiceGrpc.getDeleteWhereTagMethod) == null) {
      synchronized (TransactionMetadataServiceGrpc.class) {
        if ((getDeleteWhereTagMethod = TransactionMetadataServiceGrpc.getDeleteWhereTagMethod) == null) {
          TransactionMetadataServiceGrpc.getDeleteWhereTagMethod = getDeleteWhereTagMethod =
              io.grpc.MethodDescriptor.<to.bnk.api.transactionmetadata.DeleteWhereTagRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWhereTag"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  to.bnk.api.transactionmetadata.DeleteWhereTagRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDeleteWhereTagMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TransactionMetadataServiceStub newStub(io.grpc.Channel channel) {
    return new TransactionMetadataServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TransactionMetadataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TransactionMetadataServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TransactionMetadataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TransactionMetadataServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TransactionMetadataServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTag(to.bnk.api.transactionmetadata.CreateTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTagMethod(), responseObserver);
    }

    /**
     */
    public void getTag(to.bnk.api.transactionmetadata.GetTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTagMethod(), responseObserver);
    }

    /**
     */
    public void getTags(to.bnk.api.transactionmetadata.GetTagsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetTagsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTagsMethod(), responseObserver);
    }

    /**
     */
    public void updateTag(to.bnk.api.transactionmetadata.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTagMethod(), responseObserver);
    }

    /**
     */
    public void deleteTag(to.bnk.api.transactionmetadata.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTagMethod(), responseObserver);
    }

    /**
     */
    public void createImage(to.bnk.api.transactionmetadata.CreateImageRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateImageMethod(), responseObserver);
    }

    /**
     */
    public void getImage(to.bnk.api.transactionmetadata.GetImageRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImageMethod(), responseObserver);
    }

    /**
     */
    public void getImages(to.bnk.api.transactionmetadata.GetImagesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetImagesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetImagesMethod(), responseObserver);
    }

    /**
     */
    public void updateImage(to.bnk.api.transactionmetadata.UpdateImageRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateImageMethod(), responseObserver);
    }

    /**
     */
    public void deleteImage(to.bnk.api.transactionmetadata.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteImageMethod(), responseObserver);
    }

    /**
     */
    public void createComment(to.bnk.api.transactionmetadata.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCommentMethod(), responseObserver);
    }

    /**
     */
    public void getComment(to.bnk.api.transactionmetadata.GetCommentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCommentMethod(), responseObserver);
    }

    /**
     */
    public void getComments(to.bnk.api.transactionmetadata.GetCommentsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetCommentsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCommentsMethod(), responseObserver);
    }

    /**
     */
    public void updateComment(to.bnk.api.transactionmetadata.UpdateCommentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCommentMethod(), responseObserver);
    }

    /**
     */
    public void deleteComment(to.bnk.api.transactionmetadata.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCommentMethod(), responseObserver);
    }

    /**
     */
    public void createNarrative(to.bnk.api.transactionmetadata.CreateNarrativeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNarrativeMethod(), responseObserver);
    }

    /**
     */
    public void getNarrative(to.bnk.api.transactionmetadata.GetNarrativeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNarrativeMethod(), responseObserver);
    }

    /**
     */
    public void getNarratives(to.bnk.api.transactionmetadata.GetNarrativesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetNarrativesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNarrativesMethod(), responseObserver);
    }

    /**
     */
    public void updateNarrative(to.bnk.api.transactionmetadata.UpdateNarrativeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNarrativeMethod(), responseObserver);
    }

    /**
     */
    public void deleteNarrative(to.bnk.api.transactionmetadata.DeleteNarrativeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNarrativeMethod(), responseObserver);
    }

    /**
     */
    public void createWhereTag(to.bnk.api.transactionmetadata.CreateWhereTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateWhereTagMethod(), responseObserver);
    }

    /**
     */
    public void getWhereTag(to.bnk.api.transactionmetadata.GetWhereTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWhereTagMethod(), responseObserver);
    }

    /**
     */
    public void getWhereTags(to.bnk.api.transactionmetadata.GetWhereTagsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetWhereTagsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWhereTagsMethod(), responseObserver);
    }

    /**
     */
    public void updateWhereTag(to.bnk.api.transactionmetadata.UpdateWhereTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateWhereTagMethod(), responseObserver);
    }

    /**
     */
    public void deleteWhereTag(to.bnk.api.transactionmetadata.DeleteWhereTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteWhereTagMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.CreateTagRequest,
                to.bnk.api.transactionmetadata.Tag>(
                  this, METHODID_CREATE_TAG)))
          .addMethod(
            getGetTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetTagRequest,
                to.bnk.api.transactionmetadata.Tag>(
                  this, METHODID_GET_TAG)))
          .addMethod(
            getGetTagsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetTagsRequest,
                to.bnk.api.transactionmetadata.GetTagsResponse>(
                  this, METHODID_GET_TAGS)))
          .addMethod(
            getUpdateTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.UpdateTagRequest,
                to.bnk.api.transactionmetadata.Tag>(
                  this, METHODID_UPDATE_TAG)))
          .addMethod(
            getDeleteTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.DeleteTagRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TAG)))
          .addMethod(
            getCreateImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.CreateImageRequest,
                to.bnk.api.transactionmetadata.Image>(
                  this, METHODID_CREATE_IMAGE)))
          .addMethod(
            getGetImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetImageRequest,
                to.bnk.api.transactionmetadata.Image>(
                  this, METHODID_GET_IMAGE)))
          .addMethod(
            getGetImagesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetImagesRequest,
                to.bnk.api.transactionmetadata.GetImagesResponse>(
                  this, METHODID_GET_IMAGES)))
          .addMethod(
            getUpdateImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.UpdateImageRequest,
                to.bnk.api.transactionmetadata.Image>(
                  this, METHODID_UPDATE_IMAGE)))
          .addMethod(
            getDeleteImageMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.DeleteImageRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_IMAGE)))
          .addMethod(
            getCreateCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.CreateCommentRequest,
                to.bnk.api.transactionmetadata.Comment>(
                  this, METHODID_CREATE_COMMENT)))
          .addMethod(
            getGetCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetCommentRequest,
                to.bnk.api.transactionmetadata.Comment>(
                  this, METHODID_GET_COMMENT)))
          .addMethod(
            getGetCommentsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetCommentsRequest,
                to.bnk.api.transactionmetadata.GetCommentsResponse>(
                  this, METHODID_GET_COMMENTS)))
          .addMethod(
            getUpdateCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.UpdateCommentRequest,
                to.bnk.api.transactionmetadata.Comment>(
                  this, METHODID_UPDATE_COMMENT)))
          .addMethod(
            getDeleteCommentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.DeleteCommentRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COMMENT)))
          .addMethod(
            getCreateNarrativeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.CreateNarrativeRequest,
                to.bnk.api.transactionmetadata.Narrative>(
                  this, METHODID_CREATE_NARRATIVE)))
          .addMethod(
            getGetNarrativeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetNarrativeRequest,
                to.bnk.api.transactionmetadata.Narrative>(
                  this, METHODID_GET_NARRATIVE)))
          .addMethod(
            getGetNarrativesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetNarrativesRequest,
                to.bnk.api.transactionmetadata.GetNarrativesResponse>(
                  this, METHODID_GET_NARRATIVES)))
          .addMethod(
            getUpdateNarrativeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.UpdateNarrativeRequest,
                to.bnk.api.transactionmetadata.Narrative>(
                  this, METHODID_UPDATE_NARRATIVE)))
          .addMethod(
            getDeleteNarrativeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.DeleteNarrativeRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_NARRATIVE)))
          .addMethod(
            getCreateWhereTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.CreateWhereTagRequest,
                to.bnk.api.transactionmetadata.WhereTag>(
                  this, METHODID_CREATE_WHERE_TAG)))
          .addMethod(
            getGetWhereTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetWhereTagRequest,
                to.bnk.api.transactionmetadata.WhereTag>(
                  this, METHODID_GET_WHERE_TAG)))
          .addMethod(
            getGetWhereTagsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.GetWhereTagsRequest,
                to.bnk.api.transactionmetadata.GetWhereTagsResponse>(
                  this, METHODID_GET_WHERE_TAGS)))
          .addMethod(
            getUpdateWhereTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.UpdateWhereTagRequest,
                to.bnk.api.transactionmetadata.WhereTag>(
                  this, METHODID_UPDATE_WHERE_TAG)))
          .addMethod(
            getDeleteWhereTagMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                to.bnk.api.transactionmetadata.DeleteWhereTagRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_WHERE_TAG)))
          .build();
    }
  }

  /**
   */
  public static final class TransactionMetadataServiceStub extends io.grpc.stub.AbstractStub<TransactionMetadataServiceStub> {
    private TransactionMetadataServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionMetadataServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionMetadataServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionMetadataServiceStub(channel, callOptions);
    }

    /**
     */
    public void createTag(to.bnk.api.transactionmetadata.CreateTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTag(to.bnk.api.transactionmetadata.GetTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTags(to.bnk.api.transactionmetadata.GetTagsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetTagsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTag(to.bnk.api.transactionmetadata.UpdateTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTag(to.bnk.api.transactionmetadata.DeleteTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createImage(to.bnk.api.transactionmetadata.CreateImageRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImage(to.bnk.api.transactionmetadata.GetImageRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImages(to.bnk.api.transactionmetadata.GetImagesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetImagesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateImage(to.bnk.api.transactionmetadata.UpdateImageRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteImage(to.bnk.api.transactionmetadata.DeleteImageRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createComment(to.bnk.api.transactionmetadata.CreateCommentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComment(to.bnk.api.transactionmetadata.GetCommentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getComments(to.bnk.api.transactionmetadata.GetCommentsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetCommentsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateComment(to.bnk.api.transactionmetadata.UpdateCommentRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteComment(to.bnk.api.transactionmetadata.DeleteCommentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNarrative(to.bnk.api.transactionmetadata.CreateNarrativeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNarrativeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNarrative(to.bnk.api.transactionmetadata.GetNarrativeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNarrativeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNarratives(to.bnk.api.transactionmetadata.GetNarrativesRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetNarrativesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNarrativesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNarrative(to.bnk.api.transactionmetadata.UpdateNarrativeRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNarrativeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNarrative(to.bnk.api.transactionmetadata.DeleteNarrativeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNarrativeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWhereTag(to.bnk.api.transactionmetadata.CreateWhereTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateWhereTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWhereTag(to.bnk.api.transactionmetadata.GetWhereTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWhereTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getWhereTags(to.bnk.api.transactionmetadata.GetWhereTagsRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetWhereTagsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWhereTagsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWhereTag(to.bnk.api.transactionmetadata.UpdateWhereTagRequest request,
        io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateWhereTagMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteWhereTag(to.bnk.api.transactionmetadata.DeleteWhereTagRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteWhereTagMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TransactionMetadataServiceBlockingStub extends io.grpc.stub.AbstractStub<TransactionMetadataServiceBlockingStub> {
    private TransactionMetadataServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionMetadataServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionMetadataServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionMetadataServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Tag createTag(to.bnk.api.transactionmetadata.CreateTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Tag getTag(to.bnk.api.transactionmetadata.GetTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.GetTagsResponse getTags(to.bnk.api.transactionmetadata.GetTagsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Tag updateTag(to.bnk.api.transactionmetadata.UpdateTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTag(to.bnk.api.transactionmetadata.DeleteTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Image createImage(to.bnk.api.transactionmetadata.CreateImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Image getImage(to.bnk.api.transactionmetadata.GetImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.GetImagesResponse getImages(to.bnk.api.transactionmetadata.GetImagesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetImagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Image updateImage(to.bnk.api.transactionmetadata.UpdateImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteImage(to.bnk.api.transactionmetadata.DeleteImageRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Comment createComment(to.bnk.api.transactionmetadata.CreateCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Comment getComment(to.bnk.api.transactionmetadata.GetCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.GetCommentsResponse getComments(to.bnk.api.transactionmetadata.GetCommentsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCommentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Comment updateComment(to.bnk.api.transactionmetadata.UpdateCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteComment(to.bnk.api.transactionmetadata.DeleteCommentRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Narrative createNarrative(to.bnk.api.transactionmetadata.CreateNarrativeRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateNarrativeMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Narrative getNarrative(to.bnk.api.transactionmetadata.GetNarrativeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNarrativeMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.GetNarrativesResponse getNarratives(to.bnk.api.transactionmetadata.GetNarrativesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNarrativesMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.Narrative updateNarrative(to.bnk.api.transactionmetadata.UpdateNarrativeRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNarrativeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteNarrative(to.bnk.api.transactionmetadata.DeleteNarrativeRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNarrativeMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.WhereTag createWhereTag(to.bnk.api.transactionmetadata.CreateWhereTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateWhereTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.WhereTag getWhereTag(to.bnk.api.transactionmetadata.GetWhereTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWhereTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.GetWhereTagsResponse getWhereTags(to.bnk.api.transactionmetadata.GetWhereTagsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWhereTagsMethod(), getCallOptions(), request);
    }

    /**
     */
    public to.bnk.api.transactionmetadata.WhereTag updateWhereTag(to.bnk.api.transactionmetadata.UpdateWhereTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateWhereTagMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteWhereTag(to.bnk.api.transactionmetadata.DeleteWhereTagRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteWhereTagMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TransactionMetadataServiceFutureStub extends io.grpc.stub.AbstractStub<TransactionMetadataServiceFutureStub> {
    private TransactionMetadataServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TransactionMetadataServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TransactionMetadataServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TransactionMetadataServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Tag> createTag(
        to.bnk.api.transactionmetadata.CreateTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Tag> getTag(
        to.bnk.api.transactionmetadata.GetTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.GetTagsResponse> getTags(
        to.bnk.api.transactionmetadata.GetTagsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Tag> updateTag(
        to.bnk.api.transactionmetadata.UpdateTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTag(
        to.bnk.api.transactionmetadata.DeleteTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Image> createImage(
        to.bnk.api.transactionmetadata.CreateImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Image> getImage(
        to.bnk.api.transactionmetadata.GetImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.GetImagesResponse> getImages(
        to.bnk.api.transactionmetadata.GetImagesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetImagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Image> updateImage(
        to.bnk.api.transactionmetadata.UpdateImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteImage(
        to.bnk.api.transactionmetadata.DeleteImageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Comment> createComment(
        to.bnk.api.transactionmetadata.CreateCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Comment> getComment(
        to.bnk.api.transactionmetadata.GetCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.GetCommentsResponse> getComments(
        to.bnk.api.transactionmetadata.GetCommentsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCommentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Comment> updateComment(
        to.bnk.api.transactionmetadata.UpdateCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteComment(
        to.bnk.api.transactionmetadata.DeleteCommentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Narrative> createNarrative(
        to.bnk.api.transactionmetadata.CreateNarrativeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNarrativeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Narrative> getNarrative(
        to.bnk.api.transactionmetadata.GetNarrativeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNarrativeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.GetNarrativesResponse> getNarratives(
        to.bnk.api.transactionmetadata.GetNarrativesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNarrativesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.Narrative> updateNarrative(
        to.bnk.api.transactionmetadata.UpdateNarrativeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateNarrativeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteNarrative(
        to.bnk.api.transactionmetadata.DeleteNarrativeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNarrativeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.WhereTag> createWhereTag(
        to.bnk.api.transactionmetadata.CreateWhereTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateWhereTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.WhereTag> getWhereTag(
        to.bnk.api.transactionmetadata.GetWhereTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWhereTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.GetWhereTagsResponse> getWhereTags(
        to.bnk.api.transactionmetadata.GetWhereTagsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWhereTagsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<to.bnk.api.transactionmetadata.WhereTag> updateWhereTag(
        to.bnk.api.transactionmetadata.UpdateWhereTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateWhereTagMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteWhereTag(
        to.bnk.api.transactionmetadata.DeleteWhereTagRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteWhereTagMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TAG = 0;
  private static final int METHODID_GET_TAG = 1;
  private static final int METHODID_GET_TAGS = 2;
  private static final int METHODID_UPDATE_TAG = 3;
  private static final int METHODID_DELETE_TAG = 4;
  private static final int METHODID_CREATE_IMAGE = 5;
  private static final int METHODID_GET_IMAGE = 6;
  private static final int METHODID_GET_IMAGES = 7;
  private static final int METHODID_UPDATE_IMAGE = 8;
  private static final int METHODID_DELETE_IMAGE = 9;
  private static final int METHODID_CREATE_COMMENT = 10;
  private static final int METHODID_GET_COMMENT = 11;
  private static final int METHODID_GET_COMMENTS = 12;
  private static final int METHODID_UPDATE_COMMENT = 13;
  private static final int METHODID_DELETE_COMMENT = 14;
  private static final int METHODID_CREATE_NARRATIVE = 15;
  private static final int METHODID_GET_NARRATIVE = 16;
  private static final int METHODID_GET_NARRATIVES = 17;
  private static final int METHODID_UPDATE_NARRATIVE = 18;
  private static final int METHODID_DELETE_NARRATIVE = 19;
  private static final int METHODID_CREATE_WHERE_TAG = 20;
  private static final int METHODID_GET_WHERE_TAG = 21;
  private static final int METHODID_GET_WHERE_TAGS = 22;
  private static final int METHODID_UPDATE_WHERE_TAG = 23;
  private static final int METHODID_DELETE_WHERE_TAG = 24;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TransactionMetadataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TransactionMetadataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TAG:
          serviceImpl.createTag((to.bnk.api.transactionmetadata.CreateTagRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag>) responseObserver);
          break;
        case METHODID_GET_TAG:
          serviceImpl.getTag((to.bnk.api.transactionmetadata.GetTagRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag>) responseObserver);
          break;
        case METHODID_GET_TAGS:
          serviceImpl.getTags((to.bnk.api.transactionmetadata.GetTagsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetTagsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_TAG:
          serviceImpl.updateTag((to.bnk.api.transactionmetadata.UpdateTagRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Tag>) responseObserver);
          break;
        case METHODID_DELETE_TAG:
          serviceImpl.deleteTag((to.bnk.api.transactionmetadata.DeleteTagRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_IMAGE:
          serviceImpl.createImage((to.bnk.api.transactionmetadata.CreateImageRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image>) responseObserver);
          break;
        case METHODID_GET_IMAGE:
          serviceImpl.getImage((to.bnk.api.transactionmetadata.GetImageRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image>) responseObserver);
          break;
        case METHODID_GET_IMAGES:
          serviceImpl.getImages((to.bnk.api.transactionmetadata.GetImagesRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetImagesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_IMAGE:
          serviceImpl.updateImage((to.bnk.api.transactionmetadata.UpdateImageRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Image>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE:
          serviceImpl.deleteImage((to.bnk.api.transactionmetadata.DeleteImageRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_COMMENT:
          serviceImpl.createComment((to.bnk.api.transactionmetadata.CreateCommentRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment>) responseObserver);
          break;
        case METHODID_GET_COMMENT:
          serviceImpl.getComment((to.bnk.api.transactionmetadata.GetCommentRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment>) responseObserver);
          break;
        case METHODID_GET_COMMENTS:
          serviceImpl.getComments((to.bnk.api.transactionmetadata.GetCommentsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetCommentsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_COMMENT:
          serviceImpl.updateComment((to.bnk.api.transactionmetadata.UpdateCommentRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Comment>) responseObserver);
          break;
        case METHODID_DELETE_COMMENT:
          serviceImpl.deleteComment((to.bnk.api.transactionmetadata.DeleteCommentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_NARRATIVE:
          serviceImpl.createNarrative((to.bnk.api.transactionmetadata.CreateNarrativeRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative>) responseObserver);
          break;
        case METHODID_GET_NARRATIVE:
          serviceImpl.getNarrative((to.bnk.api.transactionmetadata.GetNarrativeRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative>) responseObserver);
          break;
        case METHODID_GET_NARRATIVES:
          serviceImpl.getNarratives((to.bnk.api.transactionmetadata.GetNarrativesRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetNarrativesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_NARRATIVE:
          serviceImpl.updateNarrative((to.bnk.api.transactionmetadata.UpdateNarrativeRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.Narrative>) responseObserver);
          break;
        case METHODID_DELETE_NARRATIVE:
          serviceImpl.deleteNarrative((to.bnk.api.transactionmetadata.DeleteNarrativeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_WHERE_TAG:
          serviceImpl.createWhereTag((to.bnk.api.transactionmetadata.CreateWhereTagRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag>) responseObserver);
          break;
        case METHODID_GET_WHERE_TAG:
          serviceImpl.getWhereTag((to.bnk.api.transactionmetadata.GetWhereTagRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag>) responseObserver);
          break;
        case METHODID_GET_WHERE_TAGS:
          serviceImpl.getWhereTags((to.bnk.api.transactionmetadata.GetWhereTagsRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.GetWhereTagsResponse>) responseObserver);
          break;
        case METHODID_UPDATE_WHERE_TAG:
          serviceImpl.updateWhereTag((to.bnk.api.transactionmetadata.UpdateWhereTagRequest) request,
              (io.grpc.stub.StreamObserver<to.bnk.api.transactionmetadata.WhereTag>) responseObserver);
          break;
        case METHODID_DELETE_WHERE_TAG:
          serviceImpl.deleteWhereTag((to.bnk.api.transactionmetadata.DeleteWhereTagRequest) request,
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
      synchronized (TransactionMetadataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getCreateTagMethod())
              .addMethod(getGetTagMethod())
              .addMethod(getGetTagsMethod())
              .addMethod(getUpdateTagMethod())
              .addMethod(getDeleteTagMethod())
              .addMethod(getCreateImageMethod())
              .addMethod(getGetImageMethod())
              .addMethod(getGetImagesMethod())
              .addMethod(getUpdateImageMethod())
              .addMethod(getDeleteImageMethod())
              .addMethod(getCreateCommentMethod())
              .addMethod(getGetCommentMethod())
              .addMethod(getGetCommentsMethod())
              .addMethod(getUpdateCommentMethod())
              .addMethod(getDeleteCommentMethod())
              .addMethod(getCreateNarrativeMethod())
              .addMethod(getGetNarrativeMethod())
              .addMethod(getGetNarrativesMethod())
              .addMethod(getUpdateNarrativeMethod())
              .addMethod(getDeleteNarrativeMethod())
              .addMethod(getCreateWhereTagMethod())
              .addMethod(getGetWhereTagMethod())
              .addMethod(getGetWhereTagsMethod())
              .addMethod(getUpdateWhereTagMethod())
              .addMethod(getDeleteWhereTagMethod())
              .build();
        }
      }
    }
    return result;
  }
}
