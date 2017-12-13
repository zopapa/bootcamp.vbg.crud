
package com.bootcamp.repositories;

import com.bootcamp.entities.WorkFlow;


public class WorkFlowRepository extends BaseRepository<WorkFlow>{
  
    public WorkFlowRepository(String unitPersistence) {
        super(unitPersistence, WorkFlow.class);
    }
}
