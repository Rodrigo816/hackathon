package org.academiadecodigo.bootcamp.modelzzz;

public class Advertisement {

    private Integer advertise_id;
    private Integer individual_id;
    private String text;

    public Advertisement(Integer advertise_id, Integer individual_id, String text) {
        this.advertise_id = advertise_id;
        this.individual_id = individual_id;
        this.text = text;
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
