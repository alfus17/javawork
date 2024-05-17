package _05_singleton;

public class T01_main_ex {

	public static void main(String[] args) {

		int[] arr = {9 ,25, 5, 24, 13, 3, 21};
		
		Math m  = new Math();
		int max = m.max(arr);
		int min = m.min(arr);
		
		System.out.println("최대값 : " + max);
		System.out.println("최솟값 : " + min);
		
	}

}

class Math{
//	min : 최솟값 , max : 최대값
	int min,max;
	
	int max(int intArr[]){
//		배열의 첫번째 인덱스 대입
		max = intArr[0];
//		배열의 모든 값과 비교
		for (int a : intArr) {max = a > max ? a : max ;}
//		최대값 리턴
		return max;
	}
	int min(int intArr[]) {
//		배열의 첫번째 인덱스 대입
		min = intArr[0];
//		배열의 모든값비교해서 최솟값 대입
		for (int a : intArr) {min = a < min ? a : min;}
//		최솟값 리턴
		return min;
	}
	
	
}