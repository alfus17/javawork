package _06_Function;

import java.util.*;
import java.util.function.Function;
import java.util.function.*;

public class T02_Fuction2 {
	static List<Student> list = Arrays.asList(
			new Student("홍길동", 70, 80),
			new Student("장발장", 95, 55),
			new Student("아무개", 20, 76),
			new Student("김무개", 30, 83),
			new Student("장무개", 40, 92),
			new Student("개나리", 55, 36)
			);
	
	
	// 평균 출력 메서드
	// 반환형 double
	static double AvgScore(ToIntFunction<Student> function) {
		int sum = 0;
		for(Student student : list) {
			sum += function.applyAsInt(student);
		}
		return  (double)sum /list.size();
	}
	
	// 출력 메소드                      Student로 입력하면 String으로 출력하겠다.
	static void printString(Function<Student, String> function) {
		for(Student student : list) {
			System.out.println(function.apply(student) + " ");
		}
		System.out.println();
	}
	
	static void printInt(ToIntFunction<Student> function) {
		for(Student student :list) {
			System.out.println(function.applyAsInt(student) + " ");
		}System.out.println();
	}
	public static void main(String[] args) {
//		System.out.println("[학생 이름]");
//		printString(t -> t.getName());
	
		System.out.println("[영어 평균 점수]" + AvgScore(t-> t.getEng()));
		System.out.println("[컴퓨터 평균 점수]" +  AvgScore(a -> a.getCom()));
		System.out.printf("[컴퓨터 평균 점수] %.2f" , AvgScore(a -> a.getCom()));
	}

}
