package _02_repetive;

public class T05_random {

	public static void main(String[] args) {
		//Math 클래스(수학 클래스)
		double doubleRandom = Math.random();
//		System.out.println(doubleRandom ); // 실수형 : 0 ~ 0.99999999
		
		int intRandom1 = (int)(doubleRandom * 10);// 0 ~ 9 까지 랜덤
		int intRandom2 = (int)(doubleRandom * 10 )+ 1; // 1 ~ 10 까지 랜덤
//		System.out.println(intRandom2);
		
		// 0 ~ 4 까지 추출
		// 0 ~ 0.999999 * 5 = 0~ 4.99999999
		int intRandom4 = (int)(Math.random() * 5);
		System.out.println(intRandom4);
		
		int intRandom5 = intRandom4 + 1;
		
	}

}
