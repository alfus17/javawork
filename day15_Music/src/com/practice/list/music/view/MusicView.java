package com.practice.list.music.view;

import java.util.Scanner;

import com.practice.list.music.controller.MusicController;

public class MusicView {
	static Scanner sc = new Scanner(System.in);
	MusicController mc = new MusicController();
	
	public void mainMenu() {
		boolean quit = true;
		while (quit) {
			printMenu();
			// 사용자가 입력한 메뉴 값
			int selectNum = sc.nextInt();
			
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
		
	}
	
	public void addAtZero() {
		
	}
	
	public void printAll() {
		
	}
	
	public void searchMusic() {
		
	}
	
	public void removeMusic() {
		
	}
	
	public void setMusic() {
		
	}
	
	public void ascTitle() {
		
	}
	
	public void descSinger() {
		
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
