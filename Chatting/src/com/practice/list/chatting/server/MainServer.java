package com.practice.list.chatting.server;

import com.practice.list.chatting.server.view.AsyncStringPrinter;
import java.awt.Toolkit;
import java.io.*;
import java.net.*;
import java.util.*;
import java.util.Scanner;

class AutoBackup{
	
	

	
	
}
public class MainServer {
	
	
	public static void main(String[] args) {
		
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		try {
			serverSocket = new ServerSocket(9010);
			while (true) { 
				// 소켓 클라이언트의 연결이 되면 새로운 스레드 생성
				System.out.println("클라이언트 연결대기중 ...");
				socket = serverSocket.accept();
				
				// client가 접속할때마다 새로운 스레드 생성
				ReceiveClientThread receive_Client_Thread = new ReceiveClientThread(socket);	
				receive_Client_Thread.start();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (serverSocket!=null) {
				try {
					serverSocket.close();
					System.out.println("서버종료");
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("서버소켓통신에러");
				}
			}
		}
	}


}