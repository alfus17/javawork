package _01_operation;

import java.util.*;
public class T06_Ex01 {

	public static void main(String[] args) {

//  1. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 양수가 아니면 “양수가 아니다“를 출력하세요.
//
//	2. 키보드로 입력 받은 하나의 정수가 양수이면 “양수다“, 
//	양수가 아닌 경우 중에서 0이면 “0이다“, 0이 아니면 “음수다”를 출력하세요.
//	
//	3.키보드로 입력 받은 하나의 정수가 짝수이면 “짝수다“, 짝수가 아니면 “홀수다“를 출력하세요.
//		
		Scanner scan = new Scanner(System.in);
		
		// 1, 2,3 문제
		System.out.println("정수를 입력하시오");
		int inputNum = scan.nextInt();
		
		String Result = inputNum >0 ? "양수" :inputNum == 0 ? "0" : "음수";
		String Result2 = inputNum %2 ==  0 ? "짝수": "홀수";
		System.out.println(Result+"이면서" +  Result2 +"이다");
		
//		4. 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고 
//			1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		

		System.out.println("인원 수를 입력하시오.");
		int humanCount = scan.nextInt();
		System.out.println("사탕의 개수를 입력하시오.");
		int candyCount = scan.nextInt();
		
		System.out.printf("%d 명의 인원의 %d의 사탕을 %d 만큼 나눠 가졌으며 나머지는 %d 입니다. \n" ,humanCount,candyCount, candyCount/humanCount , candyCount%humanCount);
/*
 * 	5. 키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
	  이 때 성별이 ‘M’이면 남학생, ‘M’이 아니면 여학생으로 출력 처리 하세요.
	  ex.
	  이름 : 박신우
	  학년(숫자만) : 3
	  반(숫자만) : 4
	  번호(숫자만) : 15
	  성별(M/F) : F
	  성적(소수점 아래 둘째자리까지) : 85.75
	
	  3학년 4반 15번 박신우 여학생의 성적은 85.75이다.
 */		
		System.out.println("이름 입력하시오.");
		String name = scan.next();
		System.out.println("학년 입력하시오.");
		int grade = scan.nextInt();
		System.out.println("반 입력하시오.");
		int classNum =scan.nextInt();
		System.out.println("번호 입력하시오.");
		int humanNum =scan.nextInt();
		System.out.println("성별(F/M) 입력하시오.");
		char sex =scan.next().charAt(0);
		System.out.println("성적(소수점 아래 둘째자리까지) 입력하시오.");
		double score =scan.nextDouble();
//		"3학년 4반 15번 박신우 여학생의 성적은 85.75이다."
//		sex == 'M'?"남학생":sex == 'F'?"여학생" :"오류" -> String일 경우  sex.equals("M") ? "남성" : sex.equals("F") ? "여성" : "넌 누구냐";
		
//		String outputResult = grade +"학년" +classNum +"반 "+ humanNum+"번 " + name + (sex == 'M'?"남학생":sex == 'F'?"여학생" :"오류")+" 의 성적은 " + score +"이다.";
//		System.out.println(outputResult);
		
		System.out.printf("%d 학년 %d 반 %d 번 %s %s의 성적은 %.2f이다\n", grade, classNum, humanNum, name,sex == 'M'?"남학생":sex == 'F'?"여학생" :"오류",score);


//		6. 나이를 키보드로 입력 받아 어린이(13세 이하)인지, 청소년(13세 초과 ~ 19세 이하)인지, 
//		성인(19세 초과)인지 출력하세요.
//		
		System.out.println("나이를 입력하시오.");
		int age = scan.nextInt();
		
		System.out.println(age<= 13 ? "어린이" : age >19 ? "성인" : "청소년");
		
		
//		7. 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고, 
//		세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
//		세 과목의 점수와 평균을 가지고 합격 여부를 처리하는데 
//		세 과목 점수가 각각 40점 이상이면서 평균이 60점 이상일 때 합격, 아니라면 불합격을 출력하세요.
//		
//		System.out.println("국어 점수 입력하시오");
//		int koreanScore = scan.nextInt();
//		System.out.println("수학 점수 입력하시오");
//		int mathScore = scan.nextInt();
//		System.out.println("영어 점수 입력하시오");
//		int englishScore = scan.nextInt();
		
		System.out.println("국어 영어 수학 점수 입력하시오(점수는 공백으로 구분합니다)");
		int koreanScore = scan.nextInt();
		int mathScore = scan.nextInt();
		int englishScore = scan.nextInt();

		System.out.println("국어 :" +koreanScore+", 수학 : "+mathScore +", 영어 : " +englishScore);
		int scoreSum = koreanScore + mathScore + englishScore;
		double scoreAvg = scoreSum / 3.0f;
		
		String testResult = koreanScore >=40 &&  mathScore >= 40 && englishScore >= 40 && scoreAvg >= 60 ? "합격" : "불합격";
		System.out.println(testResult);
		
//		8. 주민번호를 이용하여 남자인지 여자인지 구분하여 출력하세요.(입력받을 때 - 포함)
//		
		System.out.println("주민번호를 입력하시오(-를 포함하여야합니다)");
		String socialSecurityNumber = scan.next();
//		todo 예외 처리 필요 
		
		String socialSex = socialSecurityNumber.split("-")[1];
		
		System.out.println(socialSex.charAt(0)=='1' ||socialSex.charAt(0)=='3'  ? "남자" : "여자");
		
//		9. 키보드로 정수 두 개를 입력 받아 각각 변수(num1, num2)에 저장하세요.
//		그리고 또 다른 정수를 입력 받아 그 수가 num1 이하거나 num2 초과이면 true를 출력하고
//		아니면 false를 출력하세요.
//		(단, num1은 num2보다 작아야 함)
//		
		System.out.println("첫번째 정수를 입력하세요");
		int firstNum= scan.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int secondNum= scan.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int thirdNum= scan.nextInt();
		
		System.out.println(thirdNum <=firstNum || thirdNum > secondNum ? true : false );
		
		
		
//		10. 3개의 수를 키보드로 입력 받아 입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요.
		
		System.out.println("첫번째 정수를 입력하세요");
		int num1= scan.nextInt();
		System.out.println("두번째 정수를 입력하세요");
		int num2= scan.nextInt();
		System.out.println("세번째 정수를 입력하세요");
		int num3= scan.nextInt();
		
		System.out.println(num1 == num2 && num1 == num3 ? true : false);

		
		
	}
/*
 * ~ 를 입력하시오
 * 이름 스트링 배열 , 자료형 스트일 배열 
 * for 문으로 입력 받아서 
 * 
 * ~이고, ~ 입니다.
 * 
 * 
 */

}
