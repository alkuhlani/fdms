package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.IdType;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class IdTypeService extends SuperCRUDService<IdType> {

    public IdTypeService() {
        super(IdType.class);
    }
}
