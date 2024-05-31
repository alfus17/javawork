package _05_Thread;

class MultiThread extends Thread{
	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		System.out.println(startTime );
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("_");
		}
		System.out.println();
		long endTime =  System.currentTimeMillis();
		
		System.out.println("소요시간 "+ (endTime - startTime));
		
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("@" + "! " + "*");
		}
		System.out.println("소요시간 "+ (System.currentTimeMillis()- endTime ));
		System.out.println("멀티 스레드 총 소요시간 "+ (System.currentTimeMillis() - startTime));
		
	}
	
}

public class T05_MultiThreadTIme {
	static long starttime = 0;
	public static void main(String[] args) {
		
		MultiThread mt = new MultiThread();
		mt.run();
		
		long startTime =System.currentTimeMillis();
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
