package _05_Thread;

import java.awt.Toolkit;
class BeepThread extends Thread{
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i< 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			toolkit.beep();
		}
	}
}


public class T03_MultiThread {

	public static void main(String[] args) {
		BeepThread bp = new BeepThread();
		bp.start();
		
		for(int i = 0; i< 50000; i++) {
			System.out.println(i);
			
		}
		
	}

}
 