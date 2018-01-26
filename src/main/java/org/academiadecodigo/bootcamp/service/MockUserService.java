package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MockUserService implements UserService {

    private Map<String, User> users = new HashMap<>();

    @Override
    public boolean authenticate(String mail, String password) {

        return users.containsKey(mail) &&
                users.get(mail).getPassword().equals(password);
    }

    @Override
    public void addUser(User user) {

        users.put(user.getMail(), user);
    }

    @Override
    public User findByMail(String mail) {

        return users.get(mail);
    }

    @Override
    public List<User> findAllUsers() {

        return new LinkedList<>(users.values());
    }
}
