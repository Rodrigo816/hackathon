package org.academiadecodigo.bootcamp.model;

public class Appliance {

    private Integer appliance_id;
    private Integer advertise_id;
    private Integer individual_id;

    public Appliance(Integer appliance_id, Integer advertise_id, Integer individual_id) {
        this.appliance_id = appliance_id;
        this.advertise_id = advertise_id;
        this.individual_id = individual_id;
    }

    public Integer getAppliance_id() {
        return appliance_id;
    }

    public void setAppliance_id(Integer appliance_id) {
        this.appliance_id = appliance_id;
    }

    public Integer getAdvertise_id() {
        return advertise_id;
    }

    public void setAdvertise_id(Integer advertise_id) {
        this.advertise_id = advertise_id;
    }

    public Integer getIndividual_id() {
        return individual_id;
    }

    public void setIndividual_id(Integer individual_id) {
        this.individual_id = individual_id;
    }
}
