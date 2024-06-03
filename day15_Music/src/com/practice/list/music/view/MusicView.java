package com.practice.list.music.view;

import java.util.Scanner;
import com.practice.list.music.model.vo.*;

import com.practice.list.music.controller.MusicController;

public class MusicView {
	static Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		boolean quit = true;
		int selectNum = 0;
		
		while (quit) {
			
			// 사용자가 입력한 메뉴 값
			while(true) {
				try {
					printMenu();
					selectNum = sc.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("값을 잘못 입력하셨습니다.");
					sc.next();
				}
			}
			
			
			switch (selectNum) {
			case 1: {
				// 마지막 위치에 곡 추가
				addList();
				break;
			}
			case 2: {
				// 첫 위치에 곡 추가
				addAtZero();
				break;
			}
			case 3: {
				// 전체 곡 목록 출력
				printAll();
				break;
			}
			case 4: {
				// 특정 곡 검색
				searchMusic();
				break;
			}
			case 5: {
				// 특정 곡 삭제
				removeMusic();
				break;
			}
			case 6: {
				// 특정 곡 정보 수정
				setMusic();
				break;
			}
			case 7: {
				// 7일때 곡명 오름차순 정령
				ascTitle();
				break;
			}
			case 8: {
				// 메뉴판 8일때 가수명 내림차순 정렬
				descSinger();
				break;
			}
			case 9: {
				// 메뉴판 9일때 종료 출력이후 main으로 리턴
				System.out.println("종료");
				quit = !quit;
				break;
			}
			default:
				System.out.println("잘못 입력된 숫자입니다.");
			}
		}
		
	}
	
	public void addList() {
//		****** 마지막 위치에 곡 추가 ******
		// 곡 명과 가수 명을 사용자에게 입력 받는다.
		// MusicController에 addList()를 이용해서 입력한 정보를 넘기고
		// 추가 성공 시 “추가 성공”, 추가 실패 시 “추가 실패” 콘솔창에 출력
		System.out.println("곡 명과 가수 명을 입력해 주세요");
		String title =  sc.next();
		String singer  = sc.next();
		
		int result = mc.addList(new Music(title,singer));
		
		System.out.println(result == 1 ? "추가 성공" : "추가 실패");

	}
	
	public void addAtZero() {
		System.out.println("곡 명과 가수 명을 입력해 주세요");
		String title =  sc.next();
		String singer  = sc.next();
		
		int result = mc.addAtZero(new Music(title,singer));
		
		System.out.println(result == 1 ? "추가 성공" : "추가 실패");
	}
	
	public void printAll() {
		System.out.println(mc.printAll());
	}
	
	public void searchMusic() {
		System.out.println("곡 명을 입력하세요");
		String title =  sc.next();
		
		Music resultMusic = mc.searchMusic(title);
		System.out.println(resultMusic != null ? "검색한  곡은 "+resultMusic+"입니다" : "검색한 곡이 없습니다." );
	}
	
	public void removeMusic() {
		System.out.println("삭제할 곡의 이름을 입력해 주세요");
		String rmTitle = sc.next();
		
		Music rmResultMusic = mc.removeMusic(rmTitle);
		
		System.out.println(rmResultMusic != null ? rmResultMusic+"을 삭제했습니다." : "삭제할 곡이 없습니다." );
	
	}
	
	public void setMusic() {
		System.out.println("수정할 곡의 제목과 가수명을 입력해 주세요");
		String title = sc.next();
		String singer = sc.next();
				
		Music resultSetMusic = mc.setMusic(title,singer);
		
		System.out.println(resultSetMusic != null ? resultSetMusic+"의 값이 변경되었습니다." : "수정할 곡이 없습니다." );
	}
	
	public void ascTitle() {
		int ascResult = mc.ascTitle();
		System.out.println(ascResult == 1 ? "정렬 성공": "정렬 실패");
		
	}
	
	public void descSinger() {
		int descResult = mc.descSinger();
		
		System.out.println(descResult == 1 ? "정렬 성공": "정렬 실패");
	}
	
	public void printMenu() {
		System.out.println("**** 메인메뉴 ****");
		System.out.println("1. 마지막 위치에 곡 추가");
		System.out.println("2. 첫 위치에 곡 추가");
		System.out.println("3. 전체 곡 목록 출력");
		System.out.println("4. 특정 곡 검색");
		System.out.println("5. 특정 곡 삭제");
		System.out.println("6. 특정 곡 정보 수정");
		System.out.println("7. 곡명 오름차순 정렬");
		System.out.println("8. 가수명 내림차순 정렬");
		System.out.println("9. 종료");
		
	}
	
	
	

}
