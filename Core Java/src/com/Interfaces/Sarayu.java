package com.Interfaces;

public class Sarayu implements Baby {

	@Override
	public String gender() {
		return Gender.FEMALE.toString();
	}

	@Override
	public String fatherName() {
		return Parents.VINOTH.toString();
	}

	@Override
	public String motherName() {
		return Parents.JANANI.toString();
	}
	
	public String getAddress(){
		return Baby.address();
	}
	
}
