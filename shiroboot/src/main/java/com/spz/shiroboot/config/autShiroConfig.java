package com.spz.shiroboot.config;

import org.springframework.context.annotation.Configuration;

/**
 * @ClassName autShiroConfig
 * @Description
 * @Author sunpengzhen
 * @Date 2023/2/8 19:49
 **/
@Configuration
public class autShiroConfig {

    private String redisHost;
    private Integer redisPort;
    private static final Integer expireAt = 1800;
    private static final Integer timeOut = 3000;
    private String password;
}
