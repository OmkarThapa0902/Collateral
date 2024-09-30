package com.NepMaxCBS.NepMaxCBS.core.collateral.dtos;

import lombok.Getter;
import lombok.Setter;

public abstract class CollateralDTO {
    private Long id;
    private String collateralNumber;
    private double value;
    private String type; // e.g., Property, Vehicle, etc.
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCollateralNumber() {
		return collateralNumber;
	}
	public void setCollateralNumber(String collateralNumber) {
		this.collateralNumber = collateralNumber;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
    
    
}
