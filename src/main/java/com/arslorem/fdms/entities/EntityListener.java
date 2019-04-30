package com.arslorem.fdms.entities;

import java.util.Date;
import java.util.UUID;
import javax.faces.context.FacesContext;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

/**
 *
 * @author mohammed
 */
public class EntityListener {

    @PrePersist
    public void preCreate(StampedEntity entity) {
        entity.setId(UUID.randomUUID().getLeastSignificantBits());
        entity.setCreateTime(new Date());
        SecurityUser user = new SecurityUser();
        user.setId((Long) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userId"));
        entity.setCreateUser(user);
    }

    @PreUpdate
    public void preUpdate(StampedEntity entity) {
        entity.setUpdateTime(new Date());
        SecurityUser user = new SecurityUser();
        user.setId((Long) FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("userId"));
        entity.setUpdateUser(user);
    }
}
