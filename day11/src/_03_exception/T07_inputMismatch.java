package _03_exception;

import java.util.Scanner;

public class T07_inputMismatch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 3개 입력");
		int sum = 0;
		for(int i = 1 ; i <=3; i++) {
			System.out.println(i + " 번째 정수 입력 :");
			try {
				int num = sc.nextInt();
				sum += num;
			}catch (Exception e) {
				System.out.println("잘못 입력했어요");
				e.printStackTrace();
				i--;
				sc.next();
				
			}
		}
		System.out.println("합계 : "+ sum);
		
	}

}
