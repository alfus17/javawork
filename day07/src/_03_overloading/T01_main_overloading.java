package _03_overloading;
// 클래스 생성시 첫글자는 대문자로
class Over{
//	오버로딩 하는방범
//	오버로딩이란 메소드 의 이름은 같지만 입력되는 매개변수의 타입이 다르거나 매개변수의 갯수가 달라야 한다.
//	모든 경우의 수를 다 함수로 만들어 놓은 느낌이다.
//	아래는 add 메소드를 매개변수의 갯수로  오버로딩 해놓은 예시 이다.
//	리턴값으 달라도 되고 같아도 된다.
	String add() {
		return "제대로된 값을 입력하시오";
	}
	int add(int a) {
		return a;
	}
	int add(int a, int b) {
		return a+b;
	}
	double add(int a, double b , int c) {
		return a+b+c;
	}
	
}

public class T01_main_overloading {

	public static void main(String[] args) {
		
		Over over =new Over();
		
		System.out.println(over.add());
		System.out.println(over.add(1));
		System.out.println(over.add(1,2));
		System.out.println(over.add(1,2.0,3));
	}

}
