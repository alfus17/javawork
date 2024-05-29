package _03_Tree;

import java.util.Scanner;
import java.util.TreeSet;

public class T02_TreeSet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("로또 몇개를 구매하시겠습니까?");
		int count = sc.nextInt();

		for(int i=0; i<count ; i++) {
			System.out.print((i+1) + "번째 번호 ");
			LottoNumMaker();
		}


	}
	static void LottoNumMaker() {
		TreeSet ts =  new TreeSet();

		while (ts.size() < 6) {
			ts.add((int)(Math.random()*45)+1);
		}System.out.println(ts);
	}

}
