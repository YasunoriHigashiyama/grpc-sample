package jp.co.neosystem;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import jp.co.neosystem.grpc.GreeterGrpc;
import jp.co.neosystem.grpc.HelloReply;
import jp.co.neosystem.grpc.HelloRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

	private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

	public static void main(String[] args) throws Exception {

		Server server = ServerBuilder.forPort(6565)
				.addService(new GreeterImpl())
				.build();

		server.start();

		server.awaitTermination();
	}

	static class GreeterImpl extends GreeterGrpc.GreeterImplBase {
		@Override
		public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
			HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
			LOGGER.info("Hello {}", req.getName());
			return;
		}
	}
}
