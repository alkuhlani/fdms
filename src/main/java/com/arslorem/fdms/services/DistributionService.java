package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.Distribution;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class DistributionService extends SuperCRUDService<Distribution> {

    public DistributionService() {
        super(Distribution.class);
    }
}
