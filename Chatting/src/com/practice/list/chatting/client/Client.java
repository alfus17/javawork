package com.practice.list.chatting.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	
	public void start() {
		Socket socket = null;
		BufferedReader in = null;
		Scanner sc = new Scanner(System.in);
		
		try {
			// 이름 설정하기
			System.out.print("설정할 닉네임을 입력해주세요 : ");
			String name = sc.nextLine();
			System.out.println();
			
			// 서버와 연결
			socket = new Socket("localhost", 9010);
			System.out.println("[서버와 연결되었습니다]");

			// 메시지를 보내는 쓰레드 객체 생성 후 시작
			Thread sendThread = new SendMsgThread(socket, name);
			sendThread.start();

			// 소켓통신으로 부터 들어오는 값을 in에 저장
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			while (in != null) {
				// in에 저장된 데이터 한줄씩 할당
				String inputMsg = in.readLine();
				if(("/quit").equals(inputMsg)) {
					break;
				}
					
				System.out.println( inputMsg);
			}
		} catch (IOException e) {
			System.out.println("[서버 접속끊김]");
		} finally {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("[서버 연결종료]");
	}
}
