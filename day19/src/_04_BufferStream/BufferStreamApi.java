package _04_BufferStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferStreamApi {
	/*
	 * 보조 스트림 : 외부매체와 직접 연결 하지 않음. 단독 사용 불가
	 * 				반드시 기반스트림과 함께 사용
	 */

	/*	void fileSave() {
			// 기반 스트림 : FileWriter를 사용
			// 보조 스트림 : BufferWriter로 출력 속도 향상
			
			//순서
			//1.  기반스트림 먼저 생성
			//2.  보조스트림 생성(기반스트림 객체를 전달하면서 생성)
			//3.  파일 쓰고
			//4.  보조스트림과 기반스트림 닫기
			
			
		//		FileWriter fw = null;
			BufferedWriter bw = null;
			try {
				//1.
		//			fw = new FileWriter("file_buffer.txt");
		//			//2.
		//			//                                    기반스트림이름     
		//			BufferedWriter bw = new BufferedWriter(fw);
				
				//한줄로
				bw = new BufferedWriter(new FileWriter("file_buffer.txt"));
				bw.write("안녕하세요?\n");
				bw.write("맛점 하셨나요?\n");
				bw.newLine(); // 줄바꿈 메소드
				bw.write("나는 자바가 좋아요");
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();
		//				fw.close(); => 한줄로 하면서 fw = null;
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
			
			
			
			
		}*/

	// try-catch-resource 구문으로 자원 반납을 하지 않는다.
	// jdk7버전 이상 사용가능
	/*
	 try(try블럭내에서 사용할 스트림 객체 생성 구문){ // 알아서 try구문이 다 끝나면 해당 스트림 반납까지 해줌
	 
	 }catch(예외클래스 e){
	 
	 }
	 */

	void fileSave() {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter("file_buffer.txt"))) {
			bw.write("안녕하세요?\n");
			bw.write("맛점 하셨나요?\n");
			bw.newLine(); // 줄바꿈 메소드
			bw.write("나는 자바가 좋아요");
			bw.write("나는 자바가 좋아");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 입력 버퍼

	void inputBuffer() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("file_buffer.txt"));

			int value = 0;
			while ((value = br.read()) != -1) {
				System.out.print((char) value);
			}
			// 한줄씩 읽는 방법
//			System.out.println(br.readLine());

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
