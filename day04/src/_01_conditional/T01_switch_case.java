package _01_conditional;
import java.util.*;

import javax.naming.spi.DirStateFactory.Result;
public class T01_switch_case {

	public static void main(String[] args) {
		/*
		 * 이번 코드 요약정리
		 * 
		 * swith case 문 
		 * break 하지않으면 계속해서 진행 되기 때문에 case 별로 break or countine 작성필요
		 * 아무 케이스가 없을경우 default로 빠지게 됨
		 * 
		 */



		// switch- case
		Scanner scan = new Scanner(System.in);
		//		int num1 =2;
		//
		//		switch(num1) {
		//		case 1 :
		//			System.out.println("1");
		//			break;
		//		case 2 :
		//			System.out.println("2");
		//			break;
		//		}
		//
		//
		//		char ch = 'a';
		//
		//		switch(ch) {
		//		case 'a':
		//			System.out.println("a");
		//			break;
		//		case 'b':
		//			System.out.println("a");
		//			break;
		//		case 'c':
		//			System.out.println("a");
		//			break;
		//		case 'd':
		//			System.out.println("a");
		//			break;
		//		case 'e':
		//			System.out.println("a");
		//			break;
		//		default:
		//			System.out.println("error");
		//
		//
		//		}
		//		
		//		int month = 1;
		//		
		//		switch(ch) {
		//		case 1:
		//			System.out.println("1월");
		//			break;
		//		case 2:
		//			System.out.println("2월");
		//			break;
		//		case 3:
		//			System.out.println("3월");
		//			break;
		//		
		//		default:
		//			System.out.println("달을 입력하시온");
		//


		//		문제 1 . 사용자로부터 2수와 연산자를 입력받아 연산결과를 출력



		System.out.print("숫자 두개를 입력하시오\n");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력하세요 ( ex : + , - , / , x)");
		String operator = scan.next();

		switch (operator) {
		case "+": {
			int result = num1 + num2;
			System.out.printf("%d 와 %d의 %s 한 값은 %d 입니다.", num1 ,num2,operator,result);
			break;
		}
		case "-": {
			int result = num1 - num2;
			System.out.printf("%d 와 %d의 %s 한 값은 %d 입니다.", num1 ,num2,operator,result);
			break;
		}
		case "x", "X", "*" : {
			int result = num1 * num2;
			System.out.printf("%d 와 %d의 %s 한 값은 %d 입니다.", num1 ,num2,operator,result);
			break;
		}
		case "/": {
			double doubleNum2 = (double) num2;
			double result = num1 / doubleNum2;
			System.out.printf("%d 와 %d의 %s 한 값은 %.2f 입니다.", num1 ,num2,operator,result);
			break;
		}
		default:
			System.out.println("잘못된 연산자를 입력하셨습니다.");
			System.exit(0);
		}





	}





}


