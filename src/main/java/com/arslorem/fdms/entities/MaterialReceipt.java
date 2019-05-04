package com.arslorem.fdms.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "MATERIAL_RECEIPT")
public class MaterialReceipt extends StampedNamedEntity{

    @OneToMany(mappedBy = "materialReceipt")
    private List<MaterialTransfer> materialTransfers;

    @OneToMany(mappedBy = "materialReceipt")
    private List<MaterialReceiptItem> materialReceiptItems;

    private static final long serialVersionUID = 1L;
    
    @JoinColumn(name = "WAREHOUSE")
    @ManyToOne
    private Warehouse warehouse;
    
    @Column(name = "RECEIPT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiptDate;

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public List<MaterialReceiptItem> getMaterialReceiptItems() {
        return materialReceiptItems;
    }

    public void setMaterialReceiptItems(List<MaterialReceiptItem> materialReceiptItems) {
        this.materialReceiptItems = materialReceiptItems;
    }

    public List<MaterialTransfer> getMaterialTransfers() {
        return materialTransfers;
    }

    public void setMaterialTransfers(List<MaterialTransfer> materialTransfers) {
        this.materialTransfers = materialTransfers;
    }
    
}
