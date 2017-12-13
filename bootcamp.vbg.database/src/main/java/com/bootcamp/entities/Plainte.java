package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

@Entity
public class Plainte {

    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long longitude;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long lattitude;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private boolean etatValidation;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String contenu;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String etapes;

    @Column(nullable = false)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String reference;

    @ApiModelProperty(value = "creation date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateCreation;

    @ApiModelProperty(value = "update date of Axe")
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    @Column(nullable = false)
    private long dateMiseAJour;
}
