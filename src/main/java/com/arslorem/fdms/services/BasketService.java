package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.Basket;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class BasketService extends SuperCRUDService<Basket> {

    public BasketService() {
        super(Basket.class);
    }
}
