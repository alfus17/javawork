package _04_interface;

public class RemoteRun {

	public static void main(String[] args) {
		
//		interface는 이렇게 사용불가
//		RemoteControl rc1 = new RemoteControl();
		Audio audio1 = new Audio();
		audio1.turnOn();
		audio1.turnOff();
		
//		부모 타입으로 형 변환은 가능
		RemoteControl rc1 = audio1;
		rc1.turnOn();
		rc1.turnOff();
		
	
		rc1 = new Tv();
		rc1.turnOn();
		rc1.turnOff();
		
		int a = 0;
	
	}

}
