package _03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T11_Exception {

	public static void main(String[] args) {

		try {
			int [] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력 : ");
			int sum = 0;
			for(int i = 0; i <num.length; i++) {
				System.out.println(i+1 + "번째 정수 입력 :");
				num[i] = sc.nextInt();
				sum += num[i];
				
			}System.out.println("합계 : " + sum);
			
		}catch (Exception e) { // Exception은 최상위 부모라서 모든 예외 클래스를 다 받는다.
			System.out.println("예외발생");
			e.printStackTrace();
		}
		
		try {
			int [] num = new int[3];
			Scanner sc = new Scanner(System.in);
			System.out.println("정수 입력 : ");
			int sum = 0;
			for(int i = 0; i <num.length; i++) {
				System.out.println(i+1 + "번째 정수 입력 :");
				num[i] = sc.nextInt();
				sum += num[i];
				
			}System.out.println("합계 : " + sum);
		
//			모든 exception을 다 받기 땜에
		}catch (Exception e) { // Exception은 최상위 부모라서 모든 예외 클래스를 다 받는다. // 얘는 다 받기때문에 맨 아래로 가야한다.
			System.out.println("예외발생");
			e.printStackTrace();
//		} catch (NullPointerException e) {
//			
//			}catch (ArrayIndexOutOfBoundsException e) {
//			
//			}catch (ClassCastException e) {
//			
//			}catch (IllegalArgumentException e) {
//			
//			}catch (InputMismatchException e) {
//
//			}
//		
	} 

}
}
