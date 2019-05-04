package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.Beneficiary;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class BeneficiaryService extends SuperCRUDService<Beneficiary> {

    public BeneficiaryService() {
        super(Beneficiary.class);
    }
}
