package _01_constructor;

public class T01_main_tv {

	public static void main(String[] args) {
//		T01_api_tv tv1 = new T01_api_tv("삼성"); // 생성자는 객체가 만들어 질때 생성된다.
//		System.err.println("tv1의 채널 : "+ tv1.channel);
//		
//		T01_api_tv tv2 = new T01_api_tv("LG"); // 생성자는 객체가 만들어 질때 생성된다.
//		System.err.println("tv2의 채널 : "+ tv2.channel);

//		매개변수가 1개인 생성자 사용
//		T01_api_tv tv3 = new T01_api_tv("애플"); // 생성자는 객체가 만들어 질때 생성된다.
//		System.err.println("tv3의 채널 : "+ tv3.company);
//
//		T01_api_tv tv4 = new T01_api_tv("삼성"); // 생성자는 객체가 만들어 질때 생성된다.
//		System.err.println("tv4의 채널 : "+ tv4.company);

		T01_api_tv tv5 = new T01_api_tv("삼성","SM-28791050",13); // 생성자는 객체가 만들어 질때 생성된다.
		System.out.println("tv5의 회사 : "+ tv5.company +"\ntv5의 모델 : "+ tv5.model +"\ntv5의 채널 : "+ tv5.channel);

		T01_api_tv tv6 = new T01_api_tv("SAMSUNG","SM-113748990",33); // 생성자는 객체가 만들어 질때 생성된다.
		System.out.println("tv5의 회사 : "+ tv6.company +"\ntv5의 모델 : "+ tv6.model +"\ntv5의 채널 : "+ tv6.channel);


		
		
	}

}
