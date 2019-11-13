package com.deku.security.core.social.qq.connect;

import com.deku.security.core.social.qq.api.QQ;
import org.springframework.social.connect.support.OAuth2ConnectionFactory;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2019/11/12
 */
public class QQConnectionFactory extends OAuth2ConnectionFactory<QQ> {
    public QQConnectionFactory(String providerId, String appId, String appSecret) {
        super(providerId, new QQServiceProvider(appId, appSecret), new QQAdapter());
    }
}
