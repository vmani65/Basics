package com.LinkedList;

public class ExecuteThread {
// ThreadScheduler is responsible to schedule threads 
//	If multiple threads are waiting to get a chance of execution 
//	then in which order threads will be executed is decided by
//	ThreadSceduler
//	We cannot know the exact algorithm followed by ThreadScheduler. Its varied from JVM to JVM.
//	So we cannot predict thread execution order and output. Hence whenever situation comes to multithreading, there is no guarantee for exact order in which it is executed.
//	But we can provide several possible outputs.
	
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		ExecuteThread et = new ExecuteThread();
//		for(int i=0;i<10; i++){
			et.executeThread();
//		}		
	}
	
	public void executeThread(){
		ExtendThreadClass t = new ExtendThreadClass();//Main thread creates a child thread
		t.start();//Main thread starts the child thread class.
//		Difference between t.start() and t.run()?
//		t.start() will give the control to Thread class and it will internally create a child thread.
//		So the main thread and the child thread will continue executing the job independently.
//		t.run() will invoke the run method as any other normal method invocation.
//		But the main thread will continue executing the code in a single thread.No child thread is created here.
//		t.run();
//		Thread class's start() method is responsible to register the thread with ThreadScheduler and all other mandatory activities.
//		It finally invokes .run() method
//      Without executing Thread.start() method, there is no way to execute a thread class in java. So thread.start() is the heart of multithreading.
		
		Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
		
		Thread t1 = new Thread(new ImplementsRunnable());
		t1.setName("This child thread implemets Runnable Interface");
		t1.start();
		
		(Util.unsortedStringList()).forEach(obj -> {
			System.out.println(obj.toString());
		});
		try{
			t.start();
		}catch(IllegalThreadStateException ex){
			System.out.println("You are trying to start a thread that is already started");
		}
	}
}
