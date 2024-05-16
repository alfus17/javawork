package _06_static;

public class T01_api_static {
	
	//인스턴스 필드 (속성) ( 클래스 바로 밑에 만들어 져있음)
	int num = 10;   // 변수
	final int MAX  = 25;//상수 한번값이 들어가면 변경할수없다. final이 붙었기때문에 (상수 의미 키워드 : final)
	
	void method1(/*여기 안에들어가는 매개변수도 지역변수다*/) { //매개변수도 지역변수다
//		지역변수 
		int me1 = 3;
		System.out.println(me1);
	}
	
	// 정적필드(속성)
	static int sNum = 0; // -> 모든 객체들이 공동으로 사용하는 값 
	static String sName = "하하";
	
	// 생성자
	T01_api_static(){
		sNum += 10;
	}
	
	
}
