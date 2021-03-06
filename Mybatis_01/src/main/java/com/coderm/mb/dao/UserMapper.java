package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //获取全部用户
    List<User> selectUser();
    //根据id查询用户
    User getUserById(int id);

    User getUserByIdMap(Map<String,Object> map);

    //插入insert用户
    int addUser(User user);

    //万能的map
    int addUser2(Map<String, Object> map);

    //修改用户
    int updateUser(User user);

    //删除用户
    int deleteUserById(int id);

}
