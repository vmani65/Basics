package com.coreJava;

public class A {
	
	static int i = 0;
	
	public A(){
		i = 8;
	}
	public static void doIt(){
		i++;
		System.out.println("Hello");
	}
	static public int a(){
		return Integer.SIZE;
	}
	public static void main(String[] args) {
		int j= 15;
		String s1 = new Integer(j).toString();
		String s = ((Object)j).toString();
		System.out.println(s+s1);
		
		StringBuffer[] b = new StringBuffer[10];
		b[0].append("Hello World");
		System.out.println(b[0]);
	}
}
