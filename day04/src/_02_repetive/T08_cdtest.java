package _02_repetive;

import java.util.Scanner;

public class T08_cdtest {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			String str = "";
			int n = 0;
			
//			출력할 문장 입력 받기
			do {
				str = sc.next();
				
			}while(str.length() <1 || str.length() > 10);
			
//			반복횟수 입력받기
			do {
				n = sc.nextInt();
				
			}while(n < 1 || n>5 );
			
			
			System.out.print(str.repeat(n));
			
			
			
			
			
			
	}

}
