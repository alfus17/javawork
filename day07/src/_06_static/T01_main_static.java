package _06_static;

public class T01_main_static {

	public static void main(String[] args) {
		
		T01_api_static as1 = new T01_api_static();
		T01_api_static as2 = new T01_api_static();
		T01_api_static as3 = new T01_api_static();
	
		as1.num = 1000;
		System.out.println("as1.num : " + as1.num);
		System.out.println("as2.num : " + as2.num);
		System.out.println("as3.num : " + as1.num);
		
		as1.sNum += 100000;
		System.out.println("static as1.snum : " + as1.sNum);
		System.out.println("static as2.snum : " + as2.sNum);
	Integer
		System.out.println("static as3.snum : " + as3.sNum);
	}

}
 