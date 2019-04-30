package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.SecurityGroup;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class GroupController extends SuperCRUDController<SecurityGroup> {

    private static final long serialVersionUID = 1L;
}
