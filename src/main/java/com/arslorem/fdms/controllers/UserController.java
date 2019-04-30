package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.SecurityUser;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class UserController extends SuperCRUDController<SecurityUser> {

    private static final long serialVersionUID = 1L;

    @Override
    public void create() {
        item.setPassword("123");
        super.create();
    }
}
