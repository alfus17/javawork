package _01_HashMap;

import java.util.*;
import java.util.Map;

public class T02_HashMap {

	public static void main(String[] args) {
		// 사용자의 id 와 pw를 넣고 
		
		// 사용자로 부터 id와 pw 받아서 
		
		// 1. id 가 없으면 : 아이디나 비밀번호가 맞지않습니다
		// 2. id는 있지만 pw가 맞지않으면 : 아이디나 비밀번호가 맞지않습니다
		
		HashMap<String , String> user = new HashMap<String, String>();
		Scanner sc = new Scanner(System.in);
		
		user.put("a","1q");
		user.put("avc","1q2w3e");
		user.put("aasd","1q2w3w");
		String inputId ="", inputPw ="";
		
		boolean login = true;
		
		while (login) {
			
			System.out.println("아이디를 입력해주세요");
			// 아이디 입력받기
			inputId = sc.next();
			if(!user.containsKey(inputId)) {
				System.out.println("아이디 맞지않습니다");
				continue;
			}
			System.out.println("비밀번호를 입력하세요");
			//비밀번호 입력받기
			inputPw = sc.next();
			if(!user.get(inputId).equals(inputPw)) {
				System.out.println("비밀번호가 맞지않습니다");
				continue ;
			}
			login = false;
			
		}
		System.out.println("로그인에 성공하셨습니다.");
	}	
	

}
