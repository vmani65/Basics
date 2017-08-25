package com.AnonymousInnerClass;

public abstract class Domestic implements Tour {

	@Override
	public abstract String modeOfTransport();

	@Override
	public String domesticOrAbroad() {
		return "DOMESTIC";
	}

	@Override
	public String[] members(){
		String[] membersList = {"SARAYU","JANANI","VINOTH","ARJUN"};
		return membersList;
	}

	@Override
	public float budgetCost() {
		return 25125.75f;
	}
	
	public abstract String destination();

}
