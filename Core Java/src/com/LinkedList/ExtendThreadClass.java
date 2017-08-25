package com.LinkedList;

public class ExtendThreadClass extends Thread{

	// This is the child thread class that can be started by the main thread
	// The job of the thread is anything that is inside the run() method.
	// Main thread will continue doing its independent process
	// Child thread will be independent and do its process on its own
	@Override
	public void run(){
		// What is the priority of this child thread?
		// If the priority of the child thread is explicitly not set, then its inherits the priority of the parent thread
		System.out.println("This child thread inherits the priority of Main thread");
		System.out.println("This child thread priority = "+Thread.currentThread().getPriority());
		//	We can change the priority of child thread at any time
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("This child thread priority = "+Thread.currentThread().getPriority());	
		int[] i = Util.unsortedIntArray();
		for(int a=0; a<i.length; a++){
			System.out.println("Content of i is = "+i[a]);
		}
	}
	
	// Overloading of run method is possible. 
	// But Thread.start() method will always execute run() method with no arguments.
    //	We can call this explicitly like a normal method call.
	public void run(int s){
		System.out.println("run method with arguments(). This will not be invoked by the Thread.start method");
	}
	
//	What will happen if we don't override run method?
//	Then Thread.run method will be invoked by t.start().
//	Thread class run method is nothing but empty implementation. So nothing will happen
//	
//	public void run()
//	 {
//	   if (target != null) {
//	     target.run();
//	   }
//	 }
	
//	What will happen if I override Start method?
//	Then Thread class will not get the opportunity to create a child thread.
//	Start method will be executed just like a normal method
	
//	@Override
//	public void start(){
//		System.out.println("Main thread will execute me. Child thread will not be created");
//	}
//	What will happen if I override Start method and invoke super.start()?
//	Then Main Thread will give the control to Thread class. It will create a child thread and invoke run method that is overridden.
//	But any line below super.start() will be executed by main thread
	
//	@Override
//	public void start(){
//		super.start();
//		System.out.println("Main thread will execute me. Child thread will only execute the run method");
//	}
//	
	
}
