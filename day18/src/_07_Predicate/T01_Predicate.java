package _07_Predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class T01_Predicate {
	static List<Student> list = Arrays.asList(
			new Student("홍길동", "남", 80),
			new Student("장발장", "남", 55),
			new Student("아무개", "여", 76),
			new Student("김무개", "여", 83),
			new Student("장무개", "남", 92),
			new Student("개나리", "여", 36)
			);
	
	//남 , 여 별 평균 구하기
	static double avg(Predicate<Student> predicate) {
		int sum =0, count =0;
		for(Student student : list) {
			if(predicate.test(student)) {
				sum += student.getCom();
				++count ;
			}
		}return (double)sum/count;
	}
	
	public static void main(String[] args) {
		double maleAvg = avg(t -> t.getSex().equals("남"));
		System.out.printf("[남자 평균 점수] %.2f" , maleAvg);

		double femaleAvg = avg(t -> t.getSex().equals("남"));
		System.out.printf("[여자 평균 점수] %.2f" , femaleAvg);
		
	}

}
