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
@Table(name = "UOM")
public class UOM extends StampedNamedEntity{

    @OneToMany(mappedBy = "uom")
    private List<Item> items;

    private static final long serialVersionUID = 1L;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

   
}
