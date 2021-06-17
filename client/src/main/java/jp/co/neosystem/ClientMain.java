package jp.co.neosystem;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jp.co.neosystem.grpc.GreeterGrpc;
import jp.co.neosystem.grpc.HelloReply;
import jp.co.neosystem.grpc.HelloRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class ClientMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientMain.class);

	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
				.usePlaintext()
				.build();

		Consumer<String> call = str -> {
			GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);

			HelloRequest request = HelloRequest.newBuilder()
					.setName(str)
					.build();

			HelloReply reply = stub.sayHello(request);
			LOGGER.info("Reply: " + reply.getMessage());
			return;
		};

		var strings = List.of("test1", "test2", "test3", "test4", "test5");
		var spliterator = strings.spliterator();
		var stream = StreamSupport.stream(spliterator, false);

		stream.parallel().forEach(call);
		return;
	}
}
