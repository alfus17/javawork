package _03_LinkedList;

import java.util.*;

public class T01_LinkedList {

	public static void main(String[] args) {
		// 링크드 리스트가 잇다
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(0,1);
		list.addFirst(3);
		list.addLast(20);
		list.add(50);

//		System.out.println(list);
//		list.remove(1); // index  1번 삭제
//		System.out.println(list);
//		list.remove(); // 맨 앞노드 삭제
//		System.out.println(list);
//		list.removeFirst(); // 맨 앞노드 삭제
//		System.out.println(list);
//		list.removeLast(); // 맨 뒷노드 삭제
//		System.out.println(list);
		
 
		//for문을 쓰면 비효율 적이다 :  i번째 주소는 i-1번에 들어있기 때문에 i-1을 찾고 i-1은 i-2만 알고있기때문에 i-2를 찾아가야한다.
		//그렇기에 결과적으로 0~i까지 다시 돌아야 한다.
		//이터레이터로 도는게 for문 으로 도는거보다 빠르다
		// for 문은 검색속도가 느리다.
		for(int i=0; i< list.size(); i++) {
			list.get(i);
		}
		
		//Iterator : 리스트를 순회할 수 있게 해주는 클래스
		Iterator<Integer> iterator = list.iterator(); // list의 객체를 넣어줌
		// hasNext() =>  남아있는 객체가 있는가? true 아니면 false
		while (iterator.hasNext()) {
			// next() => 순회하면서 객체를 얻어옴
			System.out.print(iterator.next() + " ");
		}
	}

}
