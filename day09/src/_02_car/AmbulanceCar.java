package _02_car;

public class AmbulanceCar extends Car {

	// 사이렌 울리기 
	// 응급처치

	
	
	AmbulanceCar(boolean power , int speed){
		super(power, speed);
	}
// 응급처치
	void firstAid(){
		if(powerCheck()) {
			System.out.println("응급 처지 중입니다 !");
		}else {
			System.out.println("시동을 켜주세요");
		}
		
	}
	
	void siren() {
		if(powerCheck()) {
			System.out.println("삐용삐용삐용");
		}else {
			System.out.println("시동을 켜주세요");
		}
	}

}
