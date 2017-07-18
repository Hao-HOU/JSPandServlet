package com.acehouhao;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * ServletContextListener
 * Created by Hao HOU on 2017/7/13.
 */
@WebListener
public class ContextParameterReader implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        ServletContext context = servletContextEvent.getServletContext();
        String avatars = context.getInitParameter("AVATAR");
        context.setAttribute("avatars", avatars);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {}
}
