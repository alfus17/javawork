package com.practice.list.chatting.server;

import java.awt.Toolkit;
import java.io.*;
import java.net.*;
import java.util.Scanner;

class chatView extends Thread{
	private boolean flag = false;

	Scanner sc = new Scanner(System.in);
	static Socket socket = new Socket();
	StringBuffer sb = new StringBuffer();

	// setter
	public void StopThread(boolean flag) {
		this.flag = flag;
	}
	public void setSocket(Socket socket) {
		this.socket = socket;
	}
	
	// Thread runner
	@Override
	public void run() {

		try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				PrintWriter pw = new PrintWriter(socket.getOutputStream())){
			while(true) {
//				String msg = br.readLine();
				System.out.println("client : " + br.readLine());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

public class Server {
	public static void main(String[] args) {
		int port = 9001;
		Scanner sc = new Scanner(System.in);	
		// 채팅창 보이는거
		chatView chatView = new chatView();


		try {
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("클라이언트의 요청을 기다리고 있음...");

				Socket socket = server.accept(); 
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함!");
				//여기부분 chatView 비동기 스레드 메소드 

				try(PrintWriter pw = new PrintWriter(socket.getOutputStream())){

					chatView.setSocket(socket);
					// 채팅창 쓰레드 시작
					chatView.setDaemon(true);
					chatView.start();
					
					pw.println("환영합니다!!! 🐱‍💻");
					pw.flush();
					while(true) {
					pw.println("server :" + sc.nextLine());
					pw.flush();
			
					}
				}
			}
		} catch (IOException e) {
			chatView.StopThread(true);
			e.printStackTrace();
		} 
	}
}