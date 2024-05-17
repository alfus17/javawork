package _03_bank;

public class T01_api_bank {
	private int balance;
	
	void Deposit(int money) {
		balance += money;
	}
	
	void witdraw(int money) {// 영어단어로 철회하다 인수하다 
		if(money <= balance) {
			balance -= money;
		}else {
			System.err.println("잔고가 부족합니다 !");
		}
		
	}
	
	int getBalance() {
		return balance;
	}
	
}
