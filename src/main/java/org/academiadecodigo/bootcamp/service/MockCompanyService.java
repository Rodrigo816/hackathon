package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Company;
import org.academiadecodigo.bootcamp.model.Individual;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MockCompanyService implements CompanyService {

    private Map<String, Company> companies = new HashMap<>();


    @Override
    public void addLeader(Company company, Individual individual) {
        company.addLeader(individual);
    }

    @Override
    public void removeLeader(Company company, Individual individual) {
        company.removeLeader(individual);
    }

    @Override
    public Set<Individual> findLeaders(Company company) {
        return company.getLeaders();
    }

    @Override
    public void addCompany(Company company) {
        companies.put(company.getUser().getEmail(), company);
    }

    @Override
    public void removeCompany(Company company) {
        companies.remove(company);
    }

    @Override
    public Company findByEmail(String email) {
        return companies.get(email);
    }
}
