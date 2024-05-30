package _02_comparable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;



public class T03_FruitComparator {
	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitDescending());
		
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",13000));
		treeSet.add(new Fruit("딸기",7000));
		
		Iterator<Fruit> iterator = treeSet.iterator();
		
		while (iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit);
		}
	
		

		
		
	}

}
