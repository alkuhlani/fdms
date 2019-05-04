package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.City;
import javax.ejb.Stateless;

/**
 *
 * @author mohammed
 */
@Stateless
public class CityService extends SuperCRUDService<City> {

    public CityService() {
        super(City.class);
    }
}
