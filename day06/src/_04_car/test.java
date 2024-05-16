package _04_car;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력 :");
		String inputStr = sc.next();
		String answer ="";
		
//		toCharArray() -> 배열을 생성하여 문자를 하나하나 배열에 넣는다.
		for(Character c : inputStr.toCharArray() ) {
			if(Character.isUpperCase(c)) {
				answer += Character.isLowerCase(c);
			}else if(Character.isLowerCase(c)) {
				answer += Character.isUpperCase(c);
			}
		}
		
		
	}

}
