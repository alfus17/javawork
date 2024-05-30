package _02_comparable;

import java.util.*;

class Decending implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		if(obj1 instanceof Comparable && obj2 instanceof Comparable) {
			Comparable c1 = (Comparable) obj1;
			Comparable c2 = (Comparable) obj2;
			//오름차순  c1.compareTo(c2)
			//내림차순  c2.compareTo(c1)
			return c2.compareTo(c1);
		}
		return -1;
	}
	
}



public class T02_comparator {
	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr);
		System.out.println(Arrays.toString(strArr));

		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Decending());
		System.out.println(Arrays.toString(strArr));
	
	}

}
