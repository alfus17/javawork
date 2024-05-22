package _03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class T10_multiCatch {

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
			
		} catch (NullPointerException e) {
		
		}catch (ArrayIndexOutOfBoundsException e) {
		
		}catch (ClassCastException e) {
		
		}catch (IllegalArgumentException e) {
		
		}catch (InputMismatchException e) {

		}
		
		
	} 

}
