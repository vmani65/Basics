package com.Constructors;

import java.time.LocalTime;

public class ClassA {

	protected String threadName;
	String threadValue;
	public int value;
	
	public ClassA(Object a){
		this.threadName = (String) a;
		System.out.println("A");
	}
	
	public String calculateTime(){
		System.out.println(LocalTime.now());
		return LocalTime.now().toString();
	}
}
