package com.NepMaxCBS.NepMaxCBS.core.collateral.services;

import com.NepMaxCBS.NepMaxCBS.core.collateral.dtos.PropertyCollateralDTO;
import com.NepMaxCBS.NepMaxCBS.core.collateral.entities.PropertyCollateral;
import com.NepMaxCBS.NepMaxCBS.core.collateral.mappers.CollateralMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyCollateralServiceImpl extends AbstractCollateralServiceImpl<PropertyCollateral, PropertyCollateralDTO> {

    @Autowired
    private CollateralMapper<PropertyCollateral, PropertyCollateralDTO> collateralMapper;

    @Override
    protected PropertyCollateral mapToEntity(PropertyCollateralDTO dto) {
        return collateralMapper.toEntity(dto, new PropertyCollateral());
    }

    @Override
    protected PropertyCollateralDTO mapToDTO(PropertyCollateral entity) {
        return collateralMapper.toDTO(entity, new PropertyCollateralDTO());
    }

    @Override
    protected void updateEntity(PropertyCollateral collateral, PropertyCollateralDTO dto) {
        collateral.setPropertyAddress(dto.getPropertyAddress());
        collateral.setArea(dto.getArea());
    }
}
