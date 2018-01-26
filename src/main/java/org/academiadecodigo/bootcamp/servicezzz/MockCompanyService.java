package org.academiadecodigo.bootcamp.servicezzz;

import org.academiadecodigo.bootcamp.modelzzz.Individual;
import java.util.*;

public class MockCompanyService implements CompanyService {

    private Map<Integer, Individual> leaders;

    public MockCompanyService() {
        this.leaders = new HashMap<>();
    }

    public void addLeader(Individual individual){
        leaders.put(leaders.size(),individual);
    }

    public void removeLeader(Integer id){
        leaders.remove(id);
    }

    public List<Individual> findLeaders(){
        return new LinkedList<>(leaders.values());
    }


}
