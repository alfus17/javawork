package _01_print;

public class T02_printf {

	public static void main(String[] args) {
		
		/*
		 * 코드 요약정리
		 *  printf의 사용법
		 *  실수형 출력 float 밖에 없으며 소수점 6자리 이후부터는 반올림 한다.	
		 * 
		 */
		//		십진수 출력
		System.out.printf("%d \n",10);
		System.out.printf("%d,%d \n",10 ,20);

		int num1 = 100;
		int num2 = 200;
		System.out.printf("%d, %d\n", num1,num2);

		//		8진수 출력
		System.out.printf("%o  \n", 30);

		//		16진수 출력
		System.out.printf("%x  \n", 30);
		System.out.printf("%X  \n", 30);

		//		실수형 출력 float 밖에 없으며 소수점 6자리 이후부터는 반올림 한다.
		System.out.printf("%f  \n", 3.55555555555555);

		//		문자1개 출력 강조 : 문자열 한개는 싱글 따옴표
		System.out.printf("%c\n", '1');

		//		문자열
		System.out.printf("%s\n", "asdfadsf");

		// boolean타입 출력
		System.out.printf("%b\n", 10<3);

		// 현재는 2024년 5월 이고, 우리나라의 평균키는 165.7 입니다.
		System.out.printf("%s%d%s%d%s%.1f%s", "현재는 ",2024,"년",5,"월 이고, 우리나라의 평균키는 ",165.7,"입니다.\n");
		System.out.printf("현재는 %d년%d월이고, 우리나라의 평균키는 %.1f입니다.\n", 2024,5,165.7);

		// 이 과정의 정원은 25명이고, 현재 25명 수강중 입니다. 100%를 달성했습니다.
		System.out.printf("이 과정의 정원은 %d명이고, 현재 %d명 수강중입니다. %d%c를 달성했습니다.\n",25,25,100,'%');





	}

}
