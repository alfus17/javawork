package com.practice.list.chatting.server;

import java.io.*;
import java.net.*;
import java.util.*;

class ReceiveClientThread extends Thread {
	//Collections.synchronizedList -> 멀티 스레드 환경에서 동기화된 리스트를 사용하기 위해 생성
	private static List<PrintWriter> list = 
			Collections.synchronizedList(new ArrayList<PrintWriter>());
	
	//서버쪽 메시지 
	static String servermsg = "";
	
	//try catch 밖에서도 사용하기 위해 생성
	Socket socket = null;
	BufferedReader inputStream = null;
	PrintWriter outputStream = null;
	
	// 객체생성 = 이미 웹소켓 연결완료됨
	// 객체생성시 소켓 정보와 인풋스트림 아웃풋 스트림 연결
	public ReceiveClientThread (Socket socket) {
		this.socket = socket;
		try {
			// 인풋 아웃풋 스트림 연결
			outputStream = new PrintWriter(socket.getOutputStream());
			inputStream = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			list.add(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
	@Override
	public void run() {

		String name = "";
		try {
			// 최초1회는 client이름을 수신
			name = inputStream.readLine();
			System.out.println("[" + name + " 새연결생성]");	
			System.out.println("[" + name + " IP adress : " + socket.getInetAddress().getHostAddress() +"]");	
			sendAll("[" + name + "]님이 들어오셨습니다.");
			
			while (inputStream != null) {
				String inputMsg = inputStream.readLine();
				if("quit".equals(inputMsg)) {
					break;
				}
				if(servermsg != "") {
					sendAll( "Server :" + servermsg);
					servermsg = "";
				}
				
				sendAll(name + " : " + inputMsg);
			}
		} catch (IOException e) {
			System.out.println("[" + name + " 접속끊김]");
		} finally {
			sendAll("[" + name + "]님이 나가셨습니다");
			list.remove(outputStream);
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[" + name + " 연결종료]");
	}
	
	private void sendAll (String str) {
		for (PrintWriter out: list) {
			out.println(str);
			out.flush();
		}
	}
	
	public void SendServerMsg(String sendmsg) {
		this.servermsg = sendmsg;
	}
}
