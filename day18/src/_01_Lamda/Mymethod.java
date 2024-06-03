package _01_Lamda;


// 함수식 interface를 체크하는 어노테이션
// 추상 메서드가 1개인지를 체크 
@FunctionalInterface
public interface Mymethod {
// 하나만 받을수 있다.
	//public abstract  생략 가능
	public abstract void method();
}
