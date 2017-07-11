package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 用户页面
 * Created by Hao HOU on 2017/7/10.
 */
@WebServlet("/user.view")
public class User extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("login") == null) {
            response.sendRedirect("login.html");
        } else {
            response.setContentType("text/html;charset=UTF-8");
//            if (request.getAttribute("user") == null) {
//                response.sendRedirect("login.html");
//            }

            PrintWriter out = response.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet User</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + session.getAttribute("login") + " 已登录</h1><br/><br/>");
            out.println("<a href='logout.view'>注销</a>");
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
