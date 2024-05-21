package _08_polymorphismArrayList;

public class ProductRun {

	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		buyer.buy(new gameDevice());
		buyer.info();
//		buyer.refund();
		
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com  = new Computer();
		gameDevice game = new gameDevice();
		
		b.buy(tv);
		b.buy(com);
		b.buy(game);
		System.out.println("현재 남은 돈 : "+ b.money );
		System.out.println("현재 남은 포인트 : "+ b.bonusPoint );
		

		b.refund(game);
		b.refund(com);
		b.refund(tv);
		System.out.println("현재 남은 돈 : "+ b.money );
		System.out.println("현재 남은 포인트 : "+ b.bonusPoint );
		
		
		

		
		
	}

}
