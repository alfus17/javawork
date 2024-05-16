package _01_obj;

public class T01_main_car {

	public static void main(String[] args) {

		T01_api_car car1 = new T01_api_car();
		
		System.out.println(car1.speedUp(30));
		System.out.println("car1의 현재 스피드 : "+car1.speed);

		
		T01_api_car car2 = new T01_api_car();
		System.out.println("car2의 현재 스피드 : " + car2.speed);

		
	}

}
