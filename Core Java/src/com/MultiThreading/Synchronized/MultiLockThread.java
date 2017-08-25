package com.MultiThreading.Synchronized;

import com.LinkedList.Util;

public class MultiLockThread extends Thread {

	@Override
	public void run() {
		Thread.currentThread().setName("Child Thread");
		lockA();
	}

	public synchronized void lockA() {
		// Now the current thread has acquired lock of this method not the whole object
		synchronized (this) {
			(Util.getTreeMap()).forEach((a, b) -> {
				try {
					Thread.sleep(500);
					System.out.println(a + b);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
			System.out.println(Thread.currentThread().getName().toUpperCase() + " has completed its execution");
		}
	}

	public void printerMethod() {
		System.out.println("This piece of code is executed by : " + Thread.currentThread().getName() + " thread");
		try{
			(Util.getTreeMap()).forEach((a, b) -> {
				try {
					Thread.sleep(500);
					System.out.println("This is independent. This will continue exec on its own");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}finally{
			System.out.println(Thread.currentThread().getName().toUpperCase() + " thread has completed its execution");			
		}
	}

	public static void main(String[] args) {
		MultiLockThread multiLock = new MultiLockThread();
		multiLock.start();
		System.out.println(Thread.currentThread().getName().toUpperCase() + " has completed its execution");
		multiLock.printerMethod();
	}
}
