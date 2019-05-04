package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.City;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class CityController extends SuperCRUDController<City> {

    private static final long serialVersionUID = 1L;
}
