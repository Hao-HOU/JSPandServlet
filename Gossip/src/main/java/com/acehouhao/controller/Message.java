package com.acehouhao.controller;

import com.acehouhao.model.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;

/**
 * 新增与删除信息
 * Created by Hao HOU on 2017/7/12.
 */
@WebServlet(
        urlPatterns = {"/message.do"},
        initParams = {
                @WebInitParam(name = "SUCCESS_VIEW", value = "member.jsp"),
                @WebInitParam(name = "ERROR_VIEW", value = "member.jsp")
        }
)
public class Message extends HttpServlet {
    private String SUCCESS_VIEW;
    private String ERROR_VIEW;

    @Override
    public void init() throws ServletException {
        SUCCESS_VIEW = getServletConfig().getInitParameter("SUCCESS_VIEW");
        ERROR_VIEW = getServletConfig().getInitParameter("ERROR_VIEW");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String blabla = req.getParameter("blabla");
        if (blabla != null && blabla.length() != 0) {
            if (blabla.length() < 140) {
                UserService userService = (UserService) getServletContext().getAttribute("userService");
                String username = (String) req.getSession().getAttribute("login");
                userService.addMessage(username, blabla);
                resp.sendRedirect(SUCCESS_VIEW);
            } else {
                req.getRequestDispatcher(ERROR_VIEW).forward(req, resp);
            }
        } else {
            resp.sendRedirect(ERROR_VIEW);
        }
    }
}
