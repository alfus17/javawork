package _02_repetive;

public class T02_overlap_for {

	public static void main(String[] args) {

		for(int i =1 ; i <10; i++) {
			for (int j =2; j<10; j++) {
				System.out.printf("| %dx%d =%3d |",j ,i, i*j );
//				System.out.print(j + "x"+i +"="+i*j + " " );
			}System.out.println();
		}
			
	}

}
