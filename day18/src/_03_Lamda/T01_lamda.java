package _03_Lamda;

public class T01_lamda {

	public static void main(String[] args) {
		MyMethod mm;
		
		mm = (x,y)-> sum(x,y);
		System.out.println(mm.method(3,5));
	}
	
	static int sum(int x, int y) {
		return x+y;
	}

}
