package _01_generics;

import java.util.ArrayList;

// 제네릭 T를 받는 다는 것
class Fruit{
	@Override
	public String toString() {
		return "Fruit";
	}
	
}

class Apple extends Fruit{
	@Override
	public String toString() {
		return "Apple";
	}
}
class Banana extends Fruit{
	@Override
	public String toString() {
		return "Banana";
	}
}
class Tjoeun {
	@Override
	public String toString() {
		return "Tjoeun";
	}
}
class Box2 <T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {
		list.add(item);
	}
	T get(int i) {
		return list.get(i);
	}
	
	int size() {
		return list.size();
	}
	
	@Override
	public String toString() {
		return list.toString();
	}
	
	
}

public class T03_GenericsExtends {

	public static void main(String[] args) {
		Box2<Fruit> fruit = new Box2<>();
		Box2<Apple> appleBox = new Box2<>();
		Box2<Tjoeun> TjoeunBox = new Box2<>();
		
		fruit.add(new Fruit());
		fruit.add(new Apple());
		fruit.add(new Banana());
//		fruit.add(new Tjoeun()); Fruit와 아무런 관련이 없어서 오류
		
		appleBox.add(new Apple());
//		appleBox.add(new Fruit());  부모 안됨
		
		TjoeunBox.add(new Tjoeun()); // 더 좋은을 제외한 나머지 다 안됨
		
		System.out.println(fruit);
		System.out.println(appleBox);
		System.out.println(TjoeunBox);
		 
	}
}
