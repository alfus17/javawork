package _06_book;

import java.util.ArrayList;

public class LibraryController {
	Member member = new Member();
	ArrayList<Book>  aList = new  ArrayList<Book>();
	
	LibraryController(Member member){
		this.member = member;
	}
	
	
	void info() {
//		member출력
		System.out.println(member);
	}
//	객체 어레이 리스트 이기 때문에 객체를 add 해줘야함
	void insertBook(Book book) {
		aList.add(book);
		aList.add(book);
		aList.add(book);
		
	}
	
	ArrayList<Book> selectAll(){
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		for(int i = 0; i < aList.size(); i++) {
			book = aList.get(i);
			if(bookTitle.equals(book.title)) {
				return book;
			}else {
				book = null;
			}
			
		}
		return book;
	}

}
