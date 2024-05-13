package _01_array;

import java.util.Scanner;

public class T03_ex01 {

	public static void main(String[] args) {
		// 사용자로부터 5사람의 국어, 수학, 컴퓨터 점수 입력
		
		Scanner sc =new Scanner(System.in);
		
//		String scoreList [] = {"번호","국어","수학","컴퓨터","총점"};
//		
//		int score[][] = new int [3][5];
//		
//		// 학생별 평균
//		double numAvg [] = new double[3];
//
////		스캔 받기
//		for(int i = 0; i < 3; i++) {
////			학생별 평균 및 총점이기때문에 초기화
//			int sum =0;
//			double avg =0.0;
//			
////			번호, 국어, 수학, 컴퓨터, 총점 순으로 점수 입력 받기
//			for(int j = 0; j < scoreList.length ; j ++) {
//				
////				score[i][j] = j==0 ? i+1: sc.nextInt(); 
//				switch (scoreList[j]) {
//				case "번호": {
//					score[i][j] = i+1;
//					break;
//				}
//				case "평균" : {
////					사람별 평균
//					avg = sum /3.0f;
//					numAvg[i] = avg;
//					break;
//				}
//				case "총점" : {
////					사람별 총점
//					score[i][j] =sum;
//					break;
//				}
//
//				default:
//					System.out.print((i+1) + "번째 사람의 " + scoreList[j] + "를 입력하시오\n");
//					score[i][j] = sc.nextInt(); 
//					sum += score[i][j];
//				}
//			}
////			각 번호 학생의 평균 점수 
//			numAvg[i] = sum/3;
//			
////			각 학생의 점수 출력
//			System.out.println((i+1) + "번째 사람의 " );
//			for(int j = 0; j < scoreList.length ; j ++) {
//
//			System.out.print( scoreList[j] + " :" +  score[i][j] + " ," );
//			}System.out.printf("평균은 : %.1f\n ", numAvg[i]);
//			
//		}
//		
		
		
		
		
		
//		
//		int score [] [] = new int[3][3];
//
//		for(int i=0; i<score.length; i++) {
//			int sum =0;
//			double avg =0;
//			System.out.println((i+1)+"번째 학생의 점수를 입력하시오 : ");
//			//	국어 수학 컴퓨터 입력받기
//			for(int j=0; j <score[i].length; j++) {
//				score[i][j] = sc.nextInt();
//				sum += score[i][j];
//			}
//			avg = sum/(double)(score[i].length);
//			
//			// 국어 수학 컴퓨터 총점 및 평균 출력
//			System.out.print((i+1)+"번째 학생의 점수는 국어 , 수학, 컴퓨터 의 점수는");
//			for(int j=0; j <score[i].length; j++) {
//				System.out.print(score[i][j] + (j ==(score[i].length -1 )? " , " : "" ));
//			}System.out.printf("총점 : %d 평균 : %.1f\n" ,sum,avg);	
//			
//		}
		
		
		
	}

}
