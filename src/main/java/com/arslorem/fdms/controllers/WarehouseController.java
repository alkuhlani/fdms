package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.Warehouse;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class WarehouseController extends SuperCRUDController<Warehouse> {

    private static final long serialVersionUID = 1L;
}
