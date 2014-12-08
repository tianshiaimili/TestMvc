package com.web.domain.implement;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Repository;

import com.web.domain.dao.BaseDAO;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.PersistenceContext;
//import org.apache.log4j.Logger;

@Repository("baseDAO")
public class BaseDAOImplement<T> implements BaseDAO<T>{

	@PersistenceContext(unitName="JPAUNIT")
    private EntityManager entityManager;
	
//	private org.apache.taglibs.standard.lang.jstl.Logger logger = org.apache.taglibs.standard.lang.jstl.Logger.

    @Override
    public boolean Delete(Class<T> c,int objectID) {
        try {
            entityManager.remove(entityManager.find(c, objectID));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public T findById(Class<T> c,int objectID) {
        try {
            return (T)entityManager.find(c, objectID);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean Create(Object object) {
        try {
    		entityManager.persist(object);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean Update(Object object) {
        try {
            entityManager.merge(object);          
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> listAll(Class<T> c) {
        try {
        	String queryName=c.getName().substring(22)+".findAll";
        	System.out.println("queryName== "+queryName);
            Query query=entityManager.createNamedQuery(queryName);
            return (List<T>)query.getResultList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
