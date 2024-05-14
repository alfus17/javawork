package _02_method;

public class T02_api_method {
	
	// 4칙 연사 + , - , + , *
	//메소드 4개 각 각 리턴값 있이
	//매개변수는 2개
	int add(int x, int y) {
		return x+y;
	}
	int minus(int x , int y) {
		return x-y;
	}
	double div(int x , int y) {
		double result = (double)x/y;
			
		return result;
	}
	int multi(int x , int y) {
		return x*y;
	}

	void print() {
		System.out.println();
	}
}
