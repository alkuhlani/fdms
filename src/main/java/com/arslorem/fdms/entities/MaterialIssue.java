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
@Table(name = "MATERIAL_ISSUE")
public class MaterialIssue extends StampedNamedEntity{

    @OneToMany(mappedBy = "materialIssue")
    private List<MaterialTransfer> materialTransfers;

    @OneToMany(mappedBy = "materialIssue")
    private List<BasketVoucher> basketVouchers;

    @OneToMany(mappedBy = "materialIssue")
    private List<MaterialIssueItem> materialIssueItems;

    private static final long serialVersionUID = 1L;
    
    @JoinColumn(name = "WAREHOUSE")
    @ManyToOne
    private Warehouse warehouse;
    
    @Column(name = "ISSUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;

    @Column(name = "IS_DRAFT")
    private Boolean isDraft;
    
    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public List<BasketVoucher> getBasketVouchers() {
        return basketVouchers;
    }

    public void setBasketVouchers(List<BasketVoucher> basketVouchers) {
        this.basketVouchers = basketVouchers;
    }

    public List<MaterialIssueItem> getMaterialIssueItems() {
        return materialIssueItems;
    }

    public void setMaterialIssueItems(List<MaterialIssueItem> materialIssueItems) {
        this.materialIssueItems = materialIssueItems;
    }

    public List<MaterialTransfer> getMaterialTransfers() {
        return materialTransfers;
    }

    public void setMaterialTransfers(List<MaterialTransfer> materialTransfers) {
        this.materialTransfers = materialTransfers;
    }

    public Boolean getIsDraft() {
        return isDraft;
    }

    public void setIsDraft(Boolean isDraft) {
        this.isDraft = isDraft;
    }
    
}