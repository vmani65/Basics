package com.MultiThreading.Concurrent;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class WorkerThread extends Thread implements ThreadUtil{
	
	static ReentrantLock l = new ReentrantLock();

	@Override
	public void run(){
		try{
			do{
				if(l.tryLock(5000, TimeUnit.MILLISECONDS)){
					print(Thread.currentThread().getName()+" got the lock. Will go into sleep");
					Thread.sleep(20000);
					print(Thread.currentThread().getName()+" has finished sleeping");
					l.unlock();
					break;
				}else{
					print(Thread.currentThread().getName()+" did not get a chance to sleep. Will try after 5 secs");
					Thread.sleep(5000);
				}				
			}while(true);
		}catch(InterruptedException e){
			e.printStackTrace();
		}	
	}
}
