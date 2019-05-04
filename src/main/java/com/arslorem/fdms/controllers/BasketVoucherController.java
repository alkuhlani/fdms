package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.BasketVoucher;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class BasketVoucherController extends SuperCRUDController<BasketVoucher> {

    private static final long serialVersionUID = 1L;
}
