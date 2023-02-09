package com.spz.shiroboot.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description
 * @Author sunpengzhen
 * @Date 2023/2/8 17:13
 **/
@RestController
public class IndexController {

    @PostMapping("/login")
    public String login(){
        Subject subject = SecurityUtils.getSubject();
        subject.login(new UsernamePasswordToken("spz","spz"));
        return "success";
    }
}
