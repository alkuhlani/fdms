package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.UOM;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class UOMService extends SuperCRUDService<UOM> {

    public UOMService() {
        super(UOM.class);
    }
}
