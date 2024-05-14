package _02_method;

public class T01_api_method {
	// 반환형이 없는 메소드
	void print1() {
		// void 형이기 때문에 리턴 값이 없다 그렇기에 출력값이 없으면 return 값도 없다.
		System.out.println("반환값이 없고 매개변수도 없는 메소드");
	}
	
	int print2(int inputInt) {
		
		
		System.out.println("반환값이 int이고 매개변수는 없는 메소드");
		
		return inputInt;
	}
	
	String print3 () {
		System.out.println("반환값이 String 이고 매개변수는 없는 메소드");
		return "반환되는 문자";
	}
	
	void print4(int x) {
		System.out.println(x);
	}
	
	int print5(int x , int y) {
		int result = x+y;
		return result;
	}
	
	void print6(String str, int z) {
		System.out.println("입력한 문자열 : " + str );
		System.out.println("입력한 숫자 : " + z );
	}
	
}
