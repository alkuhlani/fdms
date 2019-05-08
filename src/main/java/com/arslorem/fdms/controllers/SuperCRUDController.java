package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.SecurityGroup;
import com.arslorem.fdms.entities.StampedNamedEntity;
import com.arslorem.fdms.entities.SuperEntity;
import com.arslorem.fdms.services.DataService;
import com.arslorem.fdms.services.SuperCRUDService;
import static com.arslorem.fdms.util.Helper.addFacesMessage;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.inject.Inject;

import static com.arslorem.fdms.util.Helper.msg;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import javax.faces.model.SelectItem;

/**
 *
 * @author mohammed
 * @param <E>
 */
public class SuperCRUDController<E extends StampedNamedEntity> implements Serializable {

    private static final long serialVersionUID = 1L;

    protected E item;
    protected List<E> items;

    @Inject
    protected SuperCRUDService<E> service;
    @Inject
    private DataService ds;

    public void prepareList() {
        item = null;
        items = service.find();
    }

    public void prepareCreate() {
        try {
            Constructor<E> constructor = service.getEntityClass().getDeclaredConstructor();
            item = constructor.newInstance();
        } catch (NoSuchMethodException | SecurityException | InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(SuperCRUDController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void prepareUpdate(Long id) {
        item = service.find(id);
    }

    public void create() {
        service.create(item);
        addFacesMessage(FacesMessage.SEVERITY_INFO, msg("saved"));
        prepareCreate();
    }

    public void update() {
        service.update(item);
        addFacesMessage(FacesMessage.SEVERITY_INFO, msg("updated"));
        item = null;
    }

    public void remove() {
        service.remove(item);
        addFacesMessage(FacesMessage.SEVERITY_INFO, msg("removed"));
        item = null;
    }

    public List<SelectItem> getSelections(String entityName, String lable) {
        List<SelectItem> selections = new ArrayList<>();
        selections.add(new SelectItem(null, lable));
        List<StampedNamedEntity> entities = ds.find(ds.getEntityClass(entityName));
        entities.forEach(e -> {
            selections.add(new SelectItem(e, e.getName()));
        });
        return selections;
    }

    public void addItem(String name) {
        try {
            Field field = item.getClass().getDeclaredField(name);
            field.setAccessible(true);
            List value = (List) field.get(item);
            if (Objects.isNull(value)) {
                value = new ArrayList<>();
            }
            value.add(new SecurityGroup());
            field.set(item, value);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(SuperCRUDController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void removeItem(String name, String toString) {
        try {
            Field field = item.getClass().getDeclaredField(name);
            field.setAccessible(true);
            List value = (List) field.get(item);
            value.remove(value.stream().filter(e -> e.toString().equals(toString)).findFirst().get());
            field.set(item, value);
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(SuperCRUDController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public List<E> getItems() {
        return items;
    }

    public void setItems(List<E> items) {
        this.items = items;
    }
}
