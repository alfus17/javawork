package _01_HashMap;

import java.util.HashMap;
import java.util.Map;

public class T01_HashMap {

	public static void main(String[] args) {
		// 부모에 HashMap || Map 가능
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("장독", 30);
		map.put("장독대", 90);
		map.put("독대", 80);
		map.put("장대", 70);
		map.put("독장대", 50);
		map.put("장12", 20);
		map.put("장24", 10);
		map.put("장13대", 30);
		map.put("장456대", 70);
		
		System.out.println("size : " + map.size());
		// get(키) : 결과는 값
		System.out.println("장독의 점수  : " + map.get("장독"));
		
		map.get("dsadfasd");
		System.out.println(map);
	
		//remove(키) : 객체삭제
		map.remove("장대");
		System.out.println(map);
		
		
		
	}	
	

}
