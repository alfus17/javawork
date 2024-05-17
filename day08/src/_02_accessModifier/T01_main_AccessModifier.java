package _02_accessModifier;

public class T01_main_AccessModifier {

	public static void main(String[] args) {
		T01_api_AccessModifier a1 = new T01_api_AccessModifier();
//		System.out.print();
		
		a1.setPriNum(10);
		System.out.println(a1.getPriNum());
		//get 메소드는 값을 변수에 넣어주는데 쓴다
		int num = a1.getPriNum();
	}

}
