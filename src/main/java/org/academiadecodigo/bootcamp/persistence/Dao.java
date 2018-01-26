package org.academiadecodigo.bootcamp.persistence;

import java.util.List;

public interface Dao<T> {

    // basic crud methods
    List<T> findAll();
    T findById(Integer id);
    void saveOrUpdate(T object);
    void delete(Integer id);
}
