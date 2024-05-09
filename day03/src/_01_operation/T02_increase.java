package _01_operation;

public class T02_increase {

	public static void main(String[] args) {


		/*이번코드 정리
		 * 
		 * 1. 증감식의 종류
		 * 
		 * 2.이항연산자는 증감식의 연산자위치가 앞이냐 뒤에냐 따라 달라진다.
		 * ex) int result = ++num2 + ++num3; ( num2 와 num3가 증가 한 후 result에 대입 된다.)
		 * ex) result = num2-- + num3--; (num2 와 num3가 합쳐진 후 result 대입이후에 num2 와 num3가 감소한다.)
		 */

		//		1. 아래는 모두 같은 증감식이다.
		int num1 = 10;
		num1 = num1 +1 ;
		num1 += 1;
		num1 ++;
		System.out.println("num1 : "+ num1);
		
		// num1 덮어쓰기
		num1 = 10;
		num1--;
		System.out.println(num1);
		num1--;
		
		// 단항 연산자일때는 연산자가 앞이나 뒤나 결과는 똑같다
		++num1 ;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		// 이항연산자는 증감식의 연산자위치가 앞이냐 뒤에냐 따라 달라진다.
		int num2 = 10;
		int num3 = 10;
		
		// result = (num2의 증감식) + (num3의 증감식) 앞에 있는 ++는 
		int result = ++num2 + ++num3;
		System.out.println(result);
		
		
		num2 = 10;
		num3 = 10;
		
		// result = (++num2)+ num3 를 진행 후 num3에 1을 더한다. 
		result = ++num2 + num3++;
		System.out.println(result);
	
		num2 = 10;
		num3 = 10;
		
		// result에 num2 와 num3를  넣고 난 다음 감소하게 된다.		
		result = num2-- + num3--;
		System.out.println(result);
		
		num2 = 10;
		num3 = 10;
		int num4 = 10;
		
		result = ++num2 + num3-- - num4++;
		System.out.println(result);
		
	
	}

}
