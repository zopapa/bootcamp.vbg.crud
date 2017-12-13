
package com.bootcamp.crud;


import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.repositories.EtapeRepository;
import com.bootcamp.entities.Etape;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Bignon
 */
public class EtapeCRUD implements DatabaseConstants{

    public static boolean create(Etape etape) throws SQLException {
        EtapeRepository etapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return etapeRepository.create(etape);
    }

    public static boolean update(Etape Etape) throws SQLException {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.update(Etape);
    }


    public static boolean delete(Etape Etape) throws SQLException {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return  EtapeRepository.delete(Etape);

    }

    public static List<Etape> read(Criterias criterias) {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.getDataByCriteria(criterias);
    }

    public static List<Etape> read(Criterias criterias, int page, int size) {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Etape> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Etape> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Etape> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.getDataByCriteria(fields);
    }

    public static List<Etape> read() throws SQLException {
        EtapeRepository EtapeRepository = new EtapeRepository(PERSISTENCE_UNIT);
        return EtapeRepository.findAll();
    }

}
