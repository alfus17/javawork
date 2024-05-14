package _01_array;

import java.util.Arrays;

public class T07_향상된for문 {

	public static void main(String[] args) {
		// 향상된 for문 배열에서만 사용 가능
		// 배열을 처음부터 끝까지 사용할 때
//		int num[] = {1,2,3,4,5};
//		
//		
////		for(같은 형태의 변수 하나 : 출력할 변수)  -> 배열을 처음부터 끝까지 다 돌때 사용함
//		for(int result : num) {
//			System.out.print(result);
//		}System.out.println("\n------------------------------------------------");
//		
//		String name[] = { "홍홍홍" ,"길길길" , "동동동"};
//		for(String nameOput : name) {
//			System.out.println(nameOput);
//		}System.out.println("------------------------------------------------");
//
//		// 배열의 단점  :  배열의 크기가 넣을 값보다 크면 메모리 낭비 		
//		// 				배열의 크기가 적을 경우 나중에 늘릴 수 없다.
//		
//		// 배열의 크기가 적을 경우 copy 하여 만들어야 함
//		int oldScore[] = {98, 121, 234,234,234};
//		int[] newScore = new int[10];
//		
//		for(int i =0; i < oldScore.length; i ++) {
//			newScore[i] = oldScore[i];
//		}
//		newScore[5] = 57;
//		System.out.println(Arrays.toString(newScore));
//		
////		라이브러리(api) : arraycopy(기존 배열,  <-앞의 배열의 몇번 인덱스 몇번부터, 새로운 배열 , <- 앞의 배열의 몇번에다가 넣을 것인지, 몇개를 넣을 것인지);
//// 		*** 배열 카피 하는것 ***
//		System.arraycopy(oldScore, 0, newScore, 6, 4);
//		System.out.println(Arrays.toString(newScore));
//		
		// 3개를 넣을 수 있는 문자열 배열을 만들어서 값을 넣고 
		// 10개짜리 배열을 만들어서 복사하여 넣기 (index 5번 부터 넣기 2개만)
		String [] strArr = { "HI" , "HELLO" , "NICE"};
		String [] emtyArr = new String[10];
		
//		System.arraycopy(strArr, 0, emtyArr, 5, 2);
		
		int index = 5;
		//향상된 for문 사용
//		for(String str : strArr) {
//			emtyArr[index] = index <7 ? str : null;
//			index++;
//			
//		}
//		System.out.println(Arrays.toString(emtyArr));
//		
//		
//		기본자료형 -> String 으로 바꿀때는 String.valueOf()사용
		
		String indexStr = String.valueOf(index);
		
		String num1 ="1";
		int iNum = Integer.parseInt(num1);
		
		if(iNum == 1 ) {
			System.out.println(true);
		}
		
		if (indexStr.equals("5")) {
			System.out.println("indexStr is String");
		}
		
		
	}

}
