package _02_repetive;

import java.util.Scanner;

public class T06_ex01 {

	public static void main(String[] args) {
		
		

		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int inputNum = 0 ;
		int ran = (int)(Math.random() * 6)+1;
		
		do {
			System.out.print("주사위 숫자를 맞춰보세요 :");
			inputNum = sc.nextInt();
			
			count++;
			System.out.println(ran == inputNum ? "올 ~ " +count + "회 만에 정답 !!" : "ㅋ 땡"  );

			
		} while (inputNum != ran);
		
		
	
	}

}
