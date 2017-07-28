package com.acehouhao.tag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Created by Hao HOU on 2017/7/28.
 */
public class WhenTag extends SimpleTagSupport {
    private boolean test;

    public void setTest(boolean test) {
        this.test = test;
    }

    @Override
    public void doTag() throws JspException, IOException {
        JspTag parent = getParent();
        if (!(parent instanceof ChooseTag)) {
            throw new JspTagException("必须置于 choose 标签中");
        }

        ChooseTag chooseTag = (ChooseTag) parent;
        if (!chooseTag.isMatched() && test) {
            chooseTag.setMatched(true);
            this.getJspBody().invoke(null);
        }
    }
}
