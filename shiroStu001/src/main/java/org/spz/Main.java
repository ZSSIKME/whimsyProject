package org.spz;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    @Test
    public void helloShiro(){
        String encode = Hex.encodeToString("spz".getBytes());
        byte[] decode = Hex.decode(encode);
        IniSecurityManagerFactory managerFactory = new IniSecurityManagerFactory("classpath:shiro.ini");
        SecurityManager securityManager = managerFactory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken spz = new UsernamePasswordToken("spz", "123");
        subject.login(spz);
        System.out.println("==="+subject.isAuthenticated());
    }
}