package com.NepMaxCBS.NepMaxCBS.core.collateral.mappers;

import com.NepMaxCBS.NepMaxCBS.core.collateral.dtos.CollateralDTO;
import com.NepMaxCBS.NepMaxCBS.core.collateral.entities.Collateral;
import org.springframework.stereotype.Component;

@Component
public class CollateralMapper<T extends Collateral, D extends CollateralDTO> {

    public D toDTO(T collateral, D dto) {
        dto.setId(collateral.getId());
        dto.setCollateralNumber(collateral.getCollateralNumber());
        dto.setValue(collateral.getValue());
        dto.setType(collateral.getType());
        return dto;
    }

    public T toEntity(D dto, T collateral) {
        collateral.setId(dto.getId());
        collateral.setCollateralNumber(dto.getCollateralNumber());
        collateral.setValue(dto.getValue());
        collateral.setType(dto.getType());
        return collateral;
    }
}
