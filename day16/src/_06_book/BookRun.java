package _06_book;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookRun {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
	
		BookController bc = new BookController();
		boolean menuQuit = true;
		
		while (menuQuit) {
			mainMenu();
			int userInputNum = sc.nextInt();
			
			switch (userInputNum) {
			case 1: {
				insertBook(bc);
				break;
			}
			case 2: {
				listAll(bc);
				break;
			}
			case 3: {
				searchBook(bc);
				break;
			}
			case 4: {
				deleteBook(bc);
				break;
			}
			case 5: {
				ascBook(bc);
				break;
			}
			case 9: {
				menuQuit =false;
				break;
			}
			default:
				System.out.println("잘못된 숫자를 입력하셨습니다.");
			}
			
		}
		
	}
	
	
	static void mainMenu() {
		System.out.println("**** 메인메뉴 ****");
		System.out.println("1. 새 도서 추가");
		System.out.println("2. 도서 전체 조회");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제");
		System.out.println("5. 도서명 오름차순 정렬");
		System.out.println("9. 종료");
	}
	//1. 책 삽입
	static void insertBook(BookController bc) {
		System.out.println("책의 정보를 입력해 주세요");
		
		System.out.print("책 제목 : ");				
		String title = sc.next();

		System.out.print("책 저자 : ");				
		String author = sc.next();

		System.out.print("책 출판사 : ");				
		String publisher = sc.next();
		
		System.out.print("책 가격 : ");				
		int price = sc.nextInt();
		bc.insertBook(new Book(title ,author,publisher,price));
	}
	//2. 책 목록들 전체 출력
	static void listAll(BookController bc) {
	
		System.out.println( bc.listAll() == "" ?"책이 없습니다" :  bc.listAll());
		
	}
	//3. 책 찾기
	static void searchBook(BookController bc) {
		System.out.println("책의 제목을 입력해 주세요: ");
		String title = sc.next();
		
		Book findBook =bc.searchBook(title);
		
		System.out.println(findBook == null ? "검색하신 도서가 없습니다" : findBook);
//		System.out.println(findBook );
		
	}
	//4. 책삭제
	static void deleteBook(BookController bc) {
		System.out.println("삭제할 도서를 입력해 주세요: ");
		System.out.print("책 제목 :");
		String title = sc.next();
		System.out.print("책 저자 :");
		String author = sc.next();
		
		Book deleteBook =bc.deleteBook(title, author );
		
		System.out.println(deleteBook == null ? "삭제할 도서를 찾지 못했습니다.":""+ deleteBook +" 해당 도서 를 삭제했습니다.");
		
	}
	//5. 책정렬
		static void ascBook(BookController bc) {
			bc.ascBook();
		}
	
	
}
