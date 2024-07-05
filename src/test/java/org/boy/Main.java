package org.boy;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.sql.SQLOutput;

public class Main {

//    @Test
//    public void test() throws ClassNotFoundException, SQLException {
//        String driver = "com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://127.0.0.1:3306/boy";
//        String username = "root";
//        String password = "123456";
//
//        Driver driver1 = new com.mysql.cj.jdbc.Driver();
//        Properties properties  = new Properties();
//        properties.setProperty("user", "root");
//        properties.setProperty("password", "123456");
//        Connection connect = driver1.connect(url, properties);
//        System.out.println(connect);
//    }

    private final static String PATH = "E:\\BaiduNetdiskDownload\\2025【启航】经济学\\04.基础精学阶段\\02.微观经济学";

    @Test
    public void test() {
        System.out.println(PATH);
        File file = new File(PATH);
        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getName());
        }


    }

}

