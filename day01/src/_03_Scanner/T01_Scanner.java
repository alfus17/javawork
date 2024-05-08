package _03_Scanner;

import _02_variable.T02_char;
import java.util.Scanner;

public class T01_Scanner {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		
//		System.out.println("당신의 이름을 입력해주세요");
//		String name = scan.next(); //문자열 단어
//		System.out.println("당신의 이름은 " + name);
//
//		System.out.println("당신의 나이를 입력하시오 " );
//		int age = scan.nextInt(); //문자열 단어
//		System.out.println("당신의 나이는 " + age + "입니다." );
//
//		System.out.println("당신의 키를 입력하시오 " );
//		double tall = scan.nextDouble(); //문자열 단어
//		System.out.println("당신의 나이는 " + tall + "입니다." );
//
//		//		nextLine은 엔터까지
//
//		System.out.println("당신의 주소를 입력하세요" );
//		String address1 = scan.next(); //문자열 단어
//		System.out.println("당신의 주소는 :" + address1 + "입니다." );

		System.out.println("당신의 주소를 입력하세요" );
		String address2 = scan.nextLine(); //문자열 단어
		System.out.println("당신의 주소는 :" + address2 + "입니다." );
		
		System.out.print("당신의 성별은 무엇입니까?");
		String gender2 = scan.next();
		System.out.print("당신의 성별은 무엇입니까?");
		char gender3 = scan.next().charAt(1);
		System.out.println("성별 : "+ gender2);
		System.out.println("성별 : "+ gender3);
		


	}

}
