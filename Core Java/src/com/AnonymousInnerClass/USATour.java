package com.AnonymousInnerClass;

import java.util.Arrays;

public class USATour extends International{

	@Override
	public String modeOfTransport(){
		return "RECREATIONAL VEHICLE";
	}
	
	@Override
	public float budgetCost(){
		return 525000.50f;
	}
	
	@Override
	public String[] members(){		
		return new String[]{"SARAYU","JANANI","VINOTH"};
	}

	@Override
	public String toString() {
		return "USATour [modeOfTransport()=" + modeOfTransport() + ", domesticOrAbroad()=" + domesticOrAbroad()
				+ ", members()=" + Arrays.toString(members()) + "]";
	}

	@Override
	public String airlines() {
		return "EMIRATES";
	}
}
