package com.itcast.test;

import com.itcast.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
