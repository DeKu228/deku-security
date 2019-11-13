package com.deku.security.core.validate.code;

import org.springframework.security.core.AuthenticationException;

/**
 * 验证码异常类
 *
 * @Author: White
 * @Date: 2019/11/11
 */
public class ValidateCodeException extends AuthenticationException {

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
