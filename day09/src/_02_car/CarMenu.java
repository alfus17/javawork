package _02_car;

import java.util.Scanner;

public class CarMenu {
	Scanner sc = new Scanner(System.in);
	
void MenuInterface(boolean power) {
	
	boolean quit = true;
	
	while(quit) {
		
		System.out.println("1.시동 \n2.속도 \n3.소방차 기능\n4.메뉴 종료");
		int inputNum = sc.nextInt();

		if(power || inputNum == 1) {
			switch (inputNum) {
			case 1: {
				System.out.println("-------------------------------------");
				System.out.println("1.시동 켜기 \n2.시동 끄기");
				int inputNum2 = sc.nextInt();
				
				
			}
			case 2: {
				System.out.println("-------------------------------------");
				System.out.println("1.속도 업 \n2.속도 다운");
			}
			case 3: {
				System.out.println("-------------------------------------");
				System.out.println("1.사이렌  \n2.응급처치");
	
	
			}
			default:{
				System.out.println("번호를 다시 입력해주세요");
				}
			}

		}else {
			System.out.println("시동을 켜주세요!");
		}

	}
}
}

