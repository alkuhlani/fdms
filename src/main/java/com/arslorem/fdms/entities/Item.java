package com.arslorem.fdms.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "ITEM")
public class Item extends StampedNamedEntity{

    @OneToMany(mappedBy = "item")
    private List<MaterialIssueItem> materialIssueItems;

    @OneToMany(mappedBy = "item")
    private List<BasketItem> basketItems;

    private static final long serialVersionUID = 1L;
    
    @JoinColumn(name = "UOM")
    @ManyToOne
    private UOM uom;

    public UOM getUom() {
        return uom;
    }

    public void setUom(UOM uom) {
        this.uom = uom;
    }

    public List<MaterialIssueItem> getMaterialIssueItems() {
        return materialIssueItems;
    }

    public void setMaterialIssueItems(List<MaterialIssueItem> materialIssueItems) {
        this.materialIssueItems = materialIssueItems;
    }

    public List<BasketItem> getBasketItems() {
        return basketItems;
    }

    public void setBasketItems(List<BasketItem> basketItems) {
        this.basketItems = basketItems;
    }
}
