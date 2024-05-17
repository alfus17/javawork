package _01_static;

public class T01_api_static {
//	인스턴스 필드
	int numIn = 3;
	String nameIn = "이턴스";
	
	//정적 필드
	static int numSt = 10;
	static String nameSt = "김정적";
	
	//인스턴스 메소드
	void me1() {
		System.out.println("인스턴스 메소드 me1()");
	}
	
	String me2() {
		System.out.println("인스턴스 메소드 me2()");
		return "me2()";
	}
	static void sMe3() {
		// 클래스에 저장공간이 있으므로 객체를 생성하지 않고도 사용가능
		// 인스턴스 변수 사용 불가 인스턴스 변수는 (메소드)는 반드시 객체가 생성되어야만 사용할 수 있기 때문
		System.out.println("정적 메소드 sMe3()");
		System.out.println("numSt");
//		System.out.println("numIn);
	}
	
	static String  sMe4() {
		System.out.println("정적 메소드 sMe3()");
		return nameSt;
	}

}
