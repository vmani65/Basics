package com.MultiThreading.Synchronized;

public class IntegerThread extends Thread {
	Display d;
	LockTypes lock;

	IntegerThread(Display d, LockTypes lock) {
		this.d = d;
		this.lock = lock;
	}

	@Override
	public void run() {
		
		switch (lock) {
		
		case SYNCHRONIZEDMETHOD :
			Thread.currentThread().setName("INTEGER THREAD - EXECUTING displayNumbers()");
			d.displayNumbers();
			break;
			
		case SYNCHRONIZEDBLOCK :
			Thread.currentThread().setName("INTEGER THREAD - EXECUTING printNumbers()");
			d.printNumbers();
			break;
			
		case SYNCHRONIZEDCLASSLOCK :
			Thread.currentThread().setName("INTEGER THREAD - EXECUTING printNumbersWithClassLevelLock()");
			d.printNumbersWithClassLevelLock();
			break;
			
		default:
			System.out.println("This should not be happening. This class cannot be instantiated without LockType");
			break;
		}
	}
}