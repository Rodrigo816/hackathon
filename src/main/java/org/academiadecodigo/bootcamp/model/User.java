package org.academiadecodigo.bootcamp.model;

public abstract class User {

    private Integer user_id;
    private String name;
    private String password;
    private String mail;
    private Title title;
    private String phone;
    private String location;

    public User(Integer user_id, String name, String password, String mail, Title title, String phone, String location) {
        this.user_id = user_id;
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.title = title;
        this.phone = phone;
        this.location = location;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
