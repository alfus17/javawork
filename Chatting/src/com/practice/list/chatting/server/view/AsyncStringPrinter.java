package com.practice.list.chatting.server.view;
import java.util.LinkedList;
import java.util.Queue;


public class AsyncStringPrinter extends Thread {
	private static final int MAX_QUEUE_SIZE = 100;    
	private static Queue<String> msgQueue = new LinkedList<>();
	
	public   void  setMsg( String userName ,String msg) {
		if (msgQueue.size() > MAX_QUEUE_SIZE) {
			getMsg();
		}
		msgQueue.add(userName+ " : " +msg+"\n");
		System.out.println("set msg  done" + msgQueue.size());
	}
	
//	
	public  void getMsg() {
		String message = msgQueue.poll();
		if (message != null) {
		    System.out.println(message);
		}
	}
	
//	비동기 쓰레드 처리
	public synchronized  void run() {
		while (msgQueue.size() >=1) {
			getMsg();
		}
 	}
	
}