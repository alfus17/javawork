package _01_print;

public class T03_printf_digit {

	public static void main(String[] args) {

		//		print의 자리 차지
		//		7자리가 나오도록 print 하지만 5자리여서 앞의 두자리가 빔
		System.out.printf("%7d\n", 32000);
		//		7자리가 나오도록 print 하지만 6자리여서 앞의 한자리가 빔
		System.out.printf("%7d\n", 320000);
		System.out.printf("%7d\n", 320);
		System.out.printf("%7d\n", 320);
		System.out.println("_____________________");

		//		%07로 할경우 빈자리는 0으로 채워진다.
		System.out.printf("%07d\n", 32000);
		System.out.printf("%07d\n", 3200);
		System.out.printf("%07d\n", 320);
		System.out.println("_____________________");

		//		왼쪽부터 10자리 오른쪽부터 10자리 그냥 꽉맞게 
		System.out.printf("[%10s]\n", "abcdefg");
		System.out.printf("[%-10s]\n", "abcdefg");
		System.out.printf("[%s]\n", "abcdefg");
		System.out.println("_____________________");

		//		소수점 자리맞추기 예제 1번은 전체 자리수 예제 2번 전체 자리 + 소수점 자리 + 예제3 소수점 자리만
		System.out.printf("%2f\n", 133233.1415);
		System.out.printf("%2.2f\n", 133233.1415);
		System.out.printf("%.2f\n", 133233.1415);

		// format : printf와 사용방법은 동일하다.
		System.out.format("%.2f\n", 133233.1415);


	}

}
