package _01_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T04_min_max {

	public static void main(String[] args) {
		// 1차원 배열의 min 값과 max 값 가져오기
		
//		int [] score = {8, 4, 9, 2,6,1,3,5,7};
		
//		// 자리바꿈
//		int num1 =10;
//		int num2 = 20;
//		
//		num1 = num2;
//		num2 = num1;
//		
//		// num1 -> tmp
//		int tmp = num1;
//		// num1 -> num2
//		num1 = num2;
//		// tmp -> num2
//		num2 = tmp;
		
		// 1차원 배열의 min값과 max값 가져오기
		
//		1차원 배열에서 최소값 비교하여 가져오기
		int [] score = {8, 4, 9, 2,6,1,3,5,7};
		int min = score[0];
		int max = score[0];

		for(int i = 0; i < score.length; i++) {
			if( min > score[i]) {
				min = score[i];
			}
			if(max < score[i]) {
				max = score[i];
			}
		}
		
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);
//		index 번호도 연산 가능
		int k = 2;
		System.out.println(k + "번째 값은 : " + score[k*2]);
		System.out.println(k + "번째 값은 : " + score[k-1]);

		int arri[] = new int[10];
		
		for(int i =0; i< arri.length; i++) {
			arri[i] = (int)(Math.random()*10);
		}
		for(int i =0; i< arri.length; i++) {
			System.out.print(arri[i] + " ,");
		}System.out.println();
		
//		배열 찍는 방법 Arrays.toString(배열이름)
		System.out.println(Arrays.toString(arri));
		
		
		
		
	}

}
