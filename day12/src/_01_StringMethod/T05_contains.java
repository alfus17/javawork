package _01_StringMethod;

public class T05_contains {

	public static void main(String[] args) {
		// contains : 문자열 안에 찾고자 하는 문자열이 포함되어 있는지 검사
		String str = "JSP 웹 프로그래밍";
		
		boolean result = str.contains("java" );
		System.out.println(result);
		
		if(str.contains("웹")) {
			System.out.println("");
		}else{
			System.out.println("기타 프로그램");
		}
	
	}
}
