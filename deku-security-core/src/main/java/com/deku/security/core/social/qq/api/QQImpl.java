package com.deku.security.core.social.qq.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.oauth2.TokenStrategy;

import java.io.IOException;

/**
 * 这个是多例的，每个用户不一样进来他们的accessToken、openid是不一样的
 * 所以不能@Component声明为spring组件！！！
 *
 * @Author: White
 * @Date: 2019/11/12
 */
@Slf4j
public class QQImpl extends AbstractOAuth2ApiBinding implements QQ {
    //获取openId的路径
    private static final String URL_GET_OPENID = "https://graph.qq.com/oauth2.0/me?access_token=%s";
    //获取用户信息的路径
    private static final String URL_GET_USER_INFO = "https://graph.qq.com/user/get_user_info?oauth_consumer_key=%s&openid=%s";

    private ObjectMapper objectMapper = new ObjectMapper();

    private String appId;
    private String openId;

    public QQImpl(String accessToken, String appId) {
        //父类默认构造会把accessToken放在请求头里，这是不符合qq要求的放在url参数里的，所以掉一下作为参数的构造
        super(accessToken, TokenStrategy.OAUTH_TOKEN_PARAMETER);
        this.appId = appId;

        String url = String.format(URL_GET_OPENID,accessToken);
        String result = getRestTemplate().getForObject(url, String.class);
        log.info("获取open"+result);
        this.openId = StringUtils.substringBetween(result,"\"openId\":\"","\"}");
    }

    @Override
    public QQUserInfo getUserInfo() {

        String url = String.format(URL_GET_USER_INFO, appId, openId);
        String result = getRestTemplate().getForObject(url, String.class);

        System.out.println(result);
        QQUserInfo userInfo = null;
        try {
            userInfo = objectMapper.readValue(result, QQUserInfo.class);
            userInfo.setOpenId(openId);
            return userInfo;
        } catch (IOException e) {
            throw new RuntimeException("获取用户信息失败", e);
        }
    }
}
