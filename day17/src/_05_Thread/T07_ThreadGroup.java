package _05_Thread;

public class T07_ThreadGroup {

	public static void main(String[] args) {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		System.out.println(main.getName());
		
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subGrp1 = new ThreadGroup(grp1,"SubGroup1");
		
		// 익명 함수
		Runnable r = new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		// Thread(ThreadGroup tg , Runnable r, String name)
		Thread th1 = new Thread(grp1,r,"th1");
		Thread th2 = new Thread(subGrp1,r,"th2");
		Thread th3 = new Thread(grp2,r,"th3");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("List of ThreadGroup : " + main.getName());
		System.out.println("Active ThreadGroup : " + main.activeGroupCount());
		System.out.println("Active Thread : " + main.activeCount());
	}

}
