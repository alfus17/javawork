package _01_StringMethod;

public class T02_replace {

	public static void main(String[] args) {
		//replace    :  글자 치환
		String str = "java program jeva aaws java dajiva";
		String newStr = str.replace("java", "자바");
		
		System.out.println(str);
		System.out.println(newStr);
		
		newStr = str.replaceAll("a", "A");
		System.out.println(newStr);

		newStr = str.replaceAll("a", "A");
		System.out.println(newStr);
		
	
		// replaceFirst 
		newStr = str.replace("java","자르반" );
		System.out.println(newStr);

		
	}

}
