/**
 *
 * @author Bignon
 */
package com.bootcamp.entities;

import com.bootcamp.commons.annotations.NativeQueryResultColumn;
import io.swagger.annotations.ApiModelProperty;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @ApiModelProperty(value = "Id of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private int id;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Login of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String login;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Password of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String password;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Password of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String nom;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Password of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String email;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Password of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String numero;

    @Column(nullable = false, length = 1024)
    @ApiModelProperty(value = "Password of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private String role;

    @Column(nullable = false)
    @ApiModelProperty(value = "Creation date of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long dateCreation;

    @Column(nullable = false)
    @ApiModelProperty(value = "Update date of the User", required = true)
    @NativeQueryResultColumn(columnType = NativeQueryResultColumn.COLUMNTYPE.SIMPLE)
    private long dateMiseAJour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
