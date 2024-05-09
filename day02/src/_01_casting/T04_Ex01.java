package _01_casting;

import java.util.Scanner;

public class T04_Ex01 {

	public static void main(String[] args) {
		
		/*
		 * 이번 코드 요약
		 * 
		 * 해당 코드는 상항 연산자 또는 if elseif 구문을 사용하여 처리해봄
		 * if문과 삼항연산자는 처리속도 부분에서 서로 별다른 차이는 없지만, 짧은 구문들에 한정하여 삼항연산자의 표기가 훨신 간편하다고 판단.
		 */

		Scanner scan = new Scanner(System.in);
		String output2 ="";

		System.out.println("정수를 입력하시오");
		int Ex1input = scan.nextInt();

		// 삼항연산자 사용하기	
		
		String output = Ex1input == 0 ? "0" : (Ex1input > 0 ? "양수":"음수") ;


		//		TODO : 자바에서 str + str;의 경우 메모리 할당과 해제를 함에있어서 더 많은 자원이 들기때문에 문자열 배열에 append하는 stringbuilder를 사용하는것이 좋다.
		System.out.println(output + "입니다.");

		//
		//		//if ,else if, else 사용하기
		//		if(Ex1input >0) {
		//			output2 = "양수";
		//		}else if (Ex1input == 0){
		//			output2 ="0";
		//		} else {
		//			output2 ="음수";
		//		}
		//		System.out.println(output2+"입니다.");
		//



	}

}
