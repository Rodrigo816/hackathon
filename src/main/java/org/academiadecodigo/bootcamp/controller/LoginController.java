package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.service.CompanyService;
import org.academiadecodigo.bootcamp.service.IndividualService;
import org.academiadecodigo.bootcamp.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {

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
        RequestDispatcher pageDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");

        pageDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (email.isEmpty() || password.isEmpty()) {
            resp.sendRedirect("/hackathon/login");
            return;
        }

        if (userService.authenticate(email,password)){

            if (individualService.findByEmail(email) != null) {
                req.getSession().setAttribute("logged_individual", individualService.findByEmail(email));
                resp.sendRedirect("/hackathon/user");
            }

            if (companyService.findByEmail(email) != null) {
                req.getSession().setAttribute("logged_company", companyService.findByEmail(email));
                resp.sendRedirect("/hackathon/company");
            }


        } else {
            resp.sendRedirect("/hackathon/register");
        }

    }
}
