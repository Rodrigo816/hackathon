package org.academiadecodigo.bootcamp.model;

public class Role {

    private Integer role_id;
    private String role_name;
    private Integer individual_id;
    private Integer company_id;

    public Role(Integer role_id, String role_name, Integer individual_id, Integer company_id) {
        this.role_id = role_id;
        this.role_name = role_name;
        this.individual_id = individual_id;
        this.company_id = company_id;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    public Integer getIndividual_id() {
        return individual_id;
    }

    public void setIndividual_id(Integer individual_id) {
        this.individual_id = individual_id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }
}
