package _03_CharStream;

import java.io.*;

public class CharStreamApi {
	// 문자기반 스트림 2byte 씩 전송
	/*
	 * xxxReader : 입력용 스트림
	 * xxxWriter : 출력용 스트림
	 * 
	 */
	//출력용 스트림
	void fileSave() {
		FileWriter fw = null;
		try {
			// 1.
			fw = new FileWriter("file_char.txt");
		
			// 2.
			fw.write('김');
			fw.write("와우 점심시간 끝이다 ");
			fw.write(' ');
			fw.write('A');
			fw.write("\n");
			
			char[] arr = { 't' ,'c' , 'h','m'};
			fw.write(arr);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//입력용 스트림
	void fileRead() {
		//생성
		FileReader fr = null;
		
		try {
			//생성
			fr = new FileReader("file_char.txt");
			
			// 읽기
			int value = 0;
			while((value=fr.read()) != -1) { // -1이 끝이기때문에 끝이 아니면
				System.out.println((char)value);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				// 닫기
				fr.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
