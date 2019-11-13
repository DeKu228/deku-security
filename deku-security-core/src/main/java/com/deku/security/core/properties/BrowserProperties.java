package com.deku.security.core.properties;

import lombok.Data;

/**
 * 浏览器环境配置项
 *
 * @Author: White
 * @Date: 2019/11/11
 */
@Data
public class BrowserProperties {
    /** 默认登录页 **/
    private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;

    /** 默认登录成功返回方式 **/
    private LoginResponseType loginResponseType = LoginResponseType.JSON;

    /** '记住我'功能的有效时间，默认1小时 **/
    private int rememberMeSeconds = 3600;
}
