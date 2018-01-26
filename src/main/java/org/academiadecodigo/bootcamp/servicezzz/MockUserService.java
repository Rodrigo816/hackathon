package org.academiadecodigo.bootcamp.servicezzz;

import org.academiadecodigo.bootcamp.modelzzz.Title;
import org.academiadecodigo.bootcamp.modelzzz.User;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MockUserService implements UserService {

    private Map<String, User> companies = new HashMap<>();
    private Map<String, User> individuals = new HashMap<>();

    @Override
    public boolean authenticate(String mail, String password) {

        return (companies.containsKey(mail) && companies.get(mail).getPassword().equals(password)) ||
                (individuals.containsKey(mail) && individuals.get(mail).getPassword().equals(password));
    }

    @Override
    public void addUser(User user) {
        Title title = user.getTitle();

        switch (title){
            case COMPANY:
                companies.put(user.getMail(),user);
                break;
            case INDIVIDUAL:
                individuals.put(user.getMail(),user);
                break;
        }

    }

    @Override
    public User findByMail(String mail) {
        User result = null;

        result = companies.get(mail);
        if (result == null){
            result = individuals.get(mail);
        }

        return result;
    }

    @Override
    public List<User> findAllIndividuals() {
        return new LinkedList<>(individuals.values());
    }

    @Override
    public List<User> findAllCompanies() {
        return new LinkedList<>(companies.values());
    }

}
