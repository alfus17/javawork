package _01_HashMap;

public class Snack {
	private String flavor;
	private int calory;
	
	
	// 빈생성자
	public Snack(){}
	//
	public Snack(String flavor, int calory) {
		this.flavor = flavor;
		this.calory = calory;
	}


	// getter / setter
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}

	
	//toString
	@Override
	public String toString() {
		return " [flavor : "+ flavor + ", calory : "+ calory + "]";
		
	}
	
}
