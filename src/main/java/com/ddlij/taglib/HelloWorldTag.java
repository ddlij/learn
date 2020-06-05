package com.ddlij.taglib;


import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class HelloWorldTag extends TagSupport {
    private String defaultValue;

    /**
     * 执行当前标签实例的开始标签
     */
    public int doStartTag() throws JspException {
        JspWriter out=pageContext.getOut();
        try {
            if (this.getDefaultValue() == null) {
                out.print(" Please enter a value for DefaultValue !!!");
            }else{
                out.print(" I'm "+this.getDefaultValue());
            }
        } catch (Exception e) {
        }
        return EVAL_BODY_INCLUDE;
    }
    /**
     * 执行当前标签实例的结束标签
     */
    public int doEndTag() throws JspException {
        JspWriter out=pageContext.getOut();
        try {
            out.print(" \n tag is end ");
        } catch (Exception e) {
        }
        return EVAL_PAGE;
    }


    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }
}
