package com.coreJava;

public class StaticBlock {

	static int[] a = new int[25];
	// This piece of static block is called even before the main method and the constructor is called.	
	static{
		for(int i=0; i<a.length; i++)
			a[i] = i;
		System.out.println("Finished my task");
	}
	public static void main(String[] args) {
		System.out.println("First line in Main method");
		StaticBlock b = new StaticBlock();
		System.out.println("Finished executing main method"+b.toString());
	}
}
