/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.repositories;

import com.bootcamp.entities.Commentaire;

/**
 *
 * @author rosius
 */
public class CommentaireRepository extends BaseRepository<Commentaire>{
    public CommentaireRepository(String unitPersistence) {
        super(unitPersistence, Commentaire.class);
    }    
}
