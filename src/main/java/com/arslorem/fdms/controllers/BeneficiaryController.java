package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.Beneficiary;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class BeneficiaryController extends SuperCRUDController<Beneficiary> {

    private static final long serialVersionUID = 1L;
}
