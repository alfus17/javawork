package _01_operation;

public class T03_compare {

	public static void main(String[] args) {
		/*이번코드 정리
		 * 
		 * 변수는 jvm안에 힙영역에 저장되며 String의 경우 새로운 객체를 생성하기때문에 스택영역에 저장이후 힙 영역에 주소값을 저장한다.
		 * 여기서 다른 객체들과 다른 점은 String의 경우에는 같은 값을 한 변수를 계속해서 만들면 new를 써서 새로운 객체를 만들지 않는 이상 주소값은 동일하다.
		 * 
		 * 1. 변수는 값이 같은가 를 비교하는 반면에 String이나 객체는 힙영역에 저장된 주소가 같은가를 비교한다.
		 *  
		 */
		
		int num1 = 10;
		int num2 = 50;
		
		boolean re1 = num1 == num2;
		System.out.println("num1 과 num2의 값이 같은가?" + re1);
		
		int num9 = 10 >> 3 ;
		System.out.println(num9);

	}

}
