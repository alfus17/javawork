package com.practice.snack.controller;

import com.practice.snack.model.vo.Snack;

public class SnackController  {
	Snack snack = Snack.getSnack();
	
	public SnackController(){
		
	}

	
//	 데이터를 setter를 이용해 저장하고 저장완료 출력
	public String saveData(String kind , String name, String flavor, int numOf , int price) {
			snack.setFlavor(flavor);
			snack.setKind(kind);
			snack.setName(name);
			snack.setNumOf(numOf);
			snack.setPrice(price);
		
		return "저장이 완료 되었습니다";
	}
	
//	저장된 데이터를 반환하는 메소드
	public String confirmData() {
		
		return  snack.infomation();
	}
	

}
