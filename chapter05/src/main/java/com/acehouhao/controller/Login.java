package com.acehouhao.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 设置与使用Servlet初始化参数
 * Created by Hao HOU on 2017/7/13.
 */
@WebServlet(
        name = "Login",
        urlPatterns = {"/login.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS", value = "success.view"),
                @WebInitParam(name = "ERROR", value = "error.view")
        }
)
public class Login extends HttpServlet {
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getInitParameter("SUCCESS");
        ERROR_VIEW = getInitParameter("ERROR");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        if ("houhao".equals(name) && "houhao".equals(password)) {
            req.getRequestDispatcher(SUCCESS_VIEW).forward(req, resp);
        } else {
            req.getRequestDispatcher(ERROR_VIEW).forward(req, resp);
        }
    }
}
