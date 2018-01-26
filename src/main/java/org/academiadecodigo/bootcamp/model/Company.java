package org.academiadecodigo.bootcamp.model;

import java.util.HashSet;
import java.util.Set;

public class Company {

    private Set<Individual> leaders;

    private User user;
    private String name;
    private String location;
    private String phone;

    public Company(User user, String name, String location, String phone) {
        leaders = new HashSet<>();
        this.user = user;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }

    public Set<Individual> getLeaders() {
        return leaders;
    }

    public void setLeaders(Set<Individual> leaders) {
        this.leaders = leaders;
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

    public void addLeader(Individual individual) {
        leaders.add(individual);
    }

    public void removeLeader(Individual individual) {
        leaders.remove(individual);
    }
}
