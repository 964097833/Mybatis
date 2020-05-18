package com.itcast.mybatis.sqlsession;

public interface SqlSessionFactory {
    /**
     * 打开一个新的sqlsession对象
     * @return
     */
    SqlSession openSession();
}
