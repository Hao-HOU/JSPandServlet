package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/**
 * 第二章实训题1
 * Created by Hao HOU on 2017/7/2.
 */
@WebServlet("/p1")
public class Ch02P1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String query = req.getParameter("query");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Ch02P1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("时间：" + new Date() + "<br/>");
        out.println("IP: " + req.getRemoteAddr() + "<br/>");
        out.println("查询字符串：" + query + "<br/>");
        out.println("</body>");
        out.println("</html>");
    }
}
