package com.NepMaxCBS.NepMaxCBS.core.collateral.repositories;

import com.NepMaxCBS.NepMaxCBS.core.collateral.entities.Collateral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollateralRepository extends JpaRepository<Collateral, Long> {
    // Custom query methods if needed
}
