package _01_casting;

import java.util.Scanner;

public class T04_Ex01 {

	public static void main(String[] args) {

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
