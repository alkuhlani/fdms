package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.MaterialIssue;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class MaterialIssueController extends SuperCRUDController<MaterialIssue> {

    private static final long serialVersionUID = 1L;
}
