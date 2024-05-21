package _01_polymorphosm;

public class Dog extends Pet{
	Dog(){
		super("불독","빨간색" ,"지랄견");
	}
	Dog(String kind , String color, String feature){
		super(kind, color ,feature);
	}
	
	String sound(){
		return "멍멍";
	}
	String feature(){
		return "지랄견";
	}


	

}
