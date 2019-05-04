package com.arslorem.fdms.entities;

import java.util.List;
import javax.persistence.Column;
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
@Table(name = "BENEFICIARY")
public class Beneficiary extends StampedNamedEntity{

    @OneToMany(mappedBy = "beneficiary")
    private List<AlternativeReceipt> alternativeReceipts;

    @OneToMany(mappedBy = "beneficiary")
    private List<BasketVoucher> basketVouchers;

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "ID_TYPE")
    @ManyToOne
    private IdType idType;
    
    @Column(name = "ID_ID")
    private String idId;
    
    @JoinColumn(name = "DISTRICT")
    @ManyToOne
    private District district;

    public IdType getIdType() {
        return idType;
    }

    public void setIdType(IdType idType) {
        this.idType = idType;
    }

    public String getIdId() {
        return idId;
    }

    public void setIdId(String idId) {
        this.idId = idId;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<AlternativeReceipt> getAlternativeReceipts() {
        return alternativeReceipts;
    }

    public void setAlternativeReceipts(List<AlternativeReceipt> alternativeReceipts) {
        this.alternativeReceipts = alternativeReceipts;
    }

    public List<BasketVoucher> getBasketVouchers() {
        return basketVouchers;
    }

    public void setBasketVouchers(List<BasketVoucher> basketVouchers) {
        this.basketVouchers = basketVouchers;
    }
    
}
