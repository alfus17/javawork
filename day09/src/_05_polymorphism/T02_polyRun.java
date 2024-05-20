package _05_polymorphism;

class Parent{
	void method1() {
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}
class Child extends Parent{
	//어노테이션
	
	/*@Override
	 * 어노테이션은 다른 프로그램에게 유용한 정보를 제공하기 위해 사용되는 것으로 주석과 같은 의미를 가진다.
		어노테이션의 역할
		
		컴파일러에게 문법 에러를 체크하도록 정보를 제공한다.
		프로그램을 빌드할 때 코드를 자동으로 생성할 수 있도록 정보를 제공한다.
		런타임에 특정 기능을 실행하도록 정보를 제공한다.

	 */
	
	@Override
	void method2() {
		System.out.println("child method2()");
	}
	
	void method3() {
		System.out.println("child method3()");
	}
	
}

public class T02_polyRun {
	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child;
		
		Parent parent2 = new Child();
		parent2.method1(); // 오버라이딩 한것은 무조건 자식게 호출된다.
		parent2.method2();
		
		
	}

}
