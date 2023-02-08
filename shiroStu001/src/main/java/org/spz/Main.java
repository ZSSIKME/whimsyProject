package org.spz;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.Hex;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;

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

    @Test
    public void demo() throws Exception {
//        byte[] decoded = Base64.decodeBase64("");
//        RSAPublicKey pubKey = (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decoded));
//        Cipher cipher = Cipher.getInstance("RSA");
//        cipher.init(1, pubKey);
//        String supername = Base64.encodeBase64String(cipher.doFinal("super".getBytes("UTF-8")));
//        String password = Base64.encodeBase64String(cipher.doFinal("1".getBytes("UTF-8")));
//        System.out.println(supername+"===="+password);

        String s = Base64.encodeToString("super".getBytes());
        System.out.println(s);
    }
}