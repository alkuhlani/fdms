package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.RelativeType;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class RelativeTypeService extends SuperCRUDService<RelativeType> {

    public RelativeTypeService() {
        super(RelativeType.class);
    }
}
