package _06_Network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ClientProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BufferedReader br = null;
		PrintWriter pw = null;
		Socket socket = null;
		
		
		try {
		String serverip = InetAddress.getLocalHost().getHostAddress();
		int port = 8080;
		
		
		
		
		
		//1) 서버에 연결 요청 보내는 구문(요청하고자하는 서버의 ip 주소와 포트번호를 제시하면서 소켓 생성)
		socket = new Socket(serverip, port);
		
		
		//2) 서버와 입출력 기반 스트림 생성
		//3) 보조스트림 통해서 성능개선
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		pw = new PrintWriter(socket.getOutputStream());
		
		//서버의 환영 메시지 출력
		System.out.println(br.readLine());
		
		while (true) {
			System.out.println("클라이언트 : ");
			pw.println(sc.nextLine());
			pw.flush();
			
			System.out.println("서버 : " + br.readLine());
		}
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pw.close();
				br.close();
				socket.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

