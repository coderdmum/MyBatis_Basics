package com.coderm.mb.dao;

import com.coderm.mb.pojo.User;
import com.coderm.mb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDaoTest {

    static Logger logger = Logger.getLogger(UserDaoTest.class);

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

    @Test
    public void log4j() {
        logger.info("info：进入selectUser方法");
        logger.debug("debug：进入selectUser方法");
        logger.error("error: 进入selectUser方法");

    }


    @Test
    public void getUserLimit() {
        //第一步 ：获取sqlsession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try{
            //方式一：执行sql
            UserMapper userDao = sqlSession.getMapper(UserMapper.class);
            Map<String, Integer> map = new HashMap<String, Integer>();
            map.put("startIndex", 1);
            map.put("pageSize", 2);
            List<User> list = userDao.getUserLimit(map);
            //方式二
//            List<User> userList = sqlSession.selectList("com.coderm.mb.dao.UseMapper.selectUser");
            for (User user : list){
                System.out.println(user);
            }


        }catch (Exception e){
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }

}



















