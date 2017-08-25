package com.ObjectReferences;

import java.util.Arrays;

public class StringReferences {
	
	int a = 0;
	
	public StringReferences(Integer i){
		// You can pass Wrapper class of primitive types and it can be used to set primitives.
		this.a = i;		
	}
	
	public void printA(){
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		StringReferences sr = new StringReferences(2);
		sr.printA();
		// Also refer Immutable class example to understand String references better
		String s = new String("A");
		String s1 = s;
		String s2 = s1;
		
		System.out.println("** I want to understand exactly how this object reference is happening  **");
		System.out.println("** First print base values");
		System.out.println("s = "+s+" s1 = "+s1+" s2 = "+s2);
		System.out.println("** Change the reference of s. What happens to other references?**");
		s = "B";
		System.out.println("s = "+s+" s1 = "+s1+" s2 = "+s2);		
		System.out.println("** Change the reference of s1. What happens to other references?**");
		s1 = "C";
		System.out.println("s = "+s+" s1 = "+s1+" s2 = "+s2);		
		System.out.println("** Change the reference of s. What happens to other references?**");
		s = new String("X");
		System.out.println("s = "+s+" s1 = "+s1+" s2 = "+s2);		
		
		System.out.println("Now try the same with arrays");
		int[] a1 = {3,6,2,9,5,8};
		int[] a2 = a1;
		int[] a3 = a2;
		System.out.println("A1 = "+Arrays.toString(a1));
		System.out.println("A2 = "+Arrays.toString(a2));
		System.out.println("A3 = "+Arrays.toString(a3));
		a1[2] = 2;
		System.out.println("Change value of a1 as a1[2] = 2; -  What is the change happening?");
		System.out.println("A1 = "+Arrays.toString(a1));
		System.out.println("A2 = "+Arrays.toString(a2));
		System.out.println("A3 = "+Arrays.toString(a3));
		a2[3] = 5;
		System.out.println("Change value of a1 as a2[3] = 5; -  What is the change happening?");
		System.out.println("A1 = "+Arrays.toString(a1));
		System.out.println("A2 = "+Arrays.toString(a2));
		System.out.println("A3 = "+Arrays.toString(a3));
		a3[4] = 7;
		System.out.println("Change value of a1 as a3[4] = 7; -  What is the change happening?");
		System.out.println("A1 = "+Arrays.toString(a1));
		System.out.println("A2 = "+Arrays.toString(a2));
		System.out.println("A3 = "+Arrays.toString(a3));
		a2[4] = a3[4];
		System.out.println("Change value of a1 as a2[4] = a3[4]; -  What is the change happening?");
		System.out.println("A1 = "+Arrays.toString(a1));
		System.out.println("A2 = "+Arrays.toString(a2));
		System.out.println("A3 = "+Arrays.toString(a3));
	}

}
