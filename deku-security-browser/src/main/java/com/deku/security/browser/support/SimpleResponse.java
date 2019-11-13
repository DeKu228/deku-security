package com.deku.security.browser.support;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2019/11/11
 */
public class SimpleResponse {

    public SimpleResponse(Object content){
        this.content = content;
    }

    private Object content;

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

}
