package _02_HashSet;

import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;


public class T04_HashSet {

	public static void main(String[] args) {
		//                             여기는 자료형 안넣어도 왼쪽어 넣었으면 들어감
		Set<Integer> set = new HashSet<Integer>();
		
		while (set.size() < 6) {
			set.add((int)(Math.random()*100 +1));
		}
		System.out.println(set);
		set.clear();
		// 같은값이 들어갈수 있기때문에 set의 사이즈를 특정하기 어렵다.
		for(int i=0; set.size() < 6; i++) {
			set.add((int)(Math.random()*100 +1));
		}
		System.out.println(set);
		
		// set은 순서가 없기때문에 정렬하지 못한다.
		// 정렬을 하려면 List로 변환해야한다.
		List list = new ArrayList(set); // LinkedList, Vector 모두 사용가능
		Collections.sort(list);
		System.out.println(list);
	}

}
