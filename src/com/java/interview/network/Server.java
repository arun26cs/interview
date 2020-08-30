package com.java.interview.network;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	private int port;

	public Server(int port) throws IOException {
		
		this.port = port;
		ServerSocket server = new ServerSocket(this.port);
		Socket socket = server.accept();
		InputStream is = socket.getInputStream();
		System.out.println(is.read());
	}

	public static void main(String[] args) throws IOException {
		Server server = new Server(3000);
		
	}

}
