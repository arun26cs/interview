package com.java.interview.network;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public Client(String address, int port) throws UnknownHostException, IOException {
		 Socket socket = new Socket(address, port);
		 OutputStream out = socket.getOutputStream();
//		 DataOutputStream dos = new DataOutputStream(out);
//		 dos.writeUTF("hello");
		 out.write(1);
		 out.close();
//		 dos.close();
		 socket.close();
		 
	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		Client cilient = new Client("127.0.0.1",3000);
	}
}
