package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.MaterialIssue;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class MaterialIssueService extends SuperCRUDService<MaterialIssue> {

    public MaterialIssueService() {
        super(MaterialIssue.class);
    }
}
