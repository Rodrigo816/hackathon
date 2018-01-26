package org.academiadecodigo.bootcamp.persistence;

import org.academiadecodigo.bootcamp.model.User;

public interface UserDao extends Dao<User> {

    User findByMail(String mail);
}
