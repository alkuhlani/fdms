package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.District;
import com.arslorem.fdms.entities.Warehouse;
import com.arslorem.fdms.services.DistrictService;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class WarehouseController extends SuperCRUDController<Warehouse> {

    private static final long serialVersionUID = 1L;
    @Inject
    private DistrictService districtService;
    public List<District> getDistricts(){
        return districtService.find();
    }
}
