package _02_abstract;

public class Cat extends Pet {
//	생성자 2개
	Cat(){
		super("페르시안","검정색", "얌전한 성격");
	}
	Cat(String kind, String color ,String feature){
		super(kind,color,feature);
	}
	
//	상속받는 애는 반드시 추상클래스의 추상 메소드를 구현해야한다.
	
	@Override
	void sound(){
		System.out.println("냐옹~");
	}
	
	@Override
	String feature(){
		return "얌전한 성격";
	}

}
