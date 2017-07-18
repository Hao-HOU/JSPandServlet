package com.acehouhao;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * FilterDemo
 * Created by Hao HOU on 2017/7/17.
 */
//@WebFilter(
//        urlPatterns = { "/*" },
//        initParams = { @WebInitParam(name = "ENCODING", value = "UTF-8")}
//)
public class EncodingFilter implements Filter {
    private String ENCODING;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ENCODING = filterConfig.getInitParameter("ENCODING");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        if ("GET".equals(req.getMethod())) {
            req = new EncodingWrapper(req, ENCODING);
        } else {
            req.setCharacterEncoding(ENCODING);
        }
        filterChain.doFilter(req, servletResponse);
    }

    @Override
    public void destroy() {}
}
