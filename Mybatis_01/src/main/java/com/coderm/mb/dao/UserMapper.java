package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;

import java.util.List;

public interface UserMapper {
    //获取全部用户
    List<User> selectUser();
    //根据id查询用户
    User getUserById(int id);

}
