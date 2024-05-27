package _03_calendar_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class T04_date {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		
		now.setYear(2025);
		
		// now.setYear(2025)
		
		// MM : 월 , mm : 분
		// hh : 소문자면 12시간 제(0~11)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));
		
		// 맨뒤에 a : 오전 / 오후 
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		System.out.println(sdf1.format(now));
		
		// HH : 대문자이면 24시간 제(0~23)
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(sdf2.format(now));
		
		
	}

}
