package _01_phone;

public class PhoneRun {

	public static void main(String[] args) {
		SmartPhone sphone = new SmartPhone("note20","white");
		System.out.println("model명 : " + sphone.model);
		System.out.println("색상 : " + sphone.color);

		sphone.bell();
		sphone.hangUp();
		sphone.receveVoice("안녕하세요 홍 가네 길동이올시다");
		sphone.sendVoice("안녕하세요 홍 가네 길동이올시다");
		sphone.hangOut();
		sphone.receveVoice("안녕하세요 홍 가네 길동이올시다");
		
		
	}

}
