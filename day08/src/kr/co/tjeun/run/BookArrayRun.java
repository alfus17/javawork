package kr.co.tjeun.run;

import java.util.Scanner;

import kr.co.tjeun.domain.Book;

public class BookArrayRun {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Book[] books = new Book[3];
		
		for (int i =0; i < books.length; i++) {
			System.out.println((i+1) + "책의 책제목 , 저자 , 가격 , 출판사 입력하시오");
			books[i] = new Book(sc.next(),sc.next(),sc.nextInt(),sc.next());
//			sc.nextLine(); -> 
			System.out.print(books[i].information());
		}
	}
}
