package org.academiadecodigo.bootcamp.servicezzz;

import org.academiadecodigo.bootcamp.modelzzz.User;

import java.util.List;

public interface UserService {
    boolean authenticate(String email, String password);
    void addUser(User user);
    User findByMail(String mail);
    List<User> findAllIndividuals();
    List<User> findAllCompanies();
}
