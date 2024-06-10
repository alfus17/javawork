package com.practice.list.chatting.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server extends Thread {
	// 서버를 열 포트 설정
	private int port = 8080;
	static Scanner sc = new Scanner(System.in);
		

	
	// 서버 여는 메소드 
	public Socket OpenServer(int port) {
		this.port = port;
		Socket socket = null;
		
	// 소켓 열기
		try {
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("클라이언트의 요청을 기다리고 있음...");
				
				socket = server.accept(); 
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함!");
				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
						PrintWriter pw = new PrintWriter(socket.getOutputStream())){
				
					pw.println("환영합니다!!! 🐱‍💻");
					pw.flush();
					String msg = "";
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		return socket;
	}
	

	
}
