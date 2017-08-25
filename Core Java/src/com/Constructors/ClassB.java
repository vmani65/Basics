package com.Constructors;

public class ClassB extends ClassA {

	protected String threadName;
	public String threadValue;
	
	public ClassB(Object a) {
		super(a);
		System.out.println("B");		
		super.threadName = calculateTime();
		this.threadName = "ClassB Thread";
	}
}
