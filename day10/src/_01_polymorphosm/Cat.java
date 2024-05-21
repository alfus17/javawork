package _01_polymorphosm;

public class Cat extends Pet {
//	생성자 2개
	Cat(){
		super("페르시안","검정색", "얌전한 성격");
	}
	Cat(String kind, String color ,String feature){
		super(kind,color,feature);
	}
	
	
	String sound(){
		return "냐옹";
	}
	
	@Override
	String feature(){
		return "얌전한 성격";
	}

}
