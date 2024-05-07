package _02_variable;

public class T02_char {

	public static void main(String[] args) {
		/*
		 * String(문자열)을 넣을 경우 ""
		 * char(문자)를 넣을 경우 ''
		 */

		char ch1 = 'a';
		char ch2 = 'b';
		char ch3 = '장';

		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);

		char ch4 = 'A' + 1;
		System.out.println("대문자 A + 1 : " + ch4);
		char ch5 ='C';
		//char ch6 = ch5 + 1; -> 오류가 나는 이유는 형변환때문이다 ch5 -> 4byte(int) 값으로 형변환되어 바뀌였지만 2byte인 char에 넣기 때문에 오류가 발생 
		
		char ch7 = 'A' + '1';
		System.out.println("'A' + '1' : " + ch7); /* A의 유니코드 (65) + 1의 유니코드(49) = 114 그렇기에 출력값은 r(114)*/

		
	}

}
