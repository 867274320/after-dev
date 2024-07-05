package org.boy.utils;

/**
 * @author tanglijie
 * @date 2024/7/2 下午5:02
 * @description 字符串工具类
 **/
public class StrUtils {

    public static boolean isBlank(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean isNotBlank(String str) {
        return !(str == null || str.trim().length() == 0);
    }
}
