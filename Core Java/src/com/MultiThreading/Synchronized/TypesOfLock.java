package com.MultiThreading.Synchronized;

import com.LinkedList.Util;
import com.SyncVsAsync.Synchronous;

public class TypesOfLock {

	public String name;
	public String value;	
	public Util ut = new Util();
	
	// We can declare synchronized block as follows
	// Lock of Current Object
	public void currentObjectLock(){
		synchronized(this){
			System.out.println("Current Class is locked untill the execution of this code");
		}
	}
	// Lock of specific Object
	public void particularObjectLock(){
		synchronized (ut){
			System.out.println("ut Object is locked untill the execution of this code");
		}
	}
	// To get class level lock
	public void classLevelLock(){
		synchronized(Synchronous.class){
			System.out.println("Synchronous Class is locked untill the execution of this code");
		}
	}
	
}
