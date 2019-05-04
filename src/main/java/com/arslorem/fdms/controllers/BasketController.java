package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.Basket;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class BasketController extends SuperCRUDController<Basket> {

    private static final long serialVersionUID = 1L;
}
