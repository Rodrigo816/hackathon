package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Company;
import org.academiadecodigo.bootcamp.model.Individual;

import java.util.Set;

public interface CompanyService {
    void addLeader(Company company, Individual individual);
    void removeLeader(Company company, Individual individual);
    Set<Individual> findLeaders(Company company);

    void addCompany(Company company);
    void removeCompany(Company company);
    Company findByEmail(String email);
}
