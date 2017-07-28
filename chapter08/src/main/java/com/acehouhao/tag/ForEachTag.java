package com.acehouhao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Collection;

/**
 * Created by Hao HOU on 2017/7/28.
 */
public class ForEachTag extends SimpleTagSupport {
    private String var;
    private Collection iteams;

    public void setVar(String var) {
        this.var = var;
    }

    public void setIteams(Collection iteams) {
        this.iteams = iteams;
    }

    @Override
    public void doTag() throws JspException, IOException {
        for (Object o : iteams) {
            this.getJspContext().setAttribute(var, o);
            this.getJspBody().invoke(null);
            this.getJspContext().removeAttribute(var);
        }
    }
}
