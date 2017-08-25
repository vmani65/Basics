package com.MultiThreading.InterThreadCommunication;
/* I am proud of this piece of code. */
public class WorkerThreadA extends Thread implements ThreadUtil{
	
	public int total;
	public String T;

	@Override
	public void run() {
		T = setCurrentThreadName(getClass().getSimpleName());
		print(T+" has started run()");

		synchronized(this){
			print(T+" has acquired the lock and starts exec");
			for(int i=1; i<=100;){				
				print("Before Computation "+i);
				total += i;
				++i;
				print("After Computation "+i);
			}
			print(T+" has finished calculating the total");
			print(T+" notifies MAIN thread");
			this.notify();
		}
	}	
}
