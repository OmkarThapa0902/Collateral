package com.NepMaxCBS.NepMaxCBS.core.collateral.controllers;

import com.NepMaxCBS.NepMaxCBS.core.collateral.dtos.PropertyCollateralDTO;
import com.NepMaxCBS.NepMaxCBS.core.collateral.services.CollateralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/collaterals")
public class CollateralController {

    @Autowired
    private CollateralService<PropertyCollateralDTO> collateralService;

    @PostMapping
    public PropertyCollateralDTO createCollateral(@RequestBody PropertyCollateralDTO collateralDTO) {
        return collateralService.createCollateral(collateralDTO);
    }

    @GetMapping("/{id}")
    public PropertyCollateralDTO getCollateral(@PathVariable Long id) {
        return collateralService.getCollateral(id);
    }

    @PutMapping("/{id}")
    public PropertyCollateralDTO updateCollateral(@PathVariable Long id, @RequestBody PropertyCollateralDTO collateralDTO) {
        return collateralService.updateCollateral(id, collateralDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteCollateral(@PathVariable Long id) {
        collateralService.deleteCollateral(id);
    }
}
