package com.ExceptionHandling;

public class ExceptionDriverClass {

	public void testCustomCheckedEx() throws CustomCheckedException {
		throw new CustomCheckedException();
	}
	
	public void testCustomCheckedExMessage() throws CustomCheckedException {
		throw new CustomCheckedException("This is a custom error message");
	}
	
	public static void main(String[] args) {
		ExceptionDriverClass dClass = new ExceptionDriverClass();
		try{
			dClass.testCustomCheckedEx();
		}catch(CustomCheckedException ch){
			System.out.println(ch.getStackTrace());
		}
	}
}
