package com.Interfaces;

public interface Baby {
	
	String gender(); // By default, this will become public
	
	public String fatherName();
	
	public String motherName();
	
	/* JAVA 1.8 NEW FEATURES*/
	/* 1. default method - An interface can have any number of default methods. This is to provide backward compatibility.
	      EG: Let's say, We have Baby interface that is implemented by 100 classes. What if I want to add a new method?
	          All the implementing classes must implement the new method. To avoid it, we have default method that provides a default implementation
	          The subclasses that are implementing can override the default method if needed.
	   2. static method - An interface can have a static method. It can referenced in static way as regular methods. 
	   	  EG: Baby.address() will return address. address() cannot be directly called.
	*/
	
	default int numberOfLegs(){
		return 2;
	}
	
	public default int numberOfFingers(){
		return 10;
	}
	
	public static String address() {
		return "Nungambakkam, Chennai";
	}
}
