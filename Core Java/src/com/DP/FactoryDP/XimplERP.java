package com.DP.FactoryDP;

public class XimplERP extends Resource{
	
	private ResourceTypes resourceType; 
	private String resourceLocation;
	private String apiKey;
	
	public XimplERP(){
		this.resourceType = ResourceTypes.RESTAPI;
		this.resourceLocation = "ximpl.com/lntinfotech";
		this.apiKey = "";
	}
	
	@Override
	public ResourceTypes getResourceType() {
		return ResourceTypes.RESTAPI;
	}

	@Override
	public String getResourceLocation() {
		return "ximpl.com/lntinfotech";
	}

	@Override
	public String getApiKey() {
		return "";
	}

	@Override
	public String toString() {
		return "XimplERP [resourceType()=" + resourceType + ", resourceLocation()=" + resourceLocation
				+ ", apiKey()=" + apiKey + "]";
	}
}
