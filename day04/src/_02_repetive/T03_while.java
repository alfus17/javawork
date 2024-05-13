package _02_repetive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		
//		int sum = 0;
//		for(int j =1; j<=100; j++) {
//			sum+=j;
//		}
//		
//		int k=1;
//		int sum2=0;
//		while (k<=100) {
//			sum2+=k;
//			k++;
//		}System.out.println("1~100까지 합은 :" + sum2);
//		
//		
//		int x = 10;
//		while ( x-- != 0) {
//			System.out.println(x);
//		}
//		
//		int count = 0;
//		while(true) {
//			System.out.println(++count);
//			if(count == 5) {
//				break; // while문을 빠져나오는 break
//			}
//		}
//		
		Scanner sc = new Scanner(System.in);
//		while(true) {
//			System.out.println("멈추려면 'q'를 누르시오");
//			if(sc.next().charAt(0) == 'q') {
//				System.out.println("프로그램이 종료되었음");
//				break; // while문을 빠져나오는 break
//			}
//		}
		
//		while의 조건이 참이면 반복문 계속 진행
		
		
		
		// 문제 사용자로부터 2개의 숫자와 연산자를 입력받아 그 결과를 출력
		char plug = 0;
		
		while(true) {
			if(plug == '1') {
				break;
			}
			System.out.println("다음 정수 2개를 입력하시오.");
			
			int num1 = sc.nextInt();
			int num2= sc.nextInt();
	
			System.out.println(" 연산자(*, /, +, -) 를 입력하시오. @를 입력할 경우 종료합니다.");
			String op = sc.next();
			
			
			switch (op) {
			case "x","*","X": {
				System.out.printf("%d x %d = %d\n", num1 ,num2, num1*num2);
				break;
			}
			case "/": {
				System.out.printf("%d / %d = %.2f\n",num1,num2,num1/(double)num2);
				break;
			}
			case "+": {
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
				break;
			}
			case "-": {
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
				break;
			}
			case "@": {
				System.out.printf("종료합니다.\n");
				plug = '1';
				break;
				
//				System.exit(0);
				
			}
			default:
				System.out.println("연산자를 다시 입력하시오!");
			}
			
		}
		
	}
}
