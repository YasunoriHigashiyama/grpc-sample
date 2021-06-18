package jp.co.neosystem;

import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jp.co.neosystem.grpc.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;
import io.grpc.StatusRuntimeException;

public class ClientMain {

	private static final Logger LOGGER = LoggerFactory.getLogger(ClientMain.class);

	public static void main(String[] args) throws IOException {
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

		ByteString attach = null;
		try (FileInputStream fileInputStream = new FileInputStream("test.jpg");
			 BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {
			attach = ByteString.readFrom(bufferedInputStream);
		}

		SendMailGrpc.SendMailBlockingStub mailStub = SendMailGrpc.newBlockingStub(channel);
		MailRequest request = MailRequest.newBuilder()
				.setFrom("")
				.setTo("")
				.setSubject("test")
				.setText("This is test mail.")
				.addAttach(attach)
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
