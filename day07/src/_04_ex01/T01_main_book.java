package _04_ex01;

public class T01_main_book {
//	클래스 바로 밑에 선언하는 변수 : 인스턴스 변수
//	인스턴스 변수의 경우 초기화 하지 않아도 기본값이 들어간다
//	ex) int i; ->기본값 0으로 초기화 됨
	public static void main(String[] args) {
//		메소드 아래 생성하는 변수 : 지역변수
//		지역변수는 직접 값을 넣어 초기화 해야한다 ex) int i = 0;
// 객체를 생성할때 다른 값을 넣고 출력하기

		T01_api_book book1 = new T01_api_book();
		T01_api_book book2 = new T01_api_book("묵향");
		T01_api_book book3 = new T01_api_book("달빛조각사",123);
		T01_api_book book4 = new T01_api_book("바람의 검심" , 454,12000);
		
//		String a = book4.print();
		
		String b = book4.printf();
		
	}

}
