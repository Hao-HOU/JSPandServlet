package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 第二章实训题2
 * Created by Hao HOU on 2017/7/3.
 */
@WebServlet("/p2")
public class Ch02P2 extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        PrintWriter out = resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ch02P2</title>");
        out.println("</head>");
        out.println("<body>");
        if ("Hao".equals(username) && "123".equals(password)) {
            out.println("<p>登录成功！</p>");
        } else {
            out.println("<p>登录失败！</p>");
            out.println("<a href='index.jsp'>返回</a>");
        }
        out.println("</body>");
        out.println("</html>");
    }
}
