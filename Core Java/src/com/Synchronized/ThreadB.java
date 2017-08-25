package com.Synchronized;

public class ThreadB implements Runnable {

	int total;
	
	@Override
	public void run(){	
		for(int i=0; i<=100;){
			total += i;
			++i;
		}
		notify();
	}
}
