package _03_Tree;

import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map.Entry;

public class T03_TreeMap {
	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		treeMap.put("apple", 30000);
		treeMap.put("banana", 900000);
		treeMap.put("cherry", 900);
		treeMap.put("grape", 5000);
		
		System.out.println("[c~n 사이 단어 검색]");
		NavigableMap<String,Integer> raviMap= treeMap.subMap("c",true , "n" , true);
//		System.out.println(raviMap);
		for(Entry<String, Integer> entry : raviMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println(treeMap.getClass());
		
		
	}

}