package _02_abstract;


// 추상 클래스는 추상메소드가 한개라돠 붙어잇으면 추상 클래스이다.
public abstract class Pet {
	private String kind;
	private String color;
	private String feature;
	
	Pet(String kind,String color, String feature){
		this.kind = kind;
		this.color = color;
		this.feature = feature;
	}
//	 추상메서드 : 선언부만 있고 실행부가 없는 매소드
//				상속받는 곳에서 반드시 구현해야한다.
//	추상메소드는  앞에 abstract 키워드를 사용해야한다.
	abstract void sound();
	
	
	
	
	String feature(){//특징
		return "";
	}
	
	// getter
	String getKind(){
		return kind;
	}
	String getColor(){
		return color;
	}
	public String toString(){return "종류 : "+ kind +" , 색상 : " + color;}
	
	void info(){
		System.out.println( "종류 : "+ kind +" , 색상 : " + color + ", 특징 : " + feature() );
	}
	

}
