package _07_Socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args){
	
		try {
			Scanner sc = new Scanner(System.in);
			int port = 9001;
			String serverip = InetAddress.getLocalHost().getHostAddress();
			
			try(Socket socket = new Socket(serverip, port)) {

				try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream())); 
						PrintWriter pw = new PrintWriter(socket.getOutputStream()) ){
					System.out.println(br.readLine());
					
					
					while (true) {
						
						System.out.println("클라이언트 : ");
						pw.println(sc.nextLine());
						pw.flush();

						System.out.println("서버 : " + br.readLine());
						if( br.readLine().equals("exit")) {
							break;
						}
					}System.out.println("서버와 연결을 해제합니다.");
				}

			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}



