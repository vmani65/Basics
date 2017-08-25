package com.AbstractClass;

public abstract class Animal {
	public abstract void getName();
	
	/* THE FOLLOWING METHODS WILL THROW COMPILER ERROR */ 
	 
//	public abstract void setName(){
//		An abstract method cannot have a body
//	}
//	public abstract int getAge(){
//		return 10;
//		An abstract method cannot have implementation
//	}
//	public abstract final void getNames();
//      An abstract method cannot have final. Also the abstract class cannot be declared final
//	private abstract void getNames();
//	
//  An abstract method cannot have private as access modifier.
	
	
	public void setType(){
		System.out.println("Abstract class can have other implementations");
	}
}
