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
@Table(name = "DISTRICT")
public class District extends StampedNamedEntity {

    @OneToMany(mappedBy = "district")
    private List<Warehouse> warehouses;

    @OneToMany(mappedBy = "district")
    private List<Beneficiary> beneficiarys;

    private static final long serialVersionUID = 1L;

    @JoinColumn(name = "CITY")
    @ManyToOne
    private City city;

    public List<Beneficiary> getBeneficiarys() {
        return beneficiarys;
    }

    public void setBeneficiarys(List<Beneficiary> beneficiarys) {
        this.beneficiarys = beneficiarys;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Warehouse> getWarehouses() {
        return warehouses;
    }

    public void setWarehouses(List<Warehouse> warehouses) {
        this.warehouses = warehouses;
    }

}
