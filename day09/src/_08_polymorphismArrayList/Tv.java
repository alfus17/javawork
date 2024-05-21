package _08_polymorphismArrayList;

public class Tv extends Product {
	
//	생성자
	Tv(){
		super(300);
	}
	@Override
//	오버라이딩을 할 경우 toString()의 주소값 표현이 나오지 않고 Tv가 출력된다.
	public String toString() {// toString 은 obj에 들어있고 public 이 때문에 public으로 지정해줘야함
		return	"Tv";
	}
	
	

}
