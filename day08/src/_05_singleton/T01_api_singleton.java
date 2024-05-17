package _05_singleton;

// 싱글톤 : 전체 프로그램에서 단하나의 객체만 만들도록 보장하는 기법
//   	: 실행 클래스에서 객체를 만들지 못하도록 해야함

public class T01_api_singleton {
	
//	실행 클래스에서 객체를 만들지 못하게 (메인 클래스)
	
//	인스턴스 변수 => 정적 변수로 바꾸어줌 그래야 호출 할 수 있음
	static T01_api_singleton sg = new T01_api_singleton();
	
	private T01_api_singleton() {
		System.out.println("객체 생성");
	}

	static T01_api_singleton getSingleton() {
		return sg; // 정적 메소드에서는 정적 필드만 사용가능
	}

}
