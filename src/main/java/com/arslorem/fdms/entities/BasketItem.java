package com.arslorem.fdms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "BASKET_ITEM")
public class BasketItem extends StampedNamedEntity{

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "BASKET")
    @ManyToOne
    private Basket basket;
    
    @JoinColumn(name = "ITEM")
    @ManyToOne
    private Item item;
    
    @Column(name = "QUANTITY")
    private Double quantity;

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }
    
    
}
