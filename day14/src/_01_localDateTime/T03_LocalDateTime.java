package _01_localDateTime;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class T03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDay = LocalDateTime.of(2024, 5,7,10,0,0);
		LocalDateTime endDay = LocalDateTime.of(2024, 11,25,18,30,0);
		
		
		System.out.println(startDay);
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		System.out.println("시작일 : " + startDay.format(dft));
		System.out.println("종료일 : " + endDay.format(dft));
		
		if(today.isBefore(endDay)) {
			System.out.println("수업 진행중 입니다");
		}else if(today.isAfter(endDay)) {
			System.out.println("종료한 수업 입니다");
		}else if(today.isEqual(endDay)) {
			System.out.println("오늘은 종료날 입니다.");
		}
		
		Duration duration = Duration.between(startDay, endDay);
		System.out.println(duration);
		
		System.out.println("종료일 까지 시간 : " + today.until(endDay,ChronoUnit.HOURS));
		System.out.println("종료일 까지 시간 : " + today.until(endDay,ChronoUnit.MONTHS));  
		System.out.println("종료일 까지 시간 : " + today.until(endDay,ChronoUnit.DAYS));
		
		LocalTime todayEndTime = LocalTime.of(18,30,0);
		System.out.println("수업 종료까지 시간 : " + LocalTime.now().until(todayEndTime,ChronoUnit.HOURS) + "시간 , 분으로는 총 "  +  LocalTime.now().until(todayEndTime,ChronoUnit.MINUTES) + " 분 남았습니다.");
	 
		System.out.println(today.plusYears(3).format(dft));
		System.out.println(today.plusMonths(5).format(dft));
		System.out.println(today.plusDays(15).format(dft));
	
			
	}

}
