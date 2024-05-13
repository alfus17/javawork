package _01_array;

public class T01_continue {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		
		
//		배열 [] 배열선언문  , 배열을 사용할경우 찾아가는데 빠르다	
//		jvm 에서 heap 영역에 arrayInt가 생성되며 주소값을 찾아 갈 경우 stack에 int(4byte *100) 의 객체가 만들어진다.
		
//		배열을 만드는 방법
		int[] arrayInt = new int [5];
//		int arrayInt1[] = new int[3];
		
		/*
		배열 생성시 초기 값들
		int = 0
		double = 0.0
		char = 0
		String = null
		boolean = false
		*/
		
		arrayInt[0] = 10;
		arrayInt[2] = 20;
		System.out.println(arrayInt[2]);
		
		int arrayInt2[] = {1,2,3,4,5};
		
		char[] arrayChar = {'a', 'b' ,'c'};
		String[] arrayStr = {"홍길동","아무개"};
		double[] arrayDou = {35.45 , 90.24, 7};
		
		int[] arrayInt3 = new int[5];
		arrayInt3[5] = 9;
		
		
		
		
		
		
		
		
		
		
		
	}

}
