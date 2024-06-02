package com.practice.list.music.model.compare;

import java.util.*;

public class AscTitle implements Comparator {
	
	
	// compare 하는애
	// 곡 명을 오름차순 정렬하는 애
	@Override
	public int compare(Object o1 , Object o2) {
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		
		return c1.compareTo(c2);
	}

}
