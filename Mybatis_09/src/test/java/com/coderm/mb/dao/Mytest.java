package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;
import com.coderm.mb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Mytest {

    @Test
    public void queryUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUsers(1);
        System.out.println(user);

        System.out.println("******************");
        User user2 = mapper.queryUsers(1);
        System.out.println(user2);
        sqlSession.close();

    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUsers(1);
        System.out.println(user);
        sqlSession.clearCache(); //清理一级缓存

        mapper.updateUser(new User(2,"dsadad", "4665"));

        System.out.println("******************");
        User user2 = mapper.queryUsers(1);
        System.out.println(user2);
        sqlSession.close();

    }
}
