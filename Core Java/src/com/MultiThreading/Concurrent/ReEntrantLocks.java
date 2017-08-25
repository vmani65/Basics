package com.MultiThreading.Concurrent;

import java.util.concurrent.locks.ReentrantLock;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class ReEntrantLocks implements ThreadUtil{

	public ReEntrantLocks(){

	}

	public static void main(String[] args) {
		ReEntrantLocks r = new ReEntrantLocks();
		r.checkReEntrantLockDetails();
		r.workers();
	}
	private void checkReEntrantLockDetails(){
		ReentrantLock l = new ReentrantLock();
		l.lock();
		l.lock();
		print("Default Fairness of ReentrantLock Object :"+l.isFair());
		print("Hold count of currentThread :"+l.getHoldCount());
		print("Is the lock held by the currentThread :"+l.isHeldByCurrentThread());
		l.unlock();
		print("Hold count of currentThread :"+l.getHoldCount());
		l.unlock();
	}

	private void workers(){
		Wisher w = new Wisher();
		Thread A = new Thread() {
			@Override
			public void run(){
				setCurrentThreadName("A");
//				w.wishWithWaiting("EXCELLENT");
				w.wishWithourWaiting("");
			}
		};
		Thread B = new Thread() {
			@Override
			public void run(){
				setCurrentThreadName("B");
//				w.wishWithWaiting("AWESOME");
				w.wishWithourWaiting("");
			}
		};

		A.start();
		B.start();
	}
}