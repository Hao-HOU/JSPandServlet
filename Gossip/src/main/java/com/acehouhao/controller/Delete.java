package com.acehouhao.controller;

import com.acehouhao.model.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * 删除
 * Created by Hao HOU on 2017/7/12.
 */
@WebServlet(
        urlPatterns = {"/delete.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS_VIEW", value = "member.jsp")
        }
)
public class Delete extends HttpServlet {
    private String SUCCESS_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserService userService = (UserService) getServletContext().getAttribute("userService");

        String username = (String) req.getSession().getAttribute("login");
        String message = req.getParameter("message");
        userService.deleteMessage(username, message);

        resp.sendRedirect(SUCCESS_VIEW);
    }
}
