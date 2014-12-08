package com.web.domain.dao;

import java.util.List;

public interface BaseDAO<T>{
    List<T> listAll(Class<T> c);
    T findById(Class<T> c,int objectID);
    boolean Create(Object object);
    boolean Update(Object object);
    boolean Delete(Class<T> c,int objectID);
}
