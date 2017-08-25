package com.AbstractClass;

public class Elephant extends Animal{

	public String _name;
	
	@Override
	public void getName() {
		_name = "I am Elephant. I am the biggest animal. Thank You !";
		System.out.println(this._name);
	}
	
//	public abstract void setName();
//	The above abstract method will throw error. 
//	Because an abstract method can be inside only an abstract class.
}
