package jp.co.neosystem;

import io.grpc.*;
import io.grpc.stub.StreamObserver;
import jp.co.neosystem.grpc.*;

import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.MultiPartEmail;
import org.apache.commons.mail.SimpleEmail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.DataSource;
import javax.mail.util.ByteArrayDataSource;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {

		//ExecutorService executor = Executors.newFixedThreadPool(10);

		Server server = ServerBuilder.forPort(6565)
				.addService(new SendMailImpl())
				.addService(new GreeterImpl())
				//.executor(executor)
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

						//executor.shutdown();
						//executor.awaitTermination(1000 * 60, TimeUnit.MILLISECONDS);
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

	static class SendMailImpl extends SendMailGrpc.SendMailImplBase {

		@Override
		public void send(MailRequest req, StreamObserver<MailReply> responseObserver) {

			try {
				MultiPartEmail email = new MultiPartEmail();

				email.setHostName("localhost");
				email.setSmtpPort(10025);

				email.addTo(req.getTo());
				email.setFrom(req.getFrom());
				email.setSubject(req.getSubject());
				email.setMsg(req.getText());

				for (int i = 0; i < req.getAttachCount(); ++i) {
					var attach = req.getAttach(i);

					DataSource source = new ByteArrayDataSource(attach.newInput(), "image/jpeg");
					email.attach(source, "sample.jpg", "");
				}

				email.send();

				MailReply reply = MailReply.newBuilder().setStatus(200).build();
				responseObserver.onNext(reply);
			} catch (EmailException | IOException e) {
				e.printStackTrace();
				MailReply reply = MailReply.newBuilder().setStatus(500).build();
				responseObserver.onNext(reply);
			}

			responseObserver.onCompleted();
			return;
		}
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
