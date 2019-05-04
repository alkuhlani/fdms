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
@Table(name = "MATERIAL_ISSUE_ITEM")
public class MaterialIssueItem extends StampedNamedEntity{

    private static final long serialVersionUID = 1L;
    
    @JoinColumn(name = "MATERIAL_ISSUE")
    @ManyToOne
    private MaterialIssue materialIssue;
    
    @JoinColumn(name = "ITEM")
    @ManyToOne
    private Item item;
    
    @Column(name = "QUANTITY")
    private Double quantity;

    public MaterialIssue getMaterialIssue() {
        return materialIssue;
    }

    public void setMaterialIssue(MaterialIssue materialIssue) {
        this.materialIssue = materialIssue;
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
