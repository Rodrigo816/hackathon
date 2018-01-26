package org.academiadecodigo.bootcamp.persistence;

import org.academiadecodigo.bootcamp.model.User;

public class JpaUserDao extends JpaDao<User> implements UserDao {

    public JpaUserDao(Class t) {
        super(User.class);
    }
}
