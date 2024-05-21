package _03_abstract;

public class PhonRun {

	public static void main(String[] args) {
		Phone phone1 = new FolderPhone("홍길동");
		phone1.turnOn();
		phone1.turnOff();
		
		phone1 = new SmartPhone("이순신");
		phone1.turnOn();
		phone1.turnOff();
		
		
	}

}
