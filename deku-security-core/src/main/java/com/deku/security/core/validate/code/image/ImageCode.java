package com.deku.security.core.validate.code.image;

import com.deku.security.core.validate.code.ValidateCode;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.image.BufferedImage;
import java.time.LocalDateTime;

/**
 * 图片验证码
 *
 * @Author: White
 * @Date: 2019/11/11
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ImageCode extends ValidateCode {
    //图片
    private BufferedImage image;

    public ImageCode(BufferedImage image, String code, int expireTime){
        super(code,expireTime);
        this.image = image;
    }

    public ImageCode(BufferedImage image, String code, LocalDateTime expireTime){
        super(code,expireTime);
        this.image = image;
    }
}
