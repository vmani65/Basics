package com.SynchronizedBlock;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

// If very few lines of code require synchronization, then its not recommended to declare entire method
// as synchronized. We have to enclose those few lines of code inside 'synchronized block'.
// The main advantage of synchronized block over synchronized method is, 
// it reduces waiting time of thread and improves performance of the system.
// synchronized method = When the total method requires synchronization
// synchronized block = When we need to have a piece of code that requires synchronization

public class DriverProgram {
	
	private class ThreadClass implements Runnable{
		@Override
		public void run() {

		}
		
		public void printMe() {

		}
	}
	
	public ThreadClass getInstance(){
		return new ThreadClass();
	}
	
	public static void main(String[] args) {
		ThreadClass t = (new DriverProgram()).new ThreadClass();
		t.run();
		t.printMe();
		List<String[]> s = new ArrayList<String[]>();
		s.add(args);
		s.add(args);
		Integer i = Integer.valueOf("100.5");
		System.out.println(i);
		List<Integer> li = new ArrayList<>();
		li.removeIf(e -> e%2 != 0);
//		DriverProgram.getInstance();
//		Class<? extends DriverProgram> r = p.getClass();
		try {
			InetAddress ad = InetAddress.getByName("www.google.com");
			System.out.println(ad.toString());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
