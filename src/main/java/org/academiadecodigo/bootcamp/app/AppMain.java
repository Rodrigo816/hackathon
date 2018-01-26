package org.academiadecodigo.bootcamp.app;

import org.academiadecodigo.bootcamp.service.*;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppMain implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        ServletContext servletContext = servletContextEvent.getServletContext();

        UserService userService = new MockUserService();
        CompanyService companyService = new MockCompanyService();
        IndividualService individualService = new MockIndividualService();
        AdvertisementService advertisementService = new MockAdvertisementService();


        servletContext.setAttribute(UserService.class.getSimpleName(), userService);
        servletContext.setAttribute(CompanyService.class.getSimpleName(), companyService);
        servletContext.setAttribute(IndividualService.class.getSimpleName(), individualService);
        servletContext.setAttribute(AdvertisementService.class.getSimpleName(), advertisementService);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
