package _01_casting;


public class T03_castingOp {

	public static void main(String[] args) {
		/*
		 * 코드 요약 정리
		 * 높은 byte의 형을 낮은 byte의 형우르 강제로 변환하게 될 경우 해당 형에 범위를 넘어서게 되면 초가한 만큼 한바퀴를 돌아 표기가 된다.
		 * 
		 */
		
		// int 형보다 작은 자료형의 연산은 모두 int로 자동 형변환됨
		byte b1 = 17;
		byte b2 = 20;

		//		byte result = b1 + b2; 오류 byte형 = int형
		int result = b1 + b2;
		byte result2 = (byte)(b1 + b2);
		System.out.println("result : " + result +" result2 : "+ result2);
	
		char c1 = 'A';
		// char c2 = c1 + 1; -> int 이하의 short 나 char byte의 경우 연산하면 int로 변경 되기 때문에 오류 발생
		int c3 = c1 +1;
		char c2 = (char)(c1 + 1);
		
		System.out.println(c2);
		System.out.println(c3);
		
		int num1 = 100;
		int num2 = 3;
		int result3 = num1 /num2;
		System.out.println(num1 + "/" +num2+"의 몫 : "+result3);
		
		double dou2 = 3;
		double result4 = num1 / dou2;  // int / double =  double
		System.out.println(result4);
		
		double re = (double)num1 / num2;
		re = num1 /(double) num2;
		re = (double)num1 / (double)num2;
		
		double re2 = num1 / num2;
		System.out.println(re2);
	}

}
