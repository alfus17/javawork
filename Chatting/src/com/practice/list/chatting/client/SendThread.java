package com.practice.list.chatting.client;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

class SendMsgThread extends Thread {
	Socket socket = null;
	String name;

	Scanner scanner = new Scanner(System.in);
	
	public SendMsgThread(Socket socket, String name) {
		this.socket = socket;
		this.name = name;
	}

	@Override
	public void run() {
 		try {
			// 최초1회는 client의 name을 서버에 전송
			PrintStream out_Stream = new PrintStream(socket.getOutputStream());
			out_Stream.println(name);
			out_Stream.flush();
			
			while (true) {
				String outputMsg = scanner.nextLine();
				out_Stream.println(outputMsg);
				out_Stream.flush();
				if("/quit".equals(outputMsg)) {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}