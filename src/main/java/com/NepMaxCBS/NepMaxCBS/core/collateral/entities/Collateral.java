package com.NepMaxCBS.NepMaxCBS.core.collateral.entities;

import jakarta.persistence.*;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)

public abstract class Collateral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String collateralNumber;
    private double value;
    private String type;
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
