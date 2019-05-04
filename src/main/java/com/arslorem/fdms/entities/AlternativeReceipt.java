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
@Table(name = "ALTERNATIVE_RECEIPT")
public class AlternativeReceipt extends StampedNamedEntity {

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "RELATIVE_TYPE")
    @ManyToOne
    private RelativeType relativeType;

    @JoinColumn(name = "ID_TYPE")
    @ManyToOne
    private IdType idType;

    @Column(name = "ID_ID")
    private String idId;

    @JoinColumn(name = "BENEFICIARY")
    @ManyToOne
    private Beneficiary beneficiary;

    public RelativeType getRelativeType() {
        return relativeType;
    }

    public void setRelativeType(RelativeType relativeType) {
        this.relativeType = relativeType;
    }

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

    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    public void setBeneficiary(Beneficiary beneficiary) {
        this.beneficiary = beneficiary;
    }

}
