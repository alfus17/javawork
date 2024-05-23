package _01_langPackage;
class Value{
	int value;
	Value(int value){
		this.value = value;
	}
	// 최상위 객체인 Object를 사용할 경우 모든 객체가 다 들어옴
//	@Override
//	public boolean equals(Object obj) {
//						// obj를 Value로 강제 형 변환
//		boolean b = this.value == ((Value)obj).value;
//		return b;
//	}
}


public class T01_equals {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
	
		
		// Object클래스의 equals는 주소가 같은가를 물어본다.
		// 오버라이딩으로 값이 같은가를 묻는 메소드를 만들어 사용
		if(v1.equals(v2)) {
			System.out.println("v1 과 v2가 같다");
		}else {
			System.out.println("v1 과 v2가 다르다");
		}
		
		Value v3 = v1;
		if(v1.equals(v3)) {
			System.out.println("v1 과 v3가 같다");
		}else {
			System.out.println("v1 과 v3가 다르다");
		}

	
	
	}
}
