package com.LinkedList;

public class ThreadSleepDemo {

	public static class SleepThread extends Thread{
		@Override
		public void run(){
			try{
				Thread.sleep(5000);
				System.out.println("This line will not be printed");
//				Why?
//				Because the thread is interrupted and it throws exception which is caught in catch block
			}catch(InterruptedException ex){
				System.out.println("Child Thread is interrupted");
			}
			
		}
	}
	
	public static class InterruptNonSleepingThread extends Thread{
		@Override
		public void run(){
			for(int i=0; i<10000; i++){
				System.out.println("I am not sleeping");
			}
			try{
				System.out.println("I am going to nap for a sec");
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				System.out.println("You guys !!! Interrupted my sleep");
//				Here the main thread is not interrupting the child thread. The main thread will continue doing its job.
//				Its now the responsibility of the JVM to interrupt
			}
			
		}
	}
	
	public static void main(String[] args) {
		SleepThread t = new SleepThread();
		t.start();
		t.interrupt();// A thread can interrupt another thread by calling t.interrupt();
		System.out.println("Main thread interrupted child thread and stopped its execution");
		
		InterruptNonSleepingThread ins = new InterruptNonSleepingThread();
		ins.start();
		ins.interrupt();// JVM will interrupt the target thread if it goes into sleeping state.
//		What will happen if target thread never enters sleep state? Then the interrupt call is wasted and the target thread will never be interrupted.
		System.out.println("JVM interrupted a sleeping child thread");
	}
}
