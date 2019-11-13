package com.deku.code;

import com.deku.security.core.validate.code.ValidateCode;
import com.deku.security.core.validate.code.ValidateCodeGenerator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.context.request.ServletWebRequest;

/**
 * 自定义的图片验证码生成器
 *
 * @Author: White
 * @Date: 2019/11/12
 */
@Slf4j
//@Component("imageValidateCodeGenerator")
public class DemoImageCodeGenerator implements ValidateCodeGenerator {

    @Override
    public ValidateCode generate(ServletWebRequest request) {
        log.info("更高级的图形验证码生成代码");
        return null;
    }
}
