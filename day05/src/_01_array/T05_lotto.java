package _01_array;

import java.util.Arrays;
import java.util.Scanner;

public class T05_lotto {

	public static void main(String[] args) {
		//p 122
		
		// 1. 6개의 1차원 배열
		// 2. 1~45숫자를 랜덤으로 추출해서 배열에 넣기
		// 3. 배열에 넣는 값과 랜덤 추출값 비교후 다르면 배열에 넣고 같으면 다시 랜덤(2번으로 돌아감)
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("받고 싶은 로또의 갯수를 적으시오 :");
		int scale = sc.nextInt();
		
		int lottoNum [] = new int[scale];
		int index = 0;

		
		while (lottoNum[lottoNum.length-1] == 0) {
			int random = (int)(Math.random() *45 +1);
			boolean insert = true;
			
			for(int i=0; i <index; i ++) {
				if(lottoNum[index] == random) {
					insert = false;
					break;
				}	
			}
			
			if(insert) {
				lottoNum[index] = random;
				index++;
			}
		} 
		System.out.print("나온 로또의 번호 : ");
		System.out.println(Arrays.toString(lottoNum));

		
		
	}

}
