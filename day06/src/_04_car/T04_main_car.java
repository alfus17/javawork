package _04_car;

import java.util.Scanner;

public class T04_main_car {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T04_api_car car = new T04_api_car();

		System.out.println("아래 번호를 입력하시오");
		boolean quitMenu = true;
		boolean carStatus = true;
		int inputNum = 0;


		while(quitMenu) {
			System.out.println("\n현재 차의 상태 : " + (car.power ? "ON" : "Off"));
			carStatus = car.power;
			System.out.println("현재 차의 색상 : " + car.nowColor);

			System.out.println("선택 가능한 메뉴 \n1:차색상 변경 \n2: 스피드 업 \n3: 스피드 다운 \n4: 차량 On/Off \n5: 메뉴창 종료");
			inputNum = sc.nextInt();

			if(carStatus | inputNum ==4 | inputNum ==5) {	
				switch (inputNum) {
				case 1: {
					car.changeColor();
					break;
				}
				case 2: {
					System.out.println("스피드 업!! \n현재차량 속도 :" +car.speedUp()); 
					break;
				}
				case 3: {
					System.out.println( "스피드 다운 \n현재차량 속도 :" + car.speedDown()); 
					break;
				}
				case 4: {
					car.powerOnOff();
					break;

				}
				case 5: {
					System.out.println("메뉴를 종료합니다.");
					quitMenu = false;
					break;
				}
				default:
					System.out.println("틀린 메뉴 입니다 다시 입력하세요");
				}

			}else {
				System.out.println("시동을 켜주세요 !!");
			}
		}

	}


}
