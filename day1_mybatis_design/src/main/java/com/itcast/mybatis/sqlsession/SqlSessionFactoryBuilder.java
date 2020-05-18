package com.itcast.mybatis.sqlsession;

import com.itcast.mybatis.cfg.Configuration;
import com.itcast.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.itcast.mybatis.utils.XMLConfigBuilder;
import jdk.nashorn.internal.ir.IdentNode;

import java.io.InputStream;

/**
 * 用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {
    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param inputStream
     * @return
     */
    public SqlSessionFactory build(InputStream inputStream) {
        Configuration cfg = XMLConfigBuilder.loadConfiguration(inputStream);
        return new DefaultSqlSessionFactory(cfg);
    }
}
