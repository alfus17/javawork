package _03_exception;

public class T04_arrayIndexOutOfBounds {

	public static void main(String[] args) {
		
		try {
			
			String [] str = {"abc" , "def" , "ghi"};
			str[3] = "kim";
				
			
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("눈구녕 똑바로 뜨고 봐 뇬석아");
			e.printStackTrace();

		}
		
	}

}
