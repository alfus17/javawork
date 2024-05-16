package _03_overloading;

import java.util.Arrays;


// 같은 패키지 안에서는 같은 클래스가 두개이상이면 안된다. 경로를 찾지 못하기 때문에
class B{
	int num;
	double dou;
	String name;
	
	
//	생성자에서 this() : 다른 생성자 호출
//  this()는 맨 첫줄에 있어야 한다.
//	기본생성자 () 빈가로가 하나는 있어야 한다.
	B(){
		this(1,1.0,"홍길동");
		num =1;
		dou =1.0;
		name = "홍길동";
		System.out.println( "매개 변수가 없는 생성자");

	}
	B(int num){
		this.num =num;
		dou =1.0;
		name = "홍길동";
		System.out.println( "매개 변수 1개인 생성자");

	}
	B(int num, double dou){
		this.num =num;
		this.dou =dou;
		name = "홍길동";
		System.out.println( "매개 변수가 2개인 생성자 이며 하나는 double");

	}
	B(int num, double dou , String name0){
		this.num =num;
		this.dou =dou;
		name = "홍길동";
		System.out.println( "매개 변수가 3개인 생성자 이며 int,double,String을 받는다");
		
	}
}
	
public class T03_main_ConOverloading {

	public static void main(String[] args) {
		B b = new B();
		B b1 = new B(1);
		B b2 = new B(2,2.0);
		B b3 = new B(2,2.0,"장");
		

	}

}
