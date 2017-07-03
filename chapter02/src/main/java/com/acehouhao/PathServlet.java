package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * URL模式设置
 * Created by Hao HOU on 2017/7/2.
 */
@WebServlet("/servlet/*")
public class PathServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet Pattern</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(req.getRequestURI() + "<br/>");
        out.println(req.getContextPath() + "<br/>");
        out.println(req.getServletPath() + "<br/>");
        out.println(req.getPathInfo());
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
