package _04_super;

class Parent3{
	int x ;
	public Parent3() {
		System.out.println("부모생성자 호출");
		x = 10;
	}
}
class Child3 extends  Parent3{
	int x = 20;
	int y =x;
	public Child3() {

		System.out.println("자식생성자 호출");
		x = 10*10;
		y = 10*10;
	}
	
}
class GrandChild extends Child3{
	int x;
	GrandChild(){
		System.out.println("손자 생성자 호출");
		x = 10*10*10;
	}
	
}
public class T03_SuperRun {

	public static void main(String[] args) {
		GrandChild child =new GrandChild(); // 자식의 객체가 생성될때 자동으로 부모도 객체가 생성된다.
		System.out.println(child.x); // 메인이 있는곳에서는 슈퍼 호출 불가 super는 반디시 상속 받는곳에 위치해야한다.
		System.out.println(child.y);
	}

}
