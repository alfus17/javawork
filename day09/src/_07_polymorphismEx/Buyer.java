package _07_polymorphismEx;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[] cart = new Product[10];
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
		cart[index] = p;
		index++;
		
	}
	void info() {
		int sum =0;
		String list = "";
	
		for(int i =0; i < cart.length; i++) {
			if(cart[i] == null)
				break;
			sum += cart[i].price;
			list += cart[i] + ( cart[i+1] == null || i == cart.length ?  "" : ", ");
		}
		System.out.println("구입한 물품의 총액 : "+sum);
		System.out.println("구입한 물품 목록 : " + list);
	}

	
}
