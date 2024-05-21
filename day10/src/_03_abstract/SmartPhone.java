package _03_abstract;

public class SmartPhone extends Phone {
	SmartPhone(String owner){
		super(owner);
	}
	
	@Override
	void turnOff() {
		System.out.println("전원을 니다");

	}
	@Override
	void turnOn() {
		System.out.println("전원을 켭니다");
	}
	
	void search(String search) {
		System.out.println(search + " 를 검색합니다.");
	}

}
