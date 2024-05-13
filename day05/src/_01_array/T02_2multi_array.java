package _01_array;

public class T02_2multi_array {

	public static void main(String[] args) {
//		2차원 배열 [행의 index][열의 index]
		int[] [] score = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15}};
		
		System.out.println("행의길이  : "+ score.length);
		System.out.println("열의길이  : "+ score[0].length);
		System.out.println("┌────────────────────┐");
		System.out.println("│ 6 │ 7 │ 8 │ 9 │ 10 │");
		System.out.println("│ 1 │ 2 │ 3 │ 4 │ 5  │");
		System.out.println("└────────────────────┘");
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				score[i][j] = score[i][j] *2 -1;
				
				System.out.print(score[i][j] +(j==( score[i].length-1)? " ":", " ));
			}System.out.println();
		}
		
		int[] [] iArr = {
				{1,2,3},
				{4,5},
				{6,7,8,9}
		};
		
	
	}

}
