package com.arslorem.fdms.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "BASKET_VOUCHER")
public class BasketVoucher extends StampedNamedEntity{

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "BENEFICIARY")
    @ManyToOne
    private Beneficiary beneficiary;
    
    @JoinColumn(name = "ITEM")
    @ManyToOne
    private MaterialIssue materialIssue;
    
    @JoinColumn(name = "BASKET")
    @ManyToOne
    private Basket basket;
    
    @Column(name = "VOUCHER")
    private String voucher;
    
    @JoinColumn(name = "DISTRIBUTION")
    @ManyToOne
    private Distribution distribution;
    
    @Column(name = "RECEIPT_CONFIRM")
    private Boolean receiptConfirm;
    
    @JoinColumn(name = "RECEIPT_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date receiptDate;
    
    @JoinColumn(name = "RECEIPT_USER")
    @ManyToOne
    private SecurityUser receiptUser;

    //fingerPrint Field Missing (FINGERPRINT)//

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

    public MaterialIssue getMaterialIssue() {
        return materialIssue;
    }

    public void setMaterialIssue(MaterialIssue materialIssue) {
        this.materialIssue = materialIssue;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public String getVoucher() {
        return voucher;
    }

    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }

    public Distribution getDistribution() {
        return distribution;
    }

    public void setDistribution(Distribution distribution) {
        this.distribution = distribution;
    }

    public Boolean getReceiptConfirm() {
        return receiptConfirm;
    }

    public void setReceiptConfirm(Boolean receiptConfirm) {
        this.receiptConfirm = receiptConfirm;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    public SecurityUser getReceiptUser() {
        return receiptUser;
    }

    public void setReceiptUser(SecurityUser receiptUser) {
        this.receiptUser = receiptUser;
    }
}
