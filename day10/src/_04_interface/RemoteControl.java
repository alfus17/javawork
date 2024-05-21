package _04_interface;

public interface RemoteControl {
	// 앞의 public static final은 인터페이스에서 생략 가능하다.
//	interface에서 상수의 변수명은 대문자로 사용하며 _로 단어를 구분한다.ㅣ
	public static final int MAX_VOLUME = 100;
	
//	컴파일시 public static final을 붙이지 않으면 자동으로 붙여준다.
	int MIN_VOLUME = 0;
	
//	컴파일시 public static final을 붙이지 않으면 자동으로 붙여준다.
	void turnOff();
//	void turnOn();
	
	public abstract void turnOn();
	
	void setVolume(int volume);
	void setChannel(int channel);
	// interface 에는 추상메서드만 들어올수있다
	/*
	 * 오류
	 * 
	 * void setChannel(int channel){}
	 * 
	 * 
	 */
	
	
	
}
