package _01_StringMethod;

import java.util.Arrays;

import javax.print.DocFlavor.CHAR_ARRAY;

public class T03_charArray {

	public static void main(String[] args) {
		String str = new String("혼자 공부하는 SQL");
		
		char[] chArray = {'혼', '자','J','S','P'};
		String str2 = new String(chArray);
		
		System.out.println(str2);
		
		char ch = str.charAt(3);
		System.out.println(ch);
		
		char[] chArray2 = str2.toCharArray();
		
	}

}
