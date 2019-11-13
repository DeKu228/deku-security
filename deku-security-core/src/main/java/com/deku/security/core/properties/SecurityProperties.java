package com.deku.security.core.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 安全属性初始化
 *
 * @Author: White
 * @Date: 2019/11/11
 */
@Data
@ConfigurationProperties(prefix = "deku.security")
public class SecurityProperties {
    /** 浏览器配置环境 **/
    private BrowserProperties browser = new BrowserProperties();
    /** 验证码配置 **/
    private ValidateCodeProperties code = new ValidateCodeProperties();
    /** 社交登录配置 **/
    private SocialProperties social = new SocialProperties();
}
