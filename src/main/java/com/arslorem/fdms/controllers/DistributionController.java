package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.Distribution;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class DistributionController extends SuperCRUDController<Distribution> {

    private static final long serialVersionUID = 1L;
}
