package _05_Thread;
class ThreadA extends Thread{
	boolean stop = false; // 쓰레드의 종료
	boolean work = true; // yield 메소드를 호출한 시점을 알기 위해 
	
	@Override
	public void run() {
		while (!stop) {
			if(work) {
				System.out.println("ThreadA 작업 내용");
			}else {
				Thread.yield();
			}
			
		}
		System.out.println("ThreadA 종료");
	}
}
class ThreadB extends Thread{
	boolean stop = false; // 쓰레드의 종료
	boolean work = true; // yield 메소드를 호출한 시점을 알기 위해 
	
	@Override
	public void run() {
		while (!stop) {
			if(work) {
				System.out.println("ThreadB 작업 내용");
			}else {
				Thread.yield();
			}
			
		}
		System.out.println("ThreadB 종료");
	}
}


public class T09_yieldThread {

	public static void main(String[] args) {
		ThreadA ta = new ThreadA();
		ThreadB tb = new ThreadB();
		ta.start();
		tb.start();
		
	}

}
