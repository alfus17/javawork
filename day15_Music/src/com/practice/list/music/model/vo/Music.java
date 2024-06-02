package com.practice.list.music.model.vo;

public class Music implements Comparable<Object> {
	private String title;
	private String singer;
	
	// 생성자
	Music(){
		
	}
	Music(String title, String singer){
		this.title = title;
		this.singer = singer;
	}
	
	// title getter/setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	// singer getter/setter
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	
	//toString
	@Override
	public String toString() {
		return "title : "+ title + ", singer : " + singer;
	}
	
	// 이퀄스 를 하면 해쉬도 같이 오버라이딩을 해야 set을 할경우 중복을 방지한다
	// 해쉬는 주소값이기때문에 혹시나 객체가 값은 같지만 주소값때문에 다른 객체로 인지할수도 있기때문에
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
	//equals
	@Override
	public boolean equals(Object obj) {
		
		return  title.equals(((Music)obj).title);
	}
	
	//compareTo
	@Override
	public int compareTo(Object o) {
		String reqTitle = ((Music)o).getTitle();
		String reqSinger = ((Music)o).getTitle();
		
		int compareResult =title.compareTo(((Music)o).title);
		if(compareResult == 0) {
			return singer.compareTo(((Music)o).singer);
		}
		return compareResult;
	}
	

}
