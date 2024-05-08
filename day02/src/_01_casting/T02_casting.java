package _01_casting;

public class T02_casting {

	public static void main(String[] args) {

		int num1 = 1234555;
		byte b1 = (byte)num1;
		System.out.println(b1);
	
		System.out.println("byte 크기 : " + Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
		System.out.println("short 크기 : " + Short.MIN_VALUE + "~" + Short.MAX_VALUE);
		System.out.println("Integer	 크기 : " + Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
		System.out.println("char	 크기 : " + (int)Character.MIN_VALUE + "~" + (int)Character.MAX_VALUE);
		
		long long1 = 12312312312312312L;
		float float1 = long1;
		System.out.println("long1 : " + float1);
		
		int num2 = 50896;
		char ch1 = (char)num2;
		System.out.println();
	}

}
