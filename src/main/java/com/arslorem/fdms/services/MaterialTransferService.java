package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.City;
import com.arslorem.fdms.entities.MaterialTransfer;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class MaterialTransferService extends SuperCRUDService<MaterialTransfer> {

    public MaterialTransferService() {
        super(MaterialTransfer.class);
    }
}
