package _06_book;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BookRun {

	public static void main(String[] args) {
//		객체를 변수에 할당하지 않고 넣어 줘도 됨
// new Member("장광진",26,"남");
//new Book("어린왕자", "쇼", "한빛");
		
		Member m = new Member("장광진",26,"남");
		
		LibraryController lc = new LibraryController(new Member("장광진",26,"남") );
//		lc.info();
		
		lc.insertBook(new Book("어린왕자", "쇼", "한빛"));
		
//		lc.searchBook("어린왕자");
//		lc.selectAll();
		
//		롬복
		
//		System.out.println(lc.searchBook("바보") == null ? "없습니다" : "찾았습니다." );
		System.out.println(lc.selectAll());
	
//		input
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	}

}
