package jp.co.neosystem;

import io.grpc.*;
import io.grpc.stub.StreamObserver;
import jp.co.neosystem.grpc.GreeterGrpc;
import jp.co.neosystem.grpc.HelloReply;
import jp.co.neosystem.grpc.HelloRequest;

import org.apache.commons.lang3.RandomUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {

		ExecutorService executor = Executors.newFixedThreadPool(10);

		Server server = ServerBuilder.forPort(6565)
				.addService(new GreeterImpl())
				.executor(executor)
				//.intercept(new ServerInterceptor() {
				//	@Override
				//	public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
				//			ServerCall<ReqT, RespT> serverCall, Metadata metadata, ServerCallHandler<ReqT, RespT> serverCallHandler) {
				//		LOGGER.info("call 1");
				//		ServerCall.Listener<ReqT> delegate = serverCallHandler.startCall(serverCall, metadata);
				//		return new ForwardingServerCallListener.SimpleForwardingServerCallListener<ReqT>(delegate) {
				//			@Override
				//			public void onHalfClose() {
				//				try {
				//					super.onHalfClose();
				//				} catch (Exception e) {
				//					serverCall.close(Status.INTERNAL
				//							.withCause(e)
				//							.withDescription(e.getMessage()), new Metadata()
				//					);
				//				}
				//			}
				//		};
				//	}
				//})
				.build();

		Runtime.getRuntime().addShutdownHook(new Thread(
				() -> {
					server.shutdown();
					try {
						server.awaitTermination();

						executor.shutdown();
						executor.awaitTermination(1000 * 60, TimeUnit.MILLISECONDS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					return;
				}
		));

		server.start();

		server.awaitTermination();
		return;
	}

	static class GreeterImpl extends GreeterGrpc.GreeterImplBase {
		@Override
		public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
			try {
				long waitTime = RandomUtils.nextLong(1000, 1000 * 10);
				Thread.sleep(waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
			LOGGER.info("Hello {}", req.getName());
			return;
		}
	}
}
