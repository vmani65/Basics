package com.Synchronized;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class ThreadA implements ThreadUtil{
	
	public static void main(String[] args) {
		ThreadB bx = new ThreadB();
		Thread b = new Thread(bx);
		b.start();
		
		synchronized (b) {
			try{
				System.out.println("Main thread waiting for child to finish exec");
				b.wait();
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			System.out.println("Total : "+bx.total);
		}
	}
}
