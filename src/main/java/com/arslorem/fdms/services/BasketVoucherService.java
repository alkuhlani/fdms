package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.BasketVoucher;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class BasketVoucherService extends SuperCRUDService<BasketVoucher> {

    public BasketVoucherService() {
        super(BasketVoucher.class);
    }
}
