package _06_book;

import java.util.ArrayList;
import java.util.Collections;

public class BookController {

	ArrayList<Book> list = new ArrayList<Book>();
	
	BookController(){
		list.add(new Book("어린왕자", "뒤페르","한빛",3000));
		list.add(new Book("바보멍충이", "장광","더좋은",2000));
		list.add(new Book("개똥벌레", "아르헨","더나은",1300));
		list.add(new Book("말괄량이 삐비", "알리","우리나라",8000));
	}
	
	// list 맨 뒤에 넣기
	void insertBook(Book b) {
		list.add(b);
	}
	
	//리스트 목록 모두 보여주기
	String listAll() {
		return list.size() == 0 ? "" : list.toString();
	}
	
	// 책 검색하여 객체 리턴
	Book searchBook(String title) {
		Book b = null;
		for(Book book :  list) {
			if(book.getTitle().equals(title) ) {
				b =  book;
//				System.out.println(b.toString());
				break;
			}
		}
		return b;
	}
	
	// 책 제목과 저자가 맞으면 list에서 삭제, 삭제한 객체 리턴
	 Book deleteBook(String title, String author) {
		boolean isdeleted = false;
		Book book = null;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title) && list.get(i).getAuthor().equals(author)) {
				try {
					book = list.get(i);
					list.remove(book);
					break;
					
				}catch (Exception e) {
					e.printStackTrace();
				}
				
			}
		}return book;
		
	 }
		
	
	// 오름차순 정렬
	void ascBook() {
		Collections.sort(list);
		System.out.println(list);
		
	}


}
