package _02_HashSet;

import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

class Member{
	String name;
	int age;
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return age == member.age && name.equals(member.name);
		
		}
		return false;
	}
	
	// 해시코드를 오버라이딩 하면  넣은 값이 같을 경우 주소가 같다.
	@Override
	public int hashCode() {
		return name.hashCode() + age;
	}
	
}

public class T03_HashSet {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 40));
		set.add(new Member("홍길동", 40));

		System.out.println("size : "+ set.size());

		for(Member element: set) {
//			System.out.println(element);
			System.out.println(element.name + ", " + element.age);
		}
		
		
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
