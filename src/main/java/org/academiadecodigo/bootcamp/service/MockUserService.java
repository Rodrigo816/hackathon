package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.User;

import java.util.HashMap;
import java.util.Map;

public class MockUserService implements UserService{

    private Map<String,User> users = new HashMap<>();

    @Override
    public boolean authenticate(String email, String password) {

        return users.containsKey(email) &&
                users.get(email).getPassword().equals(password);

        //return users.get(email).getPassword().equals(password);
    }

    @Override
    public void addUser(User user) {
        users.put(user.getEmail(),user);
    }

    @Override
    public User findByEmail(String email) {
        return users.get(email);
    }
}
