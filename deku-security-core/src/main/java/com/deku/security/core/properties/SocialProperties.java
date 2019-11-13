package com.deku.security.core.properties;

import lombok.Data;

/**
 * 社交登录配置项
 *
 * @Author: White
 * @Date: 2019/11/12
 */
@Data
public class SocialProperties {
    private QQProperties qq = new QQProperties();
}
