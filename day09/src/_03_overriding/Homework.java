package _03_overriding;
class Loading1{
	String input;
	
	Loading1(){
		
	}
	Loading1(String input){
		this.input = input;
	}
	
	void show(String str) {
		System.out.println("Loading");
	}
}
class OverLoading1 extends Loading1{
	
	
	void show(String str) {
		System.out.println(str);
	}
	void show(int i) {
		System.out.println(i);
	}
}

public class Homework {

	public static void main(String[] args) {
		
		System.out.println("");

	}

}
