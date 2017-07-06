package com.acehouhao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 字节输出
 * Created by Hao HOU on 2017/7/6.
 */
@WebServlet("/download.do")
public class Download extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String password = req.getParameter("password");
        if ("123456".equals(password)) {
            resp.setContentType("application/pdf");
            InputStream in = getServletContext().getResourceAsStream("/WEB-INF/test .pdf");
            OutputStream out = resp.getOutputStream();
            writeBytes(in, out);
        }
    }

    private void writeBytes(InputStream in, OutputStream out) throws IOException{
        byte[] buffer = new byte[1024];
        int length = -1;
        while ((length = in.read(buffer)) != -1) {
            out.write(buffer, 0, length);
        }
        in.close();
        out.close();
    }
}
