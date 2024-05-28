package _02_ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class T02_ArrayList {

	public static void main(String[] args) {
		// 권장하지 않음
		// 매개변수에 어떠한 객체라도 받겠다는 의미
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add(45.67);
		list.add("6");
		list.add(true);
		
		// 부모의 자료형으로 저장 
		// Integer의 부모형
		Object obj = list.get(0);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
	
		int num1 = (int)list.get(0);
		double db = (double)list.get(1);
		int num2 = Integer.parseInt((String)list.get(2));
		
		
		
	}

}
 