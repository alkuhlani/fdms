package com.arslorem.fdms.services;

import com.arslorem.fdms.entities.StampedNamedEntity;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;

/**
 *
 * @author mohammed
 * @param <E>
 */
public class SuperCRUDService<E extends StampedNamedEntity> implements Serializable {

    protected final Class<E> entityClass;

    @Inject
    protected DataService dataService;

    public SuperCRUDService(Class<E> entityClass) {
        this.entityClass = entityClass;
    }

    public List<E> find() {
        return dataService.find(entityClass);
    }

    public E find(Long id) {
        return dataService.find(entityClass, id);
    }

    public void create(E entity) {
        dataService.persist(entity);
    }

    public void update(E entity) {
        dataService.merge(entity);
    }

    public void remove(E entity) {
        dataService.remove(entity);
    }

    public Class<E> getEntityClass() {
        return entityClass;
    }
}
