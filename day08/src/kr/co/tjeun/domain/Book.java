package kr.co.tjeun.domain;
// 자바 빈 파일
// 속성, 생성자 , getter /setter 로 이루어져 있음
// 속성 데이터를 담거나 보내주는 역할을 담당
public class Book {
	// 도서명, 저자명, 가격, 출판사
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	public Book(){}

	public Book( String title, String author ,  int price , String publisher){
		this.title = title;
		this.author = author;
		this.price= price;
		this.publisher =publisher;
	}
	
//	 getter
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public int getPrice() {
		return this.price;
	}
	public String getPublisher() {
		return this.publisher;
	}
//	setter
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author =author;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	// 모든 필드의 값을 하나의 문자열로 반환해주는 매소드
	public String information() {
		return "책의 제목 : "+title + "\n가격 : " + price + "\n저자 : " + author + "\n출판사 : " + publisher ;
	}
	

}
