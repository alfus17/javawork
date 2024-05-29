package _02_HashSet;

import java.util.*;

class ClassA{
	String str;

	// 빈 생성자
	public ClassA(){}
	// String str을 매개변수로 받는 생성자
	public ClassA(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return this.str;
	}
}

public class T01_HashSet {

	public static void main(String[] args) {
		//Set은 객체만 넣을수있음
		HashSet set1 = new HashSet();
		Set set2 = new HashSet();

		ClassA ca1 = new ClassA("a");
		set2.add(ca1);
		set2.add(new ClassA("oracle"));
		set2.add(new ClassA("sql"));
		set2.add(new ClassA("react"));
		set2.add(new ClassA("aws"));
		set2.add(new ClassA("jsp"));

		int size = set2.size();
		System.out.println("저장된 객체의 갯수 : " + size);

		Iterator<ClassA> i = set2.iterator(); 
		while(i.hasNext()) {
			ClassA ca = i.next();
			//			System.out.println(ca);
		}


		// 출력시 계속 호출이 되도록 메소드로 구현
		//		iteratorPrint(set2.iterator());

		set2.add(new ClassA("AWSSS"));
		iteratorPrint(set2.iterator());
		System.out.println("00000000000000000000000000000000000000000000000000000000000");
		// 삭제 : oracle
		Iterator<ClassA> i2 = set2.iterator(); 
		while(i2.hasNext()) {
			ClassA ca = i2.next();
			if(ca.toString().equals("oracle")) {
				i2.remove();
			}

//			System.out.println(ca);
		}
		iteratorPrint(set2.iterator());





	}
	// static은 객체생성 하지 않아도 됨
	static void iteratorPrint(Iterator<ClassA> i  ) {
		//		Iterator<ClassA> i = set.iterator(); 

		while(i.hasNext()) {
			ClassA ca = i.next();
			System.out.println(ca);
		}

	}

}
