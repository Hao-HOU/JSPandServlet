package com.acehouhao.web;

import com.acehouhao.model.UserService;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by Hao HOU on 2017/7/19.
 */
@WebListener
public class GossipListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        String USERS = servletContextEvent.getServletContext().getInitParameter("USERS");
        context.setAttribute("userService", new UserService(USERS));
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {}
}
