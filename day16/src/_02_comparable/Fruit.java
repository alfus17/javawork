package _02_comparable;

import java.util.Comparator;

public class Fruit {
//	public class Fruit implements Comparable<Fruit>, Comparator {
	String name;
	int price;
	
	public Fruit(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		
		return this.name + this.price;
	}
	
//	@Override
//	public int compareTo(Fruit f) {
//		if(price < f.price) {
//			return -1;
//		}else if(price == f.price) {
//			return 0;
//		}else {
//			return 1;
//		}
//	}
//
//	@Override
//	public int compare(Object obj1, Object obj2) {
//		if(obj1 instanceof Comparable && obj2 instanceof Comparable) {
//			Comparable c1 = (Comparable) obj1;
//			Comparable c2 = (Comparable) obj2;
//			//오름차순  c1.compareTo(c2)
//			//내림차순  c2.compareTo(c1)
//			return c2.compareTo(c1);
//		}
//		return -1;
//	}

}
