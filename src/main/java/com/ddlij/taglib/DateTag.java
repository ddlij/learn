package com.ddlij.taglib;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * 自定义日期控件
 */
public class DateTag extends TagSupport {
    private String format;
    private String dateValue;

    /**
     * 执行当前标签实例的开始标签
     */
    public int doStartTag() throws JspException {
        JspWriter out=pageContext.getOut();
        try {
            StringBuffer html = new StringBuffer();
            html.append("<input type='text' onFocus='WdatePicker()' id='" + getId()  + "' class='Wdate' ");
            if(getDateValue() != null && !"".equals(getDateValue())) {
                html.append(" value='" + getDateValue() + "' />");
            } else {
                html.append("' />");
            }
            out.print(html);
        } catch (Exception e) {
        }
        return EVAL_BODY_INCLUDE;
    }
    /**
     * 执行当前标签实例的结束标签
     */
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getDateValue() {
        return dateValue;
    }

    public void setDateValue(String dateValue) {
        this.dateValue = dateValue;
    }
}
