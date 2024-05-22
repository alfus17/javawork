package _03_exception;

public class T02_exception {

	public static void main(String[] args) {
		try {
			//예외가 나올 수 있는 프로그램
			int a = 5/0;
			int b = 5/2;
			
			System.out.println(3);
			System.out.println(4);

		}catch (Exception e) {
			// 예외가 발생 했을 때 수행
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println(6);

		
		
	}

}
