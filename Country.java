package com.techouts.hibernatePrograms;

import javax.persistence.Embeddable;

@Embeddable
public class Country {

    private String countryName;
    private String stateName;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	
}
