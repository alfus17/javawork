package _03_exception;

public class T09_tryCatchFinally {

	public static void main(String[] args) {
//		try {
//			
//		}catch (Exception e) {
//
//		}
//		finally {
//			/*
//			 * 예외랑 상관없이 무조건 실행
//			 */
//		}

		
		
		try {
			System.out.println(args.length);
			System.out.println(args[1]);
//			int a = 3.0;
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("트라이 캐치 -끝-");
		}
		
		
		
		
	}

}
