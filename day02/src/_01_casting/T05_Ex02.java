package _01_casting;
import java.util.*;

public class T05_Ex02 {

	public static void main(String[] args) {
		/*
		 * 코드 요약 정리
		 * 1. 문자하나를 입력받아 그 문자의 유니코드를 출력하기
			
		 */
		
		Scanner scan = new Scanner(System.in);
		
//		문제 1
		System.out.println("문제 1. 문자 하나를 입력하시오");
		char inputChar = scan.nextLine().charAt(0);
		
		int intChar = inputChar;
		System.out.println("문제 2 . 입력하신 문자의 유니코드는  : " + intChar + "입니다.");
//		문제 2
//		2. 국어, 영어, 수학 점수를 입력받아 총점 출력
//	    평균 출력(소수점 2째자리까지 출력)
		String subject[] = {"국어","영어","수학"};
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i<subject.length;i++) {
			System.out.println(subject[i] +"의 점수를 입력하시오");
			int score = scan.nextInt();
			sum += score;
			
		}
		avg = sum / (double)subject.length;
		System.out.printf("각 과목들의 총합은 %d 이며 평균값은 %.2f 입니다.\n", sum, avg);
		
//		문제 3
//		    int iNum1 = 10;
//		    int iNum2 = 4;
//		    float fNum = 3.0f;
//		    double dNum = 2.5;
//		    char ch = 'K'; 
//			
//			3.1  iNum1 / iNum2의 몫 출력
//			3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
//			3.3  iNum1의 값이 10.0으로 출력되게 하기
//			3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
//			3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
//			3.6  iNum1 / fNum 한 결과 소수점 13자리까지 나오게 하시오
//			3.7  ch변수의 유니코드 출력하기
//			3.8  ch변수에 1을 더해 L 이 출력되게 하시오
//		
		System.out.println("문제 3 . ");		
		int iNum1 = 10;
	    int iNum2 = 4;
	    float fNum = 3.0f;
	    double dNum = 2.5;
	    char ch = 'K';
		
	    int dividsResult1 = iNum1 / iNum2;
	    double multiplyResult =  iNum2 * dNum;
//	    double castingResult = (double)iNum1;
//	    double castingDividsResult = (double)dividsResult1;
	    double dividsResult2 =iNum1 / fNum;
	    
	    System.out.println("3.1 iNum1 / iNum2의 몫 : "+ dividsResult1);
	    System.out.println("3.2 iNum2 * dNum 한 결과 : " + multiplyResult);
	    System.out.println("3.3 iNum1의 값이 10.0으로 출력 : " + (double)iNum1);
	    System.out.println("3.4 iNum1 / iNum2 한 결과 소수점까지 나오게 출력 : " + (double)dividsResult1  );
	    System.out.println("3.5 iNum1 / fNum 한 결과 3이 출력 : " + (int)dividsResult2 );
	    System.out.printf("3.6 iNum1 / fNum 한 결과 소수점 13자리까지 나오게 하시오 : %.13f \n" ,dividsResult2 );
	    System.out.println("3.7 ch변수의 유니코드 출력하기 : " + (int)ch);
	    System.out.printf("3.8 ch변수에 1을 더해 %c 이 출력 \n" , ((int)ch + 1));
		
		
	}

}
