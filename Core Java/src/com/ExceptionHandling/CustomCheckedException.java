package com.ExceptionHandling;

public class CustomCheckedException extends Exception{

	private static final long serialVersionUID = -3135201059168518416L;

	public CustomCheckedException(){
		super();
	}
	
	public CustomCheckedException(String message){
		super(message);
	}	
}
