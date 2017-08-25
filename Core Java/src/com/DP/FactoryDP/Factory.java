package com.DP.FactoryDP;

public class Factory {

	public static Resource getResource(ResourceTypes r){
		switch (r){
		case DATABASE : 
			return new StandAloneDB();
		case RESTAPI : 
			return new XimplERP();
		case HYBRID : 
			return new Infor();
		default:			
			return null;		
	    }
	}
}
