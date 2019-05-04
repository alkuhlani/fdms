package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.Item;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class ItemController extends SuperCRUDController<Item> {

    private static final long serialVersionUID = 1L;
}
