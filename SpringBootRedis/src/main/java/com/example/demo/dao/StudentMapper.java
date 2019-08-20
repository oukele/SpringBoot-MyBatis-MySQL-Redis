package com.example.demo.dao;

import com.example.demo.model.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    @Select("select * from student")
    List<Student> selectAll();

    @Select("select * from student where numbercode = #{numberCode}")
    Student getStudent(@Param("numberCode") String numberCode);

    @Delete("delete from student where numbercode = #{numberCode}")
    int delete(@Param("numberCode") String numberCode);

    int update(Student student);

    int insert(Student student);
}