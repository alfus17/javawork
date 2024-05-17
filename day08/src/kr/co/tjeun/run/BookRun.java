package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookRun {

	public static void main(String[] args) {
		/*
		//초기화 방법 1. 기본생성자로 객체를 생성하여 getter / setter 메소드로 값 초기화
		Book book = new Book();
		book.setTitle("JAVA");
		book.setPrice(12000);
		book.setAuthor("장광진");
		book.setPublisher("더좋은");
		
		System.out.println(book.information());
		
		// 초기화 방법 2. 매개변수가 있는 생성자 이용
		Book book2 = new Book("Python","gjjang",12000,"재능교육");
		
		System.out.println(book2.information());

		// 초기화 방법 3. 사용자로 부터 값을 입력받아 초기화 하여 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("책제목 , 저자 , 가격 , 출판사 입력하시오");
		Book book3 = new Book(sc.next(),sc.next(),sc.nextInt(),sc.next());

//		String title = sc.next();
//		String author = sc.next();
//		int price = sc.nextInt();
//		String publisher = sc.next();
//
//		Book book3 = new Book(title,author,price,publisher);
		
		System.out.println(book3.information());
		
		*/
		// 관리 해야되는데 일반 변수 사용
		Scanner sc = new Scanner(System.in);
		
		Book book1 = null;
		Book book2 = null;
		Book book3 = null;

		for(int i=0; i<3; i++) {
			System.out.println((i+1) + " 번째 도서 정보 입력");
			System.out.println("책제목 , 저자 , 가격 , 출판사 입력하시오");
			
			String title = sc.next();
			String author = sc.next();
			int price = sc.nextInt();
			String publisher = sc.next();
			
			
//			if(i == 0) {
			book1 = new Book(title,author,price,publisher);
//			}else if(i == 1) {
			book2 = new Book(title,author,price,publisher);
//			}else {
			book3 = new Book(title,author,price,publisher);
//			}
			
			System.out.println(book1.information());
			System.out.println(book2.information());
			System.out.println(book3.information());
			
			// 도서 제목으로 검색하는 서비스
			System.out.println("검색할 책 제목을 입력하시오");
			String search = sc.nextLine();
			
			if(book1.getTitle().equals(search)){
				System.out.println(book1.information());
			}else if(book2.getTitle().equals(search)){
				System.out.println(book2.information());
			}else if(book3.getTitle().equals(search)){
				System.out.println(book3.information());
			}else {
				System.out.println("없음");
			}
			
		}
		
		
		
	}
	
	

}
