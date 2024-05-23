package _01_StringMethod;

public class T08_lastIndexOf {

	public static void main(String[] args) {
		// lastIndexOf(String, fromIndex)
		// fromIndex는 앞을 보고, 문자열 걸쳐져 있으면 그 문자열도 찾는다
		String str = "adsfasdfas";
		
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf("a",2));
		
	}

}
