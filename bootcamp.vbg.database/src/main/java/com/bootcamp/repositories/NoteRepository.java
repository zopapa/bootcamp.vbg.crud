/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.repositories;

import com.bootcamp.entities.Note;

/**
 *
 * @author Archange
 */
public class NoteRepository extends BaseRepository<Note>{
    public NoteRepository(String unitPersistence) {
        super(unitPersistence, Note.class);
    }    
}
