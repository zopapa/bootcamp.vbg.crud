/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import com.bootcamp.commons.enums.EntityType;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author Bignon
 */
@Entity
public class Media implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(name = "originalName", length = 45, nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String originalName;

    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(name = "internalName", length = 45, nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String name;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String entityType;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int entityId;

    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(name = "type", length = 45, nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String type;

    @Lob
    @Basic(fetch = FetchType.LAZY, optional = false)
    @Column(name = "link", nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String lien;

    @ApiModelProperty(value = "creation date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateCreation;

    @ApiModelProperty(value = "update date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateMiseAJour;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the originalName
     */
    public String getOriginalName() {
        return originalName;
    }

    /**
     * @param originalName the originalName to set
     */
    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the lien
     */
    public String getLien() {
        return lien;
    }

    /**
     * @param lien the lien to set
     */
    public void setLien(String lien) {
        this.lien = lien;
    }

    /**
     * @return the dateCreation
     */
    public long getDateCreation() {
        return dateCreation;
    }

    /**
     * @param dateCreation the dateCreation to set
     */
    public void setDateCreation(long dateCreation) {
        this.dateCreation = dateCreation;
    }

    /**
     * @return the dateMiseAJour
     */
    public long getDateMiseAJour() {
        return dateMiseAJour;
    }

    /**
     * @param dateMiseAJour the dateMiseAJour to set
     */
    public void setDateMiseAJour(long dateMiseAJour) {
        this.dateMiseAJour = dateMiseAJour;
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
}
