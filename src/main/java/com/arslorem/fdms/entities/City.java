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
@Table(name = "CITY")
public class City extends StampedNamedEntity {

    @OneToMany(mappedBy = "city")
    private List<District> districts;

    private static final long serialVersionUID = 1L;

    public List<District> getDistricts() {
        return districts;
    }

    public void setDistricts(List<District> districts) {
        this.districts = districts;
    }

}
