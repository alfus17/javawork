package _06_book;



public class Book implements Comparable<Book>{
	private int price;
	private String title;
	private String author;
	private String publisher;
	
	public Book() {}
	public Book(String title , String author, String publisher ,int price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
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
	void setPrice(int pice) {
		this.price = price;
	}
	//getter
	String getTitle() {
		return title;
	}
	String getAuthor() {
		return author;
	}
	String getPublisher() {
		return publisher;
	}
	int getPrice() {
		return price;
	}
	
	//오버라이딩 toString
	@Override
	public String toString() {
		return "[제목 : " + title + " , 저자 : " + author + " , 출판사 : " + publisher + " , 가격 :" + price + "]";
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	// overriding의 조건 : 같은 리턴값 같은 매개변수 다른 출력
	@Override
	public boolean equals(Object obj) {
		return price == ((Book)obj).getPrice();
	}
	@Override
	public int compareTo(Book book) {
		// 모든 비교구문은 compareTo 사용하기 때문에 해당구문으로
		// String 끼리도 comparteTo하면 int 로 리턴가능
		return this.title.compareTo(book.title);
	}
	
	
	
}
