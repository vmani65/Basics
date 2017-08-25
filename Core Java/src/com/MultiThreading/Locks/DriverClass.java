package com.MultiThreading.Locks;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class DriverClass implements ThreadUtil{

	public static void main(String[] args){
		DriverClass d = new DriverClass();
		
		Thread t1 = new Thread(){
			@Override
			public void run(){
				Thread.currentThread().setName("T1");
				d.m1();
			}
		};	
		t1.start();
		Thread t2 = new Thread(){
			@Override
			public void run(){
				Thread.currentThread().setName("T2");
				d.m2();
			}
		};	
		t2.start();
	}
	
	private void m1() {
		synchronized(DriverClass.class){
			int i=1;
			while(i != 0){
				try {
					Thread.sleep(10000);
					print(Thread.currentThread().getName());
					--i;
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}	
	}
	
	private synchronized void m2(){
		
		int i=1;
		while(i != 0){			
			try {
				Thread.sleep(10000);
				print(Thread.currentThread().getName());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			--i;
		}
	}
}
