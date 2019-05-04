package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.MaterialReceipt;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class MaterialReceiptService extends SuperCRUDService<MaterialReceipt> {

    public MaterialReceiptService() {
        super(MaterialReceipt.class);
    }
}
