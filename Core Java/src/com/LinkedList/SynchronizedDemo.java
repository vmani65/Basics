package com.LinkedList;

public class SynchronizedDemo {

	public static class WishingClass{

//		In the driver program, we are creating multiple instances of WishingClass
//		It beats the synchronized concept. So use SingletonDP to restrict multiple instances of this class.
//		Uncomment the below code to implement Singleton DP
		
//		public static WishingClass w = new WishingClass();
//		private WishingClass(){			
//		}
//		public static WishingClass getInstance(){
//			return w;
//		}
		
//		This synchronized block will allow one thread access
//		Remove synchronized keyword and run the program. We should see a lot of data inconsistency.
//		What will happen if we have static synchronized like this?
//		public synchronized void wish(String name,String greeting){
//		Class Level Lock - Every class in java has a unique lock called Class level lock. 
//		If a thread wants to execute static synchronized method, then it requires class level lock.Once it acquires class level lock, its allowed to execute 
//		any static synchronized method of that class. Once method execution completes, automatically thread releases the lock.
		
		public synchronized void wish(String name,String greeting){
			for(int i=0; i<5; i++){
				System.out.print(Thread.currentThread().getName()+greeting+" :");
				try{
					Thread.sleep(500);
				}catch(InterruptedException ex){
					System.out.println(ex.toString());
				}
				System.out.println(Thread.currentThread().getName()+name);
			}
		}
	}
	public static class WishingThread extends Thread{
		
		WishingClass w;
		String name;
		String greeting;
		
		public WishingThread(WishingClass w, String name, String greeting) {
			this.w = w;
			this.name = name;
			this.greeting = greeting;
		}
		@Override
		public void run(){
			w.wish(name, greeting);
		}
	}
	public static void main(String[] args) {
		WishingClass w = new WishingClass();
//		WishingThread t = new WishingThread(new WishingClass(), "Napoleon Hill", "Good day");
//		t.setName("N Thread");
//		WishingThread t1 = new WishingThread(new WishingClass(), "Andrew Carnegie", "Welcome");
//		t1.setName("A Thread");
//		The above code is a wrong way of creating instances. Why?
//		Because we are creating multiple instances of WishingClass (new WishingClass(). Multiple instances = multiple objects.
//		(*** Think about this. One Biriyani Multiple Dogs -vs- Multiple Biriyani Multiple Dogs***)
//		Each individual object will be operated by individual threads.
//		Instead it should one instance that should be shared
//		We can overcome this by singleton design pattern.
//		Uncomment the below 2 lines to use singleton DP
//		WishingThread t = new WishingThread(WishingClass.getInstance(), "Napoleon Hill", "Good day");
//		WishingThread t1 = new WishingThread(WishingClass.getInstance(), "Andrew Carnegie", "Welcome");
		
		WishingThread t = new WishingThread(w, "Napoleon Hill", "Good day");
		WishingThread t1 = new WishingThread(w, "Andrew Carnegie", "Welcome");
		t.setName("Napoleon Hill Thread - ");;
		t.start();
		t1.setName("Andrew Carnegie Thread - ");;
		t1.start();
	}
}
