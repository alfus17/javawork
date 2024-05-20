package _06_polymorphismEx;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	
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
		
		
		
		System.out.println("this.money : " + this.money);
		System.out.println("this.bonusPoint : " + this.bonusPoint);
		
	}

	
}
