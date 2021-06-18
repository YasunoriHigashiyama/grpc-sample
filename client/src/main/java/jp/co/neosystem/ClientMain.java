package jp.co.neosystem;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jp.co.neosystem.grpc.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;
import io.grpc.StatusRuntimeException;

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

			try {
				HelloReply reply = stub.sayHello(request);
				LOGGER.info("Reply: " + reply.getMessage());
			} catch (StatusRuntimeException e) {
				LOGGER.info("str: " + str + ", status: " + e.getStatus().toString());
			}
			return;
		};

		var requests = new ArrayList<String>();
		for (int i = 0; i < 99999; ++i) {
			var tmp = String.format("test%d", i);
			requests.add(tmp);
		}

		var strings = List.of("test1", "test2");
		var spliterator = strings.spliterator();
		//var spliterator = requests.spliterator();
		var stream = StreamSupport.stream(spliterator, false);

		stream.parallel().forEach(call);


		SendMailGrpc.SendMailBlockingStub mailStub = SendMailGrpc.newBlockingStub(channel);
		MailRequest request = MailRequest.newBuilder()
				.setFrom("yasunori@dev.nekoptr.test")
				.setTo("yasunori@dev.nekoptr.test")
				.setSubject("test")
				.setText("This is test mail.")
				.build();

		try {
			MailReply reply = mailStub.send(request);
			LOGGER.info("Reply: " + reply.getMessage());
		} catch (StatusRuntimeException e) {
			LOGGER.info(e.getMessage(), e);
		}
		return;
	}
}
