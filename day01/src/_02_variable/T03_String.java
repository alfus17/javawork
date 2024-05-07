package _02_variable;

public class T03_String {

	public static void main(String[] args) {
		/*
		 * String 은 참조형 변수 : 미리 만들어 놓은 라이브러리
		 */

		String str1 = "더 좋은 아카데미";
		String str2 = "의료용 디지털 영상 표준활용";
		String str3 = "801호";
		System.out.println(str1 + str2);

		//		 escape sequence(이스케이프 문자)
		/*
				 \ + 문자  조합으로 특수한 기능 수행 
				 \n : 줄바꿈
				 \t : 탭만큼 띄우기
				 \" 쌍따옴표를 있는 그대로 출력하시오 
				 문자 앞에 있는 \는 뒤에나오는 물자를 그대로 출력하게 만드는 이스케이프 문자이다.
		 */
		System.out.println("학원명 :"+ str1 +"\n강좌명 : "+ str2);
		System.out.println("학원명 :"+ str1 +"\t강좌명 : "+ str2);
		System.out.println("강의실 : \""+ str3 +"\"\t강좌명 : \""+ str2 + "\"");
		System.out.println("강의실 : \""+ str3 +"\"\n좌명 : \""+ str2 + "\"");
		System.out.println("강의실 : \""+ str3 +"\" \\ 강좌명 : \""+ str2 + "\"");
		
		
		
	}

}
