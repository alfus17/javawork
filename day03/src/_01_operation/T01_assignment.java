package _01_operation;

public class T01_assignment {

	public static void main(String[] args) {
		/*
		 * 이번 코드 총 정리 요약
		 * 
		 * 1. 사칙연산 전부 =, 즉 +=, -=, /=, *=, %= 다 가능하다.
		 * 2. 자바는 _를 숫자로 인식하지 않기 때문에 200_000_000 숫자가 클 경우에는 옆에와 같이 표기한다.
		/ * 
		 * 
		 */
		// % 값을 나눈 나머지
		int num1 = 10;
		int num2  = 3;

		int result = num1 % num2;
		System.out.printf("%d를 %d로 나눈 몫은 %d 이고, 나머지는 %d 이다\n", num1, num2, num1/num2,result);

		// 사칙연산 전부 =, 즉 +=, -=, /=, *= 다 가능하다.
		num1 = num1 + 10;
		System.out.println("num1 : " + num1);

		num1 += 10 ; // num1 = num1 + 10; 을 줄여서 씀
		System.out.println("num1 : " + num1);

		num1 += 5 ; 
		System.out.println("num1 : " + num1);

		num1 -= 8 ; 
		System.out.println("num1 : " + num1);

		num1 /= 3 ; 
		System.out.println("num1 : " + num1);

		num1 *= 3 ; 
		System.out.println("num1 : " + num1);

		num1 %= 2 ; 
		System.out.println("num1 : " + num1);

		// 자바는 _를 숫자로 인식하지 않기 때문에 아래와 같은 표현이 가능하다.
		int num3 = 200_000_000 ; 
		System.out.println("num3 : " + num3);




	}

}
