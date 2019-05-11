package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.MaterialIssueItem;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class MaterialIssueItemService extends SuperCRUDService<MaterialIssueItem> {

    public MaterialIssueItemService() {
        super(MaterialIssueItem.class);
    }
}
