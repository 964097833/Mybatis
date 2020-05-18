package com.itcast.dao;

import com.itcast.domain.User;
import com.itcast.mybatis.annotation.Select;

import java.util.List;

public interface IUserDao {
    @Select("select * from user")
    List<User> findAll();
}
