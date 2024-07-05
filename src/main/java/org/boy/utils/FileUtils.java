package org.boy.utils;

import java.io.File;

/**
 * @author tanglijie
 * @date 2024/7/5 上午11:25
 * @description 文件工具类
 **/
public class FileUtils {

    public static void main(String[] args) {
        readFile("E:\\BaiduNetdiskDownload\\尚硅谷MyBatisPlus视频教程\\视频");
    }


    public static void readFile(String filePath) {
        File file = new File(filePath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}
