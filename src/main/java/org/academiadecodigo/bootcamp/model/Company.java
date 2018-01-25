package org.academiadecodigo.bootcamp.model;

public class Company extends User {
    private int company_id;

    public Company(int company_id) {
        this.company_id = company_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
}
