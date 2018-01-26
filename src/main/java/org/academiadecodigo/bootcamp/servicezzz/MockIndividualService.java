package org.academiadecodigo.bootcamp.servicezzz;

import org.academiadecodigo.bootcamp.modelzzz.Individual;

import java.util.HashMap;
import java.util.Map;

public class MockIndividualService implements IndividualService {

    private Map<Integer, Individual> sellers;

    public MockIndividualService() {
        sellers = new HashMap<>();
    }

    public void addSellers(Individual individual){
        sellers.put(individual.getUser_id(),individual);
    }

}
