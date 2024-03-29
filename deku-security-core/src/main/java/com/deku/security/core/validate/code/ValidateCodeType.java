package com.deku.security.core.validate.code;

import com.deku.security.core.properties.SecurityConstants;

/**
 * 验证码类型
 *
 * @Author: White
 * @Date: 2019/11/12
 */
public enum ValidateCodeType {
    //短信验证码
    SMS {
        @Override
        public String getParamNameOnValidate() {
            return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_SMS;
        }
    },

    //图片验证码
    IMAGE {
        @Override
        public String getParamNameOnValidate() {
            return SecurityConstants.DEFAULT_PARAMETER_NAME_CODE_IMAGE;
        }
    };

    /**
     * 校验时从请求中获取的参数的名字
     * @return
     */
    public abstract String getParamNameOnValidate();
}
