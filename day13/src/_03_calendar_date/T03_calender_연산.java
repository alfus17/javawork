package _03_calendar_date;

import java.util.Calendar;

public class T03_calender_연산 {
	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		
		date1.add(Calendar.DATE, 100);
		System.out.println((date1.get(Calendar.MONTH)+1) + "월  " + date1.get(Calendar.DATE) + "일");
		
	}

}
