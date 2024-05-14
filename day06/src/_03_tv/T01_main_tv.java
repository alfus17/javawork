package _03_tv;

import java.util.Scanner;

public class T01_main_tv {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		T01_api_tv tv1 = new T01_api_tv();
		
		System.out.println("회사명 : " + tv1.company);
		System.out.println("모델명 : " + tv1.model);
		System.out.println( tv1.inch + " 인치");
		
//		tv의 전원 켜기
		tv1.power();
		
		int channel = tv1.channel;
		System.out.println("현재 채널 : " + channel);
		
		
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelUp());
		System.out.println("현재 채널 : " + tv1.channelDown());
		System.out.println("현재 volume : " + tv1.volumeUp(30));
		System.out.println("컴퓨터의 상태 " + (tv1.power ? "켜져있다" : "꺼져있다"));
		System.out.println("현재 volume : " + tv1.volumeUp(30));
		

	}

}
