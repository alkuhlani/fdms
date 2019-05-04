package com.arslorem.fdms.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "BASKET")
public class Basket extends StampedNamedEntity{

    @OneToMany(mappedBy = "basket")
    private List<BasketVoucher> basketVouchers;

    @OneToMany(mappedBy = "basket")
    private List<BasketItem> basketItems;

    private static final long serialVersionUID = 1L;

    public List<BasketVoucher> getBasketVouchers() {
        return basketVouchers;
    }

    public void setBasketVouchers(List<BasketVoucher> basketVouchers) {
        this.basketVouchers = basketVouchers;
    }

    public List<BasketItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }
}
