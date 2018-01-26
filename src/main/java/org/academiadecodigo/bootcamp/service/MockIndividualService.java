package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Individual;

import java.util.HashMap;
import java.util.Map;


public class MockIndividualService implements IndividualService{

    private Map<String,Individual> individuals = new HashMap();

    @Override
    public void addIndividual(Individual individual) {
        individuals.put(individual.getUser().getEmail(),individual);
    }

    @Override
    public void addSeller(Individual leader, Individual seller) {
        leader.getSellers().add(seller);
    }

    @Override
    public void removeSeller(Individual leader, Individual seller) {
        leader.getSellers().remove(seller);
    }

    @Override
    public void changeLeaderStatus(Individual individual) {
        individual.setLeader();
    }

    @Override
    public Individual findByEmail(String email) {
        return individuals.get(email);
    }


}
