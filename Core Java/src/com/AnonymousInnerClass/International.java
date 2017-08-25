package com.AnonymousInnerClass;

public abstract class International implements Tour{
	
	@Override
	public String domesticOrAbroad(){
		return "ABROAD";
	}
	
	public abstract String airlines();

}
