package com.acehouhao;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 性能评测过滤器
 * Created by Hao HOU on 2017/7/17.
 */
//@WebFilter(filterName = "performance", urlPatterns = {"/*"})
public class PerformanceFilter implements Filter {
    private FilterConfig config;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        long begin = System.currentTimeMillis();
        filterChain.doFilter(servletRequest, servletResponse);
        config.getServletContext().log("Request process in " + (System.currentTimeMillis() - begin) + " milliseconds");
    }

    @Override
    public void destroy() {

    }
}
