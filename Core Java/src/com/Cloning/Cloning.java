package com.Cloning;

public class Cloning implements Cloneable {
	
	private float constant = 12.3f;
	
	public float getConstant(){
		return constant;
	}
	
	@Override
	public Cloning clone() throws CloneNotSupportedException{
		return (Cloning) super.clone();
	}
}

/*Update*/
