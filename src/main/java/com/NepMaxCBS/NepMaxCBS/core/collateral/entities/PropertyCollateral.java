package com.NepMaxCBS.NepMaxCBS.core.collateral.entities;

import jakarta.persistence.Entity;

@Entity
public class PropertyCollateral extends Collateral {
    private String propertyAddress;
    private double area;
	public String getPropertyAddress() {
		return propertyAddress;
	}
	public void setPropertyAddress(String propertyAddress) {
		this.propertyAddress = propertyAddress;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	}
    
    

