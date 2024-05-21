package _08_polymorphismArrayList;

public class Computer extends Product {
	//생성자
	Computer(){
		super(150);
	}
	
//	오버라이딩 해서 toString 변경한거임
	@Override
	public String toString() {
		return "computer";
	}

}
