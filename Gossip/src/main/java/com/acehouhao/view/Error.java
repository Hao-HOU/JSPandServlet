package com.acehouhao.view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 错误展示页面
 * Created by Hao HOU on 2017/7/10.
 */
@WebServlet("/error.view")
public class Error extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>新增会员失败</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>新增会员失败</h1>");
        out.println("<ul style='color: rgb(255, 0, 0);'>");
        List<String> errors = (List<String>) req.getAttribute("errors");
        for (String error : errors) {
            out.println("<li>" + error + "</li>");
        }
        out.println("</ul>");
        out.println("<a href='register.html'>返回注册页面</a>");
        out.println("</body>");
        out.println("<html>");
        out.close();
    }
}
