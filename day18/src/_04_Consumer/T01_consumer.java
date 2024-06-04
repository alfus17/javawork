package _04_Consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;


public class T01_consumer {

	public static void main(String[] args) {
		/* Consumer의 원형 : 미리 구현되어 있음
		 * @FunctionalInterface
			public interface Consumer<T> {

			void accept(T t);
		 	}
		*/


		// Consumer interface : 매개변수 1개, 리턴값 없음
		// 1. 매개변수 1개
		Consumer<String> consumer = x -> System.out.println(x);
		consumer.accept("java");
	
	
		//2. 매개변수 2개 : 앞에 Bi라는 접두어 붙임
		BiConsumer<String, String> vc = (a,b) ->  System.out.println(a+" , " + b);
		vc.accept("더좋은", "의료용 AI");
	
		//3. 매개변수 1개 double 형
		DoubleConsumer douCon = d -> System.out.println(d);
		douCon.accept(333.33);
		
		//4. 매개변수 2개중 1개는 모든 객체 , 1개는 int 형
		ObjIntConsumer<String> oiCon = (a,b) -> System.out.println(a + " , " + b);
		oiCon.accept("program", 2);
	}

}
