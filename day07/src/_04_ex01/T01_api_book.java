package _04_ex01;

public class T01_api_book {
//	변수  String bookName int ISBN int price
//	위 변수를 생성자 : 매개변수 0 ,1,2,3 총 4개 생성
//
	String bookName;
	int ISBN , price;
	
	T01_api_book(){
		this("어린왕자(예시)",10,10000);
		print();
	}
	
	T01_api_book(String bookName){
		this.bookName = bookName;
		print();
	}
	
	T01_api_book(String bookName , int ISBM){
		this.bookName = bookName;
		this.ISBN = ISBM;
		print();
	}
	
	T01_api_book(String bookName , int ISBM, int price){
		
		this.bookName = bookName;
		this.ISBN = ISBM;
		this.price = price;
		print();

	}
	
	void print() {
		String bookOutput ="책 이름 :" + (bookName == null?"조회되는 책 이름이 없습니다.":bookName);
		String ISBNOutput = "\nISBN : " + (ISBN != 0?ISBN:"입력된 값이 없습니다.");
		String priceOutput = "\n가격 :" + (price != 0? price:"입력된 값이 없습니다");
		
		System.out.println(bookOutput + ISBNOutput + priceOutput);
		System.out.println();
	
	}
	String printf() {
		String bookOutput ="책 이름 :" + (bookName == null?"조회되는 책 이름이 없습니다.":bookName);
		String ISBNOutput = "\nISBN : " + (ISBN != 0?ISBN:"입력된 값이 없습니다.");
		String priceOutput = "\n가격 :" + (price != 0? price:"입력된 값이 없습니다");
		
		System.out.println(bookOutput + ISBNOutput + priceOutput);
		System.out.println();
		
		return priceOutput;
	}

}
