package _05_Thread;

class Thread1 extends Thread{
	@Override
	public void run(){
		for(int i =0; i <100000; i++) {
			System.out.println(getName());
		}
	}
}

class Thread2 implements Runnable{

	@Override
	public void run() {
		Thread.currentThread().setName("imple 쓰레드");
		for(int i=100000 ; i < 200000; i ++) {
			System.out.println(i);
		}
	}
	
}
public class T01_Thread {
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		
//		Runnable r = new Thread2();
		Thread t2 = new Thread(new Thread2());
		t1.start();
		
		t2.start();
	
	}
}
