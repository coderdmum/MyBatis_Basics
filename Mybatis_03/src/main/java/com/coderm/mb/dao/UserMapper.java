package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    //根据id查询用户
    User getUserById(int id);

    //分页
    List<User> getUserLimit(Map<String, Integer> map);


}
