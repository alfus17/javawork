package _03_exception;

import javax.swing.text.ChangedCharSetException;

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class T06_classCast {

	public static void main(String[] args) {
		
//		Animal ani = new Animal();
//		Dog dog = new Dog();
//		Cat cat = new Cat();
//		
//		Animal ani1 = dog;
//		Animal ani2 = cat;
		
//		dog = (Dog)ani1;
//		dog = (Dog)ani;
//		
//		try {
//			
//			if(ani instanceof Dog) {
//				dog = (Dog)ani;
//			}else {
//				System.out.println("변경이 불가합니다.");
//			}
//			
//		}catch(Exception e){
//			
//			System.out.println(	"정수로 변경 불가");
//			e.printStackTrace();
//
//		}
		Dog dog = new Dog();
			
		T06_classCast t = new T06_classCast();
		t.change(dog);

	
	}
	// static을 붙이지않으면 무조건 객체를 생성해야 사용가능하다.
	public static Dog change(Animal ani) {
	Dog dog =null;	
	
	if(ani instanceof Dog) {
			dog = (Dog)ani;
	
	}else {
		System.out.println("변경불가");
		
		
	}
	return dog;
	}
}
