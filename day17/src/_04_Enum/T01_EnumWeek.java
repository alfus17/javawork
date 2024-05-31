package _04_Enum;

import java.util.Calendar;

public class T01_EnumWeek {
	public static void main(String[] args) {
		Week today = null;

		Calendar cal = Calendar.getInstance();
		// 요일 1~7
		int week = cal.get(cal.DAY_OF_WEEK);
		System.out.println(week);

		switch (week) {
		case 1: {today = Week.SUNDAY;break;}
		case 2: {today = Week.MONDAY;break;}
		case 3: {today = Week.TUESDAY;break;}
		case 4: {today = Week.WEDNESDAY;break;}
		case 5: {today = Week.THURSDAY;break;}
		case 6: {today = Week.FRIDAY;break;}
		case 7: {today = Week.SATURDAY;break;}
		}

		// 요일 1~7
		int month = cal.get(cal.MONTH) +1;
		System.out.println(month);
		Month todayMonth = null;


		switch (month) {
		case 1: {todayMonth = Month.JANUARY;break;}
		case 2: {todayMonth =  Month.FEBRUARY;break;}
		case 3: {todayMonth =  Month.MARCH;break;}
		case 4: {todayMonth = Month.APRIL;break;}
		case 5: {todayMonth = Month.MAY;break;}
		case 6: {todayMonth = Month.JUNE;break;}
		case 7: {todayMonth = Month.JULY;break;}
		case 8: {todayMonth = Month.AUGUST;break;}
		case 9: {todayMonth = Month.SEPTEMBER;break;}
		case 10: {todayMonth = Month.OCTOBER;break;}
		case 11: {todayMonth = Month.NOVEMBER;break;}
		case 12: {todayMonth = Month.DECEMBER;break;}
		}

		if(todayMonth == Month.MAY) {
			System.out.println("5월");
		}





	}
}
