package com.arslorem.fdms.controllers;

import com.arslorem.fdms.entities.Item;
import com.arslorem.fdms.entities.MaterialIssue;
import com.arslorem.fdms.entities.MaterialIssueItem;
import com.arslorem.fdms.services.ItemService;
import com.arslorem.fdms.services.MaterialIssueItemService;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;

/**
 *
 * @author mohammed
 */
@Named
@SessionScoped
public class MaterialIssueController extends SuperCRUDController<MaterialIssue> {

    private static final long serialVersionUID = 1L;
    private List<Item> allItems;
    private MaterialIssueItem materialIssueItem;
    boolean pendingItem = false;
    @Inject
    private MaterialIssueItemService issueItemService;
    @Inject
    private ItemService itemService;

    public void prepareCreateNewIssueItem() {
        materialIssueItem = new MaterialIssueItem();
        materialIssueItem.setMaterialIssue(item);
    }

    public void createNewIssueItem() {
        if (!checkIfExist(materialIssueItem)) {
            issueItemService.create(materialIssueItem);
            prepareCreateNewIssueItem();
        }
        super.prepareUpdate(item.getId());
    }
    
    public void deleteIssueItem(MaterialIssueItem obj){
        issueItemService.remove(obj);
        super.prepareUpdate(item.getId());
    }

    public boolean checkIfExist(MaterialIssueItem obj) {
        pendingItem = false;
        super.prepareUpdate(item.getId());
        if (Objects.nonNull(item.getMaterialIssueItems())) {
            item.getMaterialIssueItems().forEach((t) -> {
                if (Objects.nonNull(t.getItem())) {
                    if (Objects.nonNull(obj.getItem())) {
                        if (t.getItem().equals(obj.getItem())) {
                            pendingItem = true;
                        }
                    } else {
                        pendingItem = true;
                    }
                } else {
                    pendingItem = true;
                }
                if (Objects.nonNull(t.getQuantity())) {
                    if (!Objects.nonNull(obj.getQuantity())) {
                        pendingItem = true;
                    }
                } else {
                    pendingItem = true;
                }
            });
        }
        return pendingItem;
    }

    @Override
    public void prepareCreate() {
        super.prepareCreate();
        item.setName("Draft "+UUID.randomUUID().getMostSignificantBits());
        item.setIsDraft(Boolean.TRUE);
        super.createOnly();
        prepareCreateNewIssueItem();
    }

    @Override
    public void prepareUpdate(Long id) {
        super.prepareUpdate(id); 
        prepareCreateNewIssueItem();
    }

    @Override
    public void create() {
        pendingItem = false;
        super.prepareUpdate(item.getId());
        if (Objects.nonNull(item.getMaterialIssueItems())) {
            item.getMaterialIssueItems().forEach((t) -> {
                if (!Objects.nonNull(t.getItem())) {
                    pendingItem = true;
                }
                if (!Objects.nonNull(t.getQuantity())) {
                    pendingItem = true;
                }
            });
            if (!pendingItem) {
                item.setIsDraft(Boolean.FALSE);
                service.update(item);
            }
        }
    }

    @Override
    public void update() {
        item.setIsDraft(Boolean.FALSE);
        super.update(); 
    }

    
    public void onRowEdit(RowEditEvent event) {
        if (!checkIfExist((MaterialIssueItem) event.getObject())) {
            FacesMessage msg = new FacesMessage("Item Edited", ((MaterialIssueItem) event.getObject()).getItem().getName());
            issueItemService.update((MaterialIssueItem) event.getObject());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        } else {
            FacesMessage msg = new FacesMessage("Item Edited Fault", ((MaterialIssueItem) event.getObject()).getItem().getName());
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }

    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled", ((MaterialIssueItem) event.getObject()).getItem().getName());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }


    public List<Item> getAllItems() {
        return itemService.find();
    }

    public void setAllItems(List<Item> allItems) {
        this.allItems = allItems;
    }

    public MaterialIssueItem getMaterialIssueItem() {
        return materialIssueItem;
    }

    public void setMaterialIssueItem(MaterialIssueItem materialIssueItem) {
        this.materialIssueItem = materialIssueItem;
    }

}
