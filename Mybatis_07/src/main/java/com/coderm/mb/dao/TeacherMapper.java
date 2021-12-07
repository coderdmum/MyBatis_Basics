package com.coderm.mb.dao;

import com.coderm.mb.pojo.Teacher;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TeacherMapper {

    List<Teacher> getTeacher();

    Teacher getTeacherInfo(@Param("tid") int id);

    Teacher getTeacherInfo2(@Param("tid") int id);
}
