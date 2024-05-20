package _05_polymorphism;

class Car{
	String color;
	int speed;
	void drive() {
		System.out.println("운전중 빵빵!!!!!!!");
	}
	void stop() {
		System.out.println("Stop!!!!");
	}
}
class FireCar extends Car{
	void water() {
		System.out.println("물을 뿌립니다~~~~");
	}
	
}

public class T03_polyRun {
	public static void main(String[] args) {

		FireCar fcar = new FireCar();
		fcar.drive();
		fcar.water();
		fcar.stop();

//		부모꺼만 지정하였기 때문에 자식의 water는 사용불가
		Car car = fcar;
		car.drive();
		car.stop();
		
		FireCar fcar2 = (FireCar)car; // 부모타입 => 자식타입으로 강제 형변환
		/*
		 * 주의점
		 * 	반드시 부모는 최초객체생성시 자식의 타입으로 객체 생성 되어 있어야 한다.
		 */
		
		//강제 형 변환시 해당 주소 또는 값이 맞는 지 확인하기 위해 if 문 또는 instanceOf() 를 사용해야 한다.
		Car car2 = new Car(); //=> 객체생성시 Car 만 있기 때문에 강제 형변환이 불가능 하다.
		
		
	}

}
