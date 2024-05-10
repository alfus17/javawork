package _02_repetive;

import java.util.Scanner;

public class T01_for {

	public static void main(String[] args) {
		/*
		 * 이번코드 요약정리
		 * 반목문 3가지 :  for , while, do-while
		 * 특정한 규직이 있는 것들을 반복하여 사용할 때
		 */

		/*
		 * for 문의 사용방법
		 * for(초기화; 조건식; 증감식) {
		 * 		실행문
		 * }
		 * 조건식이 참인지 거짓인지 참이면 반복 거짓이면 for 빠져나옴
		 * 
		 */



		//		for (int i = 0;i<=100;i++) {
		//			System.out.println("안녕하세요 " + i);
		//		}
		//		
		//		System.out.println("=====================================");
		//		
		//		for (int i = 100; i >=1; i--) {
		//			System.out.println(i + "번 출력");
		//			
		//		}





		//		

		//		
//				int frame = 4;
//				
//				for (int i =0; i<frame; i++) {
//					for(int j=0; j<(frame-i); j++) {
//						System.out.print("*");
//					}System.out.println();
//					
//				}
//				
//				
//				
		
	
				


//		//		홀수만 입력받기
		System.out.println("홀수 정수를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int frame = scan.nextInt();

		//		센터 숫자
		int center  = frame /2 +1;
//	 위 삼각형
		for(int i =0;i < frame; i++) {
			for(int blank =0; blank < frame-i-1;blank++) {
				System.out.print(" ");
			}
			for(int star =0; star < 2 *i + 1 ; star++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
//		아래 삼각형
		for (int i =0; i<frame; i++) {
			for(int blank =0; blank<i;blank++) {
				System.out.print(" ");
			}
			for(int star =0; star <=2 *(frame -i -1) ; star++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}



