package com.acehouhao.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Hao HOU on 2017/7/19.
 */
@WebFilter(
        urlPatterns = { "/delete.do", "/logout.do", "/message.do", "/member.view" },
        initParams = {
                @WebInitParam(name = "LOGIN_VIEW", value = "index.html")
        }
)
public class MemberFilter implements Filter {
    private String LOGIN_VIEW;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.LOGIN_VIEW = filterConfig.getInitParameter("LOGIN_VIEW");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if (req.getSession().getAttribute("login") != null) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            HttpServletResponse resp = (HttpServletResponse) servletResponse;
            resp.sendRedirect(LOGIN_VIEW);
        }
    }

    @Override
    public void destroy() {}
}
