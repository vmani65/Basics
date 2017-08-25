package com.coreJava;

public class Variables {

	private float f; // CLASS VARIABLES are by default assigned values before initializing them.
	private boolean b;
	private char c;
	public int length;
	/*
	 * DEFAULT VALUES SET FOR CLASS VARIABLES ARE
	 * ------------------------------------------
	 * byte,short,int,long = 0
	 * float, double = 0.0
	 * boolean = false
	 * objects = null
	 * char = '\u0000'
	 * */
	
	void printPrimitives(){
		double d;
		float f;
//		System.out.println(d); 
//		Throws compiler error. LOCAL VARIABLES should be initialized before referring them.
//		System.out.println(f);
		d = 1.25d;
		f= 13.65f;
		System.out.println(f+d);
		if(length > 0){
			/* IMPORTANT:-
			 * Here I am able to reference length without creating an instance of Variable Class. How?
			 * This is a non-static method. We can access all member variables without creating an instance of this class.
			 */
			 System.out.println("Hey. This is new to me.");			
		}
	}
	
//	Understand where the scope of variables start and end
	private void scopeOfVariables(boolean hungry, int amountOfFood){
//		hungry and amountOfFood are method parameters. They are available to the whole method.
		int roomInBelly = 5; // roomInBelly is also available to the whole method
		if(hungry){
			boolean timeToEat = true; // timeToEat is declared within this block. The scope will end at line no.40
			while(amountOfFood > 0 && timeToEat){
				int amountEaten = 2; // amountEaten scope ends at line no.39
				roomInBelly = roomInBelly - amountEaten;
				amountOfFood = amountOfFood - amountEaten;
			}
		}
		System.out.println(amountOfFood);
	}
	public static void main(String[] args) {
		Variables v = new Variables();
		v.printPrimitives();
		System.out.println(v.f+v.c); //This doesn't throw compiler error because we're referencing a class variable that is by default assigned a value
		System.out.println(v.b);
		v.scopeOfVariables(true, 10);
//		printPrimitives();
//		Cannot make a static reference to non-static method(Includes default, public, private, protected)
	}
}
