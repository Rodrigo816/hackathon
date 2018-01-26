package org.academiadecodigo.bootcamp.controller;

import org.academiadecodigo.bootcamp.model.Company;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CompanyController extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Company company = (Company) req.getSession().getAttribute("logged_company");

        if (company == null) {
            resp.sendRedirect("/hackathon/");
            return;
        }

        RequestDispatcher pageDispatcher = getServletContext().getRequestDispatcher("/WEB-INF/company.jsp");

        pageDispatcher.forward(req, resp);
    }
}
