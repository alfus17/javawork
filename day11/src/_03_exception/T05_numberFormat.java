package _03_exception;

public class T05_numberFormat {

	public static void main(String[] args) {
		int index =0;
		String [] str = {"1" , "2" , "123.123"};
		try {
			for(String a : str) {
				index++;
				int i = Integer.parseInt(a);
				System.out.println(i);
				
			}
			
		}catch(NumberFormatException e){
			
			System.out.println(	str[index] + "정수로 변경 불가");
			e.printStackTrace();

		}
		
	}

}
