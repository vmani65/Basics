package com.MultiThreading.Synchronized;

/* Lock concept is applicable for class and Object types but not for primitives.
 * Hence we cannot pass primitive types as argument to synchronized block. Otherwise we will get compile time error.
 * EG: synchronized(5) - will throw compile time error
 * */

public class Display {
	// METHOD LEVEL SYNCHRONIZATION - START
		public synchronized void displayCharacters(){
			try{
				for(int a=0; a<10;a++){
					System.out.println((char)a);
					Thread.sleep(500);					
				}
			}catch(InterruptedException ex){
				System.out.println(ex.toString());
			}			
		}
		
		public synchronized void displayNumbers(){
			try{
				for(int a=0; a<15;a++){
					System.out.println(a);
					Thread.sleep(600);					
				}
			}catch(InterruptedException ex){
				System.out.println(ex.toString());
			}
		}
	// METHOD LEVEL SYNCHRONIZATION - END
		
	// BLOCK LEVEL SYNCHRONIZATION - START
		public void printCharacters(){
			try {
				System.out.println("Putting this thread to sleep before entering synchronized block "+Thread.currentThread().getName());
				Thread.sleep(2000);
				synchronized(this){
					try{
						System.out.println(Thread.currentThread().getName()+" has started execution");
						for(int i=0; i<5; i++){
							Thread.sleep(550);
							System.out.println("Finished task "+i);
						}
					}finally{
						System.out.println(Thread.currentThread().getName()+" has finished execution");
					}	
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void printNumbers(){
			try {
				System.out.println("Putting this thread to sleep before entering synchronized block "+Thread.currentThread().getName());
				Thread.sleep(2000);
				synchronized(this){					
					try{
						System.out.println(Thread.currentThread().getName()+" has started execution");
						for(int i=0; i<5; i++){
							Thread.sleep(600);
							System.out.println("Finished task "+i);
						}
					}finally{
						System.out.println(Thread.currentThread().getName()+" has completed execution");
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		// BLOCK LEVEL SYNCHRONIZATION - END
		
		// CLASS LEVEL SYNCHRONIZATION - START
		public void printCharactersWithClassLevelLock(){
			try {
				synchronized(Display.class){
					System.out.println(Thread.currentThread().getName()+" has acquired Class level lock");
					try{
						System.out.println(Thread.currentThread().getName()+" has started execution");
						for(int i=0; i<5; i++){
							Thread.sleep(2000);
							System.out.println("Finished task "+i);
						}
					}finally{
						System.out.println(Thread.currentThread().getName()+" has finished execution");
					}	
				}
				System.out.println();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		public void printNumbersWithClassLevelLock(){
			try {
				
				synchronized(Display.class){				
					System.out.println(Thread.currentThread().getName()+" has acquired Class level lock");
					try{
						System.out.println(Thread.currentThread().getName()+" has started execution");
						for(int i=0; i<5; i++){
							Thread.sleep(2000);
							System.out.println("Finished task "+i);
						}
					}finally{
						System.out.println(Thread.currentThread().getName()+" has completed execution");
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// CLASS LEVEL SYNCHRONIZATION - END
}
