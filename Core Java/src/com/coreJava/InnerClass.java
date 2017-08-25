package com.coreJava;

import java.util.ArrayList;
import java.util.List;

public class InnerClass {

	private static int a = 10;
	
	public class B {
//		A inner class can access private members, methods of outer class
		public void showIt(){
			System.out.println(InnerClass.a);
			System.out.println(a);
			System.out.println(getA());
		}
	}
	
	private int getA(){
		return a;
	}
	public static void main(String[] args) {
		
		List<String[]> s = new ArrayList<String[]>();
		s.add(args);
		
		
		B b = (new InnerClass()).new B();
		b.showIt(); // The point is inner class can access private members of outer class
//		Also it can access references in InnerClass.a format also
//		It can access private public protected default methods too..
	}
}
