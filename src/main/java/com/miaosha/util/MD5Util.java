package com.miaosha.util;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Util {

    private static final String salt = "1a2b3c4d";


    public static String md5(String src){
        return DigestUtils.md5Hex(src);
    }

    public  static String inputPassToFormPass(String inputPass){
        String str = ""+salt.charAt(0)+salt.charAt(2)+inputPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static String inputPassToDBPass(String input, String saltDB){
        String formPass = inputPassToFormPass(input);
        String dbPass = fromPassToDBPass(formPass, saltDB);
        return dbPass;
    }

    public  static String fromPassToDBPass(String formPass, String salt){
        String str = ""+salt.charAt(0)+salt.charAt(2)+formPass+salt.charAt(5)+salt.charAt(4);
        return md5(str);
    }

    public static void main(String[] args) {
//        System.out.println(fromPassToDBPass("87ccb4c5967440df2cc17b696a3e0555", "1a2b3c4d"));
        System.out.println(inputPassToFormPass("123456"));//d3b1294a61a07da9b49b6e22b2cbd7f9
    }


}
