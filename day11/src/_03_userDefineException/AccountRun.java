package _03_userDefineException;

import _01_anonymous.TestMain;
import _03_bank.T01_api_bank;

public class AccountRun {

	public static void main(String[] args) {
		
		T01_api_bank b = new T01_api_bank();
		TestMain aa= new TestMain();
		
		Account bank = new Account();
		bank.deposit(10000);
		try {
			bank.witdraw(4000);
		} catch (UserException e) {
			e.printStackTrace();
		}
		
		
	}
	
//	public static void main(String[] args) {
//		T01_api_bank b = new T01_api_bank();
//		TestMain aa = new TestMain();
//		
//		Account bank = new Account();
//		bank.deposit(1000);
//		try {
//			bank.witdraw(4000);
//		} catch (UserException e) {
//			System.out.println(e.getMessage());
//		}
//
//	}

}
