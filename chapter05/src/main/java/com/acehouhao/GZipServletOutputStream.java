package com.acehouhao;

import javax.servlet.ServletOutputStream;
import javax.servlet.WriteListener;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 * FilterDemo
 * Created by Hao HOU on 2017/7/18.
 */
public class GZipServletOutputStream extends ServletOutputStream {
    private GZIPOutputStream gzipOutputStream;

    public GZipServletOutputStream(ServletOutputStream servletOutputStream) throws IOException {
        this.gzipOutputStream = new GZIPOutputStream(servletOutputStream);
    }

    @Override
    public void write(int b) throws IOException {
        gzipOutputStream.write(b);
    }

    public GZIPOutputStream getGzipOutputStream() {
        return gzipOutputStream;
    }

    @Override
    public void setWriteListener(WriteListener writeListener) {
        //不知道这个函数要怎么实现
    }

    @Override
    public boolean isReady() {
        //不知道怎么实现这个函数，暂且返回true
        return true;
    }
}
