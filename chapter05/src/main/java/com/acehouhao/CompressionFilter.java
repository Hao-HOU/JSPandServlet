package com.acehouhao;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * FilterDemo
 * Created by Hao HOU on 2017/7/18.
 */

//应该是 GZipServletOutputStream 类没写好，导致压缩后内容有误
//@WebFilter(filterName = "CompressionFilter", urlPatterns = { "/*" })
public class CompressionFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse res = (HttpServletResponse) servletResponse;

        String encodings = req.getHeader("accept-encoding");
        if ((encodings != null) && (encodings.indexOf("gzip") > -1)) {
            CompressionWrapper responseWrapper = new CompressionWrapper(res);
            responseWrapper.setHeader("content-encoding", "gizp");
            filterChain.doFilter(servletRequest, responseWrapper);

            GZIPOutputStream gzipOutputStream = responseWrapper.getGZIPOutputStream();
            if (gzipOutputStream != null) {
                gzipOutputStream.finish();
            }
        } else {
            filterChain.doFilter(servletRequest, servletResponse);
        }
    }

    @Override
    public void destroy() {}
}
