package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 登录
 * Created by Hao HOU on 2017/7/10.
 */
@WebServlet("/login.do")
public class Login extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String password = req.getParameter("password");
        if ("houhao".equals(user) && "houhao".equals(password)) {
//            String login = req.getParameter("login");
//            if ("auto".equals(login)) {
//                Cookie cookie = new Cookie("user", "houhao");
//                cookie.setMaxAge(7 * 24 * 60 * 60);
//                resp.addCookie(cookie);
//            }
            req.getSession().setAttribute("login", user);
//            req.setAttribute("user", user);
            req.getRequestDispatcher("user.view").forward(req, resp);
        } else {
            resp.sendRedirect("login.html");
        }
    }
}
