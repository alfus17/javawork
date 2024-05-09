package _02_referenceType;

public class T01_StringClass {

	public static void main(String[] args) {
		
		/*
		 * 이번코드 요점정리
		 * 자바는 jvm (자바 버츄얼 머신) 에서 자동으로 메모리 관리를 해주며
		 * 메모리 관리를 할때 run Data Area라는 곳에 os로 부터 메모리를 할당받는다.
		 * 
		 * 그 이후 변수를 선언할 경우 heap에 쌓이고 이 값은 변할수있다.
		 * 하지만 String의 경우에는 char의 배열, 즉 새로운 객체로 객체의 값은 stack의 영역에 쌓인 이후 heap에 주소만 쌓인다.
		 * 그렇기에 String은 불변한 특성을 지니게 되는것이다.
		 * 그래서 많은 String  선언 또는 +로 스트링선언된 것들을 합치게 될경우 
		 * heap 상에 새로운 스트링 메모리 공간을 잡아먹게 되는것이다.
		 * 그렇기에 String이 자주 합쳐지고 빠지게 될 경우에는 String 보다는 StringBuffer를 사용하는것이 메모리 관리 측면에서 용이하다.
		 * 
		 * 변수는 jvm안에 힙영역에 저장되며 String의 경우 새로운 객체를 생성하기때문에 스택영역에 저장이후 힙 영역에 주소값을 저장한다.
		 * 여기서 다른 객체들과 다른 점은 String의 경우에는 같은 값을 한 변수를 계속해서 만들면 new를 써서 새로운 객체를 만들지 않는 이상 주소값은 동일하다.
		 * 
		 * 하지만 변수의 경우 , 힙영역 상에서 가변할 수 있기때문에 연산을 해도 메모리 공간을 많이 잡아먹지 않는다.
		 * 
		 */
		String name = "홍길동";
		String hobby = "공부하기";
		
		System.out.println("주소가 같은가 ?" + name == hobby);
		
		String str1 = "의료용";
		String str2 = "의료용";
		System.out.println("주소가 같은가?" + (str1 == str2));
		
		String myName = "홍길동";
		System.out.println("주소가 같은가? "+ (name == myName));
		
		String str3 = new String("영상");
		String str4 = new String("영상");
		
		System.out.println("주소가 같은가 :"+ (str3==str4));
		
		System.out.println("값이 같은가 ? : " + str3.equals(str4));
	}

}
