package org.spz.encodeutils;

import org.apache.shiro.codec.Base64;
import org.apache.shiro.codec.Hex;

public class EncodesUtil {

    public static String encodeHex(byte[] input){
        return Hex.encodeToString(input);
    }

    public static byte[] decodeHex(String input){
        return Hex.decode(input);
    }

    public static String encodeBase64(byte[] input){
        return Base64.encodeToString(input);
    }

    public static byte[] decodeBase64(String input){
        return Base64.decode(input);
    }
}
