package org.spz.encodeutils;

import org.apache.shiro.crypto.SecureRandomNumberGenerator;
import org.apache.shiro.crypto.hash.SimpleHash;

import java.util.HashMap;
import java.util.Map;

public class DigestsUtil {
    private static final String SHA1 = "SHA_1";
    private static final Integer ITERATIONS = 512;

    public static String sha1 (String input, String salt){
        return new SimpleHash(SHA1,input,salt,ITERATIONS).toString();
    }

    public static String generateSalt(){
        SecureRandomNumberGenerator randomNumberGenerator = new SecureRandomNumberGenerator();
        return randomNumberGenerator.nextBytes().toHex();
    }

    public static Map<String,String> entryptPassword(String passwordPlain) {
        Map<String,String> map = new HashMap<>();
        String salt = generateSalt();
        String password =sha1(passwordPlain,salt);
        map.put("salt", salt);
        map.put("password", password);
        return map;
    }
}
