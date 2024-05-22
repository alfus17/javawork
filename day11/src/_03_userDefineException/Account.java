package _03_userDefineException;

//같은 프로젝트 라서 임포트만 함
import _01_anonymous.TestMain;
// 같은 프로젝트안에 있으면 임포트만 하면됨
// 하지만 다른 프로젝트에 있을 경우에는 프로젝트를 포함시키는 과정이후에 임포트를 해야한다.
import _03_bank.T01_api_bank;

public class Account {

	
		private int balance;
		
		void deposit(int money) {
			balance += money;
		}
		
		void witdraw(int money) throws UserException {
			if(balance < money)
				throw new UserException("잔고부족:" + (money-balance) +"모자람");
			else
				balance -= money;
		}
		
		int getBalance() {
			return balance;
		}
}


