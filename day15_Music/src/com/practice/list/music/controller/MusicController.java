package com.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.practice.list.music.model.vo.Music;

public class MusicController {
	
	List<Music> list = new ArrayList();
	
	public int addList(Music music) {
		try {
			list.add(music);
		} catch (Exception e) {
			return 0 ;
		}
		// 성공시 return 1
		return 1 ;
	}
	
	public int addAtZero(Music music) {
		try {
			list.add(0,music);
		} catch (Exception e) {
			return 0;
		}
		// 성공시 1리턴
		return 1;
	}
	
	public List printAll() {
		// list 반환
		return list;
	}
	
	public Music searchMusic(String title) {
		Music findMusic = null;
		for(Music music : list) {
			if(music.equals(title)) {
				findMusic = music;
				break;
			}
		}
		return findMusic;
		
	}
	
	public Music removeMusic(String title) {
		Music findMusic = null;
		for(int i=0; i< list.size(); i ++) {
			if(list.get(i).getTitle().equals(title)) {
				findMusic =list.get(i);
				list.remove(findMusic);
				break;
			}
		}
		return findMusic;
		
	}
	
	public Music setMusic(String title , Music music) {
		Music findMusic = null;
		for(int i=0; i< list.size(); i ++) {
			if(list.get(i).getTitle().equals(title)) {
				findMusic =list.get(i);
				list.remove(findMusic);
				list.add(i ,music );
				break;
			}
		}
		return findMusic;
	}
	
	public int ascTitle() {
		// 리스트 곡 명 오름차순 정렬, 제목이 같으면 가수 명으로 오름차순 정렬, 1 리턴
		try {
			list.sort(null);
		} catch (Exception e) {
			return 0;
		}
		return 1;
	}
	
	public int descSinger() {
		// 리스트 가수 명 내림차순 정렬, 1 리턴
		list.sort(new Comparator<Object>() {
			@Override
			public int compare(Object o1, Object o2) {
				Comparable c1 = (Comparable) o1;
				Comparable c2 = (Comparable) o2;
				
				return c2.compareTo(c1);
			};
		
		});
		return 0;
	}
	
	
	

}
