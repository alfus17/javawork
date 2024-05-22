package _04_interface;


// interface를 상속받을 때에는 implements
// 인터페이스는 다중 상속이 가능하다.

public class Tv implements RemoteControl {

	private int volume;
	
	
	@Override
	public void turnOff() {
		System.out.println("Tv를 켭니다");
	}

	@Override
	public void turnOn() {
		System.out.println("Tv를 끕니다");

	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 음량 : " + this.volume);
	}

	@Override
	public void setChannel(int channel) {
		
	}
	
	// interface 에서 default 메소드는 override 해도 되고 안해도 상관없다.
//	
	@Override
	public void method() {
		
	}

}
