package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.SecurityGroup;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class GroupService extends SuperCRUDService<SecurityGroup> {

    public GroupService() {
        super(SecurityGroup.class);
    }
}
