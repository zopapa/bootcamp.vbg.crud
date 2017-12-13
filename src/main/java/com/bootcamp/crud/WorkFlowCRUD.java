
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.WorkFlow;
import com.bootcamp.repositories.WorkFlowRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class WorkFlowCRUD implements DatabaseConstants{

    public static boolean create(WorkFlow WorkFlow) throws SQLException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.create(WorkFlow);
    }

    public static boolean update(WorkFlow WorkFlow) throws SQLException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.update(WorkFlow);
    }


    public static boolean delete(WorkFlow WorkFlow) throws SQLException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return  WorkFlowRepository.delete(WorkFlow);

    }

    public static List<WorkFlow> read(Criterias criterias) {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.getDataByCriteria(criterias);
    }

    public static List<WorkFlow> read(Criterias criterias, int page, int size) {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<WorkFlow> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<WorkFlow> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.getDataByCriteria(criterias, fields);
    }

    public static List<WorkFlow> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.getDataByCriteria(fields);
    }

    public static List<WorkFlow> read() throws SQLException {
        WorkFlowRepository WorkFlowRepository = new WorkFlowRepository(PERSISTENCE_UNIT);
        return WorkFlowRepository.findAll();
    }

}
