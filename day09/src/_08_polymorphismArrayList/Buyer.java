package _08_polymorphismArrayList;

import java.util.ArrayList;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	//ArrayList<객체> cart = new ArrayList<객체>();
	ArrayList<Product> cart = new ArrayList<Product>();
	//		  Product []cart = new Product[10];
	int index =0;
	
//	void buy(Computer com) {
//		
//	}
//	void buy(Tv tv) {
//		
//	}
//	void buy(gameDevice game) {
//		
//	}
	
	void buy(Product p) { //각각의 자식들이 부모인 Product를 가지고있기때문에 
		if(this.money< p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.money -= p.price;
		this.bonusPoint += p.bonusPoint;
		System.out.println(p + " 를 구입함");
		
//		array list 넣는 방법
		cart.add(p);
		index++;
		
	}
	void info() {
		int sum =0;
		String list = "";
	
		// cart ArrayList 가 비었는지 확인
		if(cart.isEmpty()) {
			System.out.println("구입한 제품이 없습니다");
			return;
		}
		
		// .size 들어있는 갯수
		for(int i =0; i < cart.size(); i++) {
			Product p1= cart.get(i); // cart가 Product이기 때문에  Product 형으로 저장
			sum += p1.price;
			list += p1 + ( p1 == null  ?  "" : ", ");
		}
		System.out.println("구입한 물품의 총액 : "+sum);
		System.out.println("구입한 물품 목록 : " + list);
	}
	
	void refund(Product p) {
		if(cart.remove(p)) {
			this.money += p.price;
			this.bonusPoint -= p.bonusPoint;
			System.out.println(p+"반품");
		}else {
			System.out.println("구입하지 않은 상품입니다.");
		}
	}

	
}
