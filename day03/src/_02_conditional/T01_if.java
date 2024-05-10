package _02_conditional;

import java.util.*;

public class T01_if {

	public static void main(String[] args) {
		/*
		 * 이번 코드 요약정리
		 * 
		 * 조건이 참일 때 실행 거짓이면 else 실행
		 * if(조건식){
		 * 		참일때 실행문
		 * }else{
		 * 		거짓일때 실행문
		 * }
		 */
//		int num1 =100;
//		if (num1 == 100){System.out.println("1");}else {System.out.println("2");}
		
		// 사용자로 부터 점수를 입력 받아 80 이상 이면 합격
		Scanner scan = new Scanner(System.in);
		
		System.out.println("당신의 점수를 입력해주세요");
		int score = scan.nextInt();
		
		if(score >= 80) {
			System.out.println("당신은 90합격입니다.");	
			System.out.println("축하합니다");
		}else {
			System.out.println("분발 요망");
		}
	}

}
