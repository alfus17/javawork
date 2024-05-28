package _02_ArrayList;

import java.util.*;

public class T04_BoardArrayList_main {

	public static void main(String[] args) {
		List<T04_BoardArrayList_api> list = new ArrayList<T04_BoardArrayList_api>();
		
		T04_BoardArrayList_api b1 = new T04_BoardArrayList_api("제목1","내용1","글쓴이1");
		list.add(b1);
		list.add( new T04_BoardArrayList_api("제목2","내용2","글쓴이2"));
		list.add( new T04_BoardArrayList_api("제목3","내용3","글쓴이3"));
		list.add( new T04_BoardArrayList_api("제목4","내용4","글쓴이4"));
		list.add( new T04_BoardArrayList_api("제목5","내용5","글쓴이5"));
		list.add( new T04_BoardArrayList_api("제목6","내용6","글쓴이6"));
		list.add( new T04_BoardArrayList_api("제목7","내용7","글쓴이7"));
		
		T04_BoardArrayList_api b2 = list.get(1);
		System.out.println(list);
		
		T04_BoardArrayList_api b3 = new T04_BoardArrayList_api ();
		b3.setTitle("title1");
		b3.setContent("게시판 내용");
		b3.setWriter("아무개");
		
		list.add(b3);
		
		System.out.println(list.toString());

		
		
		

		
	}

}
 