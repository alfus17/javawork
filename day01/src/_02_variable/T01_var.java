package _02_variable;

public class T01_var {

	public static void main(String[] args) {

		/*
		 * 기본자료형
		 * 정수 : int
		 * 실수 : dobule , float
		 * 참, 거짓 : boolean
		 * 문자 1개 : char(유니코드 사용)
		 */

		/*
		 * 정수 타입 : byte(1byte), 
		 * char(2byte), 
		 * short(2byte) 
		 * int(4byte)
		 * log (8byte)
		 */

		int num1;
		int num2 = 10;

		//		System.out.println("num1 : "+ num1 + "\nnum2 : "+ num2);
		//		해당부분에서 num1 이 오류가 나는 이유는 num1 에서는 정수값이 대입되지 않았기 때문이다.

		num1 = 11;

		System.out.println("num1 : "+ num1 + "\nnum2 : "+ num2);
		System.out.println("num1 + num2 : "+ (num1 + num2));
		System.out.println("num1 *2 + num2 : "+ (num1 *2 + num2) + "\n");


		int sum = num1 + num2;
		System.out.println("sum : "+ sum + "\n");

		//		변수를 하나 만들어 sum + 5를 한 결과를 넣으시오. 그리고 출력하시오
		int num3 = sum + 5;
		System.out.println("sum + 5 : "+ num3 + "\n");

		//		long형의 뒤에는 L 대문자를 써준다. L을 기입하지 않을 경우 int로 취급된다.
		long long01 = 5000000000000000000L;
		System.out.println("long01 : "+ long01 + "\n");

		//		double 은 소수점 12 자리 float 6자리까지 정확하다
		double double01 = 3.14159283215892757189;
		double double02 = 1.333241312351234;

		System.out.println("double01 "+ double01);
		System.out.println("double02 : "+ double02);
		System.out.println("double01 + double02 : "+ (double01 + double02 ) + "\n");

		//		기본자료형 8byte 를 float 4byte에 큰자료형을 작은 자료형 에 넣을 경우 오류가 나게된다. 그렇기에 소수점 6자리가 넘는 숫자는 뒤에 f를 기입 하여야한다. 그럼 float형으로 저장되기 때문에 뒤의 6자리후의 소수점 자리가 날아감.
		float float01 = 45.123125325123512f;
		System.out.println("float01 : "+ float01);






	}

}
