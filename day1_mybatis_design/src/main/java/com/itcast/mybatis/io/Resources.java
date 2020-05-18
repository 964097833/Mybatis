package com.itcast.mybatis.io;

import java.io.InputStream;

/**
 * 使用类加载器读取配置文件
 */
public class Resources {
    /**
     * 根据传入的参数，获取一个字节输入流
     * @param filepath
     * @return
     */
    public static InputStream getResourceAsStream(String filepath) {
        return Resources.class.getClassLoader().getResourceAsStream(filepath);
    }
}
