package com.MultiThreading.InterThreadCommunication;

public class DriverProgram implements ThreadUtil{
	
	private String T;

	public static void main(String[] args) {
		new DriverProgram().mainThreadJob();
	}
	
	public void mainThreadJob() {
		T = setCurrentThreadName("MAIN");
		WorkerThreadA w = new WorkerThreadA();
		w.start();
		print(T+" has created a child thread");
		
		synchronized (w) {
			
			print(T+" has obtained lock of worker");
			print("Put main Thread to sleep after getting lock of W");
			try{
				print(T+" waiting on worker thread");
				w.wait();
				print(T+" recieved notification and finishes execution");
				print(w.total);
			}catch(InterruptedException e){
				e.printStackTrace();
			}			
		}
	}
}
