package com.practice.list.chatting.client;

import java.io.*;
import java.net.*;
import java.util.Scanner;

import com.practice.list.chatting.server.view.AsyncStringPrinter;

public class Client1 {
	public static void main(String[] args){
		AsyncStringPrinter printer = new AsyncStringPrinter();
		
		
		try {
			Scanner sc = new Scanner(System.in);
			int port = 9001;
			String serverip = InetAddress.getLocalHost().getHostAddress();
			
			try(Socket socket = new Socket(serverip, port)) {

				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
						PrintWriter pw = new PrintWriter(socket.getOutputStream()) ){
//					System.out.println(br.readLine());
					
					printer.setDaemon(true);
					printer.start();
					
					while (true) {
						
						
						printer.setMsg("Client",sc.nextLine());
						
						
						
//						System.out.print("클라이언트 : ");
//						pw.println(sc.nextLine());
//						pw.flush();

//						System.out.println("서버 : " + br.readLine());
						
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}



