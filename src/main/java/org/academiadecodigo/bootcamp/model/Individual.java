package org.academiadecodigo.bootcamp.model;

import java.util.HashSet;
import java.util.Set;

public class Individual {

    private Set<Individual> sellers;

    private User user;
    private String name;
    private String location;
    private String phone;
    private boolean leader;

    public Individual(User user, String name, String location, String phone) {
        sellers = new HashSet<>();
        this.user = user;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }

    public Set<Individual> getSellers() {
        return sellers;
    }

    public void setSellers(Set<Individual> sellers) {
        this.sellers = sellers;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isLeader() {
        return leader;
    }

    public void setLeader() {
        this.leader = !leader;
    }
}
