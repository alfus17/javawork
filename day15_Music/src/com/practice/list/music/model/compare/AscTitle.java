package com.practice.list.music.model.compare;

import java.util.*;

import com.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator {
	
	
	// compare 하는애
	// 곡 명을 오름차순 정렬하는 애
	@Override
	public int compare(Object o1 , Object o2) {
		Comparable c1 = (Comparable) o1;
		Comparable c2 = (Comparable) o2;
		
		if(c1.compareTo(c2) == 0) {
			return ((Music)c1).getSinger().compareTo(((Music)c2).getSinger());
		}		
		return c1.compareTo(c2);
	}

}
