package com.Constructors;

import java.util.Arrays;

public class ClassC extends ClassB {
	
	public ClassC(){
		super("0"); // Super Class B has a constructor that expects an object. So the subclass should by default have a constructor that will pass value to super class
		super.threadName = "threadName"; // Here we will inherit only the overridden class variables from the super class B
		super.threadValue = "0";
		calculateTime(); // ClassC inherits all the methods from Super Class A. calculateTime() does not have any return types. So we can call it directly.
		System.out.println(super.threadName);
		super.value = 12; // We can inherit all members from super Class A and B
	}
	
	@Override
	public String toString(){
		return "Great Job "+super.calculateTime().toString();
	}
	
	public void noNullMethod(@NotNull String v){
		
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
		System.out.println(c);
		int[] a = {0,1};
		a[0] = 3;
		a[1] = 4;
		System.out.println(Arrays.toString(a));
 	}
}
