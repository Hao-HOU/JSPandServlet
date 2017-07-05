package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 视图
 * Created by Hao HOU on 2017/7/5.
 */
@WebServlet("/hello.view")
public class HelloView extends HttpServlet{
    private String htmlTemplate =
            "<html>"
            + "<head>"
            + "<meta http-equiv='Content-Type' content='text/html;charset=UTF-8'>"
            + "<title>%s</title>"
            + "</head>"
            + "<body>"
            + "<h1>%s</h1>"
            + "</body>"
            + "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String user = req.getParameter("user");
        String message = (String) req.getAttribute("message");
        String html = String.format(htmlTemplate, user, message);
        resp.getWriter().print(html);
    }
}
