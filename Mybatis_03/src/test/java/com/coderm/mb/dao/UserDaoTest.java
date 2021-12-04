package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;
import com.coderm.mb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {

    @Test
    public void test() {
        //第一步 ：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一：执行sql
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            User user = userDao.getUserById(1);
            //方式二
//            List<User> userList = sqlSession.selectList("com.coderm.mb.dao.UseMapper.selectUser");

            System.out.println(user);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }



}



















