package _01_obj;

public class T01_api_car {
//	속성 : 회사 , 모델 , 컬러, 스피드
	int speed = 0; // 인스턴스 변수
	String company = "삼송" , model = "람보르기니" ;
	String colorArr[]  = {"빨강" , "파랑", "검정"};
	int colorIndex = 0;
	String nowColor = colorArr[colorIndex % colorArr.length];
	boolean power = false;
	
	// 메소드 : 시동 켜고 끄기 스피드 올리기 내리
	
	int speedUp(int speed ) { // 지역변수
//		this.speed = 객체변수 즉 인스턴스 변수 
//		지역변수 와 인스턴스 변수의 이름이 다를때 사용한다.
		this.speed = speed;
		return this.speed;
	}
	int speedDown(int speed) {
//		매개변수로 받는 지역변수가 없을 경우 굳이 this를 써서 인스턴스 변수랑 연결지을 필요가 없다.
//		speed = speed<=0 ? 0 : speed-5;
		speed = this.speed - speed <= 0 ? 0 :  this.speed - speed;
//		if(this.speed - speed <=0) {
//			this.speed = 0;
//		}else {
//			this.speed -= this.speed - speed;
//		}
		return this.speed;
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
