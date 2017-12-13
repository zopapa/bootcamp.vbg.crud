
package com.bootcamp.repositories;

import com.bootcamp.entities.Plainte;


public class PlainteRepository extends BaseRepository<Plainte>{
  
    public PlainteRepository(String unitPersistence) {
        super(unitPersistence, Plainte.class);
    }
}
