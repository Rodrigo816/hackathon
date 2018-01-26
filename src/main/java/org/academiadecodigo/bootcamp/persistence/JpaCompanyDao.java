package org.academiadecodigo.bootcamp.persistence;

import org.academiadecodigo.bootcamp.model.Company;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JpaCompanyDao extends JpaDao<Company> implements CompanyDao {

    @PersistenceContext
    private EntityManager em;

    public JpaCompanyDao(Class t) {
        super(Company.class);
    }
}
