package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.Company;
import org.academiadecodigo.bootcamp.model.Individual;
import org.academiadecodigo.bootcamp.model.User;
import org.academiadecodigo.bootcamp.service.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RegisterController extends HttpServlet {

    private UserService userService;
    private CompanyService companyService;
    private IndividualService individualService;

    @Override
    public void init() throws ServletException {
        userService = (UserService) getServletContext().getAttribute(UserService.class.getSimpleName());
        companyService = (CompanyService) getServletContext().getAttribute(CompanyService.class.getSimpleName());
        individualService = (IndividualService) getServletContext().getAttribute(IndividualService.class.getSimpleName());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher pageDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/register.jsp");

        pageDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher pageDispatcher;

        String title = req.getParameter("title");
        String name = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String phone = req.getParameter("phone");
        String location = req.getParameter("location");

        if (name.isEmpty() || password.isEmpty() || email.isEmpty() || phone.isEmpty() || location.isEmpty()) {
            pageDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/register.jsp");
            pageDispatcher.forward(req,resp);
            return;
        }

        User user = new User(email,password);
        userService.addUser(user);

        if (title.equals("individual")){

            individualService.addIndividual(new Individual(user,name,location,phone));
        }

        if (title.equals("company")){
            companyService.addCompany(new Company(user,name,location,phone));
        }


     resp.sendRedirect("/hackathon/login");
    }
}
