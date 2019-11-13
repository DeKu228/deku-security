package com.deku.security.core.properties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.boot.autoconfigure.social.SocialProperties;

/**
 * QQ登录配置项
 *
 * @Author: White
 * @Date: 2019/11/12
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class QQProperties extends SocialProperties {
    //第三方id，用来决定发起第三方登录的url，默认是 qq。
    private String providerId = "qq";
}