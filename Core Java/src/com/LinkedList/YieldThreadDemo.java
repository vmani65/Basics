package com.LinkedList;

public class YieldThreadDemo {
// Some platforms won't provide proper support for yield method. It involves preemptive scheduling which is not supported.
	public static class Yield extends Thread{
		
		@Override
		public void run(){
			(Util.unsortedStringList()).forEach(obj -> {
				System.out.println("Child Thread Print :"+obj.toString());
				Thread.yield();
//				If we comment Thread.yield();, then both the threads will be executed simultaneously and
//				we cannot expect which thread will complete first.
//				If we don't comment Thread.yield();, then child thread always calls yield method, because of that
//				Main thread will get a chance more number of times and the chance of completing main thread first is high.
			});
		}
	}
	
	public static class DataValidator extends Thread{
		
		@Override
		public void run(){
			Thread.currentThread().setName("DataValidator Thread");
			try {
				System.out.println("The name of the current thread is "+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName()+"Execution completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class SaveInDatabase extends Thread{
		
		@Override
		public void run(){
			Thread.currentThread().setName("SaveInDatabase Thread");
			try {
				System.out.println("The name of the current thread is "+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName()+"Execution completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static class ShowinUI extends Thread{
		
		@Override
		public void run(){
			Thread.currentThread().setName("ShowinUI Thread");
			try {
				System.out.println("The name of the current thread is "+Thread.currentThread().getName());
				Thread.sleep(5000);
				System.out.println(Thread.currentThread().getName()+"Execution completed");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws InterruptedException{
		Yield y = new Yield();
		y.start();
//		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
//		Un-commenting the above line will set main thread as higher priority
//		The child thread should wait till the completion of main thread because it has priority as Thread.NORM_PRIORITY
//		inherited from main thread during initialization
		(Util.getTreeMap()).forEach((k,v) ->{
			System.out.println("Main Thread Print :"+k+v);
		}); 
		
		DataValidator t1 = new DataValidator();
		SaveInDatabase t2 = new SaveInDatabase();
		ShowinUI t3 = new ShowinUI();
		t1.start();
		t1.join(1000);
//		t1.join(1000); Wait 1000ms before starting
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
	}
}
