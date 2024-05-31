package _01_generics;
// 제네릭 T를 받는 다는 것
class Delivery <T>{
	private T t;
	void set(T t) {
		this.t= t;
	}
	public T get() {
		return t;
	}
	
}

class Gmarket <T>{}

public class T01_Generics {

	public static void main(String[] args) {
		// 뒤쪽에는 똑같이 써주든가 안써줘도 앞의  String 객체 형을 받아온다
		Delivery<String> del = new Delivery<>();
		del.set("program");
		// 따로 형변환을 안해줘도 된다
		String str = del.get();

		Delivery<Integer> del2 = new Delivery<>();
		del2.set(12);
		// 제네릭을 할 경우 생성자 에서 객체의 형타입만 정해주면 되기 때문에 편하다.
		int a = del2.get();
		
		Delivery<Gmarket> del3 = new Delivery();
		del3.set(new Gmarket());
		// 내가 객체를 생성할때 원하는 타입으로 만들수 있다는 장점이 있다.
		Gmarket g = del3.get();
		
		Delivery<Gmarket> del4 = new Delivery();
		del4.set(new Gmarket());
		// 내가 객체를 생성할때 원하는 타입으로 만들수 있다는 장점이 있다.
		Gmarket f = del4.get();
		 
	}
}
