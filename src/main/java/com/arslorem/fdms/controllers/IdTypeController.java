package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.IdType;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class IdTypeController extends SuperCRUDController<IdType> {

    private static final long serialVersionUID = 1L;
}
