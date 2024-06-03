package _05_supplier;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class T01_supplier {

	public static void main(String[] args) {
//		Supplier<String> sup = () -> {return "aaa";};
		Supplier<String> sup = () -> {return "aaa";};
		String str = sup.get();
		System.out.println(sup.get());
		
		IntSupplier isup = () -> 5;
		IntSupplier isup2 = () -> (int)(Math.random()*45 + 1);
		
		
	}

}
