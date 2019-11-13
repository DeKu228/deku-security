package com.deku.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * All rights Reserved, Designed by xxxx
 *
 * @Author: White
 * @Date: 2019/11/11
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello Security";
    }
}
