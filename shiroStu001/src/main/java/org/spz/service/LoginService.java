package org.spz.service;

import org.apache.shiro.authc.UsernamePasswordToken;

public interface LoginService {
    boolean login(UsernamePasswordToken token);
    void logout();
}
