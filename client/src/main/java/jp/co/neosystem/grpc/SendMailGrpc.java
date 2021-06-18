package jp.co.neosystem.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: sendmail.proto")
public final class SendMailGrpc {

  private SendMailGrpc() {}

  public static final String SERVICE_NAME = "sendmail.SendMail";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<jp.co.neosystem.grpc.MailRequest,
      jp.co.neosystem.grpc.MailReply> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Send",
      requestType = jp.co.neosystem.grpc.MailRequest.class,
      responseType = jp.co.neosystem.grpc.MailReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<jp.co.neosystem.grpc.MailRequest,
      jp.co.neosystem.grpc.MailReply> getSendMethod() {
    io.grpc.MethodDescriptor<jp.co.neosystem.grpc.MailRequest, jp.co.neosystem.grpc.MailReply> getSendMethod;
    if ((getSendMethod = SendMailGrpc.getSendMethod) == null) {
      synchronized (SendMailGrpc.class) {
        if ((getSendMethod = SendMailGrpc.getSendMethod) == null) {
          SendMailGrpc.getSendMethod = getSendMethod =
              io.grpc.MethodDescriptor.<jp.co.neosystem.grpc.MailRequest, jp.co.neosystem.grpc.MailReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jp.co.neosystem.grpc.MailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  jp.co.neosystem.grpc.MailReply.getDefaultInstance()))
              .setSchemaDescriptor(new SendMailMethodDescriptorSupplier("Send"))
              .build();
        }
      }
    }
    return getSendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SendMailStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendMailStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendMailStub>() {
        @java.lang.Override
        public SendMailStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendMailStub(channel, callOptions);
        }
      };
    return SendMailStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SendMailBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendMailBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendMailBlockingStub>() {
        @java.lang.Override
        public SendMailBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendMailBlockingStub(channel, callOptions);
        }
      };
    return SendMailBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SendMailFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SendMailFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SendMailFutureStub>() {
        @java.lang.Override
        public SendMailFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SendMailFutureStub(channel, callOptions);
        }
      };
    return SendMailFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SendMailImplBase implements io.grpc.BindableService {

    /**
     */
    public void send(jp.co.neosystem.grpc.MailRequest request,
        io.grpc.stub.StreamObserver<jp.co.neosystem.grpc.MailReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                jp.co.neosystem.grpc.MailRequest,
                jp.co.neosystem.grpc.MailReply>(
                  this, METHODID_SEND)))
          .build();
    }
  }

  /**
   */
  public static final class SendMailStub extends io.grpc.stub.AbstractAsyncStub<SendMailStub> {
    private SendMailStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendMailStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendMailStub(channel, callOptions);
    }

    /**
     */
    public void send(jp.co.neosystem.grpc.MailRequest request,
        io.grpc.stub.StreamObserver<jp.co.neosystem.grpc.MailReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SendMailBlockingStub extends io.grpc.stub.AbstractBlockingStub<SendMailBlockingStub> {
    private SendMailBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendMailBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendMailBlockingStub(channel, callOptions);
    }

    /**
     */
    public jp.co.neosystem.grpc.MailReply send(jp.co.neosystem.grpc.MailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SendMailFutureStub extends io.grpc.stub.AbstractFutureStub<SendMailFutureStub> {
    private SendMailFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SendMailFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SendMailFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<jp.co.neosystem.grpc.MailReply> send(
        jp.co.neosystem.grpc.MailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SendMailImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SendMailImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          serviceImpl.send((jp.co.neosystem.grpc.MailRequest) request,
              (io.grpc.stub.StreamObserver<jp.co.neosystem.grpc.MailReply>) responseObserver);
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

  private static abstract class SendMailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SendMailBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return jp.co.neosystem.grpc.Sendmail.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SendMail");
    }
  }

  private static final class SendMailFileDescriptorSupplier
      extends SendMailBaseDescriptorSupplier {
    SendMailFileDescriptorSupplier() {}
  }

  private static final class SendMailMethodDescriptorSupplier
      extends SendMailBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SendMailMethodDescriptorSupplier(String methodName) {
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
      synchronized (SendMailGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SendMailFileDescriptorSupplier())
              .addMethod(getSendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
