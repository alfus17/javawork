package _06_polymorphismEx;

public class gameDevice extends Product {

	gameDevice(){
		super(70);
	}
	
//	오버라이딩 해서 toString 변경한거임
	@Override
	public String toString() {
		return "게임기";
	}

}
