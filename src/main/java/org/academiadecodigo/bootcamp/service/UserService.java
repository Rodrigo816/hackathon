package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.util.List;

public interface UserService {
    boolean authenticate(String email, String password);
    void addUser(User user);
    User findByMail(String mail);
    List<User> findAllUsers();
}
