package _02_wrapperClass;

import java.util.regex.Pattern;

public class T03_regular {
	public static void main(String[] args) {
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-234-6789";
		
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치");
		}else {
			System.out.println("정규식과 다릅니다.");
		}
		
		
		// 이메일 체크
		// 문자나 숫자 1개 이상 @ 문자나 숫자
		
		
	}

}
