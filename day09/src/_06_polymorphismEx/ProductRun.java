package _06_polymorphismEx;

public class ProductRun {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new gameDevice());
		
		System.out.println("현재 남은 돈 : "+ buyer.money );
		System.out.println("현재 남은 포인트 : "+ buyer.bonusPoint );
		
		
	}

}
