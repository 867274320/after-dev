package org.boy.utils;


import java.time.LocalDateTime;

/**
 * @author tanglijie
 * @date 2024/7/2 下午5:01
 * @description 日期工具类
 **/
public class DateUtils {

    /**
     * @author tanglijie
     * @date 2024/7/5 下午1:49
     * @methodName
     * @description  获取当前时间

     * @return
     * @throws
     **/
    public static final String getCurrentTime() {
        return LocalDateTime.now().toString();
    }
}
