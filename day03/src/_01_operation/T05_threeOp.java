package _01_operation;
import java.util.*;

public class T05_threeOp {

	public static void main(String[] args) {
		/*
		 * 이번코드 요약정리
		 * 삼항연산자
		 * (조건문) ? (true의 경우) : (false의 경우)
		 */
		
		int num1 = 10;
		int num2 = 7;
		
		String output = num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다";
		System.out.println(output);
		System.out.println(num1 < num2 ? "num1의 숫자가 더 작다" : "num1의 숫자가 더 크다"); // 궃이 변수에 넣지않아도 출력은 가능하다.
		
		int num3 = -8;
		System.out.println("num3 의 절대값 : " + (num3 > 0 ? num3 : -num3)); 
		
		
		//
		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		System.out.println("점수를 입력하시오");
		int score = scan.nextInt();
		
		// sb 사용해보기
//		sb.append ( score >= 80 ? "합격" : "불합격");
//		sb.append("입니다.");
//		String result = sb.toString(); -> 버퍼에 있는 값을 string으로 변환 하느냐 안하느냐 
		System.out.println(sb);

		sb.append("당신의 점수는" + score+"이며, 학점은 " );
		sb.append(score >= 90 ? "A" : (score >= 80 ? "B" : (score >= 70 ? "C" : "F")));
		sb.append(" 입니다.");
		System.out.println(sb);
	
		String re4 = 
				score >= 90 ? "A":
				score >= 80 ? "B":
				score >= 70 ? "C":
				score >= 60 ? "D":
				score >= 50 ? "E":"F";
				
		System.out.println(re4);
				
	
	}

}
