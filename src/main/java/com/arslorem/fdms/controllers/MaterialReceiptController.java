package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.MaterialReceipt;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class MaterialReceiptController extends SuperCRUDController<MaterialReceipt> {

    private static final long serialVersionUID = 1L;
}
