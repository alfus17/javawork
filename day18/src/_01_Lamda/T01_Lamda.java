package _01_Lamda;

public class T01_Lamda {

	public static void main(String[] args) {
		
		//람다식 사용할 때 사용 하는 interface
		// 1. 추상메서드로 구현
		// 2. 추상메서드 반드시 1개만 있어야됨
		
		Mymethod mx = new Mymethod() {

			@Override
			public void method() {
				System.out.println("method() call");
			}
		};
		
		mx = () -> {
			System.out.println("람다에서 출력");
		};
	}

}
