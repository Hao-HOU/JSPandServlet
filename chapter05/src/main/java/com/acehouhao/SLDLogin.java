package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * HttpSession事件、监听器
 * Created by Hao HOU on 2017/7/13.
 */
@WebServlet("/sldlogin.do")
public class SLDLogin extends HttpServlet {
    private Map<String, String> users;

    public SLDLogin() {
        users = new HashMap<>();
        users.put("houhao", "houhao");
        users.put("momor", "momor");
        users.put("hamimi", "hamimi");
        users.put("test", "test");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String page = "form.html";
        if (users.containsKey(username) && users.get(username).equals(password)) {
            req.getSession().setAttribute("user", username);
            page = "welcome.view";
        }
        resp.sendRedirect(page);
    }
}
