package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;
import com.coderm.mb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    @Test
    public void test() {
        //第一步 ：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一：执行sql
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userDao.selectUser();
            //方式二
//            List<User> userList = sqlSession.selectList("com.coderm.mb.dao.UseMapper.selectUser");
            for (User user : userList) {
                System.out.println(user);

            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);


        sqlSession.close();
    }
    //使用map
    @Test
    public void getUserByIdMap(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("id", 1);
        map.put("name", "coderm");

        mapper.getUserByIdMap(map);

        System.out.println(mapper.getUserByIdMap(map));



        sqlSession.close();
    }

    //增删改必须提交事务commit
    @Test
    public void addUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.addUser(new User(4, "coderq", "123456"));
        sqlSession.commit();



        sqlSession.close();
    }

    //使用map
    @Test
    public void addUser2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("userId", 5);
        map.put("userName", "coderpp");
        map.put("userPwd", "123456");

        mapper.addUser2(map);

        sqlSession.commit();



        sqlSession.close();
    }

    @Test
    public void updateUser() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(3, "coderddd", "123"));
        sqlSession.commit();

        sqlSession.close();
    }
    @Test
    public void deleteUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(3);
        sqlSession.commit();

        sqlSession.close();
    }

}



















