package _01_array;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class T06_ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

//		// 1. 길이 10 인 배열을 선언하고 1~10까지 반복문을 이용하여 순서대로 넣고 출력하기
//		int arr1 [] = new int [10];
//		for(int i=0; i <10; i++) {
//			arr1[i]= i+1;
//		}
//		System.out.println(Arrays.toString(arr1));
//		
//		// 2. 길이 10인 배열을 선언하고 1~10까지 값을 반복문을 이용하여 역순으로 배열 인덱스에 넣고 값 출력
//
//		int arr2 [] = new int [10];
//		for(int i= 0; i<10; i++) {
//			arr2[i] = 10-i;
//		}
//		System.out.println(Arrays.toString(arr2));
//		
//		// 3. 사용자로 부터 입력받은 수 만큼 배열을 만들고 1 ~ 입력받은 수를 차례대로 넣어 출력
//
//		Scanner sc = new Scanner(System.in);
//		System.out.println("배열의 길이를 입력해 주세요 :");
//		int scale = sc.nextInt();		
//
//		int arr3 [] = new int [scale];
//		for(int i=0; i < scale; i ++) {
//			arr3[i] = i+1;
//		}
//		System.out.println(Arrays.toString(arr3));
//		
//		// 4. 길이가 5인 배열에 사과,귤,포도,복숭아,참외로 초기화 후 배열 인덱스를 이용하여 귤 출력
//		String fruits [] = new String [5];
//		String list [] = {"사과","귤","포도","복숭아","참외"};
//		for(int i=0; i < fruits.length; i++){
//			fruits[i] = list[i];
//		}
//		for(int i=0; i < fruits.length; i++){
//			if( fruits[i].equals("귤")){
//				System.out.print(fruits[i]);
//			}
//		}
		

		//5. 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		//   개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력
		//   ex)
		//   문자열 : application
		//   문자 : i
		//   application에 i가 존재하는 위치(인덱스) : 4 8 
		//   i 개수 : 2
		//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력해주세요 : ");
//		String str = sc.next();
//		char ch []= new char[str.length()];
//		int index = 0;
////		문자 하나하나 배열에 넣음
//		for(int i =0; i<str.length(); i++) {
//			ch[i] = str.charAt(i);	
//		}
		
//		char 배열 테스트 출력문
//		System.out.println(Arrays.toString(ch));
		
//		System.out.print("찾는 문자를 입력해주세요 : ");
//		char searchChar = sc.next().charAt(0);
//		
//		String searchCount = "";
//		int sameCount = 0;
//		
//		for(int i=0; i<ch.length; i++) {
//			if(searchChar == ch[i]) {
//				
//				searchCount += index ==0 ? "0 ," :index + ", ";
//				sameCount++;
//			}
//			index++;
//		}
//		System.out.println("입력받은 문자열 : " + Arrays.toString(ch));
//		System.out.println("찾으려는 문자열 : "+ searchChar);
//		System.out.print(str + " 에서 " + searchChar + " 는 총 : " + sameCount +"개 존재하며 ,  " +searchCount + "인덱스에 존재한다.\n");
//		
//		
	
		
		
		
		
		
		//6. 배열에 요일(월,화,수,목,금,토,일)을 초기화하여 넣고 사용자로 부터 0~6사이의 숫자를 입력받아
		//   숫자와 같은 요일 출력
		//   ex.
		//   0 ~ 6 사이 숫자 입력 : 4			
		//   금요일
		//   0 ~ 6 사이 숫자 입력 : 7
		//   잘못 입력하셨습니다.
		//
		
//		String week [] = {"월","화","수","목","금","토","일"}; 
//		int inputNum1= 0;
//		while (true) {
//			System.out.println("0 ~ 6 사이 숫자 입력 하시오 :");
//			inputNum1= sc.nextInt();
//			if(inputNum1 <= 0 || inputNum1 >=6) {
//				break;
//			}else {
//				System.out.println("다시 입력하세요");
//				continue;
//			}
//		}
//		System.out.println(week[inputNum1] + "요일");
//		
		
		
		
		
		//7. 사용자로 부터 배열의 크기를 입력받아 그 배열의 갯수만큼 숫자로 입력받아 배열에 저장하고
		//   배열 전체의 합 출력
		//
//		System.out.println("설정할 배열의 크기를 입력하시오 : ");
//		int arrScale = sc.nextInt();
//		int intArr [] = new int[arrScale];
//		int arrSum =0;
//		
//		for(int i=0; i < arrScale; i++) {
//			System.out.println((i+1) + " 번째 배열의 값을 입력해주세요");
//			intArr[i] = sc.nextInt();
//			arrSum += intArr[i];
//		}
//		System.out.println("배열의 값 : "+ Arrays.toString(intArr));
//		System.out.println("배열의 전체 합 : " + arrSum);
//		
		
		
		
		
		
		//8. 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		//   중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		//   단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		//   다시 정수를 받도록 하세요. 
		//
		//   ex.
		//   정수 : 4
		//   다시 입력하세요.
		//   정수 : -6
		//   다시 입력하세요.
		//   정수 : 5
		//   1, 2, 3, 2, 1
	
//		
//		int inputNum = 0;
//		
//		while (true) {
//			System.out.println("3이상인 홀수 자연수를 입력하시오 :");
//			inputNum = sc.nextInt();
//			
//			if(inputNum % 2 == 0 || inputNum <3) {
//				System.out.println("다시 입력하시오 :");
//				continue;
//			}else {
//				break;
//			}	
//		}
//		
//		int intArr[] = new int [inputNum];
//		for(int i=0; i < inputNum; i++) {
//			if(i <= inputNum/2 ) {
//				intArr[i] = i+1;
//			}else {
//				intArr[i] = intArr[i-1]-1 ;
//			}
//		}
//		System.out.println(Arrays.toString(intArr));
//		
		
		
		
		
		//
		//9. 사용자가 입력한 값이 배열에 있는지 검색하여
		//   있으면 “OOO 치킨 배달 가능“, 없으면 “OOO 치킨은 없는 메뉴입니다“를 출력하세요.
		//   단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요.
		//   ex.
		//   치킨 이름을 입력하세요 : 양념			
		//   양념치킨 배달 가능
		//
		//   치킨 이름을 입력하세요 : 불닭
		//   불닭치킨은 없는 메뉴입니다.
		//
		
//		String chickMenu [] = {"양념" ,"고추냉이" ,"청양마요","간장","뿌링클","후라이드"};
//		System.out.println("치킨 이름을 입력하세요 :");
//		String seletChick = sc.next();
//		boolean exist = false;
//		
//		for(int i=0; i< chickMenu.length; i++) {
//			if(seletChick.equals(chickMenu[i])){
//				exist = true;
//				break;
//			}
//		}
//		
//		System.out.println(seletChick + (exist == true ? "배달 가능":"은 존재하지 않는 메뉴 입니다"));
//		
//		
		
		
		
		//10. 10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		//     1~10 사이의 난수를 발생시켜 배열에 초기화 후
		//     배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		//
		//     ex.
		//     5 3 2 7 4 8 6 10 9 10 
		//     최대값 : 10
		//     최소값 : 2
		
		int intArr[] = new int[10];
		for(int i=0; i < intArr.length; i++) {
			int ran = (int)(Math.random()*10 +1);
			intArr[i] = ran;
		}
		System.out.println(Arrays.toString(intArr));
		
//		min max 찾기
		int min = intArr[0];
		int max = intArr[0];
		for(int j =0; j < intArr.length; j++) {
			min = min>intArr[j] ? intArr[j] : min;
			max = max <intArr[j] ? intArr[j]: max;
		}
		System.out.println("최소값  : " + min + ", 최대값 : " + max);
						
						
		
		
	}

}
