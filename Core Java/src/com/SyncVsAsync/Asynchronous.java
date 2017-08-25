package com.SyncVsAsync;

import java.util.Arrays;
import java.util.List;

public class Asynchronous {

	public static class A extends Thread{
		@Override
		public void run(){
			Thread.currentThread().setName("Independent Thread - A");
			Thread.currentThread().setPriority(NORM_PRIORITY);

			List<Integer> l = Arrays.asList(1,2,3,4,5);
			l.forEach(o -> {
				try {
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName()+" Finished Loop "+o);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			});
		}		
	}
	public static class B extends Thread{
		@Override
		public void run(){
			Thread.currentThread().setName("Independent Thread - B");
			Thread.currentThread().setPriority(NORM_PRIORITY);		
			try{
				Thread.sleep(2500);
				System.out.println(Thread.currentThread().getName()+" Finished Execution");
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		A a = new A();
		a.start(); // Both the threads will work independently. Completely Asynchronous
		B b= new B();
		b.start();
		System.out.println(Thread.currentThread().getName()+" Main thread has completed its execution");
		
	}
}
