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
@Table(name = "MATERIAL_RECEIPT_ITEM")
public class MaterialReceiptItem extends StampedNamedEntity{

    private static final long serialVersionUID = 1L;
   
    @JoinColumn(name = "MATERIAL_RECEIPT")
    @ManyToOne
    private MaterialReceipt materialReceipt;
    
    @JoinColumn(name = "ITEM")
    @ManyToOne
    private Item item;
    
    @Column(name = "QUANTITY")
    private Double quantity;

    public MaterialReceipt getMaterialReceipt() {
        return materialReceipt;
    }

    public void setMaterialReceipt(MaterialReceipt materialReceipt) {
        this.materialReceipt = materialReceipt;
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
