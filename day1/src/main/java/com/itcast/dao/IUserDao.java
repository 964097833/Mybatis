package com.itcast.dao;

import com.itcast.domain.User;

import java.util.List;

public interface IUserDao {
    List<User> findAll();
}
