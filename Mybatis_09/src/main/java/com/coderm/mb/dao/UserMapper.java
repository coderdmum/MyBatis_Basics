package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    User queryUsers(@Param("id") int id);

    int updateUser(User user);
}
