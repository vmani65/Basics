package com.DP.FactoryDP;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class Driver implements ThreadUtil{

	public static void main(String[] args) {		
		Resource r = Factory.getResource(ResourceTypes.DATABASE);
		Resource r1 = Factory.getResource(ResourceTypes.RESTAPI);
		Resource r2 = Factory.getResource(ResourceTypes.HYBRID);
		new Driver().printValues(new Resource[]{r, r1, r2});
	}
	
	public void printValues(Resource[] rA){
		for(Resource r: rA)
			print(r);
	}
}
