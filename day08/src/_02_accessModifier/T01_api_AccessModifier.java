package _02_accessModifier;

public class T01_api_AccessModifier {
	private  int priNum = 5;
	
	// 무언가를 넣어줄땐 메소드 이름을 set 으로 써준다
	void setPriNum(int priNum) {
//		아래 방식으로 private 안에 있는 변수를 메소드에서 조작가능하다.
		this.priNum = priNum;
		
	}
	// 무언가를 얻어오는 메소드 이름은 get으로 써준다.
	int getPriNum() {
		return priNum;
	}
	
	
	
//	private void method() { // 보통 api의 메소드는 누군가 사용하기 때문에 하는거라서 private로 생성하지 않는다.
//		System.out.println("private 메소드");
//	}

}
