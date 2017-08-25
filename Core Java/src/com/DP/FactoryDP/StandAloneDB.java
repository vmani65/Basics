package com.DP.FactoryDP;

public class StandAloneDB extends Resource{
	
	private ResourceTypes resourceType; 
	private String resourceLocation;
	private String apiKey;

	public StandAloneDB(){
		this.resourceType = ResourceTypes.DATABASE;
		this.resourceLocation = "localhost:8080/test";
		this.apiKey = "abcde";
	}

	public ResourceTypes getResourceType() {
		return this.resourceType;
	}

	public String getResourceLocation() {
		return this.resourceLocation;
	}

	public String getApiKey() {
		return this.apiKey;
	}
	
	@Override
	public String toString() {
		return "StandAloneDB [resourceType=" + resourceType.toString() + ", resourceLocation=" + resourceLocation
				+ ", apiKey()=" + apiKey + "]";
	}
}
