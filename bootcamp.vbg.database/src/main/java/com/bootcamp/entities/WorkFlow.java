package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class WorkFlow {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "Id of the Etape", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @ApiModelProperty(value = "Id of the Etape", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int idPlainte;

    @ApiModelProperty(value = "Id of the Etape", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int idEtape;

    @ApiModelProperty(value = "creation date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateCreation;

    @ApiModelProperty(value = "update date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateMiseAJour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPlainte() {
        return idPlainte;
    }

    public void setIdPlainte(int idPlainte) {
        this.idPlainte = idPlainte;
    }

    public int getIdEtape() {
        return idEtape;
    }

    public void setIdEtape(int idEtape) {
        this.idEtape = idEtape;
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
}
