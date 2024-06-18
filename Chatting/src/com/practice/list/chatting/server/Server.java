package com.practice.list.chatting.server;

import com.practice.list.chatting.server.view.AsyncStringPrinter;
import java.awt.Toolkit;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Scanner;

class chatView extends Thread{
	private boolean flag = false;

	AsyncStringPrinter printer = new AsyncStringPrinter();
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




	public static void main(String[] args) {
		int port = 9001;
		Scanner sc = new Scanner(System.in);
		AsyncStringPrinter printer = new AsyncStringPrinter();
		// 채팅창 보이는거
		//		chatView chatView = new chatView();


		try {
			try(ServerSocket server = new ServerSocket(port)) {
				System.out.println("클라이언트의 요청을 기다리고 있음...");

				Socket socket = server.accept(); 
				System.out.println(socket.getInetAddress().getHostAddress() + "가 연결요청함!");
				//여기부분 chatView 비동기 스레드 메소드 

				try(PrintWriter pw = new PrintWriter(socket.getOutputStream())){

					printer.setDaemon(true);
					printer.start();

					//					chatView.setSocket(socket);
					//					// 채팅창 쓰레드 시작
					//					chatView.setDaemon(true);
					//					chatView.start();

					//					pw.println("환영합니다!!! 🐱‍💻");
					printer.setMsg("Server","환영합니다");
					while(true) {
						//						pw.println("server :" + sc.nextLine());
						//						pw.flush();
						printer.setMsg("Server",sc.nextLine());

					}
				}
			}
		} catch (IOException e) {

			e.printStackTrace();
		} 
	}
}