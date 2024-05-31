package _05_Thread;

import java.awt.Toolkit;

public class T02_SingleThread {

	public static void main(String[] args) {
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
 