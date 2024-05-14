package _03_tv;

public class T01_api_tv {
	String company = "LG";
	String model = "울트라 FULL HD";
	int inch = 65;
	int volume ;  // 기본값  : 0
	int channel =1 ;
	boolean power; // 기본값 false

	void power() {
		System.out.println("티비를" +(power ? "끕니다." : "켭니다.")  );
		power = !power;
		
	}
	
	int channelUp() {
		channel++;
		return channel;
	}
	int channelDown() {
		channel--;
		return channel;
	}
	
	int volumeUp(int volumeInput) {
		volume = volumeInput;
		return volume;
	}

//	int volumeDown(int volumeInput) {
//		volume -= volumeInput;
//		return volume;
//	}
	
}
