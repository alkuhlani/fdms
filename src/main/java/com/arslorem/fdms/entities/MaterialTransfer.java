package com.arslorem.fdms.entities;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "MATERIAL_TRANSFER")
public class MaterialTransfer extends StampedNamedEntity{

   
    private static final long serialVersionUID = 1L;
    
    @JoinColumn(name = "MATERIAL_ISSUE")
    @ManyToOne
    private MaterialIssue materialIssue;
    
    @JoinColumn(name = "MATERIAL_RECEIPT")
    @ManyToOne
    private MaterialReceipt materialReceipt;

    public MaterialIssue getMaterialIssue() {
        return materialIssue;
    }

    public void setMaterialIssue(MaterialIssue materialIssue) {
        this.materialIssue = materialIssue;
    }

    public MaterialReceipt getMaterialReceipt() {
        return materialReceipt;
    }

    public void setMaterialReceipt(MaterialReceipt materialReceipt) {
        this.materialReceipt = materialReceipt;
    }
}