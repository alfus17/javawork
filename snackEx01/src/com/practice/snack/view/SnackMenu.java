package com.practice.snack.view;

import java.util.Scanner;

import com.practice.snack.controller.SnackController;
import com.practice.snack.model.vo.Snack;


public class SnackMenu{
	
	Scanner sc = new Scanner(System.in);
	SnackController snackControl = new SnackController();
	
	
	public void menu() {
		
//		사용자로부터 메뉴 입력받아 세이브 하기
		System.out.println( "과자의 종류를 입력하세요 ");
		String kind = sc.next();
		
		System.out.println( "과자의 맛을 입력하세요 ");
		String flavor = sc.next();
		
		
		System.out.println( "과자의 이름을 입력하세요 ");
		String name = sc.next();
		
		System.out.println( "과자의 개수를 입력하세요 ");
		int numOf =sc.nextInt();
		
		System.out.println( "과자의 가격을 입력하세요 ");
		int price = sc.nextInt();
		
//		저장 
		System.out.println(snackControl.saveData(flavor,kind,name,numOf,price));
		
//		입력한 메뉴 출력
		System.out.println (snackControl.confirmData());
		
	}

}
