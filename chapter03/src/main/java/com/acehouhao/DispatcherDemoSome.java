package com.acehouhao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 使用RequestDispatcher的include()方法
 * Created by Hao HOU on 2017/7/5.
 */
@WebServlet("/some.view")
public class DispatcherDemoSome extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        out.println("Some do one...");
        RequestDispatcher dispatcher = req.getRequestDispatcher("other.view");
        dispatcher.include(req, resp);
        out.println("Some do two...");
        out.close();
    }
}
