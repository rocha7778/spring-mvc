package com.packt.webstore.dto;

import java.math.BigDecimal;

import javax.persistence.Column;

public class Countries {
	
	@Column(name = "COUNTRY_ID")
    private String countryId;
	
	 @Column(name = "COUNTRY_NAME")
	    private String countryName;
	 
	 @Column(name = "REGION_ID")
	 private BigDecimal regionId;
	 
	 
	 
	 public Countries() {
	    }

	public String getCountryId() {
		return countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public BigDecimal getRegionId() {
		return regionId;
	}

	public void setRegionId(BigDecimal regionId) {
		this.regionId = regionId;
	}
	 
	 
	 

}
