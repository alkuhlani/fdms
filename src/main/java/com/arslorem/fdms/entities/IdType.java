package com.arslorem.fdms.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ahmed
 */
@Entity
@Table(name = "ID_TYPE")
public class IdType extends StampedNamedEntity{

    @OneToMany(mappedBy = "idType")
    private List<AlternativeReceipt> alternativeReceipts;

    @OneToMany(mappedBy = "idType")
    private List<Beneficiary> beneficiarys;

    private static final long serialVersionUID = 1L;

    public List<AlternativeReceipt> getAlternativeReceipts() {
        return alternativeReceipts;
    }

    public void setAlternativeReceipts(List<AlternativeReceipt> alternativeReceipts) {
        this.alternativeReceipts = alternativeReceipts;
    }

    public List<Beneficiary> getBeneficiarys() {
        return beneficiarys;
    }

    public void setBeneficiarys(List<Beneficiary> beneficiarys) {
        this.beneficiarys = beneficiarys;
    }
        
}
