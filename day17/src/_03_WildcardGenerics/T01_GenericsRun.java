package _03_WildcardGenerics;

public class T01_GenericsRun {

	public static void main(String[] args) {
		 
//		Applicent<Person> ap = new Applicent(new Person());
//		Applicent<Student> ap2 = new Applicent(new Worker());
//		Applicent<Student> ap3 = new Applicent(new HighStudent());
	
		// 모든사람 가능 코드
		Course.registerCourse(new Applicent<Person>(new Person()));
		Course.registerCourse(new Applicent<Worker>(new Worker()));
		Course.registerCourse(new Applicent<Student>(new Student()));
		Course.registerCourse(new Applicent<Student>(new HighStudent()));
		Course.registerCourse(new Applicent<Student>(new MiddleStudent()));
		
		// 학생만 신청 가능
		Course.registerCourse2(new Applicent<Student>(new HighStudent()));
		//Course.registerCourse2(new Applicent<Person>(new Person())); => 부모 안됨 extents임
		 

		
		
	}

}
