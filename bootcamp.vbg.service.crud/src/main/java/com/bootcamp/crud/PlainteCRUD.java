
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.¨Plainte;
import com.bootcamp.repositories.¨PlainteRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class ¨PlainteCRUD implements DatabaseConstants{

    public static boolean create(¨Plainte ¨Plainte) throws SQLException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.create(¨Plainte);
    }

    public static boolean update(¨Plainte ¨Plainte) throws SQLException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.update(¨Plainte);
    }


    public static boolean delete(¨Plainte ¨Plainte) throws SQLException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return  ¨PlainteRepository.delete(¨Plainte);

    }

    public static List<¨Plainte> read(Criterias criterias) {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.getDataByCriteria(criterias);
    }

    public static List<¨Plainte> read(Criterias criterias, int page, int size) {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<¨Plainte> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<¨Plainte> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.getDataByCriteria(criterias, fields);
    }

    public static List<¨Plainte> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.getDataByCriteria(fields);
    }

    public static List<¨Plainte> read() throws SQLException {
        ¨PlainteRepository ¨PlainteRepository = new ¨PlainteRepository(PERSISTENCE_UNIT);
        return ¨PlainteRepository.findAll();
    }

}
