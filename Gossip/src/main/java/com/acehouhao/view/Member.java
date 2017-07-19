package com.acehouhao.view;

import com.acehouhao.model.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.Buffer;
import java.text.DateFormat;
import java.util.*;

/**
 * 会员页面
 * Created by Hao HOU on 2017/7/10.
 */
@WebServlet("/member.view")
public class Member extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        String username = (String) request.getSession().getAttribute("login");

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Gossip 微网志</title>");
        out.println("<link rel='stylesheet' href='css/member.css' type='text/css'>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div class='leftPanel'>");
        out.println("<img src='images/caterpillar.jpg' alt='Gossip 微网志' /><br/><br/>");
        out.println("<a href='logout.do?username=" + username + "'>注销 " + username + "</a>");
        out.println("</div>");

        out.println("<form method='post' action='message.do'>");
        out.println("分享新鲜事...<br/>");
        String blabla = request.getParameter("blabla");
        if (blabla == null) {
            blabla = "";
        } else {
            out.println("信息要 140 字以内<br/>");
        }
        out.println("<textarea cols='60' rows='4' name='blabla'>" + blabla + "</textarea>");
        out.println("<br/>");
        out.println("<button type='submit'>提交</button>");
        out.println("</form>");

        out.println("<table style='text-align: left; width: 510px; height: 88px;' border='0' cellpadding='2' cellspacing='2'");
        out.println("<thead>");
        out.println("<tr><th><hr/></th></tr>");
        out.println("</thead>");
        out.println("<tbody>");
        UserService userService = (UserService) getServletContext().getAttribute("userService");
        Map<Date, String> messages = userService.readMessage(username);
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL, Locale.CHINA);
        for (Date date : messages.keySet()) {
            out.println("<tr><td style='vertical-align: top;'");
            out.println(username + "<br/>");
            out.println(messages.get(date) + "<br/>");
            out.println(dateFormat.format(date));
            out.println("<a href='delete.do?message=" + date.getTime() + "'>删除</a>");
            out.println("<hr/></td><hr/>");
        }

        out.println("</tbody>");
        out.println("</table>");
        out.println("<hr/>");
        out.println("</body>");
        out.println("</html>");
        out.close();
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
