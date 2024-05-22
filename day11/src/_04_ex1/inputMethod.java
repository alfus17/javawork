package _04_ex1;

import java.util.Scanner;

class inputMethod {
	
	
	boolean method(boolean flag)throws UserException  {
		Scanner sc = new Scanner(System.in);

		System.out.println("첫번째 정수를 입력해 주세요");
		int num1 = sc.nextInt();

		System.out.println("두번째 정수를 입력해 주세요");
		int num2 = sc.nextInt();

		if(num1 >100 || num1 <0 ) {
			throw new UserException("첫번째로 입력한 값이 1~100 사이의 값이 아닙니다.");
		}else if(  num2 > 100 || num2 <= 0) {
			throw new UserException("두번째로 입력한 값이 1~100 사이의 값이 아닙니다. ");
		}else {
			System.out.println(num1 + " 은 " + num2 + " 의 배수인가 ? " + (num1%num2 == 0 ? true : false));
			flag = false;
		}
		return flag;
		
	}
	
	
}