package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginController extends HttpServlet {
    UserService userService;

    @Override
    public void init() throws ServletException {
        userService = (UserService) getServletContext().getAttribute("user_service");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher pageDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/login.jsp");

        pageDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("username");
        String password = req.getParameter("password");

        if (userService.authenticate(name ,password)){
            req.getSession().setAttribute("login", userService);
            resp.sendRedirect("/weblogin/users");
        } else {

        }

            // method to verificar login
        //resp.sendRedirect("/weblogin/users");

    }
}
