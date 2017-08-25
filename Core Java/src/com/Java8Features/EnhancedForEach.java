package com.Java8Features;// Package name comes first followed by import.(PIC - Package,Import,Class)

import java.util.Arrays; //Import comes second
import java.util.List;

public class EnhancedForEach {

		private static List<Integer> l = Arrays.asList(1,2,4,5,3,6,8,7,9);
		private static Java8Helper h = new Java8Helper(); // This class is inside Java8Features. Its not an inner class. It should not have public access modifier.
		
		{
			System.out.println("This is an instance initializer - 1");
		}
		
		static {
//			This piece of code is executed even before the main method is called. 
//			The order of execution is 
//			1. static block
//			2. instance initializer
//			3. constructor
//			4. main() method		
			System.out.println("This is an static initializer");
		}
		
		private void externalIterator(){
			for(Integer i : EnhancedForEach.l)
				System.out.println(i.doubleValue());			
		}
		
		private void internalIteratorWithoutTypeInference(){
			EnhancedForEach.l.forEach((Integer i) ->
				System.out.println(i.longValue()) // Pay attention. We need not put semicolon if we have one line code without curly braces.
			);
		}
		
//		In Java 1.8, The compiler will infer the type we are iterating.
//		We don't have to explicitly type-cast and explain the type to the compiler.
//		While lambdas are cute , try to keep it that way.
//		Don't have more than 2 lines of code inside lambda. If you need, create a new method and use it through lambda.
		
		private void internalIteratorWithTypeInference(){
			EnhancedForEach.l.forEach(i -> {
				System.out.println(i.floatValue()); // Attention. We need to put semicolon if we have curly braces inside for-each
			});
			
//			This is method reference. You are just passing the parameter without doing any logic.
//			We are passing the parameter as an argument to println method (instance method/non-static method)
//			EnhancedForEach.l.forEach(ex -> System.out.println(ex)); . We will make a method reference by using :: and passing ex to it.
			
			EnhancedForEach.l.forEach(System.out::println);
			
//			How about passing the parameter from forEach to a static method?
//			Simple. Pass it in the same way as non static method
			EnhancedForEach.l.forEach(String::valueOf);
			EnhancedForEach.l.forEach(h::printObjects);
		}
		
		public static void main(String[] args) {
			EnhancedForEach fEach = new EnhancedForEach();
			fEach.externalIterator();
			fEach.internalIteratorWithTypeInference();
			fEach.internalIteratorWithoutTypeInference();
		}
}
class Java8Helper {
	public void printObjects(Object o){
		System.out.println("This is printed from the helper class: "+o);
	}
}
