package _03_overriding;
class riding{
	
}
class OverRiding extends riding{
	
}

class Loading{
	void show(String str) {
		System.out.println("부모클래스 메소드 : " + str );
	}
}
class OverLoading extends Loading{
	void show(String str) {
		System.out.println("자식클래스 메소드 : " + str  + "오버 라이딩");
	}
	void show(int i) {
		System.out.println("자식클래스 메소드 : " + i  + " 오버로딩");
	}
}

public class OverrindgRun {

	public static void main(String[] args) {
		
		System.out.println("왜 안돠ㅐ");

	}

}
