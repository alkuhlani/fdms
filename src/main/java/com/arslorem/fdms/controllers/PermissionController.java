package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.SecurityPermission;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class PermissionController extends SuperCRUDController<SecurityPermission> {

    private static final long serialVersionUID = 1L;
}
