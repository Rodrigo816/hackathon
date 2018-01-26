package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

public interface UserService {

    boolean authenticate(String email, String password);
    void addUser (User user);
}
