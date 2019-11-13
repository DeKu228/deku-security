package com.deku.security.core.social.qq.connect;

import com.deku.security.core.social.qq.api.QQ;
import com.deku.security.core.social.qq.api.QQImpl;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 * QQ服务提供商
 *
 * @Author: White
 * @Date: 2019/11/12
 */
public class QQServiceProvider extends AbstractOAuth2ServiceProvider<QQ> {

    //将用户引导到获取授权码的地址，获取Authorize code
    private static final String URL_AUTHORIZE = "https://graph.qq.com/oauth2.0/authorize";
    //拿着授权码申请令牌token的地址，获取accessToken
    private static final String URL_ACCESS_TOKEN = "https://graph.qq.com/oauth2.0/token";

    private String appId;

    public QQServiceProvider(String appId, String appSecret) {
        super(new OAuth2Template(appId, appSecret, URL_AUTHORIZE, URL_ACCESS_TOKEN));
        this.appId = appId;
    }

    @Override
    public QQ getApi(String accessToken) {
        return new QQImpl(accessToken, appId);
    }
}
