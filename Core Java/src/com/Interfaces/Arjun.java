package com.Interfaces;

public class Arjun implements FutureBaby {

	@Override
	public String gender() {
		return Gender.MALE.toString();
	}

	@Override
	public String fatherName() {
		return Parents.VINOTH.toString();
	}

	@Override
	public String motherName() {
		return Parents.JANANI.toString();
	}
	
	@Override
	public int numberOfFingers(){
		return 11;
	}

}
