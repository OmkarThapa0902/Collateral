package com.NepMaxCBS.NepMaxCBS.core.collateral.entities;

import jakarta.persistence.Entity;

@Entity
public class VehicleCollateral extends Collateral {
    private String vehicleModel;
    private String registrationNumber;
}
