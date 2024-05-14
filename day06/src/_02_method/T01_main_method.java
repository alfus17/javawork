package _02_method;

import java.awt.print.Printable;

public class T01_main_method {

	public static void main(String[] args) {

		// 객체 생성
//		T01_api_method api_method = new T01_api_method();
//		// 반환형이 없는 메소드는 변수에 저장할 수 없고 , 출력 할 수도 없다
//		// int abc = ob1.print1();
//		// System.out.println( api_method.abc());
//
//		
//		api_method.print1();
//		System.out.println( api_method.print2(30));
//		System.out.println( api_method.print3());
////		System.out.println( api_method.print4(1));
//		api_method.print4(3);
//		
//		api_method.print5(3, 5);
//		System.out.println(api_method.print5(3, 5));
//		
//		api_method.print6("바보야", 3);

		
		T02_api_method calculate =new T02_api_method();
		
		int addResult , minusResult, multiResult;
		double divResult;
		
		addResult = calculate.add(3, 4);
		minusResult = calculate.minus(3, 4);
		divResult = calculate.div(3, 4);
		multiResult = calculate.multi(3, 4);
		
		System.out.printf("%d , %d , %d , %.2f",addResult , minusResult, multiResult, divResult);
		
		
	}

}
