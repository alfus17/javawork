package _01_constructor;

public class T01_api_tv {
	String company;
	String model;
	int channel;

//	아래가 생성자 
//	생성자는 객체가 만들어질때 한번만 호출
//	public T01_api_tv() {
//		
//		System.out.println("기본 생성자");
//	}
	
//	public T01_api_tv(String company) {
//		this.company = company;
//		System.out.println(this.company);
//	}
	
	// 매개변수가 3개인 생성자
	T01_api_tv(String company, String model, int channel){
		this.company = company;
		this.channel = channel;
		this.model = model;
		
		System.out.println("");
	}
	
}
