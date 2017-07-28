package com.acehouhao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Hao HOU on 2017/7/28.
 */
public class ChooseTag extends SimpleTagSupport {
    private boolean matched;

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public boolean isMatched() {
        return matched;
    }

    @Override
    public void doTag() throws JspException, IOException {
        this.getJspBody().invoke(null);
    }
}
