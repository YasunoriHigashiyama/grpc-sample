package jp.co.neosystem;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import jp.co.neosystem.grpc.GreeterGrpc;
import jp.co.neosystem.grpc.HelloReply;
import jp.co.neosystem.grpc.HelloRequest;

public class ClientMain {
	public static void main(String[] args) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
				.usePlaintext()
				.build();

		GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(channel);

		HelloRequest request = HelloRequest.newBuilder()
				.setName("Tom")
				.build();

		HelloReply reply = stub.sayHello(request);

		System.out.println("Reply: " + reply);
	}
}
