package com.MultiThreading.ThreadGroup;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class WorkerThread extends Thread implements ThreadUtil{
	
	public WorkerThread(ThreadGroup g, String name){
		super(g,name);
	}
	
	@Override
	public void run(){
		try{
			Thread.sleep(5000);
		}catch(InterruptedException e){
			print(e);
		}
	}
}
