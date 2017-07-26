package com.acehouhao.controller;

import com.acehouhao.model.Blah;
import com.acehouhao.model.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Hao HOU on 2017/7/26.
 */
@WebServlet(
        urlPatterns = { "/user/*" },
        initParams = {
                @WebInitParam(name = "USER_VIEW", value = "/user.jsp")
        }
        )
public class User extends HttpServlet {
    private String USER_VIEW;

    @Override
    public void init() throws ServletException {
        USER_VIEW = getServletConfig().getInitParameter("USER_VIEW");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = (UserService) getServletContext().getAttribute("userService");
        String username = req.getPathInfo().substring(1);
        if (userService.isUserExisted(username)) {
            Blah blah = new Blah();
            blah.setUsername(username);
            List<Blah> blahs = userService.getBlahs(blah);
            req.setAttribute("blahs", blahs);
        }
        req.setAttribute("username", username);
        req.getRequestDispatcher(USER_VIEW).forward(req, resp);
    }
}
