package com.acehouhao;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * AsyncContextDemo
 * Created by Hao HOU on 2017/7/18.
 */
@WebServlet(name = "AsyncServlet", urlPatterns = {"/async.do"}, asyncSupported = true)
public class AsyncServlet extends HttpServlet {
    private ExecutorService executorService = Executors.newFixedThreadPool(10);
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF8");
        AsyncContext ctx = req.startAsync();
        executorService.submit(new AsyncRequest(ctx));
    }

    @Override
    public void destroy() {
        executorService.shutdown();
    }
}
