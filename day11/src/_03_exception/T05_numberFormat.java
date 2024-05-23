package _03_exception;
//
class Solution {
	public boolean solution(String s) {

		//        boolean answer =  s.length()==4 || s.length() == 6 ? true : false;
		//        if(answer){
		//            for(int i =0; i<s.length(); i++){
		//                int intStr = Integer.parseInt(s)
		//            	answer = intStr >=0 && intStr <=9 ? true : false;
		//            }
		//            
		//        }

		boolean answer = false ;
		
		try {
			if(s.length() != 4 && s.length() != 6) {
				throw new Exception();
			}
			
			for(String a : s){
				int intStr = Integer.parseInt(a);
				answer = intStr >=0 && intStr <=9 ? true : false;
			}

		} catch (Exception e) {
			answer = false;
		}


		return answer;

	}

}

public class T05_numberFormat {

	public static void main(String[] args) {
		int index =0;
//		String [] str = {"1" , "2" , "123.123"};
		try {
			for(String a : str) {
				index++;
				int i = Integer.parseInt(a);
				System.out.println(i);

			}

		}catch(NumberFormatException e){

			//			System.out.println(	str[index] + "정수로 변경 불가");
			e.printStackTrace();

		}

	}

}
