package com.deku.security.core.validate.code;

import com.deku.security.core.validate.code.image.ImageCode;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 验证码生成器接口
 *
 * @Author: White
 * @Date: 2019/11/11
 */
public interface ValidateCodeGenerator {

    ValidateCode generate(ServletWebRequest request);
}
