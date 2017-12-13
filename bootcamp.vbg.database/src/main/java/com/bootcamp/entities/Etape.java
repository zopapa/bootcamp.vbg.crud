package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Etape {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "Id of the Etape", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Etape", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nom;

    @ApiModelProperty(value = "Id of the Etape", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long duree;

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

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public long getDuree() {
        return duree;
    }

    public void setDuree(long duree) {
        this.duree = duree;
    }
}
