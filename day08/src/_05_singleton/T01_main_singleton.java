package _05_singleton;

public class T01_main_singleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체 생성 불가
		//T01_api_singleton sg = new T01_api_singleton();
		T01_api_singleton singleTon = T01_api_singleton.getSingleton(); // 같은 패키지에서만 사용가능하네? => 얘 생성하면 객체 가 생성되고 객체 주소가 반환됨
		T01_api_singleton singleTon1 = T01_api_singleton.getSingleton(); 
		T01_api_singleton singleTon2 = T01_api_singleton.getSingleton(); 		
	
		if(singleTon == singleTon2) {
			System.out.println("같은 주소");
		}else {
			System.out.println();
		}
	}

}
