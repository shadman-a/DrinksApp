package com.hcl;

import java.util.List;

public interface GenericDAO<T> {
    List<T> getAll();

    T create(T entity);

    void remove(T entity);

    T update(T entity);

    int count();

}
