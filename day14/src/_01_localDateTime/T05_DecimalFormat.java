package _01_localDateTime;

import java.text.DecimalFormat;

public class T05_DecimalFormat {
	public static void main(String[] args) {
		double number = 12345678.9;
		double number2 = 3.33;
//		DecimalFormat df = new DecimalFormat("0");
//		System.out.println(df.format(number));
		
		// 0이면 무조건 자리차지, # 있으면 자리차지 없음 출력안함
		System.out.println(new DecimalFormat("0").format(number));// 정수출력 소수점은 반올림
		System.out.println(new DecimalFormat("#").format(number));
		System.out.println(new DecimalFormat("0.0").format(number));
		System.out.println(new DecimalFormat("#.#").format(number));

		System.out.println(new DecimalFormat("0.0").format(number2));
		System.out.println(new DecimalFormat("#.#").format(number));
		System.out.println(new DecimalFormat("00000000.00000").format(number2));
		System.out.println(new DecimalFormat("#######.##").format(number));
		System.out.println(new DecimalFormat("0.0").format(number2));
		System.out.println(new DecimalFormat("#.#").format(number));

		String stNum = "1,234,567.89";
		DecimalFormat df = new DecimalFormat("#,###.##");
		try {
			Number num = df.parse(stNum);
			System.out.println(num);
			double d = num.doubleValue();
			System.out.println(d);
			
			// 위의 과정을 한줄로 줄인것
			System.out.println(new DecimalFormat("#,###.##").parse(stNum).doubleValue());
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
	}


}
