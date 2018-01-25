package com.ernani.blueid;

import com.google.gson.annotations.SerializedName;

public class ExtTokenObject {

	@SerializedName("country")
	private String country;

	@SerializedName("blueGroups")
	private String[] blueGroups;

	@SerializedName("w3id-uid")
	private String w3idUid;

	@SerializedName("tenantId")
	private String tenantId;

	@SerializedName("company")
	private String company;

	public String getCountry() {
		return country;
	}

	public String[] getBlueGroups() {
		return blueGroups;
	}

	public String getW3idUid() {
		return w3idUid;
	}

	public String getTenantId() {
		return tenantId;
	}

	public String getCompany() {
		return company;
	}
}
