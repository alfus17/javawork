package _01_langPackage;

import java.util.Arrays;

class Point1{
	int x;
	int y;

	
	public Point1(int x , int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x = " + x + ",  y = " + y; 
	}
	
}
class Circle implements Cloneable{
	Point1 p;  // 중심점
	double r; // 반지름
	
	public Circle(Point1 p, double r) {
		this.p = p;
		this.r = r;

	
	}

	// 인스턴스 변수가 기본 자료형이면 깊은 복사
	// 인스턴스 변수가 참조 자료형이면 얕은 복사( 즉, 주소만 복사)
	@Override
	public Circle clone () {
		Circle obj=null;
		try {
			obj = (Circle) super.clone();
		} catch (CloneNotSupportedException e) { // Clone을 복제할수없는 경우가 발생할수있다.
			e.printStackTrace();
		}
		return obj;
		
	}
	// 인스턴스 변수가 참조자료형도 깊은 복사
	public Circle depClone () {
		Object obj=null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) { // Clone을 복제할수없는 경우가 발생할수있다.
			e.printStackTrace();
		}
		Circle c = (Circle)obj;
		c.p = new Point1(this.p.x, this.p.y);
		return c;
		
	}
	@Override
	public String toString() {
		return "p : " + p + ",  r : " + r;
	}
	
}
public class T05_cloneShallowDeepCopy {

	public static void main(String[] args) {
		String[] str = {"a","b","c"};
		String[] copyStr = str;
		
		// 얕은 복사 : 주소를 복사하는거
		// 깊은 복사 : 값을 복사하는거
		
		str[0] = "d";
		
		String str2 = "Hello";
		
		Point1 p1 = new Point1(3,5);
		
		System.out.println(str[0]);
		System.out.println(copyStr[0]);
		
		String[] deepCopy = new String[5];
		for(int i = 0 ; i <str.length; i++) {
			deepCopy[i] = str[i];
		}
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("---------------------------");
		
		str[0] = "a";
		System.out.println(Arrays.toString(str));
		System.out.println(Arrays.toString(deepCopy));
		System.out.println("---------------------------");
		
		// 2. Arrays.copyOf(원본배열, 복사할 길이)
		String[] ArrayCopy = Arrays.copyOf(str, str.length);
		System.out.println(Arrays.toString(ArrayCopy));
		ArrayCopy[2] = "z";

		// 3. clone()
		Point p = new Point(5,10);
		Circle c1 = new Circle(p1, 3);
		
		Circle c2 = (Circle) c1.clone();
		
		System.out.println(c1);
		System.out.println(c2);
		
		c1.r = 100.0;

		System.out.println(c1);
		System.out.println(c2);
		
		
		// 4. 배열에서의 clon은 기본으로 되어 있음		
		int [] num = {1,2,3};
		int [] numClone = num.clone();
		numClone[0] = 100;
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num));

	}

}
