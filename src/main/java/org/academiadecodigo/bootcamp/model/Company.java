package org.academiadecodigo.bootcamp.model;

public class Company extends User {

    private Integer company_id;

    public Company(Integer company_id,Integer user_id, String name, String password, String mail, String title, String phone, String location) {
        super(user_id, name, password, mail, title, phone, location);
        this.company_id = company_id;
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }
}
