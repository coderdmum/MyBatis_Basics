package com.coder.mb.dao;

import com.coderm.mb.dao.StudentMapper;
import com.coderm.mb.dao.TeacherMapper;
import com.coderm.mb.pojo.Student;
import com.coderm.mb.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testClass {

    @Test
    public void getTeacherById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);
        mapper.getTeacherById(1);
        System.out.println(mapper);
        sqlSession.close();
    }

    @Test
    public void getStudent() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent();
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        sqlSession.close();

    }

    @Test
    public void getStudent2() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> studentList = mapper.getStudent2();
        for (Student student1 : studentList) {
            System.out.println(student1);
        }
        sqlSession.close();

    }
}
