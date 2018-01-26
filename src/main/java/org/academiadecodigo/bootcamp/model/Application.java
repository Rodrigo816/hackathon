package org.academiadecodigo.bootcamp.model;

public class Application {

    private Integer application_id;
    private Integer advertise_id;
    private Integer individual_id;

    public Application(Integer application_id, Integer advertise_id, Integer individual_id) {
        this.application_id = application_id;
        this.advertise_id = advertise_id;
        this.individual_id = individual_id;
    }

    public Integer getApplication_id() {
        return application_id;
    }

    public void setApplication_id(Integer application_id) {
        this.application_id = application_id;
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
