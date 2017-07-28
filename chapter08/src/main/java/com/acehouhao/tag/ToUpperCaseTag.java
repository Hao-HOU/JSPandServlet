package com.acehouhao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Created by Hao HOU on 2017/7/28.
 */
public class ToUpperCaseTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        StringWriter writer = new StringWriter();
        this.getJspBody().invoke(writer);
        String upper = writer.toString().toUpperCase();
        this.getJspContext().getOut().print(upper);
    }
}
