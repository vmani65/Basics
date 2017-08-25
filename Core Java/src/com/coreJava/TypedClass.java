package com.coreJava;

public class TypedClass<T> {
	T t;
	
	public <B> void getType(T t){
		System.out.println(t.getClass().getName());
	}
	
	public static void main(String[] args) {
		System.out.println("Hello, World");
		
		int[] a1 = {3,6,2,9,5,8};
		int[] a2 = a1;
		int[] a3 = a2;
		
		a1[2] = 2;
		a2[3] = 5;
		a3[4] = 7;
		a2[4] = a3[4];
		
		System.out.println(a1[4]);
		
		String s1 = new String("s1");
		String s2 = s1;
		
		
		
		System.out.println(s1);
		System.out.println(s2);
//		System.out.println(s3);
		
	}

}
