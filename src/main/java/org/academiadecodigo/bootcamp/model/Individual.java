package org.academiadecodigo.bootcamp.model;

import java.util.Date;

public class Individual extends User {

    private Integer individual_id;
    private Date date_of_birth;

    public Individual(Integer individual_id, Date date_of_birth,Integer user_id, String name, String password, String mail, String title, String phone, String location) {
        super(user_id, name, password, mail, title, phone, location);
        this.individual_id = individual_id;
        this.date_of_birth = date_of_birth;
    }

    public Integer getIndividual_id() {
        return individual_id;
    }

    public void setIndividual_id(Integer individual_id) {
        this.individual_id = individual_id;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}

