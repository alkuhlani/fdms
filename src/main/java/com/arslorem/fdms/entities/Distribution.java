package com.arslorem.fdms.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "DISTRIBUTION")
public class Distribution extends StampedNamedEntity{

    @OneToMany(mappedBy = "distribution")
    private List<BasketVoucher> basketVouchers;

    private static final long serialVersionUID = 1L;
    
    @Column(name = "START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    
    @Column(name = "END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    
    @Column(name = "DATE_MANDATORY")
    private Boolean dateMandatory;

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getDateMandatory() {
        return dateMandatory;
    }

    public void setDateMandatory(Boolean dateMandatory) {
        this.dateMandatory = dateMandatory;
    }

    public List<BasketVoucher> getBasketVouchers() {
        return basketVouchers;
    }

    public void setBasketVouchers(List<BasketVoucher> basketVouchers) {
        this.basketVouchers = basketVouchers;
    }
}
