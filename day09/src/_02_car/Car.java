package _02_car;

public class Car {
	
	// Car
	// 시동 켜고 , 시동 끄기 
	// 속도 올리고 내리기

	
	//필드  power speed
	static private boolean power;
	static private int speed;
	
//	// 정적 객체 생성
//	static Car car = new Car();
	
//	생성자
	Car(boolean power , int speed){
		this.power = power;
		this.speed = speed;
	}
//	
////	싱글톤 ( 정적인 객체 주소 반환)
//	static Car getCar() {
//		return car;
//	}
	
//	메소드
	boolean powerCheck() {
		System.out.println("현재 시동은 " + (power==true?"켜져있습니다":"꺼져있습니다."));
		return power;
	}
	
   void speedUp(){
	   this.speed += 10;
	   System.out.println("스피드 업!!\n현재속도 : " + this.speed);
   }
   void speedDown(){
//	   스피드가 0보다 작거나 같으면 0 마이너스 아니면 -10
	   this.speed -= speed<=0?0:10;
	   System.out.println("스피드 업!!\n현재속도 : " + this.speed);
   }
//   power가 켜져있으면 이미 켜져있다 출력 아니면 시동켜기
   void powerOn() {
	   if(power) {
		   System.out.println("이미 켜져 있습니다");
	   }else {
		   power = !power;
		   System.out.println("시동을 켭니다");
	   }
   }
   void powerOff() {
	   if(power) {
		   power = !power;
		   System.out.println("시동을 끕니다.");
	   }else {
		   System.out.println("이미 시동이 꺼져 있습니다.");;
	   }
   }
   
	
	
	
	

}
