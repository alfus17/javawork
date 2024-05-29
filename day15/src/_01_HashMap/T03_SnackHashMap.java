package _01_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class T03_SnackHashMap {
	public static void main(String[] args) {
		Map <String, Snack> map = new HashMap<String, Snack>();
		
		map.put("포테이토", new Snack("감자맛", 9000));
		map.put("양파링", new Snack("양파맛", 10000));
		map.put("버터링", new Snack("단맛", 20));
		map.put("포카칩", new Snack("쓴맛", 400));
		
		System.out.println(map);
		
		// 키 값이 잇으면 값을 덮어쓰기, 키값이 없으면 넣기
		map.put("포카칩", new Snack("순한새우맛",1000));
		System.out.println(map);

		// replace 키에 해당하는 값 변경(키가 없으면 아무것도 하지 않음)
		map.put("포카칩", new Snack("겁나게매운맛",1000));
		System.out.println(map);
		
		// Iterator에서 사요하고자 하면 Map ->Set으로 변경해줘야한다.
		// 1. Map => Set으로 변경
		Set<String> keySet = map.keySet();
		
		// 2. Set => Iterator에 담기
		Iterator<String> itKey = keySet.iterator();
		
		// 3. Iterator를 돌면서 출력
		while (itKey.hasNext()) {
			String key = itKey.next();
			Snack value = map.get(key);
			System.out.println( key +  " : " + value);
		}
		
		// 2) EntrySet() 이용하는 방법
		Set entrySet = map.entrySet(); // 키 + 값 세트의 집합
		//setd은 아래와 같이 두개가 한꺼번에 안된다. 그렇기 때문에 Entry라는 클래스안에 가져와야한다.
		//
		// 제네릭을 넣으려면 매개변수는 1개만 넣어야 됨
		//Set <String , Snack> e = map.entrySet(); => 오류 . Set(1개의 매개변수만 가진다)
		// 아래와 같이 사용해야한다
		Set <Entry<String,Snack>> e = map.entrySet(); // => Entry는 2개의 매개변수도 가질수 있기때문에 가능하다.
		// 제네릭에 타입 형을 써주지 않으면 강제 형변환을 해줘야 한다.
		Iterator <Entry>itEntry = entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry entry = itEntry.next();
			
			String key = (String)entry.getKey();  // Entry == ky_vgp
			
			
		}
		
	}

}
