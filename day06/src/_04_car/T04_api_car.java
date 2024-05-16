package _04_car;

public class T04_api_car {
//	속성 : 회사 , 모델 , 컬러, 스피드
	int speed = 0;
	String company = "LG" , model = "람보르기니" ;
	String colorArr[]  = {"빨강" , "파랑", "검정"};
	int colorIndex = 0;
	String nowColor = colorArr[colorIndex % colorArr.length];
	boolean power = false;
	T04_api_car(){
		System.out.println("\n현재 차의 상태 : " + (this.power ? "ON" : "Off"));
		System.out.println("현재 차의 색상 : " + this.nowColor);
	}
	// 메소드 : 시동 켜고 끄기 스피드 올리기 내리
	
	int speedUp() {
		speed += 10;
		return speed;
	}
	int speedDown() {
		speed = speed<=0 ? 0 : speed-10;
		return speed;
	}
	void powerOnOff() {
		System.out.println("차량의 "+(power? "전원을 끕니다" : "전원을 켭니다."));
		power = !power;
	}
	
	void changeColor() {
		System.out.print("차량색상이 "  + nowColor );
		colorIndex++;
		nowColor = colorArr[colorIndex % colorArr.length];
		System.out.println( "에서 " + nowColor + "로 변경 되었습니다." );
		
	}
//	void printOutput() {
//		System.out.print();
//	}
	
	
	

}
