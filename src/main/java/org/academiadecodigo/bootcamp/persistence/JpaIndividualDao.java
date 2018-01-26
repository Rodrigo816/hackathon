package org.academiadecodigo.bootcamp.persistence;

import org.academiadecodigo.bootcamp.model.Individual;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaIndividualDao extends JpaDao<Individual> implements IndividualDao {

    @PersistenceContext
    private EntityManager em;

    public JpaIndividualDao(Class t) {
        super(Individual.class);
    }

}
