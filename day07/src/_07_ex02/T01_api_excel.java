package _07_ex02;
/*
 * 생성자
 * 매개변수가 없는 생성자
 * 매개변수로 empName, dept, job
 * 
 * 메소드
 * 보너스 계산하는 메소드(salary , bonusPoint)
 * 메소드 내에서 출력해줌
 * 
 * 보너스 계산하는 메소드(salary)
 * bonusPoint 0.1로 계산하여 
 * 메소드 내에서 출력해줌
 * 
 * 
 * 
 */

public class T01_api_excel {
	
	int  age , salary ;
	double bonusPoint;
	String gender, phone,adress ,empName ,dept, job;
	static int empNo = 0;
	
	T01_api_excel(){
//		무조거 맨 첫줄이여야 함-> this();
		this("장광진","서버","서버개발자");
		empNo ++;
	}
	T01_api_excel(String empName ,String dept,String job){
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		System.out.println("");
	}
	
	void countSalary(int salary) {
		bonusPoint = 0.1;
		
		printOutput();
		System.out.println("당신이 받을 금액은 : " +(int)(salary * bonusPoint)  + " 원 ");
	}
	void countSalary(int salary , double bonusPoint) {
		this.bonusPoint =bonusPoint;
		printOutput();
		System.out.println("당신이 받을 금액은 : " +(int)(salary * this.bonusPoint) + " 원" );
	}
	void printOutput() {
//		System.out.print("| empNo | empName | dept | job | age | gender | salary | bonusPoint | phone | adress");
//		System.out.printf("| %d | %s | %s | %s | %d | %s | %d | %.2f | %s | %s |" ,  empNo , empName , dept , job , age , gender , salary , bonusPoint , phone , adress );
	}
	

}
