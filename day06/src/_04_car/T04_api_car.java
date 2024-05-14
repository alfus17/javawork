package _04_car;

public class T04_api_car {
//	속성 : 회사 , 모델 , 컬러, 스피드
	int speed = 0;
	String company = "LG" , model = "람보르기니" ;
	String colorArr[]  = {"Red" , "Blue", "Black"};
	int colorIndex = 0;
	String nowColor = colorArr[colorIndex % colorArr.length];
	boolean power = false;
	
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
	
	
	

}
