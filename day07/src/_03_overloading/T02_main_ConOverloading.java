package _03_overloading;

import java.util.Arrays;

class Aaa{
	int num;
	double dou;
	String name;
	Aaa(){
		num =1;
		dou =1.0;
		name = "홍길동";
		System.out.println( "매개 변수가 없는 생성자");

	}
	Aaa(int num){
		this.num =num;
		dou =1.0;
		name = "홍길동";
		System.out.println( "매개 변수 1개인 생성자");

	}
	Aaa(int num, double dou){
		this.num =num;
		this.dou =dou;
		name = "홍길동";
		System.out.println( "매개 변수가 2개인 생성자 이며 하나는 double");

	}
	
	void method() {
		
	}
	// 가변인자 : 들어올 인자의 개수를 모를때 사용한다.
	void method(int num , String... str) { 
		// 뒤에있는 String... str은 가변인자로 안들어와도 되며 몇개가 들어와도 된다.
//		배열로 들어옴
		System.out.println(Arrays.toString(str));
		
	}
	void method(String str , int num ,String...strings ) { 
		
		
	}
//	void method( String... str, String num ) { 
//		// 가변인자는 맨처음에 받을수 없다.
//	}
	
}


public class T02_main_ConOverloading {

	public static void main(String[] args) {
		Aaa aaa1 = new Aaa();
		Aaa aaa2 = new Aaa();
		Aaa aaa3 = new Aaa();
		Aaa aaa4 = new Aaa();
		
		
		aaa4.method(3 , "hi","my","name" ," is", "jang");

	}

}
