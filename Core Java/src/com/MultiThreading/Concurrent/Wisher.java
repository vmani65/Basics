package com.MultiThreading.Concurrent;

import java.util.concurrent.locks.ReentrantLock;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

class Wisher implements ThreadUtil{

	static ReentrantLock l = new ReentrantLock();

	public void wishWithWaiting(String s){
		l.lock(); /* If we comment lock and unlock code, then the thread will exec. asynchronously and we will get irregular output.*/			
		for(int i=0; i<5;i++){
			try{
				print(s);
				Thread.sleep(1000);
			}catch(InterruptedException e){
				print(e);
			}
			print("How many Threads are waiting to get this lock? "+l.getQueueLength());
		}
		l.unlock();
	}

	public void wishWithourWaiting(String s){
		if(l.tryLock()){
			try{
				print(Thread.currentThread().getName()+":-");
				print("I got the lock. Happy Birthday AWESOME !!");
				Thread.sleep(1000);
			}catch(InterruptedException e){
				print(e);
			}
			l.unlock();
		}else{
			try{
				Thread.sleep(1000);
				print(Thread.currentThread().getName()+":-");
				print("Sorry I cannot wish. I didnot get the lock");
			}catch(InterruptedException e){
				print(e);
			}
		}
	}
}
