package com.practice.list.chatting.server;

public class ServerChatView extends Thread{
	@Override
	public void run() {
		while(true) {
			try {
				
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
			
		}
		
	}
}
