package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.Individual;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserController extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Individual individual = (Individual) req.getSession().getAttribute("logged_individual");

        if (individual == null) {
            resp.sendRedirect("/hackathon/");
            return;
        }

        RequestDispatcher pageDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/user.jsp");

        pageDispatcher.forward(req, resp);
    }
}
