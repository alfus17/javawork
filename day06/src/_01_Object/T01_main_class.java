package _01_Object;
import _01_Object.T01_api_class;

public class T01_main_class {

	public static void main(String[] args) {
		
		T01_api_class api = new T01_api_class();
		
//		객체를 생성후 해당 객체 .필드 로 사용이 가능하다
		int result = api.num;
		System.out.println(api.bool);
		System.out.println(api.num);
		
		api.num = -1;
		
		System.out.println(api.num);
		
		
		T02_api_class api2 = new T02_api_class();
		
		System.out.println(api2.adress + api2.age);

		api2.adress = "강원도 인제시";
		api2.age = 62;
		System.out.println(api2.adress + api2.age);
		
		
		
		
	}

}
