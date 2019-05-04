package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.Item;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class ItemService extends SuperCRUDService<Item> {

    public ItemService() {
        super(Item.class);
    }
}
