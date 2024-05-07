package day01;

public class T01_print {

	public static void main(String[] args) {

		// 주석은 기계어로 번역하지 않아요
		/*
		 * 여러줄에 걸쳐서 쓰는 주석입니다.
		 */

		
		//		 출력이후 줄바꿈 System.out.println()
		//		숫자는 쌍따옴표를 넣지 않는다 문자도 합쳐지면 문자열 즉 배열이다.
		System.out.println("출력중입니다. 출력중입니다. 출력중입니다.");
		System.out.println("내이름 : 장광진");

		//		문자열은 쌍따옴표를 ("") 넣어준다.
		System.out.println(3+7);
		System.out.println(5/3);

		//		+ 기호는 숫자였을 때에는 연산을 하고 문자열 일 경우 문자들을 연결한다
		System.out.println(5+3+"문자열 연결 예시");
		System.out.println("강의실 : " + " 801호");

		//		연산순서 : 연산결과  +7 -> +9 가 되었기때문에 79라는 값이 출력 
		System.out.println("연산결과 : "+ 7 + 9);
		System.out.println("연산결과 : " + (7 + 9));
		
		System.out.print("줄바꿈 없는 프린트 ");		
		System.out.print("줄바꿈 안됨 ");		
		System.out.println("다음줄부터 줄바꿈 됨 ");		
		
		System.out.println("이름 : 장광진");		
		System.out.println("장점 : 끈기");		
		System.out.println("나이 : 27");
		
		
		
		
	}

}
