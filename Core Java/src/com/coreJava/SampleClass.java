package com.coreJava;

public class SampleClass {
	

	public static void main(String[] args) {
		try{
			try{
				// B
				throw new ArithmeticException();
			}finally{
				
			}
		}catch(NullPointerException ex){
			System.out.println("Main catch block");
		}catch(Exception ex){
			System.out.println("-");
		}	
	}
}
