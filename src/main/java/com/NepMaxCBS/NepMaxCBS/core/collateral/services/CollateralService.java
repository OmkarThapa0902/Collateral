package com.NepMaxCBS.NepMaxCBS.core.collateral.services;

import com.NepMaxCBS.NepMaxCBS.core.collateral.dtos.CollateralDTO;

public interface CollateralService<T extends CollateralDTO> {
    T createCollateral(T collateralDTO);
    T getCollateral(Long id);
    T updateCollateral(Long id, T collateralDTO);
    void deleteCollateral(Long id);
}


