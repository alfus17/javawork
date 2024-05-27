package _01_StringBuffer_Builder;

import java.util.Random;

public class T03_Math {

	public static void main(String[] args) {
		// 절대값
		System.out.println("-11의 절대값 : " +  Math.abs(-11));
		System.out.println("-11.45의 절대값 : " +  Math.abs(-11.45));

		// 소수점 이하 무조건 올림
		System.out.println("13.1의 올림 : " +  Math.ceil(13.1));
		System.out.println("-13.1의 올림 : " +  Math.ceil(-13.1));
		
		// 소수점 이하 무조건 내림
		System.out.println("13.7의 올림 : " + Math.floor(13.7));
		System.out.println("-13.7의 올림 : " + Math.floor(-13.7));
		System.out.println("--------------------------------------------------");
		
		// 가장 가까운 정수값 반환
		System.out.println("13.1의 가까운 정수 값 : " + Math.rint(13.1));
		System.out.println("13.7의 가까운 정수 값 : " + Math.rint(13.7));
		System.out.println("13.5의 가까운 정수 값 : " + Math.rint(13.5));
		System.out.println("-13.1의 가까운 정수 값 : " + Math.rint(-13.1));
		System.out.println("-13.7의 가까운 정수 값 : " + Math.rint(-13.7));
		
		// 소수점 이하 반올림
		System.out.println("13.78의 가까운 정수 값 : " + Math.round(13.78));
		System.out.println("13.1의 가까운 정수 값 : " + Math.round(13.1));
		System.out.println("-13.1의 가까운 정수 값 : " + Math.round(-13.1));
		System.out.println("-13.78의 가까운 정수 값 : " + Math.round(-13.78));
		
		Random rand = new Random();
		int intRand = rand.nextInt(41);
		
		
		
	}

}
