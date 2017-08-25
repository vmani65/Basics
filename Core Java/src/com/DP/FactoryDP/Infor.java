package com.DP.FactoryDP;

public class Infor extends Resource{
	private ResourceTypes resourceType; 
	private String resourceLocation;
	private String apiKey;
	
	public Infor(){
		this.resourceType = ResourceTypes.HYBRID;
		this.resourceLocation = "www.infor.com";
		this.apiKey = "123-9863";
	}
	@Override
	public ResourceTypes getResourceType() {
		return ResourceTypes.HYBRID;
	}

	@Override
	public String getResourceLocation() {
		return "www.infor.com";
	}

	@Override
	public String getApiKey() {
		return "123-9863";
	}

	@Override
	public String toString() {
		return "Infor [resourceType()=" + resourceType + ", resourceLocation()=" + resourceLocation + ", apiKey()="
				+ apiKey + "]";
	}
}
