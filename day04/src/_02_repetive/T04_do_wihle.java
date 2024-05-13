package _02_repetive;

import java.util.Scanner;

public class T04_do_wihle {

	public static void main(String[] args) {

		/*
		 * 조건을 나중에 확인하므로 조건과 상관없이 1번은 반드시 실행
		 * 
		 * do{
		 * 
		 * }while(조건식)
		 * while이 조건이 참이면 do 다시 실행
		 * 
		 * 
		 */
		
//		while문은 조건을 초기에 보기때문에 반복문안으로 안들어감 
//		boolean b1 = false;
//		while(b1) {
//			System.out.println("true");
//		}
////		do-while문의 경우에는 조건이 마지막에 체킹되기 때문에 do 안에 한번은 실행된다.
//		do {
//			System.out.println("당신은 "+ b1 + " 입니다.");
//		}while(b1);
		
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("1 : for문 설명\n2 : while 설명\n3 : do-while 설명\n0 : 종료");
			ch = sc.next().charAt(0);
			
			switch (ch) {
			case '1': {
				System.out.println("for문은 반복함");
				break;
			}
			case '2': {
				System.out.println("while 문은 반복함");
				break;
			}
			case '3': {
				System.out.println("do-while 문은 반복함");
				break;
			}
			case '0': {
				System.out.println("종료합니다.");
				break;
			}
			
			default:
				System.out.println("선택지를 다시 입력하시오.");
			}
				
		}while(ch !='0'); // 조건식에서 유의할 점은 같으면 계속 도는것이고 같지않으면 종료하기 때문에 기억해야한다.
		
		
	}

}
