package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Individual;

public interface IndividualService {

    void addIndividual(Individual individual);
    void addSeller(Individual leader, Individual seller);
    void removeSeller(Individual leader, Individual seller);
    void changeLeaderStatus(Individual individual);
}
