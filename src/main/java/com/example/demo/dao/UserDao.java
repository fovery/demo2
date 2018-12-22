package com.example.demo.dao;

import com.example.demo.entity.SysUser;

public interface UserDao {
    public SysUser findByUserName(String username);

}
