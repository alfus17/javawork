package _01_generics;
class Box{
	private Object object;
	void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
	
}

class Auction{}

public class T01_nonGenerics {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		// Object (부모) 이기때문에 자식인 (String)으로 형변환 필요
		String name =(String)box.get();
		
		// 이렇게 제네릭으로 하지 않으면 강제로 형변환 해야한다.
		box.set(new Auction());
		Auction a = (Auction)box.get();
		
		 
	}
}
