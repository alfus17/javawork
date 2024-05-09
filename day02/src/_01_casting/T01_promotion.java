package _01_casting;

public class T01_promotion {

	public static void main(String[] args) {
		
//		요약 정리 : 큰 바이트에  작은 바이트의 형을 넣을 수 있으며 자동으로 형변환 된다
		
		byte b1 = 20; 
		short s1 = b1; //2byte 에 1byte 넣기
		int int1 = b1; // 4byte에 1byte 넣기
		int1 = s1; // 4byte에 2byte 넣기
		
		char ch1 ='A';
		int inch = ch1;
		System.out.println("'A'의 유니코드 : " + inch);
		System.out.println(ch1);
		
		double d1 = int1;
		System.out.println(d1);
		d1 = s1+1;
		System.out.println(d1);
		d1 = b1+2;
		System.out.println(d1);
		
	
	}

}
