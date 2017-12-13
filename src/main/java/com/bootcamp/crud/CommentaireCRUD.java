package com.bootcamp.crud;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criteria;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.entities.Commentaire;
import com.bootcamp.repositories.CommentaireRepository;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.Query;

/**
 *
 * @author Bignon
 */
public class CommentaireCRUD implements DatabaseConstants {

    /* Crud for Commentaire */
    public static boolean create(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.create(Commentaire);
    }

    public static boolean update(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.update(Commentaire);
    }

    public static boolean delete(Commentaire Commentaire) throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.delete(Commentaire);

    }

    public static List<Commentaire> read(Criterias criterias) {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias);
    }

//    public static List<Commentaire> getByCriteria(List<Criteria> criterias) {
//        String q = "select b from Commentaire b where";
//        HashMap<String, Object> hmap = new HashMap<String, Object>();
//
//        for (Criteria criteria : criterias) {
//            q+= " b." + criteria.getRule().getColumn() + " " + criteria.getRule().getOperator() + " :" + criteria.getRule().getColumn();
//            if (criteria.getLinkOperator()!=null){
//                q+=" "+criteria.getLinkOperator();
//            }
//            hmap.put(criteria.getRule().getColumn(), criteria.getRule().getValue());
//        }
//
//        CommentaireRepository commentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
//
//        Query query = commentaireRepository.getEm().createQuery(q);
//
//        Set set = hmap.entrySet();
//        Iterator iterator = set.iterator();
//        while (iterator.hasNext()) {
//            Map.Entry mentry = (Map.Entry) iterator.next();
//            query.setParameter((String) mentry.getKey(), mentry.getValue());
//        }
//        
//        List<Commentaire> result = query.getResultList();
//        return result;
//    }

    public static List<Commentaire> read(Criterias criterias, int page, int size) {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, page, size);
    }

    public static List<Commentaire> read(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, fields, page, size);
    }

    public static List<Commentaire> read(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(criterias, fields);
    }

    public static List<Commentaire> read(List<String> fields) throws SQLException, IllegalAccessException, DatabaseException, InvocationTargetException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.getDataByCriteria(fields);
    }

    public static List<Commentaire> read() throws SQLException {
        CommentaireRepository CommentaireRepository = new CommentaireRepository(PERSISTENCE_UNIT);
        return CommentaireRepository.findAll();
    }
}
