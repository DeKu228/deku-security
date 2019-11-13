package com.deku.security.core.social.qq.connect;

import com.deku.security.core.social.qq.api.QQ;
import com.deku.security.core.social.qq.api.QQUserInfo;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;

/**
 * 在服务提供商qq和第三方应用之间做用户信息的转换
 *
 * @Author: White
 * @Date: 2019/11/12
 */
public class QQAdapter implements ApiAdapter<QQ> {
    @Override
    public boolean test(QQ qq) {
        return true;
    }

    @Override
    public void setConnectionValues(QQ api, ConnectionValues values) {
        QQUserInfo userInfo = api.getUserInfo();

        //QQ用户名
        values.setDisplayName(userInfo.getNickName());
        //QQ头像
        values.setImageUrl(userInfo.getFigureurl_qq_1());
        //个人主页，QQ没有，微博有
        values.setProfileUrl(null);
        values.setProviderUserId(userInfo.getOpenId());
    }

    @Override
    public UserProfile fetchUserProfile(QQ qq) {
        return null;
    }

    @Override
    public void updateStatus(QQ qq, String message) {

    }
}
