package _02_wrapperClass;

public class T02_wrapper_설명 {

	public static void main(String[] args) {
		/*
		 * valueOf() : Integer객체에서 int형 값을 뽑아낸 메소드
		 *				Integer -> 언박싱 -> int 변환 
		 *	- 언박싱(unboxing) : 참조자료형 -> 기본자료형 변환
		 *  -   박싱(boxing) : 기분자료형 -> 참조자료형으로 변환
		 * 
		 */
		
		
		//언박싱
		Integer unm = Integer.valueOf(100);
		int num1 = unm;
		
		Character ch = 'z';
		char c = ch;
		
		int num2 = Integer.parseInt("100");
		Integer num3 = Integer.valueOf("100");
		
		// boxing
		int num4 = 10;
		Integer num5 = Integer.valueOf(num4);
		

	}

}
