package _03_Scanner;

import java.util.Scanner;

public class T02_Ex01 {

	public static void main(String[] args) {
		//		국어, 컴퓨터, 수학 점수를 입력 받아 저장하고 총점과 평균을 출력하세요.

		Scanner scan = new Scanner(System.in);


		System.out.println("국어 점수를 입력하세요");
		int korean = scan.nextInt();
		System.out.println("컴퓨터 점수를 입력하세요");
		int computer = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math = scan.nextInt();

		int sum = korean + computer + math;
		float avg = sum / 3.0f;
		
		System.out.printf("당신의 국어 점수는 %d 이고, 컴퓨터 점수는 %d 이며, 수학점수는 %d 입니다.",korean,computer,math);
		System.out.printf("당신의 총점은 %d 이며 평균점은 %.2f 입니다.",sum,avg);
		
		
		


	}

}
