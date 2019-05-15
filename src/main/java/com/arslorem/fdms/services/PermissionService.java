package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.SecurityPermission;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class PermissionService extends SuperCRUDService<SecurityPermission> {

    public PermissionService() {
        super(SecurityPermission.class);
    }
}
