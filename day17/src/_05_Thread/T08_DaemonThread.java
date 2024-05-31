package _05_Thread;

class AutoSaveThread extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			autoSave();
		}
	}
	void autoSave() {
		System.out.println("파일이 자동저장됨");
	}
}
public class T08_DaemonThread {

	public static void main(String[] args) {
		AutoSaveThread t = new AutoSaveThread();
		t.setDaemon(true);
		t.start();
		
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
