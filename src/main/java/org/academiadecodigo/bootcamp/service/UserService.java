package org.academiadecodigo.bootcamp.service;

import org.academiadecodigo.bootcamp.model.Company;
import org.academiadecodigo.bootcamp.model.Individual;
import org.academiadecodigo.bootcamp.model.Title;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.persistence.CompanyDao;
import org.academiadecodigo.bootcamp.persistence.IndividualDao;
import org.academiadecodigo.bootcamp.persistence.UserDao;

public class UserService {

    private UserDao userDao;
    private CompanyDao companyDao;
    private IndividualDao individualDao;


    public boolean authenticate(String mail, String password) {

        User user = userDao.findByMail(mail);

        if (user == null) {
            return false;
        }

        return user.getPassword().equals(password);
    }

    public void addUser(User user) {

        if (userDao.findByMail(user.getMail()) == null) {

            Title title = user.getTitle();

            switch (title) {

                case COMPANY:
                    companyDao.saveOrUpdate((Company)user);
                    break;
                case INDIVIDUAL:
                    individualDao.saveOrUpdate((Individual)user);
                    break;
            }
        }
    }
}
