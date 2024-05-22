package _03_exception;

import java.util.Scanner;

public class T08_arithmetic {
	
	public static void main(String[] args) {
		// 사용자로 부터 2수를 입력받아  8 0
		// 나눈 몫 출력
		//나눈 나머지 출력
		
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("정수 두개를 입력해 주세요");
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 +" / " + num2 + " = " + (num1/num2));			
			System.out.println(num1 +" / " + num2 + " 의 나머지 :  " + (num1%num2));			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
