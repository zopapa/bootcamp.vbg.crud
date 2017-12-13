
package com.bootcamp.repositories;

import com.bootcamp.entities.User;


public class UserRepository extends BaseRepository<User>{
  
    public UserRepository(String unitPersistence) {
        super(unitPersistence, User.class);
    }
}
