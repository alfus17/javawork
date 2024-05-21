package _06_book;

public class Book {
	String title;
	String author;
	String publisher;
	
	public Book() {
		
	
	}
	public Book(String title , String author, String publisher) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
	}
	//setter
	void setTitle(String title) {
		this.title = title;
	}
	void setAuthor(String author) {
		this.author = author;
	}
	void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	//getter
	String getTitle() {
		return this.title;
	}
	String getAuthor() {
		return this.author;
	}
	String getPublisher() {
		return this.publisher;
	}
	
	//오버라이딩 toString
	public String toString() {
		return "제목 : " + title + " , 저자 : " + author + " , 출판사 : " + publisher;
	}
	
	
	
}
