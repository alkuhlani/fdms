package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.SecurityGroup;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author mohammed
 */
@Named
@ViewScoped
public class GroupController extends SuperCRUDController<SecurityGroup> {
	private static final long serialVersionUID = 1L;
}
