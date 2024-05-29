package _02_HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class T02_HashSet {

	public static void main(String[] args) {
		String [] inte = {"1","23"};
		Object [] objArr = {"1",Integer.valueOf(3), "2","2","2","3","3","3","4","4","4"};
		
		Set set1 = new HashSet();
		for(Object obj : objArr) {
			set1.add(obj);
		}
		System.out.println(set1);
		
		set1.clear();
		System.out.println("객체의 갯수  : " + set1.size());
		//iteratorPrint(set1.iterator());
		
		
		
	}
	// static은 객체생성 하지 않아도 됨
		static void iteratorPrint(Iterator<Object> i  ) {
			//		Iterator<ClassA> i = set.iterator(); 

			while(i.hasNext()) {
				Object ca = i.next();
				System.out.println(ca);
			}
		}

}
