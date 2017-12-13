
package com.bootcamp.repositories;

import com.bootcamp.commons.constants.DatabaseConstants;
import com.bootcamp.commons.exceptions.DatabaseException;
import com.bootcamp.commons.models.Criterias;
import com.bootcamp.commons.utils.NativeQueryResultsMapper;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;

/**
 * Created by SOUL
 * repository e base  implementer par chaque entite
 *
 * @param <T>
 */
public abstract class BaseRepository<T> implements DatabaseConstants {

    private EntityManager em;
    private String persistUnit;
    private Class entityClass;
    private EntityManagerFactory emf;


    public BaseRepository(String persistUnit, Class entityClass) {
        this.persistUnit = persistUnit;
        emf = Persistence.createEntityManagerFactory(this.persistUnit);
        this.em = getEntityManager();
        this.entityClass = entityClass;
    }

    public final EntityManager getEntityManager() {
        em = emf.createEntityManager();
        return em;
    }

    /**
     * methode genetique de creation dans la bdd
     *
     * @param object
     * @return
     * @throws SQLException
     */
    public boolean create(T object) throws SQLException {
        em.getTransaction().begin();
        em.persist(object);
        em.getTransaction().commit();

        return true;
    }

    /**
     * Methode pour supprimer une entite dans la bdd
     *
     * @param object
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean delete(T object) throws SQLException {
        em.getTransaction().begin();
        em.remove(object);
        em.getTransaction().commit();

        return true;
    }

    /**
     * M?thode de mise ? jour
     *
     * @param object
     * @return boolean
     * @throws java.sql.SQLException
     */
    public boolean update(T object) throws SQLException {
        em.getTransaction().begin();
        em.merge(object);
        em.getTransaction().commit();

        return true;
    }


    public T findById(int id) throws SQLException {
        String className = entityClass.getSimpleName();

        String request = "select t from " + className + " t where t.id =:param";
        Query query = getEm().createQuery(request);
        query.setParameter("param", id);
        return (T) query.getSingleResult();
    }

    /*
     * Methode de recherche de tous les objets T
    */
    public List<T> findAll() throws SQLException {
        String className = entityClass.getSimpleName();

        String req = "select t from " + className + " t";
        Query query = getEm().createQuery(req);
        return query.getResultList();
    }


    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix) {
        criterias.setEntityClass(entityClass);

        String request = criterias.getAsStringQuery(entityPrefix);
        String className = entityClass.getSimpleName();

        String s = "SELECT " + entityPrefix + " FROM " + className + " " + entityPrefix + " WHERE " + request;
        Query query = getEntityManager().createQuery(s);
        List<T> result = query.getResultList();
        return result;
    }

    public List<T> getDataByCriteria(Criterias criterias) {
        criterias.setEntityClass(entityClass);

        return getDataByCriteria(criterias, QUERY_PREFIX);
    }

    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix, int page, int size) {
        criterias.setEntityClass(entityClass);

        String request = criterias.getAsStringQuery(entityPrefix);
        String className = entityClass.getSimpleName();

        String s = "SELECT " + entityPrefix + " FROM " + className + " " + entityPrefix + " WHERE " + request;
        Query query = getEntityManager().createQuery(s);
        query.setFirstResult(page);
        query.setMaxResults(size);
        List<T> result = query.getResultList();
        return result;
    }

    public List<T> getDataByCriteria(Criterias criterias, int page, int size) {
        criterias.setEntityClass(entityClass);

        return getDataByCriteria(criterias, QUERY_PREFIX, page, size);
    }


    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        criterias.setEntityClass(entityClass);

        String request = criterias.getAsStringQuery(entityPrefix);
        String fullClassname = entityClass.getName();
        String className = entityClass.getSimpleName();

        String selectedFields = "SELECT " ;

        for(int i =0; i<fields.size(); i++){
            String field = fields.get(i);
            if(i != fields.size()-1)
                selectedFields = selectedFields +" "+entityPrefix+"."+field + ", ";
            else
                selectedFields = selectedFields +" "+entityPrefix+"."+field ;
        }

        selectedFields = selectedFields + " FROM " + className + " " + entityPrefix + " WHERE " + request;

        Query query = getEntityManager().createQuery(selectedFields);
        List<Object[]> objects = query.getResultList();

        List<T> results = NativeQueryResultsMapper.map(objects,fields, entityClass);

        return results;
    }

    public List<T> getDataByCriteria(Criterias criterias, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        criterias.setEntityClass(entityClass);

        return getDataByCriteria(criterias, QUERY_PREFIX, fields);
    }


    public List<T> getDataByCriteria(String entityPrefix, List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        String fullClassname = entityClass.getName();
        String className = entityClass.getSimpleName();

        String selectedFields = "SELECT ";

        for(String field: fields){
            selectedFields = selectedFields + ", "+entityPrefix+"."+field;
        }

        selectedFields = selectedFields + " FROM " + className + " " + entityPrefix;

        Query query = getEntityManager().createQuery(selectedFields);
        List<Object[]> objects = query.getResultList();

        List<T> results = NativeQueryResultsMapper.map(objects,fields, entityClass);

        return results;
    }

    public List<T> getDataByCriteria(List<String> fields) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        return getDataByCriteria(QUERY_PREFIX, fields);
    }

    public List<T> getDataByCriteria(Criterias criterias, String entityPrefix, List<String> fields ,int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        criterias.setEntityClass(entityClass);

        String request = criterias.getAsStringQuery(entityPrefix);
        String className = entityClass.getSimpleName();

        String selectedFields = "SELECT ";

        for(String field: fields){
            selectedFields = selectedFields + ", "+entityPrefix+"."+field;
        }


        selectedFields = selectedFields + " FROM " + className + " " + entityPrefix + " WHERE " + request;

        Query query = getEntityManager().createQuery(selectedFields);
        query.setFirstResult(page);
        query.setMaxResults(size);
        List<Object[]> objects = query.getResultList();

        List<T> results = NativeQueryResultsMapper.map(objects,fields, entityClass);

        return results;
    }

    public List<T> getDataByCriteria(Criterias criterias, List<String> fields, int page, int size) throws IllegalAccessException, DatabaseException, InvocationTargetException {
        criterias.setEntityClass(entityClass);

        return getDataByCriteria(criterias,QUERY_PREFIX, fields, page, size);
    }

    /**
     * @return the entity manager
     */
    public EntityManager getEm() {
        return em;
    }

    public Class getEntityClass() {
        return entityClass;
    }

    public void setEntityClass(Class entityClass) {
        this.entityClass = entityClass;
    }

    public EntityManagerFactory getEmf() {
        return emf;
    }

    public void setEmf(EntityManagerFactory emf) {
        this.emf = emf;
    }

    /**
     * @param em to set
     */
    public void setEm(EntityManager em) {
        this.em = em;
    }

    /**
     * @return the persistence unit
     */
    public String getPersistUnit() {
        return persistUnit;
    }



}
