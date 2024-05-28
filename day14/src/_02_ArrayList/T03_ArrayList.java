package _02_ArrayList;

import java.lang.reflect.Array;
import java.util.*;

public class T03_ArrayList {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i=0; i< 10; i++){
			int random = (int)(Math.random()*10);
			list.add(random);
		}
//		System.out.println(list.toString());
		//                                                      3~6 까지만 뽑아옴
		List<Integer> list2 = new ArrayList<Integer>(list.subList(3, 6));
		System.out.println("list2 : "+list2.toString());
		
		// 오름차순 정렬
		Collections.sort(list);
		System.out.println("list : "+list);
	
		// list는 list2의 요소를 모두 가지고 있는가?
		System.out.println("list는 list2의 요소를 모두 가지고 있는가?" +  list.containsAll(list2));
		
		// retainAll 교집합만 남기고 모두 삭제
		System.out.println("교집합 : "  + list.retainAll(list2));
		System.out.println(list);
		System.out.println(list2);
		
		list.clear();
		list2.clear();
		
		for(int i = 0; i <10; i ++) {
			list.add(i+1);
		}
		
		list.set(4,3);
		list2.add(7);
		list2.add(3);
		
		// 문제. list2의 객체가 list 에 들어 있으면 list2의 객체를 삭제. 출력
		
		// list의 경우 인덱스가 내려오기 때문에 삭제가 안될수도 있음 그렇기에 반대부터 삭제를 진행
		for(int i =list2.size()-1 ; i>=0; i--) {
			if(list.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		System.out.println("문제 1");
		System.out.println("list : "+list);
		System.out.println("list2 : "+list2.toString());
		

		
		// 문제. list2의 객체가 list 에 들어 있으면 list의 객체를 삭제. 출력
		
		list.clear();
		list2.clear();
		
		for(int i = 0; i <10; i ++) {
			list.add(i+1);
		}
		
		list.set(4,3);
		list2.add(7);
		list2.add(3);
		
		
		for(int i =0; i< list2.size(); i ++) {
			for(int j = 0 ; j<list.size(); j ++) {
				if(list.get(j) == list2.get(i) ) {
					list.remove(j);
					
				}
			}
		}
		
		
		
		System.out.println("문제 2");
		System.out.println("list : "+list);
		System.out.println("list2 : "+list2.toString());
		
		
		
		
	}

}
 