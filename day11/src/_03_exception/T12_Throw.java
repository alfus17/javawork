package _03_exception;

public class T12_Throw {

	//throws 메소드에 사용해서 이런 예외가 있다고 하는거  
	//throw 예외로 던지는
	
	public static void main(String[] args) {
		// throw : 강제로 예외를 발생시킬때
		// throws : 메소드를 호출하여 사용할 때 발생할 수 있는 예외 명시해 두고 
//						그 메소드를 사용할 때에 예외에 대한 대비를 반드시 해줘야 한다.
		try {
			Exception e = new Exception("강제로 예외 발생");
			throw e;
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
	

}
