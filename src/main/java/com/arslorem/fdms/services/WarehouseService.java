package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.Warehouse;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class WarehouseService extends SuperCRUDService<Warehouse> {

    public WarehouseService() {
        super(Warehouse.class);
    }
}
