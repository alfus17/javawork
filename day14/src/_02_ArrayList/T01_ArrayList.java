package _02_ArrayList;

import java.util.*;

public class T01_ArrayList {

	public static void main(String[] args) {

		/*
		 * <제네릭> : 자료형을 넣어주는 것을 권장함.
		 * 			여러 자료형을 받을 시 클래스를 만들어 객체로 넘겨주는 것을 권장함
		 * 	ArrayList 선언 방법
 			ArrayList<자료형 객체 또는 객체> 이름 = new ArrayList<자료형 객체 또는 객체>(배열의 갯수);

		 */
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 자식객체를 부모타입으로 자동형변환하여 사용가능
		List<String> alist = new ArrayList<String>();
		list.add("java"); // list[0]
		list.add("객체 모델링"); // list[1]
		list.add("database"); // list[2]
		list.add(1, "tlqkf"); // list[1] 들어가고 1->2 2->3으로 밀린다.
		list.add("javascript");

		System.out.println("총 저장된 객체 수 : " + list.size());
		System.out.println(list.get(3)); // get(index) 메소드를 이용하여 얻어옴

		// 기존 for 문 
		for(int i =0; i <list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 향상된 for 문
		int index = 0;
		for(String n : list) {
			index++;
			System.out.println(index + ". "+ n);
			
		}
		
		list.remove(2);
		list.remove(0);
		index = 0;
		for(String n : list) {
			index++;
			System.out.println(index + ". "+ n);
		}
		
		// 기존에 있는자리 삭제하고 추가
		list.set(1, "멍청이");
		index = 0;
		for(String n : list) {
			index++;
			System.out.println(index + ". "+ n);
		}
		
		
		
		
	}

}
 