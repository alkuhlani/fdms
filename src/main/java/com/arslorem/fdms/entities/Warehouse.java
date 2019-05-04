package com.arslorem.fdms.entities;

import java.util.List;
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
@Table(name = "WAREHOUSE")
public class Warehouse extends StampedNamedEntity{

    @OneToMany(mappedBy = "warehouse")
    private List<MaterialIssue> materialIssues;

    private static final long serialVersionUID = 1L;
    
    @JoinColumn(name = "DISTRICT")
    @ManyToOne
    private District district;
    
    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public List<MaterialIssue> getMaterialIssues() {
        return materialIssues;
    }

    public void setMaterialIssues(List<MaterialIssue> materialIssues) {
        this.materialIssues = materialIssues;
    }
}
