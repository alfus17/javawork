package _04_ex1;

import java.util.Scanner;

public class MultipleOfFive {
	public static void main(String[] args) {

		inputMethod ip = new inputMethod();
		boolean flag = true;

		while (flag) {
			try {
				flag=ip.method(flag);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
