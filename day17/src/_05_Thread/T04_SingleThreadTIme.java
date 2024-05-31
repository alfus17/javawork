package _05_Thread;

public class T04_SingleThreadTIme {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		System.out.println(startTime );
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("&");
		}
		System.out.println();
		long endTime =  System.currentTimeMillis();
		
		System.out.println("소요시간 "+ (endTime - startTime));
		
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("#" + " " + "%");
		}
		System.out.println("소요시간 "+ (System.currentTimeMillis()- endTime ));
		System.out.println("총 소요시간 "+ (System.currentTimeMillis() - startTime));

		
	}

}
