package com.deku.security.core.validate.code.sms;

/**
 * 短信发送接口
 *
 * @Author: White
 * @Date: 2019/11/12
 */
public interface SmsCodeSender {
    void send(String mobile, String code);
}
