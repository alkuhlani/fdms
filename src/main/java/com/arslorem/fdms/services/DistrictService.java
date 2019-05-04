package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.District;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class DistrictService extends SuperCRUDService<District> {

    public DistrictService() {
        super(District.class);
    }
}
