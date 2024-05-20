package _04_super;

class Parent2{
	int x = 10;
	void show() {
		System.out.println("부모 클래스 메소드 ");
	}
}
class Child2 extends  Parent2{
	int x = 20;
	void show() { // 오버라이딩
		System.out.println("자식클래스 메소드");
	}
	void display() {
		show(); // 바로 위에있는 오버라이딩 된 show() 호출1
		super.show(); // super 가 붙었기 때문에 부모클래스의 show 메소드 호출
		System.out.println("this.x = " + this.x); // 자식 클래스의 x 출력  ( 인스턴스 변수)
		System.out.println("super.x = " + super.x); // 부모 클래스의 x 출력
		
	}
}
public class T02_SuperRun {

	public static void main(String[] args) {
		Child2 c =new Child2();
		c.display();
		
		
	}

}
