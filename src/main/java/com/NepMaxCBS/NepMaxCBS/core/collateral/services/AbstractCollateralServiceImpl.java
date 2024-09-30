package com.NepMaxCBS.NepMaxCBS.core.collateral.services;

import com.NepMaxCBS.NepMaxCBS.core.collateral.dtos.CollateralDTO;
import com.NepMaxCBS.NepMaxCBS.core.collateral.entities.Collateral;
import com.NepMaxCBS.NepMaxCBS.core.collateral.repositories.CollateralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractCollateralServiceImpl<T extends Collateral, D extends CollateralDTO> implements CollateralService<D> {

    @Autowired
    protected CollateralRepository collateralRepository;

    @Override
    public D createCollateral(D collateralDTO) {
        T collateral = mapToEntity(collateralDTO);
        collateral = collateralRepository.save(collateral);
        return mapToDTO(collateral);
    }

    @Override
    public D getCollateral(Long id) {
        T collateral = (T) collateralRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Collateral not found with id: " + id));
        return mapToDTO(collateral);
    }

    @Override
    public D updateCollateral(Long id, D collateralDTO) {
        T collateral = (T) collateralRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Collateral not found with id: " + id));
        updateEntity(collateral, collateralDTO);
        collateral = collateralRepository.save(collateral);
        return mapToDTO(collateral);
    }

    @Override
    public void deleteCollateral(Long id) {
        collateralRepository.deleteById(id);
    }

    protected abstract T mapToEntity(D dto);
    protected abstract D mapToDTO(T entity);
    protected abstract void updateEntity(T collateral, D collateralDTO);
}
