package _02_comparable;

import java.security.PublicKey;
import java.util.Iterator;
import java.util.TreeSet;

// tree 구조는 반드시 해야한다 Comparable
// 자바에서 tree구조는 자동으로 하기때문에 반드시 Comparable implements 해야한다
class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name , int age) {
		this.age = age;
		this.name = name;
	}
	

	@Override
	public int compareTo(Person o) {
		if(age < o.age) {
			return -1;
		}else if(age == o.age) {
			return 0;
		}else {
			return 1;
		}
	}
	
}


public class T01_comparable {
	public static void main(String[] args) {
		TreeSet<Person> treeset = new TreeSet<Person>();
		
		treeset.add(new Person("홍길동",45));
		treeset.add(new Person("나자바",21));
		treeset.add(new Person("채규태",68));
		treeset.add(new Person("엄근진",39));
		
		Iterator<Person> iterator = treeset.iterator();
		
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
		
	}

}
