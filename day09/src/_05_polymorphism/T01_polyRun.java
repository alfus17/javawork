package _05_polymorphism;

class A{int a=1; }
class B extends A{int b=2;}
class C extends A{int c=3;}
class D extends B{int d=4;}
class E extends C{int c=5;}


public class T01_polyRun {
	public static void main(String[] args) {
//		자동 형변환 : 자식을 부모 타입으로 형변환
		
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;

		
		System.out.println(b.a);
		System.out.println(b.b);
	
		System.out.println(a1.a);
//		System.out.println(a1.b);// -> A만 사용하도록 형변환 했기때문에 A만 사용이 가능하다
		
		System.out.println();
		System.out.println();
		
		System.out.println();
		System.out.println();
		
		
	}

}
