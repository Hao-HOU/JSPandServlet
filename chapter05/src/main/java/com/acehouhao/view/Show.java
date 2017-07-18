package com.acehouhao.view;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 为一些测试展示结果
 * Created by Hao HOU on 2017/7/17.
 */
@WebServlet("/show")
public class Show extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>测试结果展示</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>请求参数内容：" + req.getParameter("escape") + "<h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
