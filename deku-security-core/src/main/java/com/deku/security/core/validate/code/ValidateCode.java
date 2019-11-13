package com.deku.security.core.validate.code;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * 短信验证码
 *
 * @Author: White
 * @Date: 2019/11/11
 */
@Data
public class ValidateCode {
    //验证码
    private String code;
    //过期时间
    private LocalDateTime expireTime;

    public ValidateCode(String code, LocalDateTime expireTime) {
        this.code = code;
        this.expireTime = expireTime;
    }

    public ValidateCode(String code, int expireIn) {
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public boolean isExpried() {
        return LocalDateTime.now().isAfter(expireTime);
    }
}
