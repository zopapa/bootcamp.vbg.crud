
package com.bootcamp.repositories;

import com.bootcamp.entities.Etape;


public class EtapeRepository extends BaseRepository<Etape>{
  
    public EtapeRepository(String unitPersistence) {
        super(unitPersistence, Etape.class);
    }
}
