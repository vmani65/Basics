package com.MultiThreading.Synchronized;

public class DriverClass {
	public static void main(String[] args) {
		Display d = new Display();
		CharThread t1 = new CharThread(d, LockTypes.SYNCHRONIZEDMETHOD);
		IntegerThread t2 = new IntegerThread(d, LockTypes.SYNCHRONIZEDMETHOD);
		/*Sharing the same display object (d) between multiple threads.
		As long as they are accessing synchronized blocks, no issues
		If they are accessing normal methods then we will have a mixed output
		Try by removing the synchronized keyword in in methods displayChar() and displayInteger*/
		t1.start();
		t2.start();
		
		/* A BETTER SOLUTION */
		/* PROBLEM : I want the main thread to wait until Thread t1 and Thread t2 finishes execution.
		 * SOLUTION : One way to solve is put main thread to sleep for a longer time and anticipate that t1 and t2 finishes execution.
		 * Another is an elegant solution. Create an Array of threads. Make them join with the main thread.
		 * */
		
		System.out.println("This thread name is : "+ Thread.currentThread().getName().toUpperCase());
		System.out.println(Thread.currentThread().getName().toUpperCase()+" thread will wait untill the completion of t1 and t2");
		
		for(Thread t : new Thread[]{t1, t2}){
			try {
				t.join();
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}
		
		System.out.println("t1 and t2 has finished execution");
			
		CharThread t3 = new CharThread(d, LockTypes.SYNCHRONIZEDBLOCK);
		IntegerThread t4 = new IntegerThread(d, LockTypes.SYNCHRONIZEDBLOCK);
			
		t3.start();
		t4.start();
		
		/*Here we are sharing 'd' object between 4 threads. Try creating 4 display objects and give each thread one. Then each thread will have
		 * its own DISPLAY OBJECT  on which it will continue working. synchronized block and synchronized methods will have no impact on them.
		 * How to avoid this?
		 * 
		 * Create a synchronized block in Display.java that has class level lock
		 * */
		
		/*Let the main thread wait until the completion of t3 and t4 */
		
		for(Thread t : new Thread[]{t3, t4}){
			try{
				t.join();
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}
		
		System.out.println("t3 and t4 has finished execution");
		
		/* Now create multiple Display objects that can be used by t5 and t6. But make them invoke the synchronized block with class level lock */
		
		CharThread t5 = new CharThread(new Display(), LockTypes.SYNCHRONIZEDCLASSLOCK);
		IntegerThread t6 = new IntegerThread(new Display(), LockTypes.SYNCHRONIZEDCLASSLOCK);
		
		t5.start();
		t6.start();
		
		for(Thread t : new Thread[]{t5, t6}){
			try{
				t.join();
			}catch(InterruptedException ex){
				ex.printStackTrace();
			}
		}		
		System.out.println("t5 and t6 has finished execution");
		
		/* Create multiple Display objects that can be used by t7 and t8. But make them invoke the synchronized block with object level lock */
	} 
}
