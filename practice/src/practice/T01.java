package practice;
import java.util.HashMap;

public class T01 {
    public static void main(String[] args) {
    	String s = "a1234";
    	boolean answer = true;
        
    	 try{
             answer =( s.length() == 4 || s.length() ==6) ? isNumeric(s) : false;          
            
        }catch(Exception e){
            answer =false;
        }

		
    
    }
	

}
