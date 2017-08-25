package com.ExceptionHandling;

public class CustomUncheckedException extends RuntimeException{
	
	private static final long serialVersionUID = 4741043718307701736L;

	public CustomUncheckedException(){
		super();
	}
	
	public CustomUncheckedException(String message){
		super(message);
	}
}
