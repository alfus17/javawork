package com.practice.snack.model.vo;

public class Snack {
	private String kind , name, flavor;
	private int numOf, price;
	
	// 싱글톤기법으로 스태틱으로 객체 생성
	static Snack snack = new Snack();
	
	private Snack(){
//		this();
	}
	
	// static 으로 객체 주소를 반환, 객체주소 공유
	public static Snack getSnack() {
		return snack;
	}
	
	public Snack( String kind , String name,String flavor, int numOf , int price){
		this.flavor = flavor;
		this.kind = kind;
		this.name = name;
		this.numOf =numOf;
		this.price = price;
	}
	
	// getter 메소드들
	public  String getFlavor() {
		return flavor;
	}
	public  String getKind() {
		return kind;
	}
	public  String getName() {
		return name;
	}
	public  int getNumOf() {
		return numOf;
	}
	public  int getPrice() {
		return price;
	}

	// setter 메소드들
	public  void setFlavor(String kind) {
		this.kind = kind;
	}
	public  void setKind(String name) {
		this.name = name;
	}
	public  void setName(String flavor) {
		this.flavor = flavor;
	}
	public  void setNumOf(int numOf) {
		this.numOf =numOf;
	}
	public  void setPrice(int price) {
		this.price = price;
	}

	
	public String infomation() {
//		모든 정보를 반환하는 메소드
//		return "\n과자종류 : "+kind + "\n과자이름 : " + name +"\n과자맛 : " + flavor +"\n과자개수 : " + numOf +"\n과자가격: "+ price;
		return " " + kind + " ( " + name + " " + flavor +" )" + numOf +" 개 "+ price + "원";
	}

}
