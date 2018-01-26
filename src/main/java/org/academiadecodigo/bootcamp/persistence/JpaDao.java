package org.academiadecodigo.bootcamp.persistence;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class JpaDao<T> implements Dao<T>{

    @PersistenceContext
    private EntityManager em;
    private Class<T> tClass;

    public JpaDao (Class t){
        tClass = t;
    }

    @Override
    public List<T> findAll() {

        try {

            CriteriaBuilder builder = em.getCriteriaBuilder();
            CriteriaQuery<T> criteriaQuery = builder.createQuery(tClass);
            Root<T> root = criteriaQuery.from(tClass);
            criteriaQuery.select(root);

            return em.createQuery(criteriaQuery).getResultList();

        } catch (NoResultException no) {

            return null;
        }
    }

    @Override
    public T findById(Integer id) {

        try {

            return em.find(tClass, id);

        } catch (NoResultException no) {

            return null;
        }
    }

    @Override
    public void saveOrUpdate(T object) {

        em.persist(object);
    }

    @Override
    public void delete(Integer id) {

        T object = findById(id);

        if (object == null) {
            return;
        }

        em.remove(object);
    }
}
