package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author rosius
 */
@Entity
public class Commentaire implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String entityType;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int entityId;

    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(nullable = false, length = 1024)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String contenu;

    @ApiModelProperty(value = "creation date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateCreation;

    @ApiModelProperty(value = "update date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateMiseAJour;

    private int userId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    public int getEntityId() {
        return entityId;
    }

    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public long getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
