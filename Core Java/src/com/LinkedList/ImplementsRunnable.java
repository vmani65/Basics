package com.LinkedList;

public class ImplementsRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Current Child Thread Name is :"+Thread.currentThread().getName());
		System.out.println("Current Child Thread Priority is :"+Thread.currentThread().getPriority());
		(Util.getTreeMap()).forEach((k,v) ->{
			System.out.println("Navigable TreeMap key and value are"+k+" "+v);
		});
	}
}
