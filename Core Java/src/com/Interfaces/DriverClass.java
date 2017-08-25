package com.Interfaces;

public class DriverClass {

	public static void main(String[] args) {
		Baby s = new Sarayu();
		System.out.println(s.numberOfFingers());
		System.out.println(s.numberOfLegs());
		
		Sarayu vS = new Sarayu();
		System.out.println(vS.getAddress());
		
		Baby a = new Arjun();
		System.out.println(a.numberOfFingers());
		System.out.println(a.numberOfLegs());
		System.out.println(a.fatherName());
	}
}
