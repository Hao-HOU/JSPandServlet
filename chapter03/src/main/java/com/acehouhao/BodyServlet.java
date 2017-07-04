package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 读取请求的 Body 数据
 * Created by Hao HOU on 2017/7/4.
 */
@WebServlet("/body.view")
public class BodyServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String body = readBody(req);
        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet BodyView</title>");
        out.println("</head>");
        out.println("<body>");
        out.println(body);
        out.println("</body>");
        out.println("</html>");
    }

    private String readBody(HttpServletRequest request) throws IOException{
        BufferedReader reader = request.getReader();
        String input = null;
        String requestBody = "";
        while ((input = reader.readLine()) != null) {
            requestBody = requestBody + input + "<br/>";
        }

        return requestBody;
    }
}
